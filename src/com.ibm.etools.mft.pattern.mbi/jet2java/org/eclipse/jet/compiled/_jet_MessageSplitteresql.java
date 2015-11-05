package org.eclipse.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_MessageSplitteresql implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_MessageSplitteresql() {
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
    private static final TagInfo _td_c_get_34_31 = new TagInfo("c:get", //$NON-NLS-1$
            34, 31,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/containerTag", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_35_33 = new TagInfo("c:get", //$NON-NLS-1$
            35, 33,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/elementName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_36_34 = new TagInfo("c:get", //$NON-NLS-1$
            36, 34,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/badMsgAction", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_99_1 = new TagInfo("c:choose", //$NON-NLS-1$
            99, 1,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_100_1 = new TagInfo("c:when", //$NON-NLS-1$
            100, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/containerTag = '*:*'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_103_1 = new TagInfo("c:otherwise", //$NON-NLS-1$
            103, 1,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_104_56 = new TagInfo("c:get", //$NON-NLS-1$
            104, 56,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/containerTag", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_119_1 = new TagInfo("c:choose", //$NON-NLS-1$
            119, 1,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_120_1 = new TagInfo("c:when", //$NON-NLS-1$
            120, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/elementName = '*:*'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_134_1 = new TagInfo("c:otherwise", //$NON-NLS-1$
            134, 1,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_choose_192_1 = new TagInfo("c:choose", //$NON-NLS-1$
            192, 1,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_193_1 = new TagInfo("c:when", //$NON-NLS-1$
            193, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/elementName = '*:*'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_204_1 = new TagInfo("c:otherwise", //$NON-NLS-1$
            204, 1,
            new String[] {
            },
            new String[] {
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
        out.write("CREATE FILTER MODULE ExtractionComplete");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tCREATE FUNCTION Main() RETURNS BOOLEAN");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tBEGIN");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tIF Environment.PatternVariables.Completion = 0 THEN");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tRETURN TRUE;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tELSE");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tRETURN FALSE;\t\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tEND IF;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tEND;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tEND MODULE;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write(NL);         
        out.write(NL);         
        out.write("CREATE COMPUTE MODULE ExtractRecords\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t-- ========================");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t-- The INPUT message format");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t-- ========================");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("-- SET at main flow level");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tDECLARE CONTAINER CHARACTER '");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_34_31 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_34_31); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_34_31.setRuntimeParent(null);
        _jettag_c_get_34_31.setTagInfo(_td_c_get_34_31);
        _jettag_c_get_34_31.doStart(context, out);
        _jettag_c_get_34_31.doEnd();
        out.write("';");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tDECLARE ELEMENTNAME CHARACTER '");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_35_33 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_35_33); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_35_33.setRuntimeParent(null);
        _jettag_c_get_35_33.setTagInfo(_td_c_get_35_33);
        _jettag_c_get_35_33.doStart(context, out);
        _jettag_c_get_35_33.doEnd();
        out.write("';");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tDECLARE BadMsgAction CHARACTER '");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_36_34 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_36_34); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_36_34.setRuntimeParent(null);
        _jettag_c_get_36_34.setTagInfo(_td_c_get_36_34);
        _jettag_c_get_36_34.doStart(context, out);
        _jettag_c_get_36_34.doEnd();
        out.write("';\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tDECLARE LoggingOn EXTERNAL BOOLEAN TRUE;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t/* ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t   ===================================");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t   Main function to control processing");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t   ===================================");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t */");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tCREATE FUNCTION Main() RETURNS BOOLEAN");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tBEGIN");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("-- Define Environment Variables");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tSET Environment.PatternVariables.NumberOfRecordsFound = 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tSET Environment.PatternVariables.NumberOfBadRecords = 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tSET Environment.PatternVariables.Completion = -1;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tSET Environment.PatternVariables.LoggingOn = LoggingOn;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("-- Copy properties and headers");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tCall CopyMessageHeaders();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tSet OutputRoot.Properties = InputRoot.Properties;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tCALL ExtractRecordsProcess();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tRETURN FALSE;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tEND;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write(NL);         
        out.write("    /* ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("       ============================================================================================");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("         > Declare variables");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("         > Find first instance of the element to process");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("         > For each instance found");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("           1> Release memory used to store information about the previous instance (if appropriate)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("           2> Call a procedure to produce a single message the current instance");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("           3> Look for a following instance         ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("       ============================================================================================");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("     */");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tCREATE PROCEDURE ExtractRecordsProcess() BEGIN");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t-- These variables hold the actual names found if '*:*' used");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tDECLARE THIS_ROOT_NAME CHARACTER;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tDECLARE THIS_ELEMENT_NAME CHARACTER;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tDECLARE THIS_ELEMENT_NAMESPACE CHARACTER;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tDECLARE refEnvPatt REFERENCE TO Environment.PatternVariables;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t/*  Create a (local to this node) variable to hold a mutable tree */");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tDECLARE rowCachedInputXML ROW;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t/* Create an XMLNSC parser");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tAs both the incoming message AND the new parser are XMLNSC no translation is required");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t   \tand therefore the XML message is NOT fully parsed */");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t  ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tCREATE FIRSTCHILD OF rowCachedInputXML DOMAIN ('XMLNSC') NAME 'XMLNSC';");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t/* Create a mutable tree by copying the INPUT XML to the local parser");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tThis is to allow data about parsed message elements to be deleted from the message tree ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t(which can not happen on the InputRoot as its message tree is immutable) */");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\tSET rowCachedInputXML.XMLNSC = InputRoot.XMLNSC;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\t/* Create a reference variable to be used to traverse the input XML message");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("*/");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tDECLARE referenceToInputMsg REFERENCE TO rowCachedInputXML.XMLNSC;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t-- Acquire the first root element...");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_choose_99_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_99_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_choose_99_1.setRuntimeParent(null);
        _jettag_c_choose_99_1.setTagInfo(_td_c_choose_99_1);
        _jettag_c_choose_99_1.doStart(context, out);
        JET2Writer _jettag_c_choose_99_1_saved_out = out;
        while (_jettag_c_choose_99_1.okToProcessBody()) {
            out = out.newNestedContentWriter();
            RuntimeTagElement _jettag_c_when_100_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_100_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_when_100_1.setRuntimeParent(_jettag_c_choose_99_1);
            _jettag_c_when_100_1.setTagInfo(_td_c_when_100_1);
            _jettag_c_when_100_1.doStart(context, out);
            JET2Writer _jettag_c_when_100_1_saved_out = out;
            while (_jettag_c_when_100_1.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write(" \t\tMOVE referenceToInputMsg FIRSTCHILD TYPE XMLNSC.Folder NAMESPACE *;");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_when_100_1.handleBodyContent(out);
            }
            out = _jettag_c_when_100_1_saved_out;
            _jettag_c_when_100_1.doEnd();
            RuntimeTagElement _jettag_c_otherwise_103_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_103_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_otherwise_103_1.setRuntimeParent(_jettag_c_choose_99_1);
            _jettag_c_otherwise_103_1.setTagInfo(_td_c_otherwise_103_1);
            _jettag_c_otherwise_103_1.doStart(context, out);
            JET2Writer _jettag_c_otherwise_103_1_saved_out = out;
            while (_jettag_c_otherwise_103_1.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("\t\tMOVE referenceToInputMsg TO rowCachedInputXML.XMLNSC.");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_104_56 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_104_56); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_104_56.setRuntimeParent(_jettag_c_otherwise_103_1);
                _jettag_c_get_104_56.setTagInfo(_td_c_get_104_56);
                _jettag_c_get_104_56.doStart(context, out);
                _jettag_c_get_104_56.doEnd();
                out.write(";");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_otherwise_103_1.handleBodyContent(out);
            }
            out = _jettag_c_otherwise_103_1_saved_out;
            _jettag_c_otherwise_103_1.doEnd();
            _jettag_c_choose_99_1.handleBodyContent(out);
        }
        out = _jettag_c_choose_99_1_saved_out;
        _jettag_c_choose_99_1.doEnd();
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tIF NOT LASTMOVE(referenceToInputMsg) THEN");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tTHROW USER EXCEPTION SEVERITY 3 MESSAGE 2372 VALUES ('");  //$NON-NLS-1$        
        out.write( pattern.getString("com.ibm.etools.mft.pattern.mbi.ms.xmlmq.esql.4") );
        out.write("');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tEND IF;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tSET THIS_ROOT_NAME = FIELDNAME(referenceToInputMsg);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tSET THIS_ELEMENT_NAMESPACE = FIELDNAMESPACE (referenceToInputMsg);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("/******************************************************");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("*  Next locate the first repeating structure...");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("*\tcheck if specific name required");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("*   Ignore anything which is not a folder or field type");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("*******************************************************/");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_choose_119_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_119_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_choose_119_1.setRuntimeParent(null);
        _jettag_c_choose_119_1.setTagInfo(_td_c_choose_119_1);
        _jettag_c_choose_119_1.doStart(context, out);
        JET2Writer _jettag_c_choose_119_1_saved_out = out;
        while (_jettag_c_choose_119_1.okToProcessBody()) {
            out = out.newNestedContentWriter();
            RuntimeTagElement _jettag_c_when_120_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_120_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_when_120_1.setRuntimeParent(_jettag_c_choose_119_1);
            _jettag_c_when_120_1.setTagInfo(_td_c_when_120_1);
            _jettag_c_when_120_1.doStart(context, out);
            JET2Writer _jettag_c_when_120_1_saved_out = out;
            while (_jettag_c_when_120_1.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("\t\t\tMOVE referenceToInputMsg FIRSTCHILD NAMESPACE *;");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("FIRST: \tLOOP  ");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\tSET Environment.PatternVariables.temp = FieldName(referenceToInputMsg);");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("--\t\t\tIF FIELDTYPE(referenceToInputMsg)= XMLNSC.Folder THEN LEAVE FIRST; END IF;");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\tIF FIELDTYPE(referenceToInputMsg)= 16777216 THEN LEAVE FIRST; END IF; ");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("--\t\t\tIF FIELDTYPE(referenceToInputMsg)= XMLNSC.Field THEN LEAVE FIRST; END IF;");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\tIF FIELDTYPE(referenceToInputMsg)= 50331648 THEN LEAVE FIRST; END IF;\t");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\tIF FIELDTYPE(referenceToInputMsg)IS NULL THEN ");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\tTHROW USER EXCEPTION SEVERITY 3 MESSAGE 2372 VALUES ('");  //$NON-NLS-1$        
                out.write( pattern.getString("com.ibm.etools.mft.pattern.mbi.ms.xmlmq.esql.3") );
                out.write("');");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\tEND IF;");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\tMOVE referenceToInputMsg NEXTSIBLING;");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\tEND LOOP FIRST;");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_when_120_1.handleBodyContent(out);
            }
            out = _jettag_c_when_120_1_saved_out;
            _jettag_c_when_120_1.doEnd();
            RuntimeTagElement _jettag_c_otherwise_134_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_134_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_otherwise_134_1.setRuntimeParent(_jettag_c_choose_119_1);
            _jettag_c_otherwise_134_1.setTagInfo(_td_c_otherwise_134_1);
            _jettag_c_otherwise_134_1.doStart(context, out);
            JET2Writer _jettag_c_otherwise_134_1_saved_out = out;
            while (_jettag_c_otherwise_134_1.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write(NL);         
                out.write("\t\t\tMOVE referenceToInputMsg FIRSTCHILD NAMESPACE * NAME ELEMENTNAME;");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("FIRST: \tLOOP");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("--\t\t\tIF FIELDTYPE(referenceToInputMsg)= XMLNSC.Folder THEN LEAVE FIRST; END IF;");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\tIF FIELDTYPE(referenceToInputMsg)= 16777216 THEN LEAVE FIRST; END IF; ");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("--\t\t\tIF FIELDTYPE(referenceToInputMsg)= XMLNSC.Field THEN LEAVE FIRST; END IF;");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\tIF FIELDTYPE(referenceToInputMsg)= 50331648 THEN LEAVE FIRST; END IF;");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\tIF FIELDTYPE(referenceToInputMsg)IS NULL THEN ");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\tTHROW USER EXCEPTION SEVERITY 3 MESSAGE 2372 VALUES ('");  //$NON-NLS-1$        
                out.write( pattern.getString("com.ibm.etools.mft.pattern.mbi.ms.xmlmq.esql.3") );
                out.write("');");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\tEND IF;");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\tMOVE referenceToInputMsg NEXTSIBLING NAMESPACE * NAME ELEMENTNAME;");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\tEND LOOP FIRST;");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_otherwise_134_1.handleBodyContent(out);
            }
            out = _jettag_c_otherwise_134_1_saved_out;
            _jettag_c_otherwise_134_1.doEnd();
            _jettag_c_choose_119_1.handleBodyContent(out);
        }
        out = _jettag_c_choose_119_1_saved_out;
        _jettag_c_choose_119_1.doEnd();
        out.write("\t\t-- Loop around each repeating item");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tWHILE LASTMOVE(referenceToInputMsg) DO");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t-- SAVE ELEMENT NAME ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tSET THIS_ELEMENT_NAME = FIELDNAME (referenceToInputMsg);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t-- Increment the count of repeating items found...");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tSET refEnvPatt.NumberOfRecordsFound = refEnvPatt.NumberOfRecordsFound + 1;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t-- Are we on the second, or subsequent repeating item?");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tIF refEnvPatt.NumberOfRecordsFound > 1 THEN");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t-- YES, therefore erase the parsed details about the previous item to release memory");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t/* The following line is most significant with respect to memory usage.  Its execution ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t   results in the last-but-one *repeating* element, including subordinate elements, ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t   of the message tree being deleted allowing the memory used to hold information ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t   generated during parsing to be re");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t  used for further parsing. */");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tDELETE PREVIOUSSIBLING OF referenceToInputMsg;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tEND IF;\t\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t/*  ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t    ====================================================================");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t    Produce a message consisting of one embedded record from the file");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t    ====================================================================");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t */");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\t-- Set body to extracted record from file ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tSET OutputRoot.XMLNSC.{THIS_ELEMENT_NAMESPACE}:{THIS_ELEMENT_NAME} = referenceToInputMsg;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t-- Generate a new message consisting of one embedded record");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tSET refEnvPatt.ErrorState = 'OK';");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tPROPAGATE;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t-- Check whether this completed properly");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t-- If BadMsgAction is Save then record will have been written to queue");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t-- Otherwise throw an error");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tIF refEnvPatt.ErrorState = 'Failed' THEN");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tIF  BadMsgAction = 'Cancel'THEN");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tTHROW USER EXCEPTION  SEVERITY 3 MESSAGE 2372 VALUES (Environment.PatternVariables.RoutingError); ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tEND IF;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tEND IF;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("/****************************************************************************************");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("* Now search for another repeating element                                              *");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("* Reject anything that is not of type FIELD(simple element) or FOLDER (Complex element) *");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("****************************************************************************************/");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_choose_192_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_192_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_choose_192_1.setRuntimeParent(null);
        _jettag_c_choose_192_1.setTagInfo(_td_c_choose_192_1);
        _jettag_c_choose_192_1.doStart(context, out);
        JET2Writer _jettag_c_choose_192_1_saved_out = out;
        while (_jettag_c_choose_192_1.okToProcessBody()) {
            out = out.newNestedContentWriter();
            RuntimeTagElement _jettag_c_when_193_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_193_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_when_193_1.setRuntimeParent(_jettag_c_choose_192_1);
            _jettag_c_when_193_1.setTagInfo(_td_c_when_193_1);
            _jettag_c_when_193_1.doStart(context, out);
            JET2Writer _jettag_c_when_193_1_saved_out = out;
            while (_jettag_c_when_193_1.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("\t\t\tMOVE referenceToInputMsg NEXTSIBLING;\t");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("CHECK: LOOP  ");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("--\t\t\tIF FIELDTYPE(referenceToInputMsg)= XMLNSC.Folder THEN LEAVE CHECK; END IF;");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\tIF FIELDTYPE(referenceToInputMsg)= 16777216 THEN LEAVE CHECK; END IF; ");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("--\t\t\tIF FIELDTYPE(referenceToInputMsg)= XMLNSC.Field THEN LEAVE CHECK; END IF;");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\tIF FIELDTYPE(referenceToInputMsg)= 50331648 THEN LEAVE CHECK; END IF;\t");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\tIF FIELDTYPE(referenceToInputMsg) IS NULL THEN LEAVE CHECK; END IF;");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\tMOVE referenceToInputMsg NEXTSIBLING;");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\tEND LOOP CHECK;");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_when_193_1.handleBodyContent(out);
            }
            out = _jettag_c_when_193_1_saved_out;
            _jettag_c_when_193_1.doEnd();
            RuntimeTagElement _jettag_c_otherwise_204_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_204_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_otherwise_204_1.setRuntimeParent(_jettag_c_choose_192_1);
            _jettag_c_otherwise_204_1.setTagInfo(_td_c_otherwise_204_1);
            _jettag_c_otherwise_204_1.doStart(context, out);
            JET2Writer _jettag_c_otherwise_204_1_saved_out = out;
            while (_jettag_c_otherwise_204_1.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("\t\t\tMOVE referenceToInputMsg NEXTSIBLING NAMESPACE * NAME ELEMENTNAME;");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("CHECK: LOOP  ");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("--\t\t\tIF FIELDTYPE(referenceToInputMsg)= XMLNSC.Folder THEN LEAVE CHECK; END IF;");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\tIF FIELDTYPE(referenceToInputMsg)= 16777216 THEN LEAVE CHECK; END IF; ");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("--\t\t\tIF FIELDTYPE(referenceToInputMsg)= XMLNSC.Field THEN LEAVE CHECK; END IF;");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\tIF FIELDTYPE(referenceToInputMsg)= 50331648 THEN LEAVE CHECK; END IF;\t");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\tIF FIELDTYPE(referenceToInputMsg) IS NULL THEN LEAVE CHECK; END IF;");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\tMOVE referenceToInputMsg NEXTSIBLING NAMESPACE * NAME ELEMENTNAME;");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\tEND LOOP CHECK;");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_otherwise_204_1.handleBodyContent(out);
            }
            out = _jettag_c_otherwise_204_1_saved_out;
            _jettag_c_otherwise_204_1.doEnd();
            _jettag_c_choose_192_1.handleBodyContent(out);
        }
        out = _jettag_c_choose_192_1_saved_out;
        _jettag_c_choose_192_1.doEnd();
        out.write("\t\tEND WHILE;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("-- indicate no more records extracted");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tSET refEnvPatt.Completion = 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tEND;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tCREATE PROCEDURE CopyMessageHeaders() BEGIN");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tDECLARE I INTEGER 1;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tDECLARE J INTEGER;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tSET J = CARDINALITY(InputRoot.*[]);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tWHILE I < J DO");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tSET OutputRoot.*[I] = InputRoot.*[I];");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tSET I = I + 1;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tEND WHILE;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tEND;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tEND MODULE;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write(NL);         
        out.write(NL);         
        out.write(NL);         
    }
}
