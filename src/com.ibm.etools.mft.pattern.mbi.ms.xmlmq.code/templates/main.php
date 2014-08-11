<?php

	
	mb_pattern_run_template("MessageSplitterMQOneWayProject", "mqsi/MessageSplitter.esql.php", "mqsi/MessageSplitter.esql");
	
	if ($_MB['PP']['pp23'] == 'specify_routes' || $_MB['PP']['pp23'] == 'lookup_routes') {
		mb_pattern_run_template("MessageSplitterMQOneWayProject", "mqsi/Route.esql.php", "mqsi/Route.esql");
	}
	
	if ($_MB['PP']['pp14'] == 'true') {
		mb_pattern_run_template("MessageSplitterMQOneWayProject", "mqsi/Log.esql.php", "mqsi/Log.esql");
	}
	
	if ($_MB['PP']['pp23'] == 'lookup_routes') {
		mb_pattern_run_template("MessageSplitterMQOneWayProject", "mqsi/DeclareCache.esql.php", "mqsi/DeclareCache.esql");
	}
	
?>
