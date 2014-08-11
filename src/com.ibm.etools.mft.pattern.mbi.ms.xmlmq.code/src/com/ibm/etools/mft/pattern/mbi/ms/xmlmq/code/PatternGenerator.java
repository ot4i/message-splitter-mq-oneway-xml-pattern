/*******************************************************************************
 * Copyright (c) 2014 IBM Corporation and other Contributors
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM - initial implementation
 *******************************************************************************/
package com.ibm.etools.mft.pattern.mbi.ms.xmlmq.code;

import java.util.Vector;

import com.ibm.broker.config.appdev.ESQLModule;
import com.ibm.broker.config.appdev.FlowProperty;
import com.ibm.broker.config.appdev.MessageFlow;
import com.ibm.broker.config.appdev.NamespacePrefixMap;
import com.ibm.broker.config.appdev.Node;
import com.ibm.broker.config.appdev.SubFlowNode;
import com.ibm.broker.config.appdev.UserDefinedProperty;
import com.ibm.broker.config.appdev.nodes.ComputeNode;
import com.ibm.broker.config.appdev.nodes.ComputeNode.ENUM_COMPUTE_COMPUTEMODE;
import com.ibm.broker.config.appdev.nodes.DatabaseNode;
import com.ibm.broker.config.appdev.nodes.FilterNode;
import com.ibm.broker.config.appdev.nodes.FlowOrderNode;
import com.ibm.broker.config.appdev.nodes.InputNode;
import com.ibm.broker.config.appdev.nodes.MQInputNode;
import com.ibm.broker.config.appdev.nodes.MQOutputNode;
import com.ibm.broker.config.appdev.nodes.MQOutputNode.ENUM_MQOUTPUT_TRANSACTIONMODE;
import com.ibm.broker.config.appdev.nodes.OutputNode;
import com.ibm.broker.config.appdev.nodes.PassthroughNode;
import com.ibm.broker.config.appdev.nodes.RouteNode;
import com.ibm.broker.config.appdev.nodes.RouteNode.ENUM_ROUTE_DISTRIBUTIONMODE;
import com.ibm.broker.config.appdev.nodes.RouteNode.FilterTable;
import com.ibm.broker.config.appdev.nodes.RouteNode.FilterTableRow;
import com.ibm.broker.config.appdev.patterns.GeneratePatternInstanceTransform;
import com.ibm.broker.config.appdev.patterns.PatternInstanceManager;
import com.ibm.broker.config.appdev.patterns.PatternParameterRow;
import com.ibm.broker.config.appdev.patterns.PatternParameterTable;

public class PatternGenerator implements GeneratePatternInstanceTransform {

	private enum ROUTING_TYPE {
		no_routing, 
		specify_routes, 
		lookup_routes;
	}; 


	private static final String PROJECT_TITLE = "MessageSplitterMQOneWayProject";

	/** Flows **/
	private static final String FLOW_MESSAGE_SPLITTER = "mqsi/MessageSplitter.msgflow";
	private static final String SUBFLOW_ROUTE = "mqsi/Route.subflow";
	private static final String SUBFLOW_ERROR = "mqsi/Error.subflow";
	private static final String SUBFLOW_LOG = "mqsi/Log.subflow";
	private static final String SUBFLOW_MESSAGE_PROCESSOR = "mqsi/MessageProcessor.subflow";

	/** Nodes **/
	private static final String NODE_MS_INPUT_MESSAGE = "Input Message";
	private static final String NODE_ERROR_CHECK_AT_END = "Error Check at End";
	private static final String NODE_PROPAGATE_RECORD = "Propagate Record";
	private static final String NODE_MESSAGE_PROCESSOR = "Message Processor";
	private static final String NODE_ROUTING = "Routing";
	private static final String NODE_OUTPUT_MESSAGE = "Output Message";
	private static final String NODE_ROUTE_INPUT = "Input";
	private static final String NODE_LOG_MQ_OUTPUT = "MQOutput";
	private static final String NODE_BAD_MESSAGES = "Bad Messages";
	private static final String NODE_GET_ROUTES = "Get Routes";
	private static final String NODE_TRIGGER_CACHE_REFRESH = "Trigger Cache Refresh";
	private static final String NODE_INVALIDATE_CACHE = "Invalidate Cache";
	
