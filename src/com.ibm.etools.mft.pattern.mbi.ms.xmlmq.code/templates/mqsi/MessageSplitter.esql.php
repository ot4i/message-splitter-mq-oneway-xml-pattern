BROKER SCHEMA mqsi

/**
 * Copyright (c) 2014 IBM Corporation and other Contributors
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM - initial implementation
**/

CREATE FILTER MODULE ExtractionComplete

	CREATE FUNCTION Main() RETURNS BOOLEAN
	BEGIN
		IF Environment.PatternVariables.Completion = 0 THEN
			RETURN TRUE;
		ELSE
			RETURN FALSE;			
		END IF;
	END;
	END MODULE;



CREATE COMPUTE MODULE ExtractRecords		
	-- ========================
	-- The INPUT message format
	-- ========================
-- SET at main flow level
	DECLARE CONTAINER CHARACTER '<?php echo $_MB['PP']['pp2'] ?>';
	DECLARE ELEMENTNAME CHARACTER '<?php echo $_MB['PP']['pp3'] ?>';
	DECLARE BadMsgAction CHARACTER 'Save';	
	DECLARE LoggingOn EXTERNAL BOOLEAN TRUE;
	
	/* 
	   ===================================
	   Main function to control processing
	   ===================================
	 */
	CREATE FUNCTION Main() RETURNS BOOLEAN
	BEGIN
-- Define Environment Variables
	SET Environment.PatternVariables.NumberOfRecordsFound = 0;
	SET Environment.PatternVariables.NumberOfBadRecords = 0;
	SET Environment.PatternVariables.Completion = -1;
	SET Environment.PatternVariables.LoggingOn = LoggingOn;
-- Copy properties and headers
	Call CopyMessageHeaders();
	Set OutputRoot.Properties = InputRoot.Properties;

	CALL ExtractRecordsProcess();
	RETURN FALSE;
	END;


    /* 
       ============================================================================================
         > Declare variables
         > Find first instance of the element to process
         > For each instance found
           1> Release memory used to store information about the previous instance (if appropriate)
           2> Call a procedure to produce a single message the current instance
           3> Look for a following instance         
       ============================================================================================
     */
	CREATE PROCEDURE ExtractRecordsProcess() BEGIN
		
		-- These variables hold the actual names found if '*:*' used
		DECLARE THIS_ROOT_NAME CHARACTER;
		DECLARE THIS_ELEMENT_NAME CHARACTER;
		DECLARE THIS_ELEMENT_NAMESPACE CHARACTER;
		DECLARE refEnvPatt REFERENCE TO Environment.PatternVariables;
		
		/*  Create a (local to this node) variable to hold a mutable tree */
		DECLARE rowCachedInputXML ROW;

		
		/* Create an XMLNSC parser
			As both the incoming message AND the new parser are XMLNSC no translation is required
		   	and therefore the XML message is NOT fully parsed */
			  
		CREATE FIRSTCHILD OF rowCachedInputXML DOMAIN ('XMLNSC') NAME 'XMLNSC';
		/* Create a mutable tree by copying the INPUT XML to the local parser
		This is to allow data about parsed message elements to be deleted from the message tree 
		(which can not happen on the InputRoot as its message tree is immutable) */

		SET rowCachedInputXML.XMLNSC = InputRoot.XMLNSC;
		

		/* Create a reference variable to be used to traverse the input XML message
*/
		DECLARE referenceToInputMsg REFERENCE TO rowCachedInputXML.XMLNSC;
		-- Acquire the first root element...
		
 		MOVE referenceToInputMsg FIRSTCHILD TYPE XMLNSC.Folder NAMESPACE *;
	
		IF NOT LASTMOVE(referenceToInputMsg) THEN
		THROW USER EXCEPTION SEVERITY 3 MESSAGE 2372 VALUES ('No child elements of type Field (simple element) or Folder(complex element) found in the input message, in the Message Splitter for WebSphere MQ: one-way (for XML) pattern');
		END IF;
		SET THIS_ROOT_NAME = FIELDNAME(referenceToInputMsg);
		SET THIS_ELEMENT_NAMESPACE = FIELDNAMESPACE (referenceToInputMsg);
/******************************************************
*  Next locate the first repeating structure...
*	check if specific name required
*   Ignore anything which is not a folder or field type
*******************************************************/
		
			MOVE referenceToInputMsg FIRSTCHILD NAMESPACE *;
