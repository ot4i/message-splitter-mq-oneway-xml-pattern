package org.eclipse.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_Errorsubflow_0 implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_Errorsubflow_0() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_get_19_12 = new TagInfo("c:get", //$NON-NLS-1$
            19, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_19_50 = new TagInfo("c:get", //$NON-NLS-1$
            19, 50,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@error", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_20_15 = new TagInfo("c:get", //$NON-NLS-1$
            20, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_20_53 = new TagInfo("c:get", //$NON-NLS-1$
            20, 53,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@error", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_24_5 = new TagInfo("c:if", //$NON-NLS-1$
            24, 5,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/errorMessageRequired = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_30_61 = new TagInfo("c:get", //$NON-NLS-1$
            30, 61,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@error", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_31_17 = new TagInfo("c:get", //$NON-NLS-1$
            31, 17,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_31_55 = new TagInfo("c:get", //$NON-NLS-1$
            31, 55,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@error", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_32_15 = new TagInfo("c:get", //$NON-NLS-1$
            32, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@projectname", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_34_36 = new TagInfo("c:get", //$NON-NLS-1$
            34, 36,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@projectname", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_34_90 = new TagInfo("c:get", //$NON-NLS-1$
            34, 90,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@error", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_36_36 = new TagInfo("c:get", //$NON-NLS-1$
            36, 36,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@projectname", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_36_90 = new TagInfo("c:get", //$NON-NLS-1$
            36, 90,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@error", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_37_65 = new TagInfo("c:get", //$NON-NLS-1$
            37, 65,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/shortDescription", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_39_26 = new TagInfo("c:get", //$NON-NLS-1$
            39, 26,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@patternName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_39_71 = new TagInfo("c:get", //$NON-NLS-1$
            39, 71,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@patternVersion", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_40_15 = new TagInfo("c:get", //$NON-NLS-1$
            40, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/longDescription", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_41_33 = new TagInfo("c:get", //$NON-NLS-1$
            41, 33,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@patternName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_42_36 = new TagInfo("c:get", //$NON-NLS-1$
            42, 36,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@patternVersion", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_48_21 = new TagInfo("c:get", //$NON-NLS-1$
            48, 21,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_48_59 = new TagInfo("c:get", //$NON-NLS-1$
            48, 59,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@error", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_48_101 = new TagInfo("c:get", //$NON-NLS-1$
            48, 101,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@projectname", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_51_41 = new TagInfo("c:get", //$NON-NLS-1$
            51, 41,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_56_40 = new TagInfo("c:get", //$NON-NLS-1$
            56, 40,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_66_1 = new TagInfo("c:choose", //$NON-NLS-1$
            66, 1,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_67_1 = new TagInfo("c:when", //$NON-NLS-1$
            67, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/errorMessageRequired = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_69_41 = new TagInfo("c:get", //$NON-NLS-1$
            69, 41,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_74_40 = new TagInfo("c:get", //$NON-NLS-1$
            74, 40,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_79_25 = new TagInfo("c:get", //$NON-NLS-1$
            79, 25,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/errorQueueManager", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_80_18 = new TagInfo("c:get", //$NON-NLS-1$
            80, 18,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/queueprefix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_80_55 = new TagInfo("c:get", //$NON-NLS-1$
            80, 55,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/errorQueue", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_80_91 = new TagInfo("c:get", //$NON-NLS-1$
            80, 91,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/queuesuffix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_87_98 = new TagInfo("c:get", //$NON-NLS-1$
            87, 98,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/instanceName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_91_1 = new TagInfo("c:otherwise", //$NON-NLS-1$
            91, 1,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_94_98 = new TagInfo("c:get", //$NON-NLS-1$
            94, 98,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/instanceName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_114_1 = new TagInfo("c:choose", //$NON-NLS-1$
            114, 1,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_115_1 = new TagInfo("c:when", //$NON-NLS-1$
            115, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/errorMessageRequired = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_132_1 = new TagInfo("c:otherwise", //$NON-NLS-1$
            132, 1,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_if_140_9 = new TagInfo("c:if", //$NON-NLS-1$
            140, 9,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/errorMessageRequired = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_144_22 = new TagInfo("c:get", //$NON-NLS-1$
            144, 22,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_144_60 = new TagInfo("c:get", //$NON-NLS-1$
            144, 60,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@error", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_145_19 = new TagInfo("c:get", //$NON-NLS-1$
            145, 19,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@projectname", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;

com.ibm.etools.mft.pattern.mbi.plugin.PatternPlugin pattern = com.ibm.etools.mft.pattern.mbi.plugin.PatternPlugin.getInstance();
com.ibm.etools.mft.pattern.mbi.mrrc.relmq.PatternMessages messages = new com.ibm.etools.mft.pattern.mbi.mrrc.relmq.PatternMessages();

        out.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<ecore:EPackage xmi:version=\"2.0\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:xmi=\"http://www.omg.org/XMI\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:ComIbmCompute.msgnode=\"ComIbmCompute.msgnode\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:ComIbmFilter.msgnode=\"ComIbmFilter.msgnode\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:ComIbmFlowOrder.msgnode=\"ComIbmFlowOrder.msgnode\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:ComIbmMQOutput.msgnode=\"ComIbmMQOutput.msgnode\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:ComIbmMQReply.msgnode=\"ComIbmMQReply.msgnode\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:ComIbmThrow.msgnode=\"ComIbmThrow.msgnode\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:ComIbmResetContentDescriptor.msgnode=\"ComIbmResetContentDescriptor.msgnode\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:ecore=\"http://www.eclipse.org/emf/2002/Ecore\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:eflow=\"http://www.ibm.com/wbi/2005/eflow\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:utility=\"http://www.ibm.com/wbi/2005/eflow_utility\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    nsURI=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_19_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_19_12); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_19_12.setRuntimeParent(null);
        _jettag_c_get_19_12.setTagInfo(_td_c_get_19_12);
        _jettag_c_get_19_12.doStart(context, out);
        _jettag_c_get_19_12.doEnd();
        RuntimeTagElement _jettag_c_get_19_50 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_19_50); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_19_50.setRuntimeParent(null);
        _jettag_c_get_19_50.setTagInfo(_td_c_get_19_50);
        _jettag_c_get_19_50.doStart(context, out);
        _jettag_c_get_19_50.doEnd();
        out.write(".subflow\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    nsPrefix=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_20_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_20_15); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_20_15.setRuntimeParent(null);
        _jettag_c_get_20_15.setTagInfo(_td_c_get_20_15);
        _jettag_c_get_20_15.doStart(context, out);
        _jettag_c_get_20_15.doEnd();
        RuntimeTagElement _jettag_c_get_20_53 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_20_53); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_20_53.setRuntimeParent(null);
        _jettag_c_get_20_53.setTagInfo(_td_c_get_20_53);
        _jettag_c_get_20_53.doStart(context, out);
        _jettag_c_get_20_53.doEnd();
        out.write(".subflow\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  <eClassifiers xmi:type=\"eflow:FCMComposite\" name=\"FCMComposite_1\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <eSuperTypes href=\"http://www.ibm.com/wbi/2005/eflow#//FCMBlock\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_24_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_24_5); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_24_5.setRuntimeParent(null);
        _jettag_c_if_24_5.setTagInfo(_td_c_if_24_5);
        _jettag_c_if_24_5.doStart(context, out);
        while (_jettag_c_if_24_5.okToProcessBody()) {
            out.write("    <eStructuralFeatures xmi:type=\"ecore:EAttribute\" xmi:id=\"Property.ErrorLoggingOn\" name=\"ErrorLoggingOn\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    lowerBound=\"1\" defaultValueLiteral=\"true\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      <eType xmi:type=\"ecore:EDataType\" href=\"http://www.eclipse.org/emf/2002/Ecore#//EBoolean\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    </eStructuralFeatures>");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_24_5.handleBodyContent(out);
        }
        _jettag_c_if_24_5.doEnd();
        out.write("    <translation xmi:type=\"utility:TranslatableString\" key=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_30_61 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_30_61); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_30_61.setRuntimeParent(null);
        _jettag_c_get_30_61.setTagInfo(_td_c_get_30_61);
        _jettag_c_get_30_61.doStart(context, out);
        _jettag_c_get_30_61.doEnd();
        out.write("\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    bundleName=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_31_17 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_31_17); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_31_17.setRuntimeParent(null);
        _jettag_c_get_31_17.setTagInfo(_td_c_get_31_17);
        _jettag_c_get_31_17.doStart(context, out);
        _jettag_c_get_31_17.doEnd();
        RuntimeTagElement _jettag_c_get_31_55 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_31_55); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_31_55.setRuntimeParent(null);
        _jettag_c_get_31_55.setTagInfo(_td_c_get_31_55);
        _jettag_c_get_31_55.doStart(context, out);
        _jettag_c_get_31_55.doEnd();
        out.write("\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    pluginId=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_32_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_32_15); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_32_15.setRuntimeParent(null);
        _jettag_c_get_32_15.setTagInfo(_td_c_get_32_15);
        _jettag_c_get_32_15.doStart(context, out);
        _jettag_c_get_32_15.doEnd();
        out.write("\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <colorGraphic16 xmi:type=\"utility:GIFFileGraphic\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    resourceName=\"platform:/plugin/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_34_36 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_34_36); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_34_36.setRuntimeParent(null);
        _jettag_c_get_34_36.setTagInfo(_td_c_get_34_36);
        _jettag_c_get_34_36.doStart(context, out);
        _jettag_c_get_34_36.doEnd();
        out.write("/icons/full/obj16/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_34_90 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_34_90); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_34_90.setRuntimeParent(null);
        _jettag_c_get_34_90.setTagInfo(_td_c_get_34_90);
        _jettag_c_get_34_90.doStart(context, out);
        _jettag_c_get_34_90.doEnd();
        out.write(".gif\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <colorGraphic32 xmi:type=\"utility:GIFFileGraphic\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    resourceName=\"platform:/plugin/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_36_36 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_36_36); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_36_36.setRuntimeParent(null);
        _jettag_c_get_36_36.setTagInfo(_td_c_get_36_36);
        _jettag_c_get_36_36.doStart(context, out);
        _jettag_c_get_36_36.doEnd();
        out.write("/icons/full/obj30/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_36_90 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_36_90); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_36_90.setRuntimeParent(null);
        _jettag_c_get_36_90.setTagInfo(_td_c_get_36_90);
        _jettag_c_get_36_90.doStart(context, out);
        _jettag_c_get_36_90.doEnd();
        out.write(".gif\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("   \t<shortDescription xmi:type=\"utility:ConstantString\" string=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_37_65 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_37_65); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_37_65.setRuntimeParent(null);
        _jettag_c_get_37_65.setTagInfo(_td_c_get_37_65);
        _jettag_c_get_37_65.doStart(context, out);
        _jettag_c_get_37_65.doEnd();
        out.write("\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <longDescription xmi:type=\"utility:ConstantString\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    string=\"Generated by ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_39_26 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_39_26); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_39_26.setRuntimeParent(null);
        _jettag_c_get_39_26.setTagInfo(_td_c_get_39_26);
        _jettag_c_get_39_26.doStart(context, out);
        _jettag_c_get_39_26.doEnd();
        out.write(" Version ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_39_71 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_39_71); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_39_71.setRuntimeParent(null);
        _jettag_c_get_39_71.setTagInfo(_td_c_get_39_71);
        _jettag_c_get_39_71.doStart(context, out);
        _jettag_c_get_39_71.doEnd();
        out.write(NL);         
        out.write("    &#xD;&#xA;");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_40_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_40_15); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_40_15.setRuntimeParent(null);
        _jettag_c_get_40_15.setTagInfo(_td_c_get_40_15);
        _jettag_c_get_40_15.doStart(context, out);
        _jettag_c_get_40_15.doEnd();
        out.write(NL);         
        out.write("    &#xD;&#xA;$MQSI patternName=");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_41_33 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_41_33); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_41_33.setRuntimeParent(null);
        _jettag_c_get_41_33.setTagInfo(_td_c_get_41_33);
        _jettag_c_get_41_33.doStart(context, out);
        _jettag_c_get_41_33.doEnd();
        out.write(" MQSI$");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    &#xD;&#xA;$MQSI patternVersion=");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_42_36 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_42_36); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_42_36.setRuntimeParent(null);
        _jettag_c_get_42_36.setTagInfo(_td_c_get_42_36);
        _jettag_c_get_42_36.doStart(context, out);
        _jettag_c_get_42_36.doEnd();
        out.write(" MQSI$");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    \"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <version xmi:type=\"utility:ConstantString\" string=\"1\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <composition>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <nodes xmi:type=\"eflow:FCMSource\" xmi:id=\"InTerminal.Input\" location=\"10,20\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:TranslatableString\" key=\"InTerminal.Input\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        bundleName=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_48_21 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_48_21); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_48_21.setRuntimeParent(null);
        _jettag_c_get_48_21.setTagInfo(_td_c_get_48_21);
        _jettag_c_get_48_21.doStart(context, out);
        _jettag_c_get_48_21.doEnd();
        RuntimeTagElement _jettag_c_get_48_59 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_48_59); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_48_59.setRuntimeParent(null);
        _jettag_c_get_48_59.setTagInfo(_td_c_get_48_59);
        _jettag_c_get_48_59.doStart(context, out);
        _jettag_c_get_48_59.doEnd();
        out.write("\" pluginId=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_48_101 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_48_101); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_48_101.setRuntimeParent(null);
        _jettag_c_get_48_101.setTagInfo(_td_c_get_48_101);
        _jettag_c_get_48_101.doStart(context, out);
        _jettag_c_get_48_101.doEnd();
        out.write("\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <nodes xmi:type=\"ComIbmCompute.msgnode:FCMComposite_1\" xmi:id=\"FCMComposite_1_1\" location=\"427,32\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      computeExpression=\"esql://routine/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_51_41 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_51_41); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_51_41.setRuntimeParent(null);
        _jettag_c_get_51_41.setTagInfo(_td_c_get_51_41);
        _jettag_c_get_51_41.doStart(context, out);
        _jettag_c_get_51_41.doEnd();
        out.write("#Create_Error_Reply.Main\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      throwExceptionOnDatabaseError=\"false\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"Create Error Response\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <nodes xmi:type=\"ComIbmFilter.msgnode:FCMComposite_1\" xmi:id=\"FCMComposite_1_2\" location=\"289,20\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      filterExpression=\"esql://routine/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_56_40 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_56_40); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_56_40.setRuntimeParent(null);
        _jettag_c_get_56_40.setTagInfo(_td_c_get_56_40);
        _jettag_c_get_56_40.doStart(context, out);
        _jettag_c_get_56_40.doEnd();
        out.write("#Request_Check.Main\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <translation xmi:type=\"utility:ConstantString\" string=\"Reply if Request Mode\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <nodes xmi:type=\"ComIbmMQReply.msgnode:FCMComposite_1\" xmi:id=\"FCMComposite_1_4\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      location=\"600,33\" persistenceMode=\"yes\" transactionMode=\"no\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"Reply\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            <nodes xmi:type=\"ComIbmFlowOrder.msgnode:FCMComposite_1\" xmi:id=\"FCMComposite_1_3\" location=\"159,20\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"Reply First\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_choose_66_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_66_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_choose_66_1.setRuntimeParent(null);
        _jettag_c_choose_66_1.setTagInfo(_td_c_choose_66_1);
        _jettag_c_choose_66_1.doStart(context, out);
        JET2Writer _jettag_c_choose_66_1_saved_out = out;
        while (_jettag_c_choose_66_1.okToProcessBody()) {
            out = out.newNestedContentWriter();
            RuntimeTagElement _jettag_c_when_67_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_67_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_when_67_1.setRuntimeParent(_jettag_c_choose_66_1);
            _jettag_c_when_67_1.setTagInfo(_td_c_when_67_1);
            _jettag_c_when_67_1.doStart(context, out);
            JET2Writer _jettag_c_when_67_1_saved_out = out;
            while (_jettag_c_when_67_1.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("      <nodes xmi:type=\"ComIbmCompute.msgnode:FCMComposite_1\" xmi:id=\"FCMComposite_1_7\" location=\"434,157\" ");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("      computeExpression=\"esql://routine/");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_69_41 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_69_41); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_69_41.setRuntimeParent(_jettag_c_when_67_1);
                _jettag_c_get_69_41.setTagInfo(_td_c_get_69_41);
                _jettag_c_get_69_41.doStart(context, out);
                _jettag_c_get_69_41.doEnd();
                out.write("#Build_Error_Message.Main\" ");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("       throwExceptionOnDatabaseError=\"false\">");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"Build Error Message\"/>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("      </nodes>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("      <nodes xmi:type=\"ComIbmFilter.msgnode:FCMComposite_1\" xmi:id=\"FCMComposite_1_8\" location=\"258,145\" ");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("      filterExpression=\"esql://routine/");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_74_40 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_74_40); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_74_40.setRuntimeParent(_jettag_c_when_67_1);
                _jettag_c_get_74_40.setTagInfo(_td_c_get_74_40);
                _jettag_c_get_74_40.doStart(context, out);
                _jettag_c_get_74_40.doEnd();
                out.write("#ErrorQ_check.Main\" ");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("      throwExceptionOnDatabaseError=\"false\">");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"ErrorLoggingOn?\"/>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("      </nodes>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("      <nodes xmi:type=\"ComIbmMQOutput.msgnode:FCMComposite_1\" xmi:id=\"FCMComposite_1_12\" location=\"593,158\" ");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("      queueManagerName=\"");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_79_25 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_79_25); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_79_25.setRuntimeParent(_jettag_c_when_67_1);
                _jettag_c_get_79_25.setTagInfo(_td_c_get_79_25);
                _jettag_c_get_79_25.doStart(context, out);
                _jettag_c_get_79_25.doEnd();
                out.write("\" ");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("      queueName=\"");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_80_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_80_18); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_80_18.setRuntimeParent(_jettag_c_when_67_1);
                _jettag_c_get_80_18.setTagInfo(_td_c_get_80_18);
                _jettag_c_get_80_18.doStart(context, out);
                _jettag_c_get_80_18.doEnd();
                RuntimeTagElement _jettag_c_get_80_55 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_80_55); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_80_55.setRuntimeParent(_jettag_c_when_67_1);
                _jettag_c_get_80_55.setTagInfo(_td_c_get_80_55);
                _jettag_c_get_80_55.doStart(context, out);
                _jettag_c_get_80_55.doEnd();
                RuntimeTagElement _jettag_c_get_80_91 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_80_91); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_80_91.setRuntimeParent(_jettag_c_when_67_1);
                _jettag_c_get_80_91.setTagInfo(_td_c_get_80_91);
                _jettag_c_get_80_91.doStart(context, out);
                _jettag_c_get_80_91.doEnd();
                out.write("\" ");  //$NON-NLS-1$        
                out.write(NL);         
                out.write(NL);         
                out.write("      transactionMode=\"no\" persistenceMode=\"yes\" validateMaster=\"none\">");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"Error Output\"/>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("      </nodes>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("      <nodes xmi:type=\"ComIbmThrow.msgnode:FCMComposite_1\" xmi:id=\"FCMComposite_1_5\"");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("      location=\"350,79\"");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("      messageText=\"");  //$NON-NLS-1$        
                out.write( pattern.getString("com.ibm.etools.mft.pattern.mbi.mrrc.relmq.esql.10") );
                out.write(" ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_87_98 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_87_98); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_87_98.setRuntimeParent(_jettag_c_when_67_1);
                _jettag_c_get_87_98.setTagInfo(_td_c_get_87_98);
                _jettag_c_get_87_98.doStart(context, out);
                _jettag_c_get_87_98.doEnd();
                out.write(" ");  //$NON-NLS-1$        
                out.write( pattern.getString("com.ibm.etools.mft.pattern.mbi.mrrc.relmq.esql.11") );
                out.write(" \">");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"Throw\"/>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("      </nodes>");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_when_67_1.handleBodyContent(out);
            }
            out = _jettag_c_when_67_1_saved_out;
            _jettag_c_when_67_1.doEnd();
            RuntimeTagElement _jettag_c_otherwise_91_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_91_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_otherwise_91_1.setRuntimeParent(_jettag_c_choose_66_1);
            _jettag_c_otherwise_91_1.setTagInfo(_td_c_otherwise_91_1);
            _jettag_c_otherwise_91_1.doStart(context, out);
            JET2Writer _jettag_c_otherwise_91_1_saved_out = out;
            while (_jettag_c_otherwise_91_1.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("      <nodes xmi:type=\"ComIbmThrow.msgnode:FCMComposite_1\" xmi:id=\"FCMComposite_1_5\"");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("      location=\"350,79\"");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("      messageText=\"");  //$NON-NLS-1$        
                out.write( pattern.getString("com.ibm.etools.mft.pattern.mbi.mrrc.relmq.esql.10") );
                out.write(" ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_94_98 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_94_98); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_94_98.setRuntimeParent(_jettag_c_otherwise_91_1);
                _jettag_c_get_94_98.setTagInfo(_td_c_get_94_98);
                _jettag_c_get_94_98.doStart(context, out);
                _jettag_c_get_94_98.doEnd();
                out.write(" ");  //$NON-NLS-1$        
                out.write( pattern.getString("com.ibm.etools.mft.pattern.mbi.mrrc.relmq.esql.11") );
                out.write(" \">");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"Throw\"/>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("      </nodes>");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_otherwise_91_1.handleBodyContent(out);
            }
            out = _jettag_c_otherwise_91_1_saved_out;
            _jettag_c_otherwise_91_1.doEnd();
            _jettag_c_choose_66_1.handleBodyContent(out);
        }
        out = _jettag_c_choose_66_1_saved_out;
        _jettag_c_choose_66_1.doEnd();
        out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_1\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("             targetNode=\"FCMComposite_1_3\"  ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("             sourceNode=\"InTerminal.Input\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("             sourceTerminalName=\"OutTerminal.out\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t  <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_2\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t  \t\t targetNode=\"FCMComposite_1_1\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("             sourceNode=\"FCMComposite_1_2\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("             sourceTerminalName=\"OutTerminal.true\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_3\" targetNode=\"FCMComposite_1_4\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      sourceNode=\"FCMComposite_1_1\" sourceTerminalName=\"OutTerminal.out\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_4\" targetNode=\"FCMComposite_1_2\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("       sourceNode=\"FCMComposite_1_3\" sourceTerminalName=\"OutTerminal.first\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("      ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            ");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_choose_114_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_114_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_choose_114_1.setRuntimeParent(null);
        _jettag_c_choose_114_1.setTagInfo(_td_c_choose_114_1);
        _jettag_c_choose_114_1.doStart(context, out);
        JET2Writer _jettag_c_choose_114_1_saved_out = out;
        while (_jettag_c_choose_114_1.okToProcessBody()) {
            out = out.newNestedContentWriter();
            RuntimeTagElement _jettag_c_when_115_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_115_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_when_115_1.setRuntimeParent(_jettag_c_choose_114_1);
            _jettag_c_when_115_1.setTagInfo(_td_c_when_115_1);
            _jettag_c_when_115_1.doStart(context, out);
            JET2Writer _jettag_c_when_115_1_saved_out = out;
            while (_jettag_c_when_115_1.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_6\" ");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("      targetNode=\"FCMComposite_1_8\" sourceNode=\"FCMComposite_1_3\" sourceTerminalName=\"OutTerminal.second\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_7\" ");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("      targetNode=\"FCMComposite_1_7\" sourceNode=\"FCMComposite_1_8\" ");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("      sourceTerminalName=\"OutTerminal.true\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_8\" ");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("      targetNode=\"FCMComposite_1_12\" sourceNode=\"FCMComposite_1_7\" ");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("      sourceTerminalName=\"OutTerminal.out\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("   ");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_9\" targetNode=\"FCMComposite_1_5\" sourceNode=\"FCMComposite_1_8\" sourceTerminalName=\"OutTerminal.false\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_10\" targetNode=\"FCMComposite_1_5\" sourceNode=\"FCMComposite_1_8\" sourceTerminalName=\"OutTerminal.unknown\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_11\" targetNode=\"FCMComposite_1_5\" sourceNode=\"FCMComposite_1_8\" ");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("      sourceTerminalName=\"OutTerminal.failure\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_5\" targetNode=\"FCMComposite_1_5\" sourceNode=\"FCMComposite_1_12\" sourceTerminalName=\"OutTerminal.failure\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_12\" targetNode=\"FCMComposite_1_5\" sourceNode=\"FCMComposite_1_12\" sourceTerminalName=\"OutTerminal.out\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_when_115_1.handleBodyContent(out);
            }
            out = _jettag_c_when_115_1_saved_out;
            _jettag_c_when_115_1.doEnd();
            RuntimeTagElement _jettag_c_otherwise_132_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_132_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_otherwise_132_1.setRuntimeParent(_jettag_c_choose_114_1);
            _jettag_c_otherwise_132_1.setTagInfo(_td_c_otherwise_132_1);
            _jettag_c_otherwise_132_1.doStart(context, out);
            JET2Writer _jettag_c_otherwise_132_1_saved_out = out;
            while (_jettag_c_otherwise_132_1.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("           <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_6\" targetNode=\"FCMComposite_1_5\" sourceNode=\"FCMComposite_1_3\" sourceTerminalName=\"OutTerminal.second\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write(NL);         
                out.write("     ");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_otherwise_132_1.handleBodyContent(out);
            }
            out = _jettag_c_otherwise_132_1_saved_out;
            _jettag_c_otherwise_132_1.doEnd();
            _jettag_c_choose_114_1.handleBodyContent(out);
        }
        out = _jettag_c_choose_114_1_saved_out;
        _jettag_c_choose_114_1.doEnd();
        out.write("    </composition>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <propertyOrganizer>");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_140_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_140_9); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_140_9.setRuntimeParent(null);
        _jettag_c_if_140_9.setTagInfo(_td_c_if_140_9);
        _jettag_c_if_140_9.doStart(context, out);
        while (_jettag_c_if_140_9.okToProcessBody()) {
            out.write("         <propertyDescriptor groupName=\"Group.Basic\" configurable=\"true\" userDefined=\"true\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("         describedAttribute=\"Property.ErrorLoggingOn\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        <propertyName xmi:type=\"utility:TranslatableString\" key=\"Property.ErrorLoggingOn\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        bundleName= \"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_144_22 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_144_22); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_144_22.setRuntimeParent(_jettag_c_if_140_9);
            _jettag_c_get_144_22.setTagInfo(_td_c_get_144_22);
            _jettag_c_get_144_22.doStart(context, out);
            _jettag_c_get_144_22.doEnd();
            RuntimeTagElement _jettag_c_get_144_60 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_144_60); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_144_60.setRuntimeParent(_jettag_c_if_140_9);
            _jettag_c_get_144_60.setTagInfo(_td_c_get_144_60);
            _jettag_c_get_144_60.doStart(context, out);
            _jettag_c_get_144_60.doEnd();
            out.write("\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        pluginId=\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_145_19 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_145_19); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_145_19.setRuntimeParent(_jettag_c_if_140_9);
            _jettag_c_get_145_19.setTagInfo(_td_c_get_145_19);
            _jettag_c_get_145_19.doStart(context, out);
            _jettag_c_get_145_19.doEnd();
            out.write("\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      </propertyDescriptor>    ");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_140_9.handleBodyContent(out);
        }
        _jettag_c_if_140_9.doEnd();
        out.write("    </propertyOrganizer>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  </eClassifiers>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("</ecore:EPackage>");  //$NON-NLS-1$        
        out.write(NL);         
    }
}