	private static final String NODE_ERROR_LOGGING_ON_FILTER = "Error Logging On?";
	private static final String NODE_ERROR_END_FILTER = "End?";
	private static final String NODE_ERROR_BUILD_ERROR_MSG = "Build Error Message";
	private static final String NODE_ERROR_OUTPUT = "Error Output";
	private static final String NODE_ERROR_SAVED_MESSAGES = "Saved Messages?";
	private static final String NODE_ERROR_BUILD_FINAL_MESSAGE = "Build Final Message";
	private static final String NODE_ERROR_FINAL_ERROR_OUTPUT = "Final Error Output";
	
	private static final String NODE_ROUTE_TO_DEST_COMPUTE = "Compute";
	private static final String NODE_ROUTE_FAILURE_NODE = "failure";
	private static final String NODE_ROUTE_ROUTE_1 = "route1";

	/** Properties **/
	private final static String PROPERTY_INPUT_QUEUE = "pp1";
	private final static String PROPERTY_CONTAINER_NAME = "pp2";
	private final static String PROPERTY_MESSAGE_ELEMENT_NAME = "pp3";
	//Routing Type
	private final static String PROPERTY_ROUTING_TYPE = "pp23";
	//No Routing
	private final static String PROPERTY_NR_OUTPUT_QUEUE_MANAGER = "pp4";
	private final static String PROPERTY_NR_OUTPUT_QUEUE = "pp5";
	//Specify routes
	private final static String PROPERTY_SR_NAMESPACE_TABLE = "pp6";
	private final static String PROPERTY_SR_ROUTING_TABLE = "pp7";
	//Lookup routes
	private final static String PROPERTY_LR_DATA_SOURCE = "pp8";
	private final static String PROPERTY_lR_CONTEXT = "pp9";
	private final static String PROPERTY_LR_KEYLOCATION_1 = "pp10";
	private final static String PROPERTY_LR_KEYLOCATION_2 = "pp11";
	private final static String PROPERTY_LR_CACHE_REFRESH = "pp12";
	private final static String PROPERTY_LR_REFRESH_QUEUE = "pp13";
	//Logging
	private final static String PROPERTY_LOGGING_REQUIRED = "pp14";
	private final static String PROPERTY_LOG_QM = "pp16";
	private final static String PROPERTY_LOG_Q = "pp15";
	//Error Handling
	private final static String PROPERTY_ERROR_REQUIRED = "pp17";
	private final static String PROPERTY_ERROR_QM = "pp18";
	private final static String PROPERTY_ERROR_Q = "pp19";
	private final static String PROPERTY_BAD_MESSAGE_ACTION = "pp20";
	private final static String PROPERTY_BAD_MESSAGE_QM = "pp21";
	private final static String PROPERTY_BAD_MESSAGE_Q = "pp22";


	private PatternInstanceManager patternInstanceManager;
	private ROUTING_TYPE routingType;

	@Override
	public void onGeneratePatternInstance(PatternInstanceManager patternInstanceManager) {


		this.patternInstanceManager = patternInstanceManager;

		// The location for the generated projects 
		String location = patternInstanceManager.getWorkspaceLocation();

		// The pattern instance name for this generation
		String patternInstanceName = patternInstanceManager.getPatternInstanceName();

		//Set Input Message Q name
		MessageFlow msgSplitterFlow = this.getMessageSplitterFlow();
		MQInputNode inputMsgMQInput = (MQInputNode) msgSplitterFlow.getNodeByName(NODE_MS_INPUT_MESSAGE);
		inputMsgMQInput.setQueueName(patternInstanceManager.getParameterValue(PROPERTY_INPUT_QUEUE));

		this.routingType = ROUTING_TYPE.valueOf(patternInstanceManager.getParameterValue(PROPERTY_ROUTING_TYPE));

		switch (routingType) {
			case no_routing:
				this.setupNoRouting();
			break;
			case specify_routes:
				this.setupSpecifyRoutes();
			break;
			case lookup_routes:
				this.setupLookupRoutes();
			break;
		}

		//Logging?
		boolean loggingEnabled = this.patternInstanceManager.getParameterValue(PROPERTY_LOGGING_REQUIRED).equals("true");
		if (loggingEnabled) {
			this.setupLogging();
		} else { //Remove Log Flow
			this.patternInstanceManager.removeMessageFlow(this.getLogSubFlow());
		}

		//Error Handling
		boolean errorHandlingEnabled = this.patternInstanceManager.getParameterValue(PROPERTY_ERROR_REQUIRED).equals("true");
		this.setupErrorHandling(errorHandlingEnabled);
	}

