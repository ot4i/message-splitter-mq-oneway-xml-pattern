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

<?php

$routing_type = $_MB['PP']['pp23'];

if ($routing_type == 'specify_routes') {

echo <<<ESQL

	CREATE COMPUTE MODULE SetRoutingError
	CREATE FUNCTION Main() RETURNS BOOLEAN
	BEGIN
	SET Environment.PatternVariables.RoutingError = 'Routing error, key not found, at record number:  '
	|| CAST(Environment.PatternVariables.NumberOfRecordsFound AS CHARACTER);
		SET Environment.PatternVariables.ErrorState = 'Failed';
	SET Environment.PatternVariables.NumberOfBadRecords = Environment.PatternVariables.NumberOfBadRecords +1;
-- This is required so that message can be written to bad messages queue
	SET OutputRoot = InputRoot;
	END;
	END MODULE;
	CREATE COMPUTE MODULE SetOtherError
	CREATE FUNCTION Main() RETURNS BOOLEAN
	BEGIN
	SET Environment.PatternVariables.RoutingError = 'Routing error at record number:   '
	|| CAST(Environment.PatternVariables.NumberOfRecordsFound AS CHARACTER);
	SET Environment.PatternVariables.ErrorState = 'Failed';
	SET Environment.PatternVariables.NumberOfBadRecords = Environment.PatternVariables.NumberOfBadRecords +1;
-- This is required so that message can be written to bad messages queue
	SET OutputRoot = InputRoot;
	END;
	END MODULE;
ESQL;
} else if ($routing_type == 'lookup_routes') {

$key1 = $_MB['PP']['pp10'];
$key2 = $_MB['PP']['pp11'];

echo <<<ESQL

CREATE COMPUTE MODULE RoutetoDest
	CREATE FUNCTION Main() RETURNS BOOLEAN
	BEGIN
		/****************************************************************************
		*   Extract destination data based on message   
		*	This version assumes MQ destination
		*   Any compute node using this ESQL most have the following set:
		*
		*   - The database source set to the database containing the routing table
		*   - The compute mode set to environment.
		*****************************************************************************/

-- Copy LocalEnvironment so content not lost
		SET OutputLocalEnvironment = InputLocalEnvironment;
-- Extract the key from the incoming message

		DECLARE KEY1 CHARACTER;
		DECLARE KEY2 CHARACTER;

/******************************************
* This is a pattern parameter substitution*
*******************************************/
		SET KEY1 = $key1;
		SET KEY2 = $key2;
		IF KEY1 = NULL OR KEY2 = NULL THEN
	SET Environment.PatternVariables.RoutingError = 'No match for key value in database. at record number :'
	|| CAST(Environment.PatternVariables.NumberOfRecordsFound as CHARACTER);
			SET Environment.PatternVariables.ErrorState = 'Failed';
			SET Environment.PatternVariables.NumberOfBadRecords = Environment.PatternVariables.NumberOfBadRecords +1;
			PROPAGATE TO TERMINAL 'failure';
			RETURN FALSE;
		END IF;
		
		
-- Select queue manager and queue based on key from message		
		SET  OutputLocalEnvironment.Destination.MQDestinationList.DestinationData[] = 
		      (
		       SELECT S.QUEUE_MANAGER as queueManagerName, S.QUEUE_NAME as queueName 
		       FROM CacheQueueTable.DestinationData[] as S 
		       WHERE 
		        S.VARIABLE1 = KEY1 and
		        S.VARIABLE2 = KEY2 		        			
		        );
-- Was a route selected		        
IF EXISTS(OutputLocalEnvironment.Destination.MQDestinationList.DestinationData[])
-- YES - Propagate to out
	THEN RETURN TRUE;
-- NO - Propagate to failure and set environment
ELSE 
	SET Environment.PatternVariables.RoutingError = 'No match for key value in database. at record number :'
	|| CAST(Environment.PatternVariables.NumberOfRecordsFound as CHARACTER);
	SET Environment.PatternVariables.ErrorState = 'Failed';
	SET Environment.PatternVariables.NumberOfBadRecords = Environment.PatternVariables.NumberOfBadRecords +1;
	PROPAGATE TO TERMINAL 'failure';
	RETURN FALSE;
END IF;
	END;
	END MODULE;


ESQL;

}