FIRST: 	LOOP  
			SET Environment.PatternVariables.temp = FieldName(referenceToInputMsg);
--			IF FIELDTYPE(referenceToInputMsg)= XMLNSC.Folder THEN LEAVE FIRST; END IF;
			IF FIELDTYPE(referenceToInputMsg)= 16777216 THEN LEAVE FIRST; END IF; 
--			IF FIELDTYPE(referenceToInputMsg)= XMLNSC.Field THEN LEAVE FIRST; END IF;
			IF FIELDTYPE(referenceToInputMsg)= 50331648 THEN LEAVE FIRST; END IF;	
			IF FIELDTYPE(referenceToInputMsg)IS NULL THEN 
				THROW USER EXCEPTION SEVERITY 3 MESSAGE 2372 VALUES ('No root element found in the input message, in the Message Splitter for WebSphere MQ: one-way (for XML) pattern');
			END IF;
			MOVE referenceToInputMsg NEXTSIBLING;
		END LOOP FIRST;
		-- Loop around each repeating item
		WHILE LASTMOVE(referenceToInputMsg) DO
			-- SAVE ELEMENT NAME 
			SET THIS_ELEMENT_NAME = FIELDNAME (referenceToInputMsg);
			-- Increment the count of repeating items found...
			SET refEnvPatt.NumberOfRecordsFound = refEnvPatt.NumberOfRecordsFound + 1;
			
			-- Are we on the second, or subsequent repeating item?
			IF refEnvPatt.NumberOfRecordsFound > 1 THEN
				-- YES, therefore erase the parsed details about the previous item to release memory
				/* The following line is most significant with respect to memory usage.  Its execution 
				   results in the last-but-one *repeating* element, including subordinate elements, 
				   of the message tree being deleted allowing the memory used to hold information 
				   generated during parsing to be re
				  used for further parsing. */
				DELETE PREVIOUSSIBLING OF referenceToInputMsg;
			END IF;			
			

	/*  
	    ====================================================================
	    Produce a message consisting of one embedded record from the file
	    ====================================================================
	 */

		-- Set body to extracted record from file 
		SET OutputRoot.XMLNSC.{THIS_ELEMENT_NAMESPACE}:{THIS_ELEMENT_NAME} = referenceToInputMsg;
		-- Generate a new message consisting of one embedded record
		SET refEnvPatt.ErrorState = 'OK';
		PROPAGATE;
		-- Check whether this completed properly
		-- If BadMsgAction is Save then record will have been written to queue
		-- Otherwise throw an error
		IF refEnvPatt.ErrorState = 'Failed' THEN
			IF  BadMsgAction = 'Cancel'THEN
				THROW USER EXCEPTION  SEVERITY 3 MESSAGE 2372 VALUES (Environment.PatternVariables.RoutingError); 
			END IF;
		END IF;
			
/****************************************************************************************
* Now search for another repeating element                                              *
* Reject anything that is not of type FIELD(simple element) or FOLDER (Complex element) *
****************************************************************************************/
			MOVE referenceToInputMsg NEXTSIBLING;	
CHECK: LOOP  
--			IF FIELDTYPE(referenceToInputMsg)= XMLNSC.Folder THEN LEAVE CHECK; END IF;
			IF FIELDTYPE(referenceToInputMsg)= 16777216 THEN LEAVE CHECK; END IF; 
--			IF FIELDTYPE(referenceToInputMsg)= XMLNSC.Field THEN LEAVE CHECK; END IF;
			IF FIELDTYPE(referenceToInputMsg)= 50331648 THEN LEAVE CHECK; END IF;	
			IF FIELDTYPE(referenceToInputMsg) IS NULL THEN LEAVE CHECK; END IF;
			MOVE referenceToInputMsg NEXTSIBLING;
		END LOOP CHECK;
		END WHILE;
-- indicate no more records extracted
		SET refEnvPatt.Completion = 0;
	END;

	CREATE PROCEDURE CopyMessageHeaders() BEGIN
		DECLARE I INTEGER 1;
		DECLARE J INTEGER;
		SET J = CARDINALITY(InputRoot.*[]);
		WHILE I < J DO
			SET OutputRoot.*[I] = InputRoot.*[I];
			SET I = I + 1;
		END WHILE;
	END;
	END MODULE;