	private void setupNoRouting() {

		//Setup Route Subflow
		MessageFlow routeSubFlow = this.getRouteSubFlow();
		InputNode routeInputNode = (InputNode) routeSubFlow.getNodeByName(NODE_ROUTE_INPUT);

		PassthroughNode passThruNode = new PassthroughNode();
		routeSubFlow.addNode(passThruNode);
		routeSubFlow.connect(routeInputNode.OUTPUT_TERMINAL_OUT, passThruNode.INPUT_TERMINAL_IN);

		OutputNode routeOutputNode = new OutputNode();
		routeOutputNode.setNodeName("route1");
		routeSubFlow.addNode(routeOutputNode);
		routeSubFlow.connect(passThruNode.OUTPUT_TERMINAL_OUT, routeOutputNode.INPUT_TERMINAL_IN);


		//Add common nodes to message splitter flow
		Node messageProcessorSubFlow = this.prepareMessageSplitterFlow();

		MessageFlow msgSplitterFlow = this.getMessageSplitterFlow();

		//Add Routing SubFlow Node
		SubFlowNode routingSubFlow = new SubFlowNode();
		routingSubFlow.setNodeName(NODE_ROUTING);
		routingSubFlow.setSubFlow(this.getRouteSubFlow());
		msgSplitterFlow.addNode(routingSubFlow);
		msgSplitterFlow.connect(messageProcessorSubFlow.getOutputTerminal("Output"), routingSubFlow.getInputTerminal("Input"));

		//Add Output Message MQInput Node
		MQOutputNode outputMessageMqOut = new MQOutputNode();
		outputMessageMqOut.setNodeName(NODE_OUTPUT_MESSAGE);
		outputMessageMqOut.setQueueName(patternInstanceManager.getParameterValue(PROPERTY_NR_OUTPUT_QUEUE));
		outputMessageMqOut.setQueueManagerName(patternInstanceManager.getParameterValue(PROPERTY_NR_OUTPUT_QUEUE_MANAGER));
		msgSplitterFlow.addNode(outputMessageMqOut);
		msgSplitterFlow.connect(routingSubFlow.getOutputTerminal("route1"), outputMessageMqOut.INPUT_TERMINAL_IN);
	}

