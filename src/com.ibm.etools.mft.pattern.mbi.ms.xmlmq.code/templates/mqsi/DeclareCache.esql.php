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

DECLARE CacheQueueTable SHARED ROW;
CREATE COMPUTE MODULE Invalidatecache

	CREATE FUNCTION Main() RETURNS BOOLEAN
	BEGIN
	SET CacheQueueTable.valid value = null;
	END;
	END MODULE;
	
CREATE DATABASE MODULE CheckCache
	CREATE Function Main() RETURNS BOOLEAN
	BEGIN
	DECLARE CONTEXT CHARACTER '<?php echo $_MB['PP']['pp9']; ?>';
-- Read the database table into memory when CacheQueues.valid field is set to null.
-- Do this atomically to protect against problems when threads > 1

		ROUTING : BEGIN ATOMIC
			IF CacheQueueTable.valid IS NULL THEN
		SET  CacheQueueTable.DestinationData[] =  
		       	(
		       		SELECT S.QUEUE_MANAGER, S.QUEUE_NAME ,S.VARIABLE1, S.VARIABLE2
		       		FROM Database.ROUTING_TABLE as S 
		       		WHERE 
		       			S.ROUTING_CONTEXT = CONTEXT     			
		       	 ); 
		         	 
			SET CacheQueueTable.valid = true;
			END IF;
		END ROUTING;		

-- 	At this point the CacheQueues should be full of the data with possible destinations		
	END;
END MODULE;