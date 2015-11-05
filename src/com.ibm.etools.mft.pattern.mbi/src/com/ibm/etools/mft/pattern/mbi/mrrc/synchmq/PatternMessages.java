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
package com.ibm.etools.mft.pattern.mbi.mrrc.synchmq;

import java.util.Map;
import org.eclipse.osgi.util.NLS;
import com.ibm.etools.mft.pattern.mbi.plugin.PatternBundle;
import com.ibm.etools.mft.pattern.mbi.plugin.PatternPlugin;
import com.ibm.etools.patterns.model.base.IPatternBundle;

public class PatternMessages extends PatternBundle implements IPatternBundle {
	private static final String BUNDLE_NAME = "com.ibm.etools.mft.pattern.mbi.mrrc.synchmq.messages"; //$NON-NLS-1$
	private static final Map<String, String> map;	
	private static final String[] enumerations = { "MQEI_UNLIMITED" }; //$NON-NLS-1$

	public static String getStringStatic(String key) {
		return map.get(key);
	}
	
	public String getString(String key) {
		return map.get(key);
	}
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_group_instanceName;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_group_instanceName_description;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_group_inputInformation;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_group_inputInformation_description;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_group_providerInformation;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_group_providerInformation_description;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_group_responseInformation;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_group_responseInformation_description;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_group_log;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_group_log_description;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_group_errorHandling;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_group_errorHandling_description;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_group_general;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_group_general_description;		

	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_pov_root_instanceName;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_pov_root_instanceName_watermark;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_pov_root_instanceName_default;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_pov_root_readRequestQueue;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_pov_root_readRequestQueue_watermark;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_pov_root_validationofRequest;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_pov_root_validationofRequest_watermark;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_pov_root_inputDataType;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_pov_root_inputDataType_watermark;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_pov_root_inputMessageSet;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_pov_root_inputMessageSet_watermark;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_pov_root_inputMessageType;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_pov_root_inputMessageType_watermark;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_pov_root_inputMessageFormat;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_pov_root_inputMessageFormat_watermark;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_pov_root_providerRequestQueueManager;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_pov_root_providerRequestQueueManager_watermark;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_pov_root_providerRequestQueue;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_pov_root_providerRequestQueue_watermark;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_pov_root_maximumResponseTime;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_pov_root_maximumResponseTime_watermark;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_pov_root_storeQueue;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_pov_root_storeQueue_watermark;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_pov_root_responseQueue;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_pov_root_responseQueue_watermark;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_pov_root_validationofResponse;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_pov_root_validationofResponse_watermark;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_pov_root_responseDataType;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_pov_root_responseDataType_watermark;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_pov_root_responseMessageSet;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_pov_root_responseMessageSet_watermark;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_pov_root_responseMessageType;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_pov_root_responseMessageType_watermark;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_pov_root_responseMessageFormat;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_pov_root_responseMessageFormat_watermark;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_pov_root_loggingRequired;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_pov_root_loggingRequired_watermark;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_pov_root_logQueueManager;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_pov_root_logQueueManager_watermark;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_pov_root_logQueue;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_pov_root_logQueue_watermark;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_pov_root_errorMessageRequired;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_pov_root_errorMessageRequired_watermark;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_pov_root_errorQueueManager;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_pov_root_errorQueueManager_watermark;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_pov_root_errorQueue;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_pov_root_errorQueue_watermark;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_pov_root_brokerSchema;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_pov_root_brokerSchema_watermark;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_pov_root_flowPrefix;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_pov_root_flowPrefix_watermark;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_pov_root_flowSuffix;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_pov_root_flowSuffix_watermark;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_pov_root_queuePrefix;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_pov_root_queuePrefix_watermark;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_pov_root_queueSuffix;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_pov_root_queueSuffix_watermark;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_pov_root_shortDescription;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_pov_root_shortDescription_watermark;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_pov_root_longDescription;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_pov_root_longDescription_watermark;		
	
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_pov_validationEnum_None;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_pov_validationEnum_content;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_pov_validationEnum_contentAndValue;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_pov_mdtypeEnum_XML;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_pov_mdtypeEnum_binaryData;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_pov_mdtypeEnum_textData;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_pov_responseTimeEnum_MQEI_UNLIMITED;

	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_esql_1;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_esql_2;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_esql_3;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_esql_4;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_esql_5;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_esql_6;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_esql_7;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_esql_8;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_esql_9;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_esql_10;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_esql_11;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_esql_12;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_flow_1;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_jet_1;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_jet_2;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_jet_3;		

	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_summary_1;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_summary_3;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_summary_4;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_summary_5;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_summary_6;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_summary_7;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_summary_8;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_summary_9;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_summary_10;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_summary_10_queueManager;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_summary_11;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_summary_11_queueManager;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_summary_12;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_summary_12_queueManager;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_summary_14;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_summary_15;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_summary_16;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_summary_17;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_summary_18;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_summary_19;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_summary_20;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_summary_22;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_summary_23;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_summary_24;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_summary_101;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_summary_102;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_summary_103;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_summary_104;		
	public static String com_ibm_etools_mft_pattern_mbi_mrrc_synchmq_summary_105;		
	
	static {
		NLS.initializeMessages(BUNDLE_NAME, PatternMessages.class);
		PatternPlugin.addBundle(PatternMessages.class);
		map = PatternBundle.createMessageMap(PatternMessages.class, enumerations);
	}
}