	private void setupSpecifyRoutes() {

		PatternParameterTable routingValues = this.patternInstanceManager.getParameterTable(PROPERTY_SR_ROUTING_TABLE);
		PatternParameterTable namespaceValues = this.patternInstanceManager.getParameterTable(PROPERTY_SR_NAMESPACE_TABLE);

		//Add common nodes to message splitter flow
		Node messageProcessorSubFlow = this.prepareMessageSplitterFlow();

		MessageFlow msgSplitterFlow = this.getMessageSplitterFlow();

		//Setup Route Subflow
		MessageFlow routeSubFlow = this.getRouteSubFlow();
		InputNode routeInputNode = (InputNode) routeSubFlow.getNodeByName(NODE_ROUTE_INPUT);

		RouteNode routeNode = new RouteNode();
		routeNode.setDistributionMode(ENUM_ROUTE_DISTRIBUTIONMODE.first);
		routeSubFlow.addNode(routeNode);
		//Connect input to route node
		routeSubFlow.connect(routeInputNode.OUTPUT_TERMINAL_OUT, routeNode.INPUT_TERMINAL_IN);

		//Add Route Node to MessageSplitter
		SubFlowNode routingSubFlowNode = new SubFlowNode();
		routingSubFlowNode.setNodeName(NODE_ROUTING);
		routingSubFlowNode.setSubFlow(routeSubFlow);
		msgSplitterFlow.addNode(routingSubFlowNode);
		msgSplitterFlow.connect(messageProcessorSubFlow.getOutputTerminal("Output"), routingSubFlowNode.getInputTerminal("Input"));

		//Add namespaces
		if (namespaceValues.getRowCount() > 0) {

			Vector<NamespacePrefixMap> NsMaps = new Vector<NamespacePrefixMap>();

			for (int i = 0; i < namespaceValues.getRowCount(); i++) {
				PatternParameterRow row = namespaceValues.getRow(i);
				String prefix = row.getValue("namespaceprefix");
				String uri = row.getValue("namespaceuri");
				NamespacePrefixMap NsMap = new NamespacePrefixMap();
				NsMap.setNsPrefix(prefix);
				NsMap.setNamespace(uri);
				NsMaps.add(NsMap);
			}

			routeNode.setNsmappingtables(NsMaps);
		}

		//Add filters
		if (routingValues.getRowCount() > 0) {

			FilterTable filterTable = routeNode.getFilterTable();

			for (int i =0; i < routingValues.getRowCount(); i++) {

				String outputTerminalName = "match"+(i+1);

				PatternParameterRow filterRow = routingValues.getRow(i);

				String keyLocation = filterRow.getValue("keylocation");
				String keyValue = filterRow.getValue("keyvalue");
				String queueManager = filterRow.getValue("queuemanager");
				String queueName = filterRow.getValue("queue");

				FilterTableRow tableRow = filterTable.createRow();
				tableRow.setFilterPattern(keyLocation + "=\"" + keyValue + "\"");
				tableRow.setRoutingOutputTerminal(outputTerminalName);

				filterTable.addRow(tableRow);

				OutputNode outputNode = new OutputNode();
				outputNode.setNodeName(outputTerminalName);


				routeSubFlow.addNode(outputNode);
				routeSubFlow.connect(routeNode.getOutputTerminal(outputTerminalName), outputNode.INPUT_TERMINAL_IN);

				//Connect to MQOutput in RecordDistributor
				MQOutputNode mqOut = new MQOutputNode();
				mqOut.setNodeName("Output"+(i+1));
				mqOut.setQueueManagerName(queueManager);
				mqOut.setQueueName(queueName);
				mqOut.setTransactionMode(ENUM_MQOUTPUT_TRANSACTIONMODE.yes);
				msgSplitterFlow.addNode(mqOut);
				msgSplitterFlow.connect(routingSubFlowNode.getOutputTerminal(outputTerminalName), mqOut.INPUT_TERMINAL_IN);
			}
		}

		//Add Failure OutputNode
		OutputNode failureOutputNode = new OutputNode();
		failureOutputNode.setNodeName(NODE_ROUTE_FAILURE_NODE);
		routeSubFlow.addNode(failureOutputNode);

		//Add Default route
		ComputeNode setRoutingError = new ComputeNode();
		setRoutingError.setNodeName("Set Routing Error");
		ESQLModule setRoutingErrorESQL = new ESQLModule();
		setRoutingErrorESQL.setBrokerSchema("mqsi");
		setRoutingErrorESQL.setEsqlMain("SetRoutingError");
		setRoutingError.setComputeExpression(setRoutingErrorESQL);
		routeSubFlow.addNode(setRoutingError);
		routeSubFlow.connect(routeNode.OUTPUT_TERMINAL_DEFAULT, setRoutingError.INPUT_TERMINAL_IN);
		routeSubFlow.connect(setRoutingError.OUTPUT_TERMINAL_OUT, failureOutputNode.INPUT_TERMINAL_IN);

		//Add Failure
		ComputeNode setOtherError = new ComputeNode();
		setOtherError.setNodeName("Set Other Error");
		ESQLModule setOtherErrorESQL = new ESQLModule();
		setOtherErrorESQL.setBrokerSchema("mqsi");
		setOtherErrorESQL.setEsqlMain("SetOtherError");
		setOtherError.setComputeExpression(setOtherErrorESQL);
		routeSubFlow.addNode(setOtherError);
		routeSubFlow.connect(routeNode.OUTPUT_TERMINAL_DEFAULT, setOtherError.INPUT_TERMINAL_IN);
		routeSubFlow.connect(setOtherError.OUTPUT_TERMINAL_OUT, failureOutputNode.INPUT_TERMINAL_IN);


	}

