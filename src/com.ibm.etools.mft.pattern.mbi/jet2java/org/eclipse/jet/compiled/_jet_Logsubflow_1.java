package org.eclipse.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_Logsubflow_1 implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_Logsubflow_1() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_get_10_12 = new TagInfo("c:get", //$NON-NLS-1$
            10, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlowURI", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_11_15 = new TagInfo("c:get", //$NON-NLS-1$
            11, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlowPrefix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_14_61 = new TagInfo("c:get", //$NON-NLS-1$
            14, 61,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@log", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_15_17 = new TagInfo("c:get", //$NON-NLS-1$
            15, 17,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlowBundleName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_16_15 = new TagInfo("c:get", //$NON-NLS-1$
            16, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@projectname", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_18_36 = new TagInfo("c:get", //$NON-NLS-1$
            18, 36,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@projectname", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_18_90 = new TagInfo("c:get", //$NON-NLS-1$
            18, 90,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@log", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_20_36 = new TagInfo("c:get", //$NON-NLS-1$
            20, 36,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@projectname", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_20_90 = new TagInfo("c:get", //$NON-NLS-1$
            20, 90,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@log", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_21_65 = new TagInfo("c:get", //$NON-NLS-1$
            21, 65,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/shortDescription", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_23_26 = new TagInfo("c:get", //$NON-NLS-1$
            23, 26,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@patternName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_23_71 = new TagInfo("c:get", //$NON-NLS-1$
            23, 71,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@patternVersion", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_24_15 = new TagInfo("c:get", //$NON-NLS-1$
            24, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/longDescription", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_25_33 = new TagInfo("c:get", //$NON-NLS-1$
            25, 33,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@patternName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_26_36 = new TagInfo("c:get", //$NON-NLS-1$
            26, 36,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@patternVersion", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_31_41 = new TagInfo("c:get", //$NON-NLS-1$
            31, 41,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@esqlQualifier", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_36_25 = new TagInfo("c:get", //$NON-NLS-1$
            36, 25,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/logQueueManager", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_37_18 = new TagInfo("c:get", //$NON-NLS-1$
            37, 18,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@queueprefix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_37_56 = new TagInfo("c:get", //$NON-NLS-1$
            37, 56,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/logQueue", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_37_88 = new TagInfo("c:get", //$NON-NLS-1$
            37, 88,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@queuesuffix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_42_40 = new TagInfo("c:get", //$NON-NLS-1$
            42, 40,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@esqlQualifier", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_52_41 = new TagInfo("c:get", //$NON-NLS-1$
            52, 41,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@esqlQualifier", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_57_18 = new TagInfo("c:get", //$NON-NLS-1$
            57, 18,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlowBundleName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_58_19 = new TagInfo("c:get", //$NON-NLS-1$
            58, 19,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@projectname", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<ecore:EPackage xmi:version=\"2.0\" xmlns:xmi=\"http://www.omg.org/XMI\" xmlns:ComIbmCompute.msgnode=\"ComIbmCompute.msgnode\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("xmlns:ComIbmFilter.msgnode=\"ComIbmFilter.msgnode\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("xmlns:ComIbmMQOutput.msgnode=\"ComIbmMQOutput.msgnode\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("xmlns:ComIbmTrace.msgnode=\"ComIbmTrace.msgnode\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("xmlns:ComIbmTryCatch.msgnode=\"ComIbmTryCatch.msgnode\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("xmlns:ecore=\"http://www.eclipse.org/emf/2002/Ecore\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("xmlns:eflow=\"http://www.ibm.com/wbi/2005/eflow\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("xmlns:utility=\"http://www.ibm.com/wbi/2005/eflow_utility\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    nsURI=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_10_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_10_12); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_10_12.setRuntimeParent(null);
        _jettag_c_get_10_12.setTagInfo(_td_c_get_10_12);
        _jettag_c_get_10_12.doStart(context, out);
        _jettag_c_get_10_12.doEnd();
        out.write(".subflow\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    nsPrefix=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_11_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_11_15); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_11_15.setRuntimeParent(null);
        _jettag_c_get_11_15.setTagInfo(_td_c_get_11_15);
        _jettag_c_get_11_15.doStart(context, out);
        _jettag_c_get_11_15.doEnd();
        out.write(".subflow\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  <eClassifiers xmi:type=\"eflow:FCMComposite\" name=\"FCMComposite_1\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <eSuperTypes href=\"http://www.ibm.com/wbi/2005/eflow#//FCMBlock\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <translation xmi:type=\"utility:TranslatableString\" key=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_14_61 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_14_61); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_14_61.setRuntimeParent(null);
        _jettag_c_get_14_61.setTagInfo(_td_c_get_14_61);
        _jettag_c_get_14_61.doStart(context, out);
        _jettag_c_get_14_61.doEnd();
        out.write("\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    bundleName=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_15_17 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_15_17); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_15_17.setRuntimeParent(null);
        _jettag_c_get_15_17.setTagInfo(_td_c_get_15_17);
        _jettag_c_get_15_17.doStart(context, out);
        _jettag_c_get_15_17.doEnd();
        out.write("\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    pluginId=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_16_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_16_15); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_16_15.setRuntimeParent(null);
        _jettag_c_get_16_15.setTagInfo(_td_c_get_16_15);
        _jettag_c_get_16_15.doStart(context, out);
        _jettag_c_get_16_15.doEnd();
        out.write("\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <colorGraphic16 xmi:type=\"utility:GIFFileGraphic\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    resourceName=\"platform:/plugin/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_18_36 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_18_36); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_18_36.setRuntimeParent(null);
        _jettag_c_get_18_36.setTagInfo(_td_c_get_18_36);
        _jettag_c_get_18_36.doStart(context, out);
        _jettag_c_get_18_36.doEnd();
        out.write("/icons/full/obj16/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_18_90 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_18_90); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_18_90.setRuntimeParent(null);
        _jettag_c_get_18_90.setTagInfo(_td_c_get_18_90);
        _jettag_c_get_18_90.doStart(context, out);
        _jettag_c_get_18_90.doEnd();
        out.write(".gif\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <colorGraphic32 xmi:type=\"utility:GIFFileGraphic\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    resourceName=\"platform:/plugin/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_20_36 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_20_36); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_20_36.setRuntimeParent(null);
        _jettag_c_get_20_36.setTagInfo(_td_c_get_20_36);
        _jettag_c_get_20_36.doStart(context, out);
        _jettag_c_get_20_36.doEnd();
        out.write("/icons/full/obj30/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_20_90 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_20_90); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_20_90.setRuntimeParent(null);
        _jettag_c_get_20_90.setTagInfo(_td_c_get_20_90);
        _jettag_c_get_20_90.doStart(context, out);
        _jettag_c_get_20_90.doEnd();
        out.write(".gif\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <shortDescription xmi:type=\"utility:ConstantString\" string=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_21_65 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_21_65); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_21_65.setRuntimeParent(null);
        _jettag_c_get_21_65.setTagInfo(_td_c_get_21_65);
        _jettag_c_get_21_65.doStart(context, out);
        _jettag_c_get_21_65.doEnd();
        out.write("\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <longDescription xmi:type=\"utility:ConstantString\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    string=\"Generated by ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_23_26 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_23_26); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_23_26.setRuntimeParent(null);
        _jettag_c_get_23_26.setTagInfo(_td_c_get_23_26);
        _jettag_c_get_23_26.doStart(context, out);
        _jettag_c_get_23_26.doEnd();
        out.write(" Version ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_23_71 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_23_71); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_23_71.setRuntimeParent(null);
        _jettag_c_get_23_71.setTagInfo(_td_c_get_23_71);
        _jettag_c_get_23_71.doStart(context, out);
        _jettag_c_get_23_71.doEnd();
        out.write(NL);         
        out.write("    &#xD;&#xA;");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_24_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_24_15); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_24_15.setRuntimeParent(null);
        _jettag_c_get_24_15.setTagInfo(_td_c_get_24_15);
        _jettag_c_get_24_15.doStart(context, out);
        _jettag_c_get_24_15.doEnd();
        out.write(NL);         
        out.write("    &#xD;&#xA;$MQSI patternName=");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_25_33 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_25_33); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_25_33.setRuntimeParent(null);
        _jettag_c_get_25_33.setTagInfo(_td_c_get_25_33);
        _jettag_c_get_25_33.doStart(context, out);
        _jettag_c_get_25_33.doEnd();
        out.write(" MQSI$");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    &#xD;&#xA;$MQSI patternVersion=");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_26_36 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_26_36); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_26_36.setRuntimeParent(null);
        _jettag_c_get_26_36.setTagInfo(_td_c_get_26_36);
        _jettag_c_get_26_36.doStart(context, out);
        _jettag_c_get_26_36.doEnd();
        out.write(" MQSI$");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    \"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <version xmi:type=\"utility:ConstantString\" string=\"1\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <composition>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <nodes xmi:type=\"ComIbmCompute.msgnode:FCMComposite_1\" xmi:id=\"FCMComposite_1_3\" location=\"398,200\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      computeExpression=\"esql://routine/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_31_41 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_31_41); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_31_41.setRuntimeParent(null);
        _jettag_c_get_31_41.setTagInfo(_td_c_get_31_41);
        _jettag_c_get_31_41.doStart(context, out);
        _jettag_c_get_31_41.doEnd();
        out.write("CreateLogMessage.Main\" computeMode=\"destinationAndMessage\" throwExceptionOnDatabaseError=\"false\" >");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"Create Log Message\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <nodes xmi:type=\"ComIbmMQOutput.msgnode:FCMComposite_1\" xmi:id=\"FCMComposite_1_6\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      location=\"545,201\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      queueManagerName=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_36_25 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_36_25); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_36_25.setRuntimeParent(null);
        _jettag_c_get_36_25.setTagInfo(_td_c_get_36_25);
        _jettag_c_get_36_25.doStart(context, out);
        _jettag_c_get_36_25.doEnd();
        out.write("\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      queueName=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_37_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_37_18); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_37_18.setRuntimeParent(null);
        _jettag_c_get_37_18.setTagInfo(_td_c_get_37_18);
        _jettag_c_get_37_18.doStart(context, out);
        _jettag_c_get_37_18.doEnd();
        RuntimeTagElement _jettag_c_get_37_56 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_37_56); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_37_56.setRuntimeParent(null);
        _jettag_c_get_37_56.setTagInfo(_td_c_get_37_56);
        _jettag_c_get_37_56.doStart(context, out);
        _jettag_c_get_37_56.doEnd();
        RuntimeTagElement _jettag_c_get_37_88 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_37_88); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_37_88.setRuntimeParent(null);
        _jettag_c_get_37_88.setTagInfo(_td_c_get_37_88);
        _jettag_c_get_37_88.doStart(context, out);
        _jettag_c_get_37_88.doEnd();
        out.write("\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      transactionMode=\"no\" persistenceMode=\"yes\" validateMaster=\"none\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"MQOutput\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <nodes xmi:type=\"ComIbmFilter.msgnode:FCMComposite_1\" xmi:id=\"FCMComposite_1_11\" location=\"305,188\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      filterExpression=\"esql://routine/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_42_40 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_42_40); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_42_40.setRuntimeParent(null);
        _jettag_c_get_42_40.setTagInfo(_td_c_get_42_40);
        _jettag_c_get_42_40.doStart(context, out);
        _jettag_c_get_42_40.doEnd();
        out.write("CheckLogging.Main\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"Filter\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <nodes xmi:type=\"ComIbmTryCatch.msgnode:FCMComposite_1\" xmi:id=\"FCMComposite_1_15\" location=\"214,119\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"TryCatch\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <nodes xmi:type=\"ComIbmTrace.msgnode:FCMComposite_1\" xmi:id=\"FCMComposite_1_16\" location=\"563,115\" pattern=\"&#xD;&#xA;Logging Failure&#xD;&#xA;=========&#xD;&#xA;&#xD;&#xA;${Environment.PatternVariables}&#xD;&#xA;==========\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"Trace1\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <nodes xmi:type=\"ComIbmCompute.msgnode:FCMComposite_1\" xmi:id=\"FCMComposite_1_17\" location=\"402,115\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      computeExpression=\"esql://routine/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_52_41 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_52_41); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_52_41.setRuntimeParent(null);
        _jettag_c_get_52_41.setTagInfo(_td_c_get_52_41);
        _jettag_c_get_52_41.doStart(context, out);
        _jettag_c_get_52_41.doEnd();
        out.write("CreateTraceData.Main\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"CreateTraceData\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <nodes xmi:type=\"eflow:FCMSource\" xmi:id=\"InTerminal.Input\" location=\"53,119\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:TranslatableString\" key=\"InTerminal.Input\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    \tbundleName=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_57_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_57_18); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_57_18.setRuntimeParent(null);
        _jettag_c_get_57_18.setTagInfo(_td_c_get_57_18);
        _jettag_c_get_57_18.doStart(context, out);
        _jettag_c_get_57_18.doEnd();
        out.write("\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        pluginId=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_58_19 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_58_19); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_58_19.setRuntimeParent(null);
        _jettag_c_get_58_19.setTagInfo(_td_c_get_58_19);
        _jettag_c_get_58_19.doStart(context, out);
        _jettag_c_get_58_19.doEnd();
        out.write("\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_16\" targetNode=\"FCMComposite_1_16\" sourceNode=\"FCMComposite_1_17\" sourceTerminalName=\"OutTerminal.out\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_15\" targetNode=\"FCMComposite_1_17\" sourceNode=\"FCMComposite_1_15\" sourceTerminalName=\"OutTerminal.catch\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_6\" targetNode=\"FCMComposite_1_11\" sourceNode=\"FCMComposite_1_15\" sourceTerminalName=\"OutTerminal.try\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_8\" targetNode=\"FCMComposite_1_3\" sourceNode=\"FCMComposite_1_11\" sourceTerminalName=\"OutTerminal.true\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_11\" targetNode=\"FCMComposite_1_6\" sourceNode=\"FCMComposite_1_3\" sourceTerminalName=\"OutTerminal.out\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_1\" targetNode=\"FCMComposite_1_15\" sourceNode=\"InTerminal.Input\" sourceTerminalName=\"OutTerminal.out\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    </composition>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <propertyOrganizer/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  </eClassifiers>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("</ecore:EPackage>");  //$NON-NLS-1$        
        out.write(NL);         
    }
}
