package org.eclipse.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_Logsubflow implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_Logsubflow() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_get_10_8 = new TagInfo("c:get", //$NON-NLS-1$
            10, 8,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_10_46 = new TagInfo("c:get", //$NON-NLS-1$
            10, 46,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@log", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_11_11 = new TagInfo("c:get", //$NON-NLS-1$
            11, 11,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_11_49 = new TagInfo("c:get", //$NON-NLS-1$
            11, 49,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@log", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_15_61 = new TagInfo("c:get", //$NON-NLS-1$
            15, 61,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@log", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_16_17 = new TagInfo("c:get", //$NON-NLS-1$
            16, 17,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_16_55 = new TagInfo("c:get", //$NON-NLS-1$
            16, 55,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@log", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_17_15 = new TagInfo("c:get", //$NON-NLS-1$
            17, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@projectname", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_19_36 = new TagInfo("c:get", //$NON-NLS-1$
            19, 36,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@projectname", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_19_90 = new TagInfo("c:get", //$NON-NLS-1$
            19, 90,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@log", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_21_36 = new TagInfo("c:get", //$NON-NLS-1$
            21, 36,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@projectname", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_21_90 = new TagInfo("c:get", //$NON-NLS-1$
            21, 90,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@log", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_22_65 = new TagInfo("c:get", //$NON-NLS-1$
            22, 65,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/shortDescription", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_24_26 = new TagInfo("c:get", //$NON-NLS-1$
            24, 26,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@patternName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_24_71 = new TagInfo("c:get", //$NON-NLS-1$
            24, 71,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@patternVersion", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_25_15 = new TagInfo("c:get", //$NON-NLS-1$
            25, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/longDescription", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_26_33 = new TagInfo("c:get", //$NON-NLS-1$
            26, 33,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@patternName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_27_36 = new TagInfo("c:get", //$NON-NLS-1$
            27, 36,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@patternVersion", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_32_41 = new TagInfo("c:get", //$NON-NLS-1$
            32, 41,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_37_25 = new TagInfo("c:get", //$NON-NLS-1$
            37, 25,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/logQueueManager", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_38_18 = new TagInfo("c:get", //$NON-NLS-1$
            38, 18,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/queuePrefix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_38_55 = new TagInfo("c:get", //$NON-NLS-1$
            38, 55,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/logQueue", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_38_87 = new TagInfo("c:get", //$NON-NLS-1$
            38, 87,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/queueSuffix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_43_40 = new TagInfo("c:get", //$NON-NLS-1$
            43, 40,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_54_41 = new TagInfo("c:get", //$NON-NLS-1$
            54, 41,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_59_21 = new TagInfo("c:get", //$NON-NLS-1$
            59, 21,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_59_59 = new TagInfo("c:get", //$NON-NLS-1$
            59, 59,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@log", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_60_19 = new TagInfo("c:get", //$NON-NLS-1$
            60, 19,
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
        out.write("nsURI=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_10_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_10_8); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_10_8.setRuntimeParent(null);
        _jettag_c_get_10_8.setTagInfo(_td_c_get_10_8);
        _jettag_c_get_10_8.doStart(context, out);
        _jettag_c_get_10_8.doEnd();
        RuntimeTagElement _jettag_c_get_10_46 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_10_46); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_10_46.setRuntimeParent(null);
        _jettag_c_get_10_46.setTagInfo(_td_c_get_10_46);
        _jettag_c_get_10_46.doStart(context, out);
        _jettag_c_get_10_46.doEnd();
        out.write(".subflow\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("nsPrefix=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_11_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_11_11); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_11_11.setRuntimeParent(null);
        _jettag_c_get_11_11.setTagInfo(_td_c_get_11_11);
        _jettag_c_get_11_11.doStart(context, out);
        _jettag_c_get_11_11.doEnd();
        RuntimeTagElement _jettag_c_get_11_49 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_11_49); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_11_49.setRuntimeParent(null);
        _jettag_c_get_11_49.setTagInfo(_td_c_get_11_49);
        _jettag_c_get_11_49.doStart(context, out);
        _jettag_c_get_11_49.doEnd();
        out.write(".subflow\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  <eClassifiers xmi:type=\"eflow:FCMComposite\" name=\"FCMComposite_1\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <eSuperTypes href=\"http://www.ibm.com/wbi/2005/eflow#//FCMBlock\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <translation xmi:type=\"utility:TranslatableString\" key=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_15_61 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_15_61); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_15_61.setRuntimeParent(null);
        _jettag_c_get_15_61.setTagInfo(_td_c_get_15_61);
        _jettag_c_get_15_61.doStart(context, out);
        _jettag_c_get_15_61.doEnd();
        out.write("\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    bundleName=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_16_17 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_16_17); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_16_17.setRuntimeParent(null);
        _jettag_c_get_16_17.setTagInfo(_td_c_get_16_17);
        _jettag_c_get_16_17.doStart(context, out);
        _jettag_c_get_16_17.doEnd();
        RuntimeTagElement _jettag_c_get_16_55 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_16_55); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_16_55.setRuntimeParent(null);
        _jettag_c_get_16_55.setTagInfo(_td_c_get_16_55);
        _jettag_c_get_16_55.doStart(context, out);
        _jettag_c_get_16_55.doEnd();
        out.write("\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    pluginId=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_17_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_17_15); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_17_15.setRuntimeParent(null);
        _jettag_c_get_17_15.setTagInfo(_td_c_get_17_15);
        _jettag_c_get_17_15.doStart(context, out);
        _jettag_c_get_17_15.doEnd();
        out.write("\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <colorGraphic16 xmi:type=\"utility:GIFFileGraphic\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    resourceName=\"platform:/plugin/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_19_36 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_19_36); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_19_36.setRuntimeParent(null);
        _jettag_c_get_19_36.setTagInfo(_td_c_get_19_36);
        _jettag_c_get_19_36.doStart(context, out);
        _jettag_c_get_19_36.doEnd();
        out.write("/icons/full/obj16/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_19_90 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_19_90); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_19_90.setRuntimeParent(null);
        _jettag_c_get_19_90.setTagInfo(_td_c_get_19_90);
        _jettag_c_get_19_90.doStart(context, out);
        _jettag_c_get_19_90.doEnd();
        out.write(".gif\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <colorGraphic32 xmi:type=\"utility:GIFFileGraphic\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    resourceName=\"platform:/plugin/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_21_36 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_21_36); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_21_36.setRuntimeParent(null);
        _jettag_c_get_21_36.setTagInfo(_td_c_get_21_36);
        _jettag_c_get_21_36.doStart(context, out);
        _jettag_c_get_21_36.doEnd();
        out.write("/icons/full/obj30/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_21_90 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_21_90); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_21_90.setRuntimeParent(null);
        _jettag_c_get_21_90.setTagInfo(_td_c_get_21_90);
        _jettag_c_get_21_90.doStart(context, out);
        _jettag_c_get_21_90.doEnd();
        out.write(".gif\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <shortDescription xmi:type=\"utility:ConstantString\" string=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_22_65 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_22_65); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_22_65.setRuntimeParent(null);
        _jettag_c_get_22_65.setTagInfo(_td_c_get_22_65);
        _jettag_c_get_22_65.doStart(context, out);
        _jettag_c_get_22_65.doEnd();
        out.write("\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <longDescription xmi:type=\"utility:ConstantString\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    string=\"Generated by ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_24_26 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_24_26); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_24_26.setRuntimeParent(null);
        _jettag_c_get_24_26.setTagInfo(_td_c_get_24_26);
        _jettag_c_get_24_26.doStart(context, out);
        _jettag_c_get_24_26.doEnd();
        out.write(" Version ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_24_71 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_24_71); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_24_71.setRuntimeParent(null);
        _jettag_c_get_24_71.setTagInfo(_td_c_get_24_71);
        _jettag_c_get_24_71.doStart(context, out);
        _jettag_c_get_24_71.doEnd();
        out.write(NL);         
        out.write("    &#xD;&#xA;");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_25_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_25_15); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_25_15.setRuntimeParent(null);
        _jettag_c_get_25_15.setTagInfo(_td_c_get_25_15);
        _jettag_c_get_25_15.doStart(context, out);
        _jettag_c_get_25_15.doEnd();
        out.write(NL);         
        out.write("    &#xD;&#xA;$MQSI patternName=");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_26_33 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_26_33); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_26_33.setRuntimeParent(null);
        _jettag_c_get_26_33.setTagInfo(_td_c_get_26_33);
        _jettag_c_get_26_33.doStart(context, out);
        _jettag_c_get_26_33.doEnd();
        out.write(" MQSI$");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    &#xD;&#xA;$MQSI patternVersion=");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_27_36 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_27_36); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_27_36.setRuntimeParent(null);
        _jettag_c_get_27_36.setTagInfo(_td_c_get_27_36);
        _jettag_c_get_27_36.doStart(context, out);
        _jettag_c_get_27_36.doEnd();
        out.write(" MQSI$");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    \"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <version xmi:type=\"utility:ConstantString\" string=\"1\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <composition>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <nodes xmi:type=\"ComIbmCompute.msgnode:FCMComposite_1\" xmi:id=\"FCMComposite_1_3\" location=\"398,150\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      computeExpression=\"esql://routine/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_32_41 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_32_41); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_32_41.setRuntimeParent(null);
        _jettag_c_get_32_41.setTagInfo(_td_c_get_32_41);
        _jettag_c_get_32_41.doStart(context, out);
        _jettag_c_get_32_41.doEnd();
        out.write("#CreateLogMessage.Main\" computeMode=\"destinationAndMessage\" throwExceptionOnDatabaseError=\"false\" >");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"Create Log Message\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <nodes xmi:type=\"ComIbmMQOutput.msgnode:FCMComposite_1\" xmi:id=\"FCMComposite_1_6\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      location=\"545,151\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      queueManagerName=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_37_25 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_37_25); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_37_25.setRuntimeParent(null);
        _jettag_c_get_37_25.setTagInfo(_td_c_get_37_25);
        _jettag_c_get_37_25.doStart(context, out);
        _jettag_c_get_37_25.doEnd();
        out.write("\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      queueName=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_38_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_38_18); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_38_18.setRuntimeParent(null);
        _jettag_c_get_38_18.setTagInfo(_td_c_get_38_18);
        _jettag_c_get_38_18.doStart(context, out);
        _jettag_c_get_38_18.doEnd();
        RuntimeTagElement _jettag_c_get_38_55 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_38_55); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_38_55.setRuntimeParent(null);
        _jettag_c_get_38_55.setTagInfo(_td_c_get_38_55);
        _jettag_c_get_38_55.doStart(context, out);
        _jettag_c_get_38_55.doEnd();
        RuntimeTagElement _jettag_c_get_38_87 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_38_87); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_38_87.setRuntimeParent(null);
        _jettag_c_get_38_87.setTagInfo(_td_c_get_38_87);
        _jettag_c_get_38_87.doStart(context, out);
        _jettag_c_get_38_87.doEnd();
        out.write("\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      transactionMode=\"no\" persistenceMode=\"yes\" validateMaster=\"none\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"Write Log\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <nodes xmi:type=\"ComIbmFilter.msgnode:FCMComposite_1\" xmi:id=\"FCMComposite_1_11\" location=\"305,138\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      filterExpression=\"esql://routine/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_43_40 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_43_40); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_43_40.setRuntimeParent(null);
        _jettag_c_get_43_40.setTagInfo(_td_c_get_43_40);
        _jettag_c_get_43_40.doStart(context, out);
        _jettag_c_get_43_40.doEnd();
        out.write("#CheckLogging.Main\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"Logging On?\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <nodes xmi:type=\"ComIbmTryCatch.msgnode:FCMComposite_1\" xmi:id=\"FCMComposite_1_15\" location=\"180,69\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"Trace if Log Fails\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <nodes xmi:type=\"ComIbmTrace.msgnode:FCMComposite_1\" xmi:id=\"FCMComposite_1_16\" location=\"563,65\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      pattern=\"&#xD;&#xA;Logging Failure&#xD;&#xA;=========&#xD;&#xA;&#xD;&#xA;${Environment.Variables.Error}&#xD;&#xA;==========\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"Trace\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <nodes xmi:type=\"ComIbmCompute.msgnode:FCMComposite_1\" xmi:id=\"FCMComposite_1_17\" location=\"402,65\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      computeExpression=\"esql://routine/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_54_41 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_54_41); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_54_41.setRuntimeParent(null);
        _jettag_c_get_54_41.setTagInfo(_td_c_get_54_41);
        _jettag_c_get_54_41.doStart(context, out);
        _jettag_c_get_54_41.doEnd();
        out.write("#CreateTraceData.Main\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"Create Trace Data\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <nodes xmi:type=\"eflow:FCMSource\" xmi:id=\"InTerminal.Input\" location=\"53,69\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:TranslatableString\" key=\"InTerminal.Input\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        bundleName=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_59_21 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_59_21); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_59_21.setRuntimeParent(null);
        _jettag_c_get_59_21.setTagInfo(_td_c_get_59_21);
        _jettag_c_get_59_21.doStart(context, out);
        _jettag_c_get_59_21.doEnd();
        RuntimeTagElement _jettag_c_get_59_59 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_59_59); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_59_59.setRuntimeParent(null);
        _jettag_c_get_59_59.setTagInfo(_td_c_get_59_59);
        _jettag_c_get_59_59.doStart(context, out);
        _jettag_c_get_59_59.doEnd();
        out.write("\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        pluginId=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_60_19 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_60_19); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_60_19.setRuntimeParent(null);
        _jettag_c_get_60_19.setTagInfo(_td_c_get_60_19);
        _jettag_c_get_60_19.doStart(context, out);
        _jettag_c_get_60_19.doEnd();
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