	private void setupLookupRoutes() {
		MessageFlow msgSplitterFlow = this.getMessageSplitterFlow();
		
		//Add common nodes to message splitter flow
		Node messageProcessorSubFlow = this.prepareMessageSplitterFlow();
		
		// Populate Route SubFlow
		MessageFlow routeSubFlow = this.getRouteSubFlow();
		InputNode routeInputNode = (InputNode) routeSubFlow.getNodeByName(NODE_ROUTE_INPUT);

		//Add RoutetoDest Compute Node
		ComputeNode routeToDestCompute = new ComputeNode();
		routeToDestCompute.setNodeName(NODE_ROUTE_TO_DEST_COMPUTE);
		routeToDestCompute.setComputeMode(ENUM_COMPUTE_COMPUTEMODE.destinationAndMessage);
		ESQLModule routeToDestEsql = new ESQLModule();
		routeToDestEsql.setBrokerSchema("mqsi");
		routeToDestEsql.setEsqlMain("RoutetoDest");
		routeToDestCompute.setComputeExpression(routeToDestEsql);
		routeSubFlow.addNode(routeToDestCompute);
		routeSubFlow.connect(routeInputNode.OUTPUT_TERMINAL_OUT, routeToDestCompute.INPUT_TERMINAL_IN);
		
		//Add Output Nodes
		OutputNode failureOutputNode = new OutputNode();
		failureOutputNode.setNodeName(NODE_ROUTE_FAILURE_NODE);
		routeSubFlow.addNode(failureOutputNode);
		routeSubFlow.connect(routeToDestCompute.OUTPUT_TERMINAL_FAILURE, failureOutputNode.INPUT_TERMINAL_IN);
		
		OutputNode route1OutputNode = new OutputNode();
		route1OutputNode.setNodeName(NODE_ROUTE_ROUTE_1);
		routeSubFlow.addNode(route1OutputNode);
		routeSubFlow.connect(routeToDestCompute.OUTPUT_TERMINAL_FAILURE, route1OutputNode.INPUT_TERMINAL_IN);
		
		
		//Add Route Node to MessageSplitter
		SubFlowNode routingSubFlowNode = new SubFlowNode();
		routingSubFlowNode.setNodeName(NODE_ROUTING);
		routingSubFlowNode.setSubFlow(routeSubFlow);
		msgSplitterFlow.addNode(routingSubFlowNode);
		msgSplitterFlow.connect(messageProcessorSubFlow.getOutputTerminal("Output"), routingSubFlowNode.getInputTerminal("Input"));
	
		
		//Add Output Message MQOutput to MessageSplitter
		MQOutputNode outputMessage = new MQOutputNode();
		outputMessage.setNodeName(NODE_OUTPUT_MESSAGE);
		msgSplitterFlow.addNode(outputMessage);
		msgSplitterFlow.connect(routingSubFlowNode.getOutputTerminal(NODE_ROUTE_ROUTE_1), outputMessage.INPUT_TERMINAL_IN);
		
		//Add Cache Refresh 
		boolean cacheRefreshRequired = this.patternInstanceManager.getParameterValue(PROPERTY_LR_CACHE_REFRESH).equals("true");
		
		if (cacheRefreshRequired) {
			String refreshQName =  this.patternInstanceManager.getParameterValue(PROPERTY_LR_REFRESH_QUEUE);
			MQInputNode cacheRefreshMQInput = new MQInputNode();
			cacheRefreshMQInput.setNodeName(NODE_TRIGGER_CACHE_REFRESH);
			cacheRefreshMQInput.setQueueName(refreshQName);
			msgSplitterFlow.addNode(cacheRefreshMQInput);
			
			ComputeNode invalidateCacheCompute  = new ComputeNode();
			invalidateCacheCompute.setNodeName(NODE_INVALIDATE_CACHE);
			ESQLModule invalidateCacheEsql = new ESQLModule();
			invalidateCacheEsql.setBrokerSchema("mqsi");
			invalidateCacheEsql.setEsqlMain("Invalidatecache");
			invalidateCacheCompute.setComputeExpression(invalidateCacheEsql);
			msgSplitterFlow.addNode(invalidateCacheCompute);
			msgSplitterFlow.connect(cacheRefreshMQInput.OUTPUT_TERMINAL_OUT, invalidateCacheCompute.INPUT_TERMINAL_IN);
			
		}
	}

