/*******************************************************************************
* Copyright (c) 2005, 2011 IBM Corporation and others.
*
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
*
* Contributors:
*     IBM - initial API and implementation
*******************************************************************************/
package com.ibm.etools.mft.pattern.mbi.ms.xmlmq;

import java.util.Map;
import org.eclipse.osgi.util.NLS;
import com.ibm.etools.mft.pattern.mbi.plugin.PatternBundle;
import com.ibm.etools.mft.pattern.mbi.plugin.PatternPlugin;
import com.ibm.etools.patterns.model.base.IPatternBundle;

public class PatternMessages extends PatternBundle implements IPatternBundle {
	private static final String BUNDLE_NAME = "com.ibm.etools.mft.pattern.mbi.ms.xmlmq.messages"; //$NON-NLS-1$
	private static final Map<String, String> map;	
	private static final String[] enumerations = { "routeDefault", "routeRoute", "destinationCache" };

	public static String getStringStatic(String key) {
		return map.get(key);
	}
		
	public String getString(String key) {
		return map.get(key);
	}

	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_group_instanceName;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_group_patternLevel;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_group_patternLevel_description;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_group_inputInformation;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_group_inputInformation_description;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_group_routing;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_group_routing_description;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_group_selectRoutes;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_group_selectRoutes_description;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_group_lookupRoutes;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_group_lookupRoutes_description;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_group_noRouting;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_group_noRouting_description;

	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_group_log;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_group_log_description;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_group_errorHandling;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_group_errorHandling_description; 

	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_pov_root_instanceName_watermark;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_pov_root_inputQueue_watermark;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_pov_root_containerTag_watermark;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_pov_root_elementName_watermark;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_pov_root_inputMessageType_watermark;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_pov_root_inputMessageFormat_watermark;

	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_pov_root_outputQueue_watermark;

	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_pov_root_routingDB_watermark;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_pov_root_routingcontext_watermark;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_pov_root_key1_watermark;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_pov_root_key2_watermark;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_pov_root_refreshQueue_watermark;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_pov_root_logQueue_watermark;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_pov_root_errorQueue_watermark;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_pov_root_badMsgQueue_watermark;

	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_esql_1;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_esql_2;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_esql_3;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_esql_4;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_esql_5;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_esql_6;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_esql_7;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_esql_8;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_esql_9;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_flow_1;

	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_summary_1;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_summary_2;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_summary_3;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_summary_4;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_summary_5;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_summary_6;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_summary_7;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_summary_8;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_summary_9;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_summary_10;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_summary_11;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_summary_12;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_summary_13;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_summary_13_queueManager;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_summary_14;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_summary_14_queueManager;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_summary_15;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_summary_15_queueManager;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_summary_16;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_summary_16_queueManager;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_summary_18;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_summary_19;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_summary_20;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_summary_21;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_summary_22;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_summary_23;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_summary_24;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_summary_25;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_summary_26;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_summary_27;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_summary_28;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_summary_29;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_summary_30;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_summary_31;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_summary_32;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_summary_33;

	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_pov_validationEnum_None;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_pov_validationEnum_content;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_pov_validationEnum_contentAndValue;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_pov_badMsgEnum_Save;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_pov_badMsgEnum_Cancel;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_pov_routingEnum_routeDefault;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_pov_routingEnum_routeRoute;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_pov_routingEnum_destinationCache;

	// Pattern level
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_pov_root_instanceName;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_pov_root_instanceName_default;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_pov_root_brokerSchema;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_pov_root_flowprefix;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_pov_root_flowsuffix;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_pov_root_queueprefix;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_pov_root_queuesuffix;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_pov_root_shortDescription;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_pov_root_shortDescription_default;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_pov_root_longDescription;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_pov_root_longDescription_default;

	// Input information 			
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_pov_root_inputQueue;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_pov_root_validation;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_pov_root_validation_default;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_pov_root_messageSet;

	// Message information
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_pov_root_containerTag;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_pov_root_containerTag_default;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_pov_root_elementName;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_pov_root_elementName_default;
					    
	// Routing information		
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_pov_root_routingSubflow;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_pov_root_routingSubflow_default;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_pov_root_outputQueueManager;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_pov_root_outputQueue;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_pov_root_routingDB;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_pov_root_routingcontext;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_pov_root_routingcontext_default;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_pov_root_key1;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_pov_root_key2;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_pov_root_cacheRefresh;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_pov_root_refreshQueue;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_pov_root_route;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_pov_root_route_keyLocation;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_pov_root_route_keyValue;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_pov_root_route_queueManager;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_pov_root_route_queue;
	
	// Namespace table
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_pov_root_namespaceTable;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_pov_root_namespaceTable_nsPrefix;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_pov_root_namespaceTable_nsURI;

	// Logging and error handling 
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_pov_root_loggingRequired;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_pov_root_loggingRequired_default;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_pov_root_logQueueManager;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_pov_root_logQueue;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_pov_root_errorMessageRequired;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_pov_root_errorMessageRequired_default;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_pov_root_errorQueueManager;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_pov_root_errorQueue;

	// Bad messages
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_pov_root_badMsgAction;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_pov_root_badMsgAction_default;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_pov_root_badMsgQueueManager;
	public static String com_ibm_etools_mft_pattern_mbi_ms_xmlmq_pov_root_badMsgQueue;

	static {
		NLS.initializeMessages(BUNDLE_NAME, PatternMessages.class);
		PatternPlugin.addBundle(PatternMessages.class);
		map = PatternBundle.createMessageMap(PatternMessages.class, enumerations);
	}
}
