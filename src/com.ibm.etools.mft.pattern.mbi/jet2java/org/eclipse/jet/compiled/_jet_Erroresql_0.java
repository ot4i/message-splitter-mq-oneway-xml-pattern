package org.eclipse.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_Erroresql_0 implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_Erroresql_0() {
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
com.ibm.etools.mft.pattern.mbi.mrrc.synchmq.PatternMessages messages = new com.ibm.etools.mft.pattern.mbi.mrrc.synchmq.PatternMessages();

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
        out.write(" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("DECLARE ErrorLoggingOn EXTERNAL BOOLEAN TRUE;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("CREATE COMPUTE MODULE Create_Error_Reply");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tCREATE FUNCTION Main() RETURNS BOOLEAN");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tBEGIN");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("-- Copy MQMD which contains reply address");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tSET OutputRoot.MQMD = InputRoot.MQMD;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("-- Set CorrelId to message ID so requester can retrieve by correlId");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tSET OutputRoot.MQMD.CorrelId = InputRoot.MQMD.MsgId;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("-- Set up Error response");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tCREATE NEXTSIBLING OF OutputRoot.MQMD DOMAIN('XMLNSC') NAME 'XMLNSC';");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tSET OutputRoot.XMLNSC.Error.Status = -1;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tSET OutputRoot.XMLNSC.Error.Text = ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t'");  //$NON-NLS-1$        
        out.write( pattern.getString("com.ibm.etools.mft.pattern.mbi.mrrc.synchmq.esql.9") );
        out.write("';");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tRETURN TRUE;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tEND;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("END MODULE;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("CREATE COMPUTE MODULE Build_Error_Message");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tCREATE FUNCTION Main() RETURNS BOOLEAN");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tBEGIN");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tSET OutputRoot.MQMD = InputRoot.MQMD;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tSET OutputRoot.Properties = NULL;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tCall AddExceptionData();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    END;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tCREATE PROCEDURE AddExceptionData() BEGIN");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tCREATE NEXTSIBLING OF OutputRoot.MQMD DOMAIN('XMLNSC') NAME 'XMLNSC';");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tSET OutputRoot.XMLNSC.Error.BrokerName  = SQL.BrokerName;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tDECLARE ERef REFERENCE TO OutputRoot.XMLNSC.Error;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tSET ERef.MessageFlowLabel = SQL.MessageFlowLabel; ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    SET ERef.DTSTAMP =   CURRENT_TIMESTAMP;  ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tSET ERef.StatusCode = -1;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("     ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    -- Add some exception data for error and fault");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tDECLARE Error INTEGER;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tDECLARE Text CHARACTER;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tDECLARE Label CHARACTER;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tDECLARE I INTEGER 1;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tDECLARE K INTEGER;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tDECLARE start REFERENCE TO InputExceptionList.*[1];");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\tWHILE start.Number IS NOT NULL DO ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tSET Label = start.Label;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tSET Error = start.Number;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tIF Error = 3001 THEN");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tSET Text = start.Insert.Text;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tELSE");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tSET Text = start.Text;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tEND IF;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t-- Don't include the \"Caught exception and rethrowing message\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tIF Error <> 2230 THEN");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t-- Process inserts");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tDECLARE Inserts Character;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tDECLARE INS Integer;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tSET Inserts = '';");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t-- Are there any inserts for this exception");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tIF EXISTS (start.Insert[]) THEN");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t-- If YES add them to inserts string");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t \tSET Inserts = Inserts || COALESCE(start.Insert[1].Text,'NULL')|| ' / ';");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t \tSET K = 1;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t \tINSERTS: LOOP");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\tIF CARDINALITY(start.Insert[])> K ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\tTHEN ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\tSET Inserts = Inserts || COALESCE(start.Insert[K+1].Text,'NULL')|| ' / ';");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t-- No more inserts to process");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\tELSE LEAVE INSERTS;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\tEND IF;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tSET K = K+1;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tEND LOOP INSERTS;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tEND IF;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tSET ERef.Exception[I].Label = Label;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tSET ERef.Exception[I].Error = Error;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tSET ERef.Exception[I].Text = Text;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tSet ERef.Exception[I].Inserts = COALESCE(Inserts, '');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tSET I = I+1; ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tEND IF;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t-- Move start to the last child of the field to which it currently points");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tMOVE start LASTCHILD;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tEND WHILE;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tEND;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("END MODULE;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("CREATE FILTER MODULE ErrorQ_check");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tCREATE FUNCTION Main() RETURNS BOOLEAN");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tBEGIN");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("-- Do not write a second error message if this message has already been backed out");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tIF Root.MQMD.BackoutCount > 0 THEN RETURN FALSE; \t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tELSE RETURN ErrorLoggingOn;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tEND IF;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tEND;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("END MODULE;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("CREATE FILTER MODULE Request_Check");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tCREATE FUNCTION Main() RETURNS BOOLEAN");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tBEGIN");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("-- Do not send a reply if this message has already been backed out");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tIF Root.MQMD.BackoutCount > 0 THEN RETURN FALSE; END IF;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("-- Only send a reply if in request mode (do not know where to go if error is in response flow)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tIF  Environment.Variables.RRMode = 'Request' ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tTHEN RETURN TRUE;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tELSE RETURN FALSE;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tEND IF;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tEND;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("END MODULE;");  //$NON-NLS-1$        
    }
}