	private Node prepareMessageSplitterFlow() {
		//Setup MessageSplitter Flow
		MessageFlow msgSplitterFlow = this.getMessageSplitterFlow();

		MQInputNode inputMsgNode = (MQInputNode) msgSplitterFlow.getNodeByName(NODE_MS_INPUT_MESSAGE);
		
		// Add Error Check at End Flow Order Node
		FlowOrderNode errorCheckFlowOrder = new FlowOrderNode();
		errorCheckFlowOrder.setNodeName(NODE_ERROR_CHECK_AT_END);
		msgSplitterFlow.addNode(errorCheckFlowOrder);
	
		//If Lookup routes selected then add DBNode Get Routes

		if (this.routingType.equals(ROUTING_TYPE.lookup_routes)) {
			String dataSource = this.patternInstanceManager.getParameterValue(PROPERTY_LR_DATA_SOURCE);
			
			DatabaseNode getRoutesNode = new DatabaseNode();
			getRoutesNode.setNodeName(NODE_GET_ROUTES);
			getRoutesNode.setDataSource(dataSource);
			ESQLModule checkCacheEsql = new ESQLModule();
			checkCacheEsql.setBrokerSchema("mqsi");
			checkCacheEsql.setEsqlMain("CheckCache");
			getRoutesNode.setStatement(checkCacheEsql);
			
			msgSplitterFlow.addNode(getRoutesNode);
			msgSplitterFlow.connect(inputMsgNode.OUTPUT_TERMINAL_OUT, getRoutesNode.INPUT_TERMINAL_IN);
			msgSplitterFlow.connect(getRoutesNode.OUTPUT_TERMINAL_OUT, errorCheckFlowOrder.INPUT_TERMINAL_IN);
		} else {
			msgSplitterFlow.connect(inputMsgNode.OUTPUT_TERMINAL_OUT, errorCheckFlowOrder.INPUT_TERMINAL_IN);
		}

		// Add Propagate Record Compute Node
		ComputeNode propagateRecordComputeNode = new ComputeNode();
		propagateRecordComputeNode.setNodeName(NODE_PROPAGATE_RECORD);
		ESQLModule extractRecordEsql = new ESQLModule();
		extractRecordEsql.setBrokerSchema("mqsi");
		extractRecordEsql.setEsqlMain("ExtractRecords");
		propagateRecordComputeNode.setComputeExpression(extractRecordEsql);
		msgSplitterFlow.addNode(propagateRecordComputeNode);
		msgSplitterFlow.connect(errorCheckFlowOrder.OUTPUT_TERMINAL_FIRST, propagateRecordComputeNode.INPUT_TERMINAL_IN);

		//Add Message Processor SubFlow Node
		SubFlowNode messageProcessorSubFlow = new SubFlowNode();
		messageProcessorSubFlow.setNodeName(NODE_MESSAGE_PROCESSOR);
		messageProcessorSubFlow.setSubFlow(this.getMessageProcessorSubflow());
		msgSplitterFlow.addNode(messageProcessorSubFlow);
		msgSplitterFlow.connect(propagateRecordComputeNode.OUTPUT_TERMINAL_OUT, messageProcessorSubFlow.getInputTerminal("Input"));

		return messageProcessorSubFlow;
	}

