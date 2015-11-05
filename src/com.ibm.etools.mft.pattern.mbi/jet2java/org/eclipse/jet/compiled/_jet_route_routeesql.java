package org.eclipse.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_route_routeesql implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_route_routeesql() {
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
        out.write("\tCREATE COMPUTE MODULE SetRoutingError");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tCREATE FUNCTION Main() RETURNS BOOLEAN");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tBEGIN");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tSET Environment.PatternVariables.RoutingError = '");  //$NON-NLS-1$        
        out.write( pattern.getString("com.ibm.etools.mft.pattern.mbi.ms.xmlmq.esql.8") );
        out.write(" '");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t|| CAST(Environment.PatternVariables.NumberOfRecordsFound AS CHARACTER);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tSET Environment.PatternVariables.ErrorState = 'Failed';");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tSET Environment.PatternVariables.NumberOfBadRecords = Environment.PatternVariables.NumberOfBadRecords +1;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("-- This is required so that message can be written to bad messages queue");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tSET OutputRoot = InputRoot;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tEND;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tEND MODULE;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tCREATE COMPUTE MODULE SetOtherError");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tCREATE FUNCTION Main() RETURNS BOOLEAN");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tBEGIN");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tSET Environment.PatternVariables.RoutingError = '");  //$NON-NLS-1$        
        out.write( pattern.getString("com.ibm.etools.mft.pattern.mbi.ms.xmlmq.esql.7") );
        out.write(" '");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t|| CAST(Environment.PatternVariables.NumberOfRecordsFound AS CHARACTER);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tSET Environment.PatternVariables.ErrorState = 'Failed';");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tSET Environment.PatternVariables.NumberOfBadRecords = Environment.PatternVariables.NumberOfBadRecords +1;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("-- This is required so that message can be written to bad messages queue");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tSET OutputRoot = InputRoot;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tEND;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tEND MODULE;");  //$NON-NLS-1$        
    }
}
