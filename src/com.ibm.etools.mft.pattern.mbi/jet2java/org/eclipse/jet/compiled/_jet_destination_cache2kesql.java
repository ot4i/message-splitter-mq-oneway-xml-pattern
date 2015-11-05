package org.eclipse.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_destination_cache2kesql implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_destination_cache2kesql() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_if_5_1 = new TagInfo("c:if", //$NON-NLS-1$
            5, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "boolean($root/brokerSchema)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_7_1 = new TagInfo("c:if", //$NON-NLS-1$
            7, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "string-length($root/brokerSchema) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_9_15 = new TagInfo("c:get", //$NON-NLS-1$
            9, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/brokerSchema", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_12_18 = new TagInfo("c:get", //$NON-NLS-1$
            12, 18,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@patternName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_12_63 = new TagInfo("c:get", //$NON-NLS-1$
            12, 63,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@patternVersion", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_13_23 = new TagInfo("c:get", //$NON-NLS-1$
            13, 23,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@patternName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_14_26 = new TagInfo("c:get", //$NON-NLS-1$
            14, 26,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@patternVersion", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_37_14 = new TagInfo("c:get", //$NON-NLS-1$
            37, 14,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/key1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_38_14 = new TagInfo("c:get", //$NON-NLS-1$
            38, 14,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/key2", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;

com.ibm.etools.mft.pattern.mbi.plugin.PatternPlugin pattern = com.ibm.etools.mft.pattern.mbi.plugin.PatternPlugin.getInstance();
com.ibm.etools.mft.pattern.mbi.ms.xmlmq.PatternMessages messages = new com.ibm.etools.mft.pattern.mbi.ms.xmlmq.PatternMessages();

        RuntimeTagElement _jettag_c_if_5_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_5_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_5_1.setRuntimeParent(null);
        _jettag_c_if_5_1.setTagInfo(_td_c_if_5_1);
        _jettag_c_if_5_1.doStart(context, out);
        while (_jettag_c_if_5_1.okToProcessBody()) {
            // Tag exists 
            RuntimeTagElement _jettag_c_if_7_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_7_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_7_1.setRuntimeParent(_jettag_c_if_5_1);
            _jettag_c_if_7_1.setTagInfo(_td_c_if_7_1);
            _jettag_c_if_7_1.doStart(context, out);
            while (_jettag_c_if_7_1.okToProcessBody()) {
                // and has a value
                out.write("BROKER SCHEMA ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_9_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_9_15); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_9_15.setRuntimeParent(_jettag_c_if_7_1);
                _jettag_c_get_9_15.setTagInfo(_td_c_get_9_15);
                _jettag_c_get_9_15.doStart(context, out);
                _jettag_c_get_9_15.doEnd();
                out.write(NL);         
                _jettag_c_if_7_1.handleBodyContent(out);
            }
            _jettag_c_if_7_1.doEnd();
            _jettag_c_if_5_1.handleBodyContent(out);
        }
        _jettag_c_if_5_1.doEnd();
        out.write("--  Generated by ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_12_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_12_18); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_12_18.setRuntimeParent(null);
        _jettag_c_get_12_18.setTagInfo(_td_c_get_12_18);
        _jettag_c_get_12_18.doStart(context, out);
        _jettag_c_get_12_18.doEnd();
        out.write(" Version ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_12_63 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_12_63); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_12_63.setRuntimeParent(null);
        _jettag_c_get_12_63.setTagInfo(_td_c_get_12_63);
        _jettag_c_get_12_63.doStart(context, out);
        _jettag_c_get_12_63.doEnd();
        out.write(NL);         
        out.write("--  $MQSI patternName=");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_13_23 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_13_23); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_13_23.setRuntimeParent(null);
        _jettag_c_get_13_23.setTagInfo(_td_c_get_13_23);
        _jettag_c_get_13_23.doStart(context, out);
        _jettag_c_get_13_23.doEnd();
        out.write(" MQSI$");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("--  $MQSI patternVersion=");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_14_26 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_14_26); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_14_26.setRuntimeParent(null);
        _jettag_c_get_14_26.setTagInfo(_td_c_get_14_26);
        _jettag_c_get_14_26.doStart(context, out);
        _jettag_c_get_14_26.doEnd();
        out.write(" MQSI$");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("CREATE COMPUTE MODULE RoutetoDest");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tCREATE FUNCTION Main() RETURNS BOOLEAN");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tBEGIN");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t/****************************************************************************");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t*   Extract destination data based on message   ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t*\tThis version assumes MQ destination");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t*   Any compute node using this ESQL most have the following set:");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t*");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t*   - The database source set to the database containing the routing table");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t*   - The compute mode set to environment.");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t*****************************************************************************/");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("-- Copy LocalEnvironment so content not lost");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tSET OutputLocalEnvironment = InputLocalEnvironment;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("-- Extract the key from the incoming message");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\tDECLARE KEY1 CHARACTER;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tDECLARE KEY2 CHARACTER;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("/******************************************");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("* This is a pattern parameter substitution*");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("*******************************************/");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tSET KEY1 = ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_37_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_37_14); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_37_14.setRuntimeParent(null);
        _jettag_c_get_37_14.setTagInfo(_td_c_get_37_14);
        _jettag_c_get_37_14.doStart(context, out);
        _jettag_c_get_37_14.doEnd();
        out.write(";");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tSET KEY2 = ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_38_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_38_14); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_38_14.setRuntimeParent(null);
        _jettag_c_get_38_14.setTagInfo(_td_c_get_38_14);
        _jettag_c_get_38_14.doStart(context, out);
        _jettag_c_get_38_14.doEnd();
        out.write(";");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tIF KEY1 = NULL OR KEY2 = NULL THEN");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tSET Environment.PatternVariables.RoutingError = '");  //$NON-NLS-1$        
        out.write( pattern.getString("com.ibm.etools.mft.pattern.mbi.ms.xmlmq.esql.9") );
        out.write("'");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t|| CAST(Environment.PatternVariables.NumberOfRecordsFound as CHARACTER);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tSET Environment.PatternVariables.ErrorState = 'Failed';");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tSET Environment.PatternVariables.NumberOfBadRecords = Environment.PatternVariables.NumberOfBadRecords +1;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tPROPAGATE TO TERMINAL 'failure';");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tRETURN FALSE;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tEND IF;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("-- Select queue manager and queue based on key from message\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tSET  OutputLocalEnvironment.Destination.MQDestinationList.DestinationData[] = ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t      (");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t       SELECT S.QUEUE_MANAGER as queueManagerName, S.QUEUE_NAME as queueName ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t       FROM CacheQueueTable.DestinationData[] as S ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t       WHERE ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t        S.VARIABLE1 = KEY1 and");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t        S.VARIABLE2 = KEY2 \t\t        \t\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t        );");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("-- Was a route selected\t\t        ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("IF EXISTS(OutputLocalEnvironment.Destination.MQDestinationList.DestinationData[])");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("-- YES - Propagate to out");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tTHEN RETURN TRUE;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("-- NO - Propagate to failure and set environment");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("ELSE ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tSET Environment.PatternVariables.RoutingError = '");  //$NON-NLS-1$        
        out.write( pattern.getString("com.ibm.etools.mft.pattern.mbi.ms.xmlmq.esql.9") );
        out.write("'");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t|| CAST(Environment.PatternVariables.NumberOfRecordsFound as CHARACTER);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tSET Environment.PatternVariables.ErrorState = 'Failed';");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tSET Environment.PatternVariables.NumberOfBadRecords = Environment.PatternVariables.NumberOfBadRecords +1;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tPROPAGATE TO TERMINAL 'failure';");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tRETURN FALSE;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("END IF;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tEND;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tEND MODULE;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write(NL);         
        out.write(NL);         
        out.write(NL);         
        out.write(NL);         
    }
}