	private void setupErrorHandling(boolean errorHandlingRequired) {
		MessageFlow msgSplitterFlow = this.getMessageSplitterFlow();
		MessageFlow errorSubFlow = this.getErrorSubFlow();

		FlowOrderNode errorCheckFlowOrder = (FlowOrderNode) msgSplitterFlow.getNodeByName(NODE_ERROR_CHECK_AT_END);

		SubFlowNode errorSubFlowNode = new SubFlowNode();
		errorSubFlowNode.setSubFlow(errorSubFlow);
		errorSubFlowNode.setNodeName("Error");
		msgSplitterFlow.addNode(errorSubFlowNode);
		//Connect to InputMessage in message splitter flow
		MQInputNode inputMsg = (MQInputNode) msgSplitterFlow.getNodeByName(NODE_MS_INPUT_MESSAGE);
		msgSplitterFlow.connect(inputMsg.OUTPUT_TERMINAL_CATCH, errorSubFlowNode.getInputTerminal("Input"));

		FilterNode errorLoggingOnFilter = (FilterNode) errorSubFlow.getNodeByName(NODE_ERROR_LOGGING_ON_FILTER);

		//Add Throw Compute Node
		ComputeNode throwComputeNode = new ComputeNode();
		throwComputeNode.setNodeName("Throw");
		ESQLModule throwEsql = new ESQLModule();
		throwEsql.setBrokerSchema("mqsi");
		throwEsql.setEsqlMain("Cancel");
		throwComputeNode.setComputeExpression(throwEsql);
		throwComputeNode.setComputeMode(ENUM_COMPUTE_COMPUTEMODE.exceptionAndMessage);
		throwComputeNode.setThrowExceptionOnDatabaseError(false);
		errorSubFlow.addNode(throwComputeNode);

		errorSubFlow.connect(errorLoggingOnFilter.OUTPUT_TERMINAL_FALSE, throwComputeNode.INPUT_TERMINAL_IN);

		String badMessageAction = this.patternInstanceManager.getParameterValue(PROPERTY_BAD_MESSAGE_ACTION);

		if (errorHandlingRequired) {




			//Add User Defined Property
			UserDefinedProperty errorLoggingOn = new UserDefinedProperty("Basic", "ErrorLoggingOn", 
					FlowProperty.Usage.MANDATORY, FlowProperty.Type.BOOLEAN, true);

			errorSubFlow.addFlowProperty(errorLoggingOn);

			FilterNode endFilter = (FilterNode) errorSubFlow.getNodeByName(NODE_ERROR_END_FILTER);

			String qName = this.patternInstanceManager.getParameterValue(PROPERTY_ERROR_Q);
			String qManager = this.patternInstanceManager.getParameterValue(PROPERTY_ERROR_QM);

			//Build Error Message and Send to Error Output
			ComputeNode buildErrorMessageCompute = new ComputeNode();
			buildErrorMessageCompute.setNodeName(NODE_ERROR_BUILD_ERROR_MSG);
			ESQLModule buildErrorMsgEsql = new ESQLModule();
			buildErrorMsgEsql.setBrokerSchema("mqsi");
			buildErrorMsgEsql.setEsqlMain("Build_Error_Message");
			buildErrorMessageCompute.setComputeExpression(buildErrorMsgEsql);
			buildErrorMessageCompute.setThrowExceptionOnDatabaseError(false);
			errorSubFlow.addNode(buildErrorMessageCompute);
			errorSubFlow.connect(errorLoggingOnFilter.OUTPUT_TERMINAL_TRUE, buildErrorMessageCompute.INPUT_TERMINAL_IN);

			//Add Error Output MQOutput Node
			MQOutputNode errorOutput = new MQOutputNode();
			errorOutput.setNodeName(NODE_ERROR_OUTPUT);
			errorOutput.setQueueName(qName);
			errorOutput.setQueueManagerName(qManager);
			errorSubFlow.addNode(errorOutput);
			errorSubFlow.connect(buildErrorMessageCompute.OUTPUT_TERMINAL_OUT, errorOutput.INPUT_TERMINAL_IN);
			errorSubFlow.connect(errorOutput.OUTPUT_TERMINAL_OUT, throwComputeNode.INPUT_TERMINAL_IN);
			errorSubFlow.connect(errorOutput.OUTPUT_TERMINAL_FAILURE, throwComputeNode.INPUT_TERMINAL_IN);

			if (!routingType.equals(ROUTING_TYPE.no_routing) && badMessageAction.equals("save")) {

				//Connect Error Subflow node to Error Check at End filter
				msgSplitterFlow.connect(errorCheckFlowOrder.OUTPUT_TERMINAL_SECOND, errorSubFlowNode.getInputTerminal("Input"));

				//Build Final Message
				FilterNode savedMessagesFilter = new FilterNode();
				savedMessagesFilter.setNodeName(NODE_ERROR_SAVED_MESSAGES);
				ESQLModule checkSavedMessagesEsql = new ESQLModule();
				checkSavedMessagesEsql.setBrokerSchema("mqsi");
				checkSavedMessagesEsql.setEsqlMain("CheckSavedMessages");
				savedMessagesFilter.setFilterExpression(checkSavedMessagesEsql);
				errorSubFlow.addNode(savedMessagesFilter);
				errorSubFlow.connect(endFilter.OUTPUT_TERMINAL_TRUE, savedMessagesFilter.INPUT_TERMINAL_IN);

				ComputeNode buildFinalMessage = new ComputeNode();
				buildFinalMessage.setNodeName(NODE_ERROR_BUILD_FINAL_MESSAGE);
				ESQLModule buildFinalMessageEsql = new ESQLModule();
				buildFinalMessageEsql.setBrokerSchema("mqsi");
				buildFinalMessageEsql.setEsqlMain("BuildFinalMessage");
				buildFinalMessage.setComputeExpression(buildFinalMessageEsql);
				errorSubFlow.addNode(buildFinalMessage);
				errorSubFlow.connect(savedMessagesFilter.OUTPUT_TERMINAL_TRUE, buildFinalMessage.INPUT_TERMINAL_IN);

				MQOutputNode finalErrorOutput = new MQOutputNode();
				finalErrorOutput.setNodeName(NODE_ERROR_FINAL_ERROR_OUTPUT);
				finalErrorOutput.setQueueName(qName);
				finalErrorOutput.setQueueManagerName(qManager);
				errorSubFlow.addNode(finalErrorOutput);
				errorSubFlow.connect(buildFinalMessage.OUTPUT_TERMINAL_OUT, finalErrorOutput.INPUT_TERMINAL_IN);
			}
		} 

		if (!routingType.equals(ROUTING_TYPE.no_routing) && badMessageAction.equals("save")) {
			//Add Bad Messages MQOutput
			MQOutputNode badMessages = new MQOutputNode();
			badMessages.setNodeName(NODE_BAD_MESSAGES);
			String badQName = this.patternInstanceManager.getParameterValue(PROPERTY_BAD_MESSAGE_Q);
			String badQM = this.patternInstanceManager.getParameterValue(PROPERTY_BAD_MESSAGE_QM);
			badMessages.setQueueName(badQName);
			badMessages.setQueueManagerName(badQM);
			msgSplitterFlow.addNode(badMessages);
			msgSplitterFlow.connect(msgSplitterFlow.getNodeByName(NODE_ROUTING).getOutputTerminal(NODE_ROUTE_FAILURE_NODE), badMessages.INPUT_TERMINAL_IN);
		}
	}

