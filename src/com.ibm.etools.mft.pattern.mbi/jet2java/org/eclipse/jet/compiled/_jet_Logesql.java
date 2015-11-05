package org.eclipse.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_Logesql implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_Logesql() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_if_1_1 = new TagInfo("c:if", //$NON-NLS-1$
            1, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "boolean($root/brokerSchema)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_3_1 = new TagInfo("c:if", //$NON-NLS-1$
            3, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "string-length($root/brokerSchema) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_5_15 = new TagInfo("c:get", //$NON-NLS-1$
            5, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/brokerSchema", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_8_18 = new TagInfo("c:get", //$NON-NLS-1$
            8, 18,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@patternName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_8_63 = new TagInfo("c:get", //$NON-NLS-1$
            8, 63,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@patternVersion", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_9_23 = new TagInfo("c:get", //$NON-NLS-1$
            9, 23,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@patternName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_10_26 = new TagInfo("c:get", //$NON-NLS-1$
            10, 26,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@patternVersion", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        RuntimeTagElement _jettag_c_if_1_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_1_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_1_1.setRuntimeParent(null);
        _jettag_c_if_1_1.setTagInfo(_td_c_if_1_1);
        _jettag_c_if_1_1.doStart(context, out);
        while (_jettag_c_if_1_1.okToProcessBody()) {
            // Tag exists 
            RuntimeTagElement _jettag_c_if_3_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_3_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_3_1.setRuntimeParent(_jettag_c_if_1_1);
            _jettag_c_if_3_1.setTagInfo(_td_c_if_3_1);
            _jettag_c_if_3_1.doStart(context, out);
            while (_jettag_c_if_3_1.okToProcessBody()) {
                // and has a value
                out.write("BROKER SCHEMA ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_5_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_5_15); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_5_15.setRuntimeParent(_jettag_c_if_3_1);
                _jettag_c_get_5_15.setTagInfo(_td_c_get_5_15);
                _jettag_c_get_5_15.doStart(context, out);
                _jettag_c_get_5_15.doEnd();
                out.write(NL);         
                _jettag_c_if_3_1.handleBodyContent(out);
            }
            _jettag_c_if_3_1.doEnd();
            _jettag_c_if_1_1.handleBodyContent(out);
        }
        _jettag_c_if_1_1.doEnd();
        out.write("--  Generated by ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_8_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_8_18); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_8_18.setRuntimeParent(null);
        _jettag_c_get_8_18.setTagInfo(_td_c_get_8_18);
        _jettag_c_get_8_18.doStart(context, out);
        _jettag_c_get_8_18.doEnd();
        out.write(" Version ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_8_63 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_8_63); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_8_63.setRuntimeParent(null);
        _jettag_c_get_8_63.setTagInfo(_td_c_get_8_63);
        _jettag_c_get_8_63.doStart(context, out);
        _jettag_c_get_8_63.doEnd();
        out.write(NL);         
        out.write("--  $MQSI patternName=");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_9_23 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_9_23); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_9_23.setRuntimeParent(null);
        _jettag_c_get_9_23.setTagInfo(_td_c_get_9_23);
        _jettag_c_get_9_23.doStart(context, out);
        _jettag_c_get_9_23.doEnd();
        out.write(" MQSI$");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("--  $MQSI patternVersion=");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_10_26 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_10_26); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_10_26.setRuntimeParent(null);
        _jettag_c_get_10_26.setTagInfo(_td_c_get_10_26);
        _jettag_c_get_10_26.doStart(context, out);
        _jettag_c_get_10_26.doEnd();
        out.write(" MQSI$");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("CREATE Compute MODULE CreateLogMessage");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("CREATE FUNCTION main() RETURNS BOOLEAN BEGIN");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("-- Create logging info in MQRFH2 - add to existing message");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tSET OutputRoot = InputRoot;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("DECLARE outRef REFERENCE TO OutputRoot.MQRFH2;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" IF LASTMOVE(outRef) THEN");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" -- MQRFH2 EXISTS");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    SET outRef.usr.BrokerName = SQL.BrokerName;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    SET outRef.usr.MessageFlowLabel = SQL.MessageFlowLabel; ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    SET outRef.usr.DTSTAMP =   CURRENT_TIMESTAMP; ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" ELSE");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" -- CREATE THE MQRFH2 Header first");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    DECLARE MQMDRef REFERENCE TO OutputRoot.MQMD;\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    CREATE NEXTSIBLING OF MQMDRef AS outRef DOMAIN('MQRFH2') NAME 'MQRFH2';");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    SET outRef.(MQRFH2.Field)Version = 2;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    SET outRef.(MQRFH2.Field)Encoding = InputRoot.MQMD.Encoding;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    SET outRef.(MQRFH2.Field)CodedCharSetId = InputRoot.MQMD.CodedCharSetId;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    SET outRef.usr.BrokerName = SQL.BrokerName;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    SET outRef.usr.MessageFlowLabel = SQL.MessageFlowLabel; ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    SET outRef.usr.DTSTAMP =   CURRENT_TIMESTAMP; ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    SET OutputRoot.MQMD.Format = MQFMT_RF_HEADER_2;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" END IF;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("END;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("END MODULE;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("CREATE Compute MODULE CreateTraceData");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("CREATE FUNCTION main() RETURNS BOOLEAN BEGIN");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tDECLARE EnvVarRef REFERENCE TO Environment.Variables;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tSET EnvVarRef.DTSTAMP = CURRENT_TIMESTAMP; ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tSET EnvVarRef.BrokerName = Substring(SQL.BrokerName from 1 for 128);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    SET EnvVarRef.MessageFlowlabel = Substring(SQL.MessageFlowLabel from 1 for 128);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("END;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("END MODULE;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("CREATE FILTER MODULE CheckLogging");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tCREATE FUNCTION Main() RETURNS BOOLEAN");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tBEGIN");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tIF Environment.Variables.ResponseLoggingOn AND (Environment.Variables.RRMode = 'Response') THEN RETURN TRUE;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tEND IF;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tIF Environment.Variables.RequestLoggingOn AND (Environment.Variables.RRMode = 'Request') THEN RETURN TRUE;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tEND IF;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tRETURN FALSE;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tEND;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("END MODULE;");  //$NON-NLS-1$        
        out.write(NL);         
    }
}
