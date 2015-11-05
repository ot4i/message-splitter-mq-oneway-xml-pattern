package org.eclipse.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_route_routesubflow implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_route_routesubflow() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_get_11_12 = new TagInfo("c:get", //$NON-NLS-1$
            11, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlowURI", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_12_15 = new TagInfo("c:get", //$NON-NLS-1$
            12, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlowPrefix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_17_10 = new TagInfo("c:get", //$NON-NLS-1$
            17, 10,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@route", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_18_17 = new TagInfo("c:get", //$NON-NLS-1$
            18, 17,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlowBundleName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_19_15 = new TagInfo("c:get", //$NON-NLS-1$
            19, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@projectname", //$NON-NLS-1$
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
                "$root/@route", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_23_36 = new TagInfo("c:get", //$NON-NLS-1$
            23, 36,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@projectname", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_23_90 = new TagInfo("c:get", //$NON-NLS-1$
            23, 90,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@route", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_24_65 = new TagInfo("c:get", //$NON-NLS-1$
            24, 65,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/shortDescription", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_26_26 = new TagInfo("c:get", //$NON-NLS-1$
            26, 26,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@patternName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_26_71 = new TagInfo("c:get", //$NON-NLS-1$
            26, 71,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@patternVersion", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_27_15 = new TagInfo("c:get", //$NON-NLS-1$
            27, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/longDescription", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_28_33 = new TagInfo("c:get", //$NON-NLS-1$
            28, 33,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@patternName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_29_36 = new TagInfo("c:get", //$NON-NLS-1$
            29, 36,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@patternVersion", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_37_17 = new TagInfo("c:get", //$NON-NLS-1$
            37, 17,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlowBundleName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_38_19 = new TagInfo("c:get", //$NON-NLS-1$
            38, 19,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@projectname", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_42_28 = new TagInfo("c:get", //$NON-NLS-1$
            42, 28,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlowBundleName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_43_26 = new TagInfo("c:get", //$NON-NLS-1$
            43, 26,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@projectname", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_47_41 = new TagInfo("c:get", //$NON-NLS-1$
            47, 41,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@esqlQualifier", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_53_41 = new TagInfo("c:get", //$NON-NLS-1$
            53, 41,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@esqlQualifier", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_59_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            59, 1,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "yCoord", //$NON-NLS-1$
                "250", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_60_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            60, 1,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "outputCount", //$NON-NLS-1$
                "0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_61_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            61, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$root/route/row", //$NON-NLS-1$
                "curOutput", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_62_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            62, 1,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "outputCount", //$NON-NLS-1$
                "$outputCount+1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_63_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            63, 1,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "yCoord", //$NON-NLS-1$
                "$yCoord+50", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_66_33 = new TagInfo("c:get", //$NON-NLS-1$
            66, 33,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$outputCount", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_67_21 = new TagInfo("c:get", //$NON-NLS-1$
            67, 21,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$yCoord", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_69_31 = new TagInfo("c:get", //$NON-NLS-1$
            69, 31,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$outputCount", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_70_17 = new TagInfo("c:get", //$NON-NLS-1$
            70, 17,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlowBundleName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_71_17 = new TagInfo("c:get", //$NON-NLS-1$
            71, 17,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@projectname", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_79_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            79, 1,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "outputCount", //$NON-NLS-1$
                "0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_80_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            80, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$root/route/row", //$NON-NLS-1$
                "curOutput", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_81_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            81, 1,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "outputCount", //$NON-NLS-1$
                "$outputCount+1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_82_44 = new TagInfo("c:get", //$NON-NLS-1$
            82, 44,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$outputCount", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_83_35 = new TagInfo("c:get", //$NON-NLS-1$
            83, 35,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$outputCount", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_86_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            86, 1,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "outputCount", //$NON-NLS-1$
                "0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_87_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            87, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$root/route/row", //$NON-NLS-1$
                "curOutput", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_88_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            88, 1,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "outputCount", //$NON-NLS-1$
                "$outputCount+1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_89_37 = new TagInfo("c:get", //$NON-NLS-1$
            89, 37,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$curOutput/keyLocation", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_89_85 = new TagInfo("c:get", //$NON-NLS-1$
            89, 85,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$curOutput/keyValue", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_90_37 = new TagInfo("c:get", //$NON-NLS-1$
            90, 37,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$outputCount", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_92_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            92, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$root/namespaceTable/row", //$NON-NLS-1$
                "curOutput", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_94_1 = new TagInfo("c:if", //$NON-NLS-1$
            94, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "string-length($curOutput/nsPrefix) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_95_30 = new TagInfo("c:get", //$NON-NLS-1$
            95, 30,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$curOutput/nsPrefix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_96_15 = new TagInfo("c:get", //$NON-NLS-1$
            96, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$curOutput/nsURI", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_107_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            107, 1,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "outputCount", //$NON-NLS-1$
                "0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_108_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            108, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$root/route/row", //$NON-NLS-1$
                "curOutput", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_109_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            109, 1,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "outputCount", //$NON-NLS-1$
                "$outputCount+1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_112_37 = new TagInfo("c:get", //$NON-NLS-1$
            112, 37,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$outputCount", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_114_32 = new TagInfo("c:get", //$NON-NLS-1$
            114, 32,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$outputCount", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<ecore:EPackage xmi:version=\"2.0\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("xmlns:xmi=\"http://www.omg.org/XMI\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("xmlns:ComIbmCompute.msgnode=\"ComIbmCompute.msgnode\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("xmlns:ComIbmRoute.msgnode=\"ComIbmRoute.msgnode\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("xmlns:ComIbmTrace.msgnode=\"ComIbmTrace.msgnode\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("xmlns:ecore=\"http://www.eclipse.org/emf/2002/Ecore\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("xmlns:eflow=\"http://www.ibm.com/wbi/2005/eflow\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("xmlns:utility=\"http://www.ibm.com/wbi/2005/eflow_utility\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    nsURI=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_11_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_11_12); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_11_12.setRuntimeParent(null);
        _jettag_c_get_11_12.setTagInfo(_td_c_get_11_12);
        _jettag_c_get_11_12.doStart(context, out);
        _jettag_c_get_11_12.doEnd();
        out.write(".subflow\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    nsPrefix=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_12_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_12_15); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_12_15.setRuntimeParent(null);
        _jettag_c_get_12_15.setTagInfo(_td_c_get_12_15);
        _jettag_c_get_12_15.doStart(context, out);
        _jettag_c_get_12_15.doEnd();
        out.write(".subflow\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  <eClassifiers xmi:type=\"eflow:FCMComposite\" name=\"FCMComposite_1\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <eSuperTypes href=\"http://www.ibm.com/wbi/2005/eflow#//FCMBlock\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <translation xsi:type=\"utility:TranslatableString\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    key=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_17_10 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_17_10); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_17_10.setRuntimeParent(null);
        _jettag_c_get_17_10.setTagInfo(_td_c_get_17_10);
        _jettag_c_get_17_10.doStart(context, out);
        _jettag_c_get_17_10.doEnd();
        out.write("\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    bundleName=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_18_17 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_18_17); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_18_17.setRuntimeParent(null);
        _jettag_c_get_18_17.setTagInfo(_td_c_get_18_17);
        _jettag_c_get_18_17.doStart(context, out);
        _jettag_c_get_18_17.doEnd();
        out.write("\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    pluginId=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_19_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_19_15); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_19_15.setRuntimeParent(null);
        _jettag_c_get_19_15.setTagInfo(_td_c_get_19_15);
        _jettag_c_get_19_15.doStart(context, out);
        _jettag_c_get_19_15.doEnd();
        out.write("\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <colorGraphic16 xsi:type=\"utility:GIFFileGraphic\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    resourceName=\"platform:/plugin/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_21_36 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_21_36); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_21_36.setRuntimeParent(null);
        _jettag_c_get_21_36.setTagInfo(_td_c_get_21_36);
        _jettag_c_get_21_36.doStart(context, out);
        _jettag_c_get_21_36.doEnd();
        out.write("/icons/full/obj16/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_21_90 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_21_90); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_21_90.setRuntimeParent(null);
        _jettag_c_get_21_90.setTagInfo(_td_c_get_21_90);
        _jettag_c_get_21_90.doStart(context, out);
        _jettag_c_get_21_90.doEnd();
        out.write(".subflow.gif\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <colorGraphic32 xsi:type=\"utility:GIFFileGraphic\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    resourceName=\"platform:/plugin/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_23_36 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_23_36); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_23_36.setRuntimeParent(null);
        _jettag_c_get_23_36.setTagInfo(_td_c_get_23_36);
        _jettag_c_get_23_36.doStart(context, out);
        _jettag_c_get_23_36.doEnd();
        out.write("/icons/full/obj30/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_23_90 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_23_90); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_23_90.setRuntimeParent(null);
        _jettag_c_get_23_90.setTagInfo(_td_c_get_23_90);
        _jettag_c_get_23_90.doStart(context, out);
        _jettag_c_get_23_90.doEnd();
        out.write(".subflow.gif\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <shortDescription xmi:type=\"utility:ConstantString\" string=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_24_65 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_24_65); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_24_65.setRuntimeParent(null);
        _jettag_c_get_24_65.setTagInfo(_td_c_get_24_65);
        _jettag_c_get_24_65.doStart(context, out);
        _jettag_c_get_24_65.doEnd();
        out.write("\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <longDescription xmi:type=\"utility:ConstantString\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    string=\"Generated by ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_26_26 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_26_26); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_26_26.setRuntimeParent(null);
        _jettag_c_get_26_26.setTagInfo(_td_c_get_26_26);
        _jettag_c_get_26_26.doStart(context, out);
        _jettag_c_get_26_26.doEnd();
        out.write(" Version ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_26_71 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_26_71); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_26_71.setRuntimeParent(null);
        _jettag_c_get_26_71.setTagInfo(_td_c_get_26_71);
        _jettag_c_get_26_71.doStart(context, out);
        _jettag_c_get_26_71.doEnd();
        out.write(NL);         
        out.write("    &#xD;&#xA;");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_27_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_27_15); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_27_15.setRuntimeParent(null);
        _jettag_c_get_27_15.setTagInfo(_td_c_get_27_15);
        _jettag_c_get_27_15.doStart(context, out);
        _jettag_c_get_27_15.doEnd();
        out.write(NL);         
        out.write("    &#xD;&#xA;$MQSI patternName=");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_28_33 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_28_33); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_28_33.setRuntimeParent(null);
        _jettag_c_get_28_33.setTagInfo(_td_c_get_28_33);
        _jettag_c_get_28_33.doStart(context, out);
        _jettag_c_get_28_33.doEnd();
        out.write(" MQSI$");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    &#xD;&#xA;$MQSI patternVersion=");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_29_36 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_29_36); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_29_36.setRuntimeParent(null);
        _jettag_c_get_29_36.setTagInfo(_td_c_get_29_36);
        _jettag_c_get_29_36.doStart(context, out);
        _jettag_c_get_29_36.doEnd();
        out.write(" MQSI$");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    \"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <version xmi:type=\"utility:ConstantString\" string=\"1\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <composition>");  //$NON-NLS-1$        
        out.write(NL);         
        // Input node,output node for failure and compute to set routing error are standard 
        out.write("      ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <nodes xmi:type=\"eflow:FCMSource\" xmi:id=\"InTerminal.Input\" location=\"100,201\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:TranslatableString\" key=\"InTerminal.Input\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    bundleName=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_37_17 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_37_17); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_37_17.setRuntimeParent(null);
        _jettag_c_get_37_17.setTagInfo(_td_c_get_37_17);
        _jettag_c_get_37_17.doStart(context, out);
        _jettag_c_get_37_17.doEnd();
        out.write("\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        pluginId=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_38_19 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_38_19); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_38_19.setRuntimeParent(null);
        _jettag_c_get_38_19.setTagInfo(_td_c_get_38_19);
        _jettag_c_get_38_19.doStart(context, out);
        _jettag_c_get_38_19.doEnd();
        out.write("\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <nodes xmi:type=\"eflow:FCMSink\" xmi:id=\"OutTerminal.Output200\" location=\"550,89\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:TranslatableString\" key=\"OutTerminal.failure\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("               bundleName=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_42_28 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_42_28); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_42_28.setRuntimeParent(null);
        _jettag_c_get_42_28.setTagInfo(_td_c_get_42_28);
        _jettag_c_get_42_28.doStart(context, out);
        _jettag_c_get_42_28.doEnd();
        out.write("\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("               pluginId=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_43_26 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_43_26); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_43_26.setRuntimeParent(null);
        _jettag_c_get_43_26.setTagInfo(_td_c_get_43_26);
        _jettag_c_get_43_26.doStart(context, out);
        _jettag_c_get_43_26.doEnd();
        out.write("\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            <nodes xsi:type=\"ComIbmCompute.msgnode:FCMComposite_1\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      xmi:id=\"FCMComposite_1_4\" location=\"476,184\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      computeExpression=\"esql://routine/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_47_41 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_47_41); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_47_41.setRuntimeParent(null);
        _jettag_c_get_47_41.setTagInfo(_td_c_get_47_41);
        _jettag_c_get_47_41.doStart(context, out);
        _jettag_c_get_47_41.doEnd();
        out.write("SetRoutingError.Main\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      computeMode=\"message\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xsi:type=\"utility:ConstantString\" string=\"Set Routing Error\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("     ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <nodes xmi:type=\"ComIbmCompute.msgnode:FCMComposite_1\" xmi:id=\"FCMComposite_1_1\" location=\"414,62\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      computeExpression=\"esql://routine/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_53_41 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_53_41); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_53_41.setRuntimeParent(null);
        _jettag_c_get_53_41.setTagInfo(_td_c_get_53_41);
        _jettag_c_get_53_41.doStart(context, out);
        _jettag_c_get_53_41.doEnd();
        out.write("SetOtherError.Main\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"Set Other Error\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        // Now add dynamic output nodes one for each route 
        out.write(NL);         
        out.write(NL);         
        RuntimeTagElement _jettag_c_setVariable_59_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_59_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_59_1.setRuntimeParent(null);
        _jettag_c_setVariable_59_1.setTagInfo(_td_c_setVariable_59_1);
        _jettag_c_setVariable_59_1.doStart(context, out);
        _jettag_c_setVariable_59_1.doEnd();
        RuntimeTagElement _jettag_c_setVariable_60_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_60_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_60_1.setRuntimeParent(null);
        _jettag_c_setVariable_60_1.setTagInfo(_td_c_setVariable_60_1);
        _jettag_c_setVariable_60_1.doStart(context, out);
        _jettag_c_setVariable_60_1.doEnd();
        RuntimeTagElement _jettag_c_iterate_61_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_61_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_61_1.setRuntimeParent(null);
        _jettag_c_iterate_61_1.setTagInfo(_td_c_iterate_61_1);
        _jettag_c_iterate_61_1.doStart(context, out);
        while (_jettag_c_iterate_61_1.okToProcessBody()) {
            RuntimeTagElement _jettag_c_setVariable_62_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_62_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_62_1.setRuntimeParent(_jettag_c_iterate_61_1);
            _jettag_c_setVariable_62_1.setTagInfo(_td_c_setVariable_62_1);
            _jettag_c_setVariable_62_1.doStart(context, out);
            _jettag_c_setVariable_62_1.doEnd();
            RuntimeTagElement _jettag_c_setVariable_63_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_63_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_63_1.setRuntimeParent(_jettag_c_iterate_61_1);
            _jettag_c_setVariable_63_1.setTagInfo(_td_c_setVariable_63_1);
            _jettag_c_setVariable_63_1.doStart(context, out);
            _jettag_c_setVariable_63_1.doEnd();
            out.write(NL);         
            out.write("      <nodes xmi:type=\"eflow:FCMSink\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      xmi:id=\"OutTerminal.Output");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_66_33 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_66_33); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_66_33.setRuntimeParent(_jettag_c_iterate_61_1);
            _jettag_c_get_66_33.setTagInfo(_td_c_get_66_33);
            _jettag_c_get_66_33.doStart(context, out);
            _jettag_c_get_66_33.doEnd();
            out.write("\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      location=\"425,");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_67_21 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_67_21); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_67_21.setRuntimeParent(_jettag_c_iterate_61_1);
            _jettag_c_get_67_21.setTagInfo(_td_c_get_67_21);
            _jettag_c_get_67_21.doStart(context, out);
            _jettag_c_get_67_21.doEnd();
            out.write("\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        <translation xmi:type=\"utility:TranslatableString\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        key=\"OutTerminal.route");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_69_31 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_69_31); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_69_31.setRuntimeParent(_jettag_c_iterate_61_1);
            _jettag_c_get_69_31.setTagInfo(_td_c_get_69_31);
            _jettag_c_get_69_31.doStart(context, out);
            _jettag_c_get_69_31.doEnd();
            out.write("\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    bundleName=\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_70_17 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_70_17); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_70_17.setRuntimeParent(_jettag_c_iterate_61_1);
            _jettag_c_get_70_17.setTagInfo(_td_c_get_70_17);
            _jettag_c_get_70_17.doStart(context, out);
            _jettag_c_get_70_17.doEnd();
            out.write("\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      pluginId=\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_71_17 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_71_17); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_71_17.setRuntimeParent(_jettag_c_iterate_61_1);
            _jettag_c_get_71_17.setTagInfo(_td_c_get_71_17);
            _jettag_c_get_71_17.doStart(context, out);
            _jettag_c_get_71_17.doEnd();
            out.write("\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      </nodes>");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_iterate_61_1.handleBodyContent(out);
        }
        _jettag_c_iterate_61_1.doEnd();
        out.write(NL);         
        out.write(NL);         
        out.write("      <nodes xmi:type=\"ComIbmRoute.msgnode:FCMComposite_1\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      xmi:id=\"FCMComposite_1_6\" location=\"184,201\" distributionMode=\"first\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        RuntimeTagElement _jettag_c_setVariable_79_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_79_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_79_1.setRuntimeParent(null);
        _jettag_c_setVariable_79_1.setTagInfo(_td_c_setVariable_79_1);
        _jettag_c_setVariable_79_1.doStart(context, out);
        _jettag_c_setVariable_79_1.doEnd();
        RuntimeTagElement _jettag_c_iterate_80_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_80_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_80_1.setRuntimeParent(null);
        _jettag_c_iterate_80_1.setTagInfo(_td_c_iterate_80_1);
        _jettag_c_iterate_80_1.doStart(context, out);
        while (_jettag_c_iterate_80_1.okToProcessBody()) {
            RuntimeTagElement _jettag_c_setVariable_81_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_81_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_81_1.setRuntimeParent(_jettag_c_iterate_80_1);
            _jettag_c_setVariable_81_1.setTagInfo(_td_c_setVariable_81_1);
            _jettag_c_setVariable_81_1.doStart(context, out);
            _jettag_c_setVariable_81_1.doEnd();
            out.write("       <outTerminals  terminalNodeID=\"match");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_82_44 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_82_44); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_82_44.setRuntimeParent(_jettag_c_iterate_80_1);
            _jettag_c_get_82_44.setTagInfo(_td_c_get_82_44);
            _jettag_c_get_82_44.doStart(context, out);
            _jettag_c_get_82_44.doEnd();
            out.write("\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("       dynamic=\"true\" label=\"match");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_83_35 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_83_35); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_83_35.setRuntimeParent(_jettag_c_iterate_80_1);
            _jettag_c_get_83_35.setTagInfo(_td_c_get_83_35);
            _jettag_c_get_83_35.doStart(context, out);
            _jettag_c_get_83_35.doEnd();
            out.write("\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_iterate_80_1.handleBodyContent(out);
        }
        _jettag_c_iterate_80_1.doEnd();
        out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"Route\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_setVariable_86_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_86_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_86_1.setRuntimeParent(null);
        _jettag_c_setVariable_86_1.setTagInfo(_td_c_setVariable_86_1);
        _jettag_c_setVariable_86_1.doStart(context, out);
        _jettag_c_setVariable_86_1.doEnd();
        RuntimeTagElement _jettag_c_iterate_87_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_87_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_87_1.setRuntimeParent(null);
        _jettag_c_iterate_87_1.setTagInfo(_td_c_iterate_87_1);
        _jettag_c_iterate_87_1.doStart(context, out);
        while (_jettag_c_iterate_87_1.okToProcessBody()) {
            RuntimeTagElement _jettag_c_setVariable_88_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_88_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_88_1.setRuntimeParent(_jettag_c_iterate_87_1);
            _jettag_c_setVariable_88_1.setTagInfo(_td_c_setVariable_88_1);
            _jettag_c_setVariable_88_1.doStart(context, out);
            _jettag_c_setVariable_88_1.doEnd();
            out.write("        <filterTable filterPattern=\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_89_37 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_89_37); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_89_37.setRuntimeParent(_jettag_c_iterate_87_1);
            _jettag_c_get_89_37.setTagInfo(_td_c_get_89_37);
            _jettag_c_get_89_37.doStart(context, out);
            _jettag_c_get_89_37.doEnd();
            out.write("=&quot;");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_89_85 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_89_85); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_89_85.setRuntimeParent(_jettag_c_iterate_87_1);
            _jettag_c_get_89_85.setTagInfo(_td_c_get_89_85);
            _jettag_c_get_89_85.doStart(context, out);
            _jettag_c_get_89_85.doEnd();
            out.write("&quot;\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        routingOutputTerminal=\"match");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_90_37 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_90_37); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_90_37.setRuntimeParent(_jettag_c_iterate_87_1);
            _jettag_c_get_90_37.setTagInfo(_td_c_get_90_37);
            _jettag_c_get_90_37.doStart(context, out);
            _jettag_c_get_90_37.doEnd();
            out.write("\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_iterate_87_1.handleBodyContent(out);
        }
        _jettag_c_iterate_87_1.doEnd();
        RuntimeTagElement _jettag_c_iterate_92_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_92_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_92_1.setRuntimeParent(null);
        _jettag_c_iterate_92_1.setTagInfo(_td_c_iterate_92_1);
        _jettag_c_iterate_92_1.doStart(context, out);
        while (_jettag_c_iterate_92_1.okToProcessBody()) {
            // check that namespaces are defined 
            RuntimeTagElement _jettag_c_if_94_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_94_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_94_1.setRuntimeParent(_jettag_c_iterate_92_1);
            _jettag_c_if_94_1.setTagInfo(_td_c_if_94_1);
            _jettag_c_if_94_1.doStart(context, out);
            while (_jettag_c_if_94_1.okToProcessBody()) {
                out.write("\t<nsMappingTable nsPrefix = \"");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_95_30 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_95_30); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_95_30.setRuntimeParent(_jettag_c_if_94_1);
                _jettag_c_get_95_30.setTagInfo(_td_c_get_95_30);
                _jettag_c_get_95_30.doStart(context, out);
                _jettag_c_get_95_30.doEnd();
                out.write("\" ");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\tnamespace = \"");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_96_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_96_15); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_96_15.setRuntimeParent(_jettag_c_if_94_1);
                _jettag_c_get_96_15.setTagInfo(_td_c_get_96_15);
                _jettag_c_get_96_15.doStart(context, out);
                _jettag_c_get_96_15.doEnd();
                out.write("\"/>");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_if_94_1.handleBodyContent(out);
            }
            _jettag_c_if_94_1.doEnd();
            _jettag_c_iterate_92_1.handleBodyContent(out);
        }
        _jettag_c_iterate_92_1.doEnd();
        out.write("</nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        // fixed connections - assume maximum of 200 links 
        out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_201\" targetNode=\"FCMComposite_1_6\" sourceNode=\"InTerminal.Input\" sourceTerminalName=\"OutTerminal.out\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_203\" targetNode=\"OutTerminal.Output200\" sourceNode=\"FCMComposite_1_4\" sourceTerminalName=\"OutTerminal.out\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_204\" targetNode=\"FCMComposite_1_1\" sourceNode=\"FCMComposite_1_6\" sourceTerminalName=\"OutTerminal.failure\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_205\" targetNode=\"OutTerminal.Output200\" sourceNode=\"FCMComposite_1_1\" sourceTerminalName=\"OutTerminal.out\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_202\" targetNode=\"FCMComposite_1_4\" sourceNode=\"FCMComposite_1_6\" sourceTerminalName=\"OutTerminal.default\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        // Now the dynamic connections 
        RuntimeTagElement _jettag_c_setVariable_107_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_107_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_107_1.setRuntimeParent(null);
        _jettag_c_setVariable_107_1.setTagInfo(_td_c_setVariable_107_1);
        _jettag_c_setVariable_107_1.doStart(context, out);
        _jettag_c_setVariable_107_1.doEnd();
        RuntimeTagElement _jettag_c_iterate_108_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_108_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_108_1.setRuntimeParent(null);
        _jettag_c_iterate_108_1.setTagInfo(_td_c_iterate_108_1);
        _jettag_c_iterate_108_1.doStart(context, out);
        while (_jettag_c_iterate_108_1.okToProcessBody()) {
            RuntimeTagElement _jettag_c_setVariable_109_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_109_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_109_1.setRuntimeParent(_jettag_c_iterate_108_1);
            _jettag_c_setVariable_109_1.setTagInfo(_td_c_setVariable_109_1);
            _jettag_c_setVariable_109_1.doStart(context, out);
            _jettag_c_setVariable_109_1.doEnd();
            out.write("      <connections xmi:type=\"eflow:FCMConnection\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      xmi:id=\"FCMConnection_1\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      targetNode=\"OutTerminal.Output");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_112_37 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_112_37); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_112_37.setRuntimeParent(_jettag_c_iterate_108_1);
            _jettag_c_get_112_37.setTagInfo(_td_c_get_112_37);
            _jettag_c_get_112_37.doStart(context, out);
            _jettag_c_get_112_37.doEnd();
            out.write("\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      sourceNode=\"FCMComposite_1_6\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      sourceTerminalName=\"match");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_114_32 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_114_32); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_114_32.setRuntimeParent(_jettag_c_iterate_108_1);
            _jettag_c_get_114_32.setTagInfo(_td_c_get_114_32);
            _jettag_c_get_114_32.doStart(context, out);
            _jettag_c_get_114_32.doEnd();
            out.write("\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_iterate_108_1.handleBodyContent(out);
        }
        _jettag_c_iterate_108_1.doEnd();
        out.write(NL);         
        out.write(NL);         
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