	private void setupLogging() {
		MessageFlow msgSplitterFlow = this.getMessageSplitterFlow();
		MessageFlow logSubflow = this.getLogSubFlow();

		FlowOrderNode errorCheckFlowOrder = (FlowOrderNode) msgSplitterFlow.getNodeByName(NODE_ERROR_CHECK_AT_END);

		MQOutputNode mqOutput = (MQOutputNode) logSubflow.getNodeByName(NODE_LOG_MQ_OUTPUT);
		String qName = this.patternInstanceManager.getParameterValue(PROPERTY_LOG_Q);
		String qManager = this.patternInstanceManager.getParameterValue(PROPERTY_LOG_QM);

		mqOutput.setQueueName(qName);
		mqOutput.setQueueManagerName(qManager);

		//Add SubFlowNode
		SubFlowNode logSubFlow = new SubFlowNode();
		logSubFlow.setNodeName("Log");
		logSubFlow.setSubFlow(logSubflow);
		msgSplitterFlow.addNode(logSubFlow);
		msgSplitterFlow.connect(errorCheckFlowOrder.OUTPUT_TERMINAL_SECOND, logSubFlow.getInputTerminal("Input"));

		//Add User Defined Property
		UserDefinedProperty loggingUDP = new UserDefinedProperty("Basic", "LoggingOn", 
				FlowProperty.Usage.MANDATORY, FlowProperty.Type.BOOLEAN, true);


		msgSplitterFlow.addFlowProperty(loggingUDP);
	}

	private MessageFlow getMessageSplitterFlow() {
		return this.patternInstanceManager.getMessageFlow(PROJECT_TITLE, FLOW_MESSAGE_SPLITTER);
	}

	private MessageFlow getMessageProcessorSubflow() {
		return this.patternInstanceManager.getMessageFlow(PROJECT_TITLE, SUBFLOW_MESSAGE_PROCESSOR);
	}

	private MessageFlow getRouteSubFlow() {
		return this.patternInstanceManager.getMessageFlow(PROJECT_TITLE, SUBFLOW_ROUTE);
	}

	private MessageFlow getLogSubFlow() {
		return this.patternInstanceManager.getMessageFlow(PROJECT_TITLE, SUBFLOW_LOG);
	}

	private MessageFlow getErrorSubFlow() {
		return this.patternInstanceManager.getMessageFlow(PROJECT_TITLE, SUBFLOW_ERROR);
	}
}
