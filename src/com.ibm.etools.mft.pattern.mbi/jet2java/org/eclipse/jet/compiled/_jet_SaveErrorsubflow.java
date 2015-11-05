package org.eclipse.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_SaveErrorsubflow implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_SaveErrorsubflow() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_get_14_12 = new TagInfo("c:get", //$NON-NLS-1$
            14, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlowURI", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_15_15 = new TagInfo("c:get", //$NON-NLS-1$
            15, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlowPrefix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_20_5 = new TagInfo("c:if", //$NON-NLS-1$
            20, 5,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/errorMessageRequired = 'true' or $root/badMsgAction = 'Save'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_25_61 = new TagInfo("c:get", //$NON-NLS-1$
            25, 61,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@error", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_26_17 = new TagInfo("c:get", //$NON-NLS-1$
            26, 17,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlowBundleName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_27_15 = new TagInfo("c:get", //$NON-NLS-1$
            27, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@projectname", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_30_5 = new TagInfo("c:get", //$NON-NLS-1$
            30, 5,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@projectname", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_30_59 = new TagInfo("c:get", //$NON-NLS-1$
            30, 59,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@error", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_32_36 = new TagInfo("c:get", //$NON-NLS-1$
            32, 36,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@projectname", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_32_90 = new TagInfo("c:get", //$NON-NLS-1$
            32, 90,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@error", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_33_65 = new TagInfo("c:get", //$NON-NLS-1$
            33, 65,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/shortDescription", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_35_26 = new TagInfo("c:get", //$NON-NLS-1$
            35, 26,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@patternName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_35_71 = new TagInfo("c:get", //$NON-NLS-1$
            35, 71,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@patternVersion", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_36_15 = new TagInfo("c:get", //$NON-NLS-1$
            36, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/longDescription", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_37_33 = new TagInfo("c:get", //$NON-NLS-1$
            37, 33,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@patternName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_38_36 = new TagInfo("c:get", //$NON-NLS-1$
            38, 36,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@patternVersion", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_44_18 = new TagInfo("c:get", //$NON-NLS-1$
            44, 18,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlowBundleName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_45_19 = new TagInfo("c:get", //$NON-NLS-1$
            45, 19,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@projectname", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_49_40 = new TagInfo("c:get", //$NON-NLS-1$
            49, 40,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@esqlQualifier", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_52_2 = new TagInfo("c:if", //$NON-NLS-1$
            52, 2,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/errorMessageRequired='true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_54_25 = new TagInfo("c:get", //$NON-NLS-1$
            54, 25,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/errorQueueManager", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_55_18 = new TagInfo("c:get", //$NON-NLS-1$
            55, 18,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/queueprefix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_55_55 = new TagInfo("c:get", //$NON-NLS-1$
            55, 55,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/errorQueue", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_55_91 = new TagInfo("c:get", //$NON-NLS-1$
            55, 91,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/queuesuffix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_60_41 = new TagInfo("c:get", //$NON-NLS-1$
            60, 41,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@esqlQualifier", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_67_41 = new TagInfo("c:get", //$NON-NLS-1$
            67, 41,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_73_40 = new TagInfo("c:get", //$NON-NLS-1$
            73, 40,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@esqlQualifier", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_78_2 = new TagInfo("c:if", //$NON-NLS-1$
            78, 2,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/errorMessageRequired='true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_79_135 = new TagInfo("c:get", //$NON-NLS-1$
            79, 135,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@esqlQualifier", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_83_25 = new TagInfo("c:get", //$NON-NLS-1$
            83, 25,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/errorQueueManager", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_84_18 = new TagInfo("c:get", //$NON-NLS-1$
            84, 18,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/queueprefix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_84_55 = new TagInfo("c:get", //$NON-NLS-1$
            84, 55,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/errorQueue", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_84_91 = new TagInfo("c:get", //$NON-NLS-1$
            84, 91,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/queuesuffix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_88_139 = new TagInfo("c:get", //$NON-NLS-1$
            88, 139,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@esqlQualifier", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_99_2 = new TagInfo("c:if", //$NON-NLS-1$
            99, 2,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/errorMessageRequired='true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_117_17 = new TagInfo("c:if", //$NON-NLS-1$
            117, 17,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/errorMessageRequired = 'true' ", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_120_19 = new TagInfo("c:get", //$NON-NLS-1$
            120, 19,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlowBundleName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_121_23 = new TagInfo("c:get", //$NON-NLS-1$
            121, 23,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@projectname", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;

com.ibm.etools.mft.pattern.mbi.plugin.PatternPlugin pattern = com.ibm.etools.mft.pattern.mbi.plugin.PatternPlugin.getInstance();
com.ibm.etools.mft.pattern.mbi.ms.xmlmq.PatternMessages messages = new com.ibm.etools.mft.pattern.mbi.ms.xmlmq.PatternMessages();

        out.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<ecore:EPackage xmi:version=\"2.0\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:xmi=\"http://www.omg.org/XMI\" xmlns:ComIbmCompute.msgnode=\"ComIbmCompute.msgnode\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:ComIbmFilter.msgnode=\"ComIbmFilter.msgnode\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:ComIbmMQOutput.msgnode=\"ComIbmMQOutput.msgnode\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:ComIbmThrow.msgnode=\"ComIbmThrow.msgnode\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:ecore=\"http://www.eclipse.org/emf/2002/Ecore\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:eflow=\"http://www.ibm.com/wbi/2005/eflow\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:utility=\"http://www.ibm.com/wbi/2005/eflow_utility\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    nsURI=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_14_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_14_12); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_14_12.setRuntimeParent(null);
        _jettag_c_get_14_12.setTagInfo(_td_c_get_14_12);
        _jettag_c_get_14_12.doStart(context, out);
        _jettag_c_get_14_12.doEnd();
        out.write(".subflow\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    nsPrefix=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_15_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_15_15); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_15_15.setRuntimeParent(null);
        _jettag_c_get_15_15.setTagInfo(_td_c_get_15_15);
        _jettag_c_get_15_15.doStart(context, out);
        _jettag_c_get_15_15.doEnd();
        out.write(".subflow\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  <eClassifiers xmi:type=\"eflow:FCMComposite\" name=\"FCMComposite_1\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    <eSuperTypes href=\"http://www.ibm.com/wbi/2005/eflow#//FCMBlock\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_20_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_20_5); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_20_5.setRuntimeParent(null);
        _jettag_c_if_20_5.setTagInfo(_td_c_if_20_5);
        _jettag_c_if_20_5.doStart(context, out);
        while (_jettag_c_if_20_5.okToProcessBody()) {
            out.write("    <eStructuralFeatures xmi:type=\"ecore:EAttribute\" xmi:id=\"Property.ErrorLoggingOn\" name=\"ErrorLoggingOn\" lowerBound=\"1\" defaultValueLiteral=\"true\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      <eType xmi:type=\"ecore:EDataType\" href=\"http://www.eclipse.org/emf/2002/Ecore#//EBoolean\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    </eStructuralFeatures>");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_20_5.handleBodyContent(out);
        }
        _jettag_c_if_20_5.doEnd();
        out.write("    <translation xmi:type=\"utility:TranslatableString\" key=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_25_61 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_25_61); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_25_61.setRuntimeParent(null);
        _jettag_c_get_25_61.setTagInfo(_td_c_get_25_61);
        _jettag_c_get_25_61.doStart(context, out);
        _jettag_c_get_25_61.doEnd();
        out.write("\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    bundleName=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_26_17 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_26_17); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_26_17.setRuntimeParent(null);
        _jettag_c_get_26_17.setTagInfo(_td_c_get_26_17);
        _jettag_c_get_26_17.doStart(context, out);
        _jettag_c_get_26_17.doEnd();
        out.write("\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    pluginId=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_27_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_27_15); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_27_15.setRuntimeParent(null);
        _jettag_c_get_27_15.setTagInfo(_td_c_get_27_15);
        _jettag_c_get_27_15.doStart(context, out);
        _jettag_c_get_27_15.doEnd();
        out.write("\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <colorGraphic16 xmi:type=\"utility:GIFFileGraphic\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    resourceName=\"platform:/plugin/");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_30_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_30_5); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_30_5.setRuntimeParent(null);
        _jettag_c_get_30_5.setTagInfo(_td_c_get_30_5);
        _jettag_c_get_30_5.doStart(context, out);
        _jettag_c_get_30_5.doEnd();
        out.write("/icons/full/obj16/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_30_59 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_30_59); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_30_59.setRuntimeParent(null);
        _jettag_c_get_30_59.setTagInfo(_td_c_get_30_59);
        _jettag_c_get_30_59.doStart(context, out);
        _jettag_c_get_30_59.doEnd();
        out.write(".gif\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <colorGraphic32 xmi:type=\"utility:GIFFileGraphic\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    resourceName=\"platform:/plugin/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_32_36 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_32_36); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_32_36.setRuntimeParent(null);
        _jettag_c_get_32_36.setTagInfo(_td_c_get_32_36);
        _jettag_c_get_32_36.doStart(context, out);
        _jettag_c_get_32_36.doEnd();
        out.write("/icons/full/obj30/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_32_90 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_32_90); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_32_90.setRuntimeParent(null);
        _jettag_c_get_32_90.setTagInfo(_td_c_get_32_90);
        _jettag_c_get_32_90.doStart(context, out);
        _jettag_c_get_32_90.doEnd();
        out.write(".gif\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <shortDescription xmi:type=\"utility:ConstantString\" string=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_33_65 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_33_65); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_33_65.setRuntimeParent(null);
        _jettag_c_get_33_65.setTagInfo(_td_c_get_33_65);
        _jettag_c_get_33_65.doStart(context, out);
        _jettag_c_get_33_65.doEnd();
        out.write("\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <longDescription xmi:type=\"utility:ConstantString\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    string=\"Generated by ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_35_26 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_35_26); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_35_26.setRuntimeParent(null);
        _jettag_c_get_35_26.setTagInfo(_td_c_get_35_26);
        _jettag_c_get_35_26.doStart(context, out);
        _jettag_c_get_35_26.doEnd();
        out.write(" Version ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_35_71 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_35_71); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_35_71.setRuntimeParent(null);
        _jettag_c_get_35_71.setTagInfo(_td_c_get_35_71);
        _jettag_c_get_35_71.doStart(context, out);
        _jettag_c_get_35_71.doEnd();
        out.write(NL);         
        out.write("    &#xD;&#xA;");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_36_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_36_15); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_36_15.setRuntimeParent(null);
        _jettag_c_get_36_15.setTagInfo(_td_c_get_36_15);
        _jettag_c_get_36_15.doStart(context, out);
        _jettag_c_get_36_15.doEnd();
        out.write(NL);         
        out.write("    &#xD;&#xA;$MQSI patternName=");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_37_33 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_37_33); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_37_33.setRuntimeParent(null);
        _jettag_c_get_37_33.setTagInfo(_td_c_get_37_33);
        _jettag_c_get_37_33.doStart(context, out);
        _jettag_c_get_37_33.doEnd();
        out.write(" MQSI$");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    &#xD;&#xA;$MQSI patternVersion=");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_38_36 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_38_36); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_38_36.setRuntimeParent(null);
        _jettag_c_get_38_36.setTagInfo(_td_c_get_38_36);
        _jettag_c_get_38_36.doStart(context, out);
        _jettag_c_get_38_36.doEnd();
        out.write(" MQSI$");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    \"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <version xmi:type=\"utility:ConstantString\" string=\"1\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <composition>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <nodes xmi:type=\"eflow:FCMSource\" xmi:id=\"InTerminal.Input\" location=\"19,107\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:TranslatableString\" key=\"InTerminal.Input\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    \tbundleName=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_44_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_44_18); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_44_18.setRuntimeParent(null);
        _jettag_c_get_44_18.setTagInfo(_td_c_get_44_18);
        _jettag_c_get_44_18.doStart(context, out);
        _jettag_c_get_44_18.doEnd();
        out.write("\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        pluginId=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_45_19 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_45_19); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_45_19.setRuntimeParent(null);
        _jettag_c_get_45_19.setTagInfo(_td_c_get_45_19);
        _jettag_c_get_45_19.doStart(context, out);
        _jettag_c_get_45_19.doEnd();
        out.write("\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("      <nodes xmi:type=\"ComIbmFilter.msgnode:FCMComposite_1\" xmi:id=\"FCMComposite_1_8\" location=\"199,111\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      filterExpression=\"esql://routine/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_49_40 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_49_40); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_49_40.setRuntimeParent(null);
        _jettag_c_get_49_40.setTagInfo(_td_c_get_49_40);
        _jettag_c_get_49_40.doStart(context, out);
        _jettag_c_get_49_40.doEnd();
        out.write("CheckErrorLogging.Main\" throwExceptionOnDatabaseError=\"false\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"Error Logging On?\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_52_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_52_2); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_52_2.setRuntimeParent(null);
        _jettag_c_if_52_2.setTagInfo(_td_c_if_52_2);
        _jettag_c_if_52_2.doStart(context, out);
        while (_jettag_c_if_52_2.okToProcessBody()) {
            out.write("      <nodes xmi:type=\"ComIbmMQOutput.msgnode:FCMComposite_1\" xmi:id=\"FCMComposite_1_12\" location=\"587,187\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      queueManagerName=\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_54_25 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_54_25); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_54_25.setRuntimeParent(_jettag_c_if_52_2);
            _jettag_c_get_54_25.setTagInfo(_td_c_get_54_25);
            _jettag_c_get_54_25.doStart(context, out);
            _jettag_c_get_54_25.doEnd();
            out.write("\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      queueName=\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_55_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_55_18); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_55_18.setRuntimeParent(_jettag_c_if_52_2);
            _jettag_c_get_55_18.setTagInfo(_td_c_get_55_18);
            _jettag_c_get_55_18.doStart(context, out);
            _jettag_c_get_55_18.doEnd();
            RuntimeTagElement _jettag_c_get_55_55 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_55_55); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_55_55.setRuntimeParent(_jettag_c_if_52_2);
            _jettag_c_get_55_55.setTagInfo(_td_c_get_55_55);
            _jettag_c_get_55_55.doStart(context, out);
            _jettag_c_get_55_55.doEnd();
            RuntimeTagElement _jettag_c_get_55_91 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_55_91); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_55_91.setRuntimeParent(_jettag_c_if_52_2);
            _jettag_c_get_55_91.setTagInfo(_td_c_get_55_91);
            _jettag_c_get_55_91.doStart(context, out);
            _jettag_c_get_55_91.doEnd();
            out.write("\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      transactionMode=\"no\" persistenceMode=\"yes\" validateMaster=\"none\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"Error Output\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      </nodes>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      <nodes xmi:type=\"ComIbmCompute.msgnode:FCMComposite_1\" xmi:id=\"FCMComposite_1_7\" location=\"430,189\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      computeExpression=\"esql://routine/");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_60_41 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_60_41); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_60_41.setRuntimeParent(_jettag_c_if_52_2);
            _jettag_c_get_60_41.setTagInfo(_td_c_get_60_41);
            _jettag_c_get_60_41.doStart(context, out);
            _jettag_c_get_60_41.doEnd();
            out.write("Build_Error_Message.Main\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      throwExceptionOnDatabaseError=\"false\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"Build Error Message\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      </nodes>");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_52_2.handleBodyContent(out);
        }
        _jettag_c_if_52_2.doEnd();
        out.write("<nodes xmi:type=\"ComIbmCompute.msgnode:FCMComposite_1\" xmi:id=\"FCMComposite_1_2\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("location=\"678,51\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      computeExpression=\"esql://routine/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_67_41 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_67_41); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_67_41.setRuntimeParent(null);
        _jettag_c_get_67_41.setTagInfo(_td_c_get_67_41);
        _jettag_c_get_67_41.doStart(context, out);
        _jettag_c_get_67_41.doEnd();
        out.write("#Cancel.Main\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      computeMode=\"exceptionAndMessage\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      throwExceptionOnDatabaseError=\"false\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"Throw\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <nodes xmi:type=\"ComIbmFilter.msgnode:FCMComposite_1\" xmi:id=\"FCMComposite_1_4\" location=\"92,107\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      filterExpression=\"esql://routine/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_73_40 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_73_40); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_73_40.setRuntimeParent(null);
        _jettag_c_get_73_40.setTagInfo(_td_c_get_73_40);
        _jettag_c_get_73_40.doStart(context, out);
        _jettag_c_get_73_40.doEnd();
        out.write("ExtractionComplete.Main\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"End?\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      ");  //$NON-NLS-1$        
        out.write(NL);         
        // Put in end message but only if error message required
        RuntimeTagElement _jettag_c_if_78_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_78_2); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_78_2.setRuntimeParent(null);
        _jettag_c_if_78_2.setTagInfo(_td_c_if_78_2);
        _jettag_c_if_78_2.doStart(context, out);
        while (_jettag_c_if_78_2.okToProcessBody()) {
            out.write("<nodes xmi:type=\"ComIbmCompute.msgnode:FCMComposite_1\" xmi:id=\"FCMComposite_1_3\" location=\"274,380\" computeExpression=\"esql://routine/");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_79_135 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_79_135); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_79_135.setRuntimeParent(_jettag_c_if_78_2);
            _jettag_c_get_79_135.setTagInfo(_td_c_get_79_135);
            _jettag_c_get_79_135.doStart(context, out);
            _jettag_c_get_79_135.doEnd();
            out.write("BuildFinalMessage.Main\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"Build Final Message\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      </nodes>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      <nodes xmi:type=\"ComIbmMQOutput.msgnode:FCMComposite_1\" xmi:id=\"FCMComposite_1_10\" location=\"503,371\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      queueManagerName=\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_83_25 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_83_25); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_83_25.setRuntimeParent(_jettag_c_if_78_2);
            _jettag_c_get_83_25.setTagInfo(_td_c_get_83_25);
            _jettag_c_get_83_25.doStart(context, out);
            _jettag_c_get_83_25.doEnd();
            out.write("\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      queueName=\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_84_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_84_18); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_84_18.setRuntimeParent(_jettag_c_if_78_2);
            _jettag_c_get_84_18.setTagInfo(_td_c_get_84_18);
            _jettag_c_get_84_18.doStart(context, out);
            _jettag_c_get_84_18.doEnd();
            RuntimeTagElement _jettag_c_get_84_55 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_84_55); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_84_55.setRuntimeParent(_jettag_c_if_78_2);
            _jettag_c_get_84_55.setTagInfo(_td_c_get_84_55);
            _jettag_c_get_84_55.doStart(context, out);
            _jettag_c_get_84_55.doEnd();
            RuntimeTagElement _jettag_c_get_84_91 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_84_91); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_84_91.setRuntimeParent(_jettag_c_if_78_2);
            _jettag_c_get_84_91.setTagInfo(_td_c_get_84_91);
            _jettag_c_get_84_91.doStart(context, out);
            _jettag_c_get_84_91.doEnd();
            out.write("\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("       transactionMode=\"no\" persistenceMode=\"yes\" >");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"Final Error Output\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      </nodes>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      <nodes xmi:type=\"ComIbmFilter.msgnode:FCMComposite_1\" xmi:id=\"FCMComposite_1_1\" location=\"153,332\" filterExpression=\"esql://routine/");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_88_139 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_88_139); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_88_139.setRuntimeParent(_jettag_c_if_78_2);
            _jettag_c_get_88_139.setTagInfo(_td_c_get_88_139);
            _jettag_c_get_88_139.doStart(context, out);
            _jettag_c_get_88_139.doEnd();
            out.write("CheckSavedMessages.Main\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"Saved Messages?\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      </nodes>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_11\" targetNode=\"FCMComposite_1_10\" sourceNode=\"FCMComposite_1_3\" sourceTerminalName=\"OutTerminal.out\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_2\" targetNode=\"FCMComposite_1_1\" sourceNode=\"FCMComposite_1_4\" sourceTerminalName=\"OutTerminal.true\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_3\" targetNode=\"FCMComposite_1_3\" sourceNode=\"FCMComposite_1_1\" sourceTerminalName=\"OutTerminal.true\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_78_2.handleBodyContent(out);
        }
        _jettag_c_if_78_2.doEnd();
        out.write("      ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t  <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_4\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      targetNode=\"FCMComposite_1_4\" sourceNode=\"InTerminal.Input\" sourceTerminalName=\"OutTerminal.out\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_99_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_99_2); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_99_2.setRuntimeParent(null);
        _jettag_c_if_99_2.setTagInfo(_td_c_if_99_2);
        _jettag_c_if_99_2.doStart(context, out);
        while (_jettag_c_if_99_2.okToProcessBody()) {
            out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_1\" targetNode=\"FCMComposite_1_7\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      sourceNode=\"FCMComposite_1_8\" sourceTerminalName=\"OutTerminal.true\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_2\" targetNode=\"FCMComposite_1_12\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      sourceNode=\"FCMComposite_1_7\" sourceTerminalName=\"OutTerminal.out\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_3\" targetNode=\"FCMComposite_1_2\" sourceNode=\"FCMComposite_1_12\" sourceTerminalName=\"OutTerminal.out\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_5\" targetNode=\"FCMComposite_1_2\" sourceNode=\"FCMComposite_1_12\" sourceTerminalName=\"OutTerminal.failure\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(NL);         
            _jettag_c_if_99_2.handleBodyContent(out);
        }
        _jettag_c_if_99_2.doEnd();
        out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_20\" targetNode=\"FCMComposite_1_2\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      sourceNode=\"FCMComposite_1_8\" sourceTerminalName=\"OutTerminal.false\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("           <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_6\" targetNode=\"FCMComposite_1_8\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("           sourceNode=\"FCMComposite_1_4\" sourceTerminalName=\"OutTerminal.false\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </composition>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <propertyOrganizer>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_117_17 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_117_17); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_117_17.setRuntimeParent(null);
        _jettag_c_if_117_17.setTagInfo(_td_c_if_117_17);
        _jettag_c_if_117_17.doStart(context, out);
        while (_jettag_c_if_117_17.okToProcessBody()) {
            out.write("          <propertyDescriptor groupName=\"Group.Basic\" configurable=\"true\" userDefined=\"true\" describedAttribute=\"Property.ErrorLoggingOn\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("            <propertyName xmi:type=\"utility:TranslatableString\" key=\"Property.ErrorLoggingOn\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    \t\tbundleName=\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_120_19 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_120_19); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_120_19.setRuntimeParent(_jettag_c_if_117_17);
            _jettag_c_get_120_19.setTagInfo(_td_c_get_120_19);
            _jettag_c_get_120_19.doStart(context, out);
            _jettag_c_get_120_19.doEnd();
            out.write("\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("            pluginId=\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_121_23 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_121_23); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_121_23.setRuntimeParent(_jettag_c_if_117_17);
            _jettag_c_get_121_23.setTagInfo(_td_c_get_121_23);
            _jettag_c_get_121_23.doStart(context, out);
            _jettag_c_get_121_23.doEnd();
            out.write("\"/></propertyDescriptor>");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_117_17.handleBodyContent(out);
        }
        _jettag_c_if_117_17.doEnd();
        out.write(NL);         
        out.write("         </propertyOrganizer>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  </eClassifiers>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("</ecore:EPackage>");  //$NON-NLS-1$        
        out.write(NL);         
    }
}
