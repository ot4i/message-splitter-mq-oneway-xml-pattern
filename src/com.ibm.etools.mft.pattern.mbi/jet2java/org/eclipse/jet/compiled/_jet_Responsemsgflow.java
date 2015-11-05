package org.eclipse.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_Responsemsgflow implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_Responsemsgflow() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_get_9_11 = new TagInfo("c:get", //$NON-NLS-1$
            9, 11,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_9_49 = new TagInfo("c:get", //$NON-NLS-1$
            9, 49,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@error", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_10_6 = new TagInfo("c:get", //$NON-NLS-1$
            10, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_10_44 = new TagInfo("c:get", //$NON-NLS-1$
            10, 44,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@error", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_11_5 = new TagInfo("c:if", //$NON-NLS-1$
            11, 5,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/loggingRequired = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_12_11 = new TagInfo("c:get", //$NON-NLS-1$
            12, 11,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_12_49 = new TagInfo("c:get", //$NON-NLS-1$
            12, 49,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@log", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_13_6 = new TagInfo("c:get", //$NON-NLS-1$
            13, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_13_44 = new TagInfo("c:get", //$NON-NLS-1$
            13, 44,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@log", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_15_11 = new TagInfo("c:get", //$NON-NLS-1$
            15, 11,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_15_49 = new TagInfo("c:get", //$NON-NLS-1$
            15, 49,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@responseprocessor", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_16_43 = new TagInfo("c:get", //$NON-NLS-1$
            16, 43,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_16_81 = new TagInfo("c:get", //$NON-NLS-1$
            16, 81,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@responseprocessor", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_20_12 = new TagInfo("c:get", //$NON-NLS-1$
            20, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_20_50 = new TagInfo("c:get", //$NON-NLS-1$
            20, 50,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@response", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_21_15 = new TagInfo("c:get", //$NON-NLS-1$
            21, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_21_53 = new TagInfo("c:get", //$NON-NLS-1$
            21, 53,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@response", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_24_1 = new TagInfo("c:if", //$NON-NLS-1$
            24, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/errorMessageRequired = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_29_1 = new TagInfo("c:if", //$NON-NLS-1$
            29, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/loggingRequired = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_34_61 = new TagInfo("c:get", //$NON-NLS-1$
            34, 61,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@response", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_34_108 = new TagInfo("c:get", //$NON-NLS-1$
            34, 108,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_34_146 = new TagInfo("c:get", //$NON-NLS-1$
            34, 146,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@response", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_34_191 = new TagInfo("c:get", //$NON-NLS-1$
            34, 191,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@projectname", //$NON-NLS-1$
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
                "$root/@response", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_38_36 = new TagInfo("c:get", //$NON-NLS-1$
            38, 36,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@projectname", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_38_90 = new TagInfo("c:get", //$NON-NLS-1$
            38, 90,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@response", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_39_65 = new TagInfo("c:get", //$NON-NLS-1$
            39, 65,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/shortDescription", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_41_26 = new TagInfo("c:get", //$NON-NLS-1$
            41, 26,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@patternName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_41_71 = new TagInfo("c:get", //$NON-NLS-1$
            41, 71,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@patternVersion", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_42_15 = new TagInfo("c:get", //$NON-NLS-1$
            42, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/longDescription", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_43_33 = new TagInfo("c:get", //$NON-NLS-1$
            43, 33,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@patternName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_44_36 = new TagInfo("c:get", //$NON-NLS-1$
            44, 36,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@patternVersion", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_49_13 = new TagInfo("c:get", //$NON-NLS-1$
            49, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/queuePrefix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_49_50 = new TagInfo("c:get", //$NON-NLS-1$
            49, 50,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/responseQueue", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_49_87 = new TagInfo("c:get", //$NON-NLS-1$
            49, 87,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/queueSuffix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_52_1 = new TagInfo("c:choose", //$NON-NLS-1$
            52, 1,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_53_1 = new TagInfo("c:when", //$NON-NLS-1$
            53, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/validationofResponse = 'None'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_56_1 = new TagInfo("c:otherwise", //$NON-NLS-1$
            56, 1,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_58_24 = new TagInfo("c:get", //$NON-NLS-1$
            58, 24,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/validationofResponse", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_59_1 = new TagInfo("c:choose", //$NON-NLS-1$
            59, 1,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_60_1 = new TagInfo("c:when", //$NON-NLS-1$
            60, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/responseDataType = 'XML'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_62_27 = new TagInfo("c:get", //$NON-NLS-1$
            62, 27,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "substring-after(substring-after($root/responseMessageSet,'/'),'/')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_when_64_1 = new TagInfo("c:when", //$NON-NLS-1$
            64, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/responseDataType = 'MIME'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_when_67_1 = new TagInfo("c:when", //$NON-NLS-1$
            67, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/responseDataType = 'binaryData'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_69_27 = new TagInfo("c:get", //$NON-NLS-1$
            69, 27,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "substring-after(substring-after($root/responseMessageSet,'/'),'/')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_70_28 = new TagInfo("c:get", //$NON-NLS-1$
            70, 28,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/responseMessageType", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_71_30 = new TagInfo("c:get", //$NON-NLS-1$
            71, 30,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/responseMessageFormat", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_when_73_1 = new TagInfo("c:when", //$NON-NLS-1$
            73, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/inputDataType = 'textData'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_75_27 = new TagInfo("c:get", //$NON-NLS-1$
            75, 27,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "substring-after(substring-after($root/responseMessageSet,'/'),'/')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_76_28 = new TagInfo("c:get", //$NON-NLS-1$
            76, 28,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/responseMessageType", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_77_30 = new TagInfo("c:get", //$NON-NLS-1$
            77, 30,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/responseMessageFormat", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_86_18 = new TagInfo("c:get", //$NON-NLS-1$
            86, 18,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/queuePrefix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_86_55 = new TagInfo("c:get", //$NON-NLS-1$
            86, 55,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/storeQueue", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_86_89 = new TagInfo("c:get", //$NON-NLS-1$
            86, 89,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/queueSuffix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_95_41 = new TagInfo("c:get", //$NON-NLS-1$
            95, 41,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_101_41 = new TagInfo("c:get", //$NON-NLS-1$
            101, 41,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_114_41 = new TagInfo("c:get", //$NON-NLS-1$
            114, 41,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_117_24 = new TagInfo("c:get", //$NON-NLS-1$
            117, 24,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_117_62 = new TagInfo("c:get", //$NON-NLS-1$
            117, 62,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@responseprocessor", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_121_24 = new TagInfo("c:get", //$NON-NLS-1$
            121, 24,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_121_62 = new TagInfo("c:get", //$NON-NLS-1$
            121, 62,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@error", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_124_2 = new TagInfo("c:if", //$NON-NLS-1$
            124, 2,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/loggingRequired = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_128_24 = new TagInfo("c:get", //$NON-NLS-1$
            128, 24,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_128_62 = new TagInfo("c:get", //$NON-NLS-1$
            128, 62,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@log", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_140_1 = new TagInfo("c:choose", //$NON-NLS-1$
            140, 1,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_141_2 = new TagInfo("c:when", //$NON-NLS-1$
            141, 2,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/loggingRequired = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_146_2 = new TagInfo("c:otherwise", //$NON-NLS-1$
            146, 2,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_if_153_1 = new TagInfo("c:if", //$NON-NLS-1$
            153, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/errorMessageRequired = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_157_20 = new TagInfo("c:get", //$NON-NLS-1$
            157, 20,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_157_58 = new TagInfo("c:get", //$NON-NLS-1$
            157, 58,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@response", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_157_104 = new TagInfo("c:get", //$NON-NLS-1$
            157, 104,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@projectname", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_159_1 = new TagInfo("c:if", //$NON-NLS-1$
            159, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/loggingRequired = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_162_25 = new TagInfo("c:get", //$NON-NLS-1$
            162, 25,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_162_63 = new TagInfo("c:get", //$NON-NLS-1$
            162, 63,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@request", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_162_108 = new TagInfo("c:get", //$NON-NLS-1$
            162, 108,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@projectname", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_165_1 = new TagInfo("c:if", //$NON-NLS-1$
            165, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/errorMessageRequired = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_169_5 = new TagInfo("c:if", //$NON-NLS-1$
            169, 5,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/errorMessageRequired = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_171_34 = new TagInfo("c:get", //$NON-NLS-1$
            171, 34,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_171_72 = new TagInfo("c:get", //$NON-NLS-1$
            171, 72,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@error", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<ecore:EPackage xmi:version=\"2.0\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:xmi=\"http://www.omg.org/XMI\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:ComIbmCompute.msgnode=\"ComIbmCompute.msgnode\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:ComIbmFlowOrder.msgnode=\"ComIbmFlowOrder.msgnode\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:ComIbmMQGet.msgnode=\"ComIbmMQGet.msgnode\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:ComIbmMQInput.msgnode=\"ComIbmMQInput.msgnode\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:ComIbmMQReply.msgnode=\"ComIbmMQReply.msgnode\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_9_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_9_11); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_9_11.setRuntimeParent(null);
        _jettag_c_get_9_11.setTagInfo(_td_c_get_9_11);
        _jettag_c_get_9_11.doStart(context, out);
        _jettag_c_get_9_11.doEnd();
        RuntimeTagElement _jettag_c_get_9_49 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_9_49); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_9_49.setRuntimeParent(null);
        _jettag_c_get_9_49.setTagInfo(_td_c_get_9_49);
        _jettag_c_get_9_49.doStart(context, out);
        _jettag_c_get_9_49.doEnd();
        out.write(".subflow=");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    \"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_10_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_10_6); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_10_6.setRuntimeParent(null);
        _jettag_c_get_10_6.setTagInfo(_td_c_get_10_6);
        _jettag_c_get_10_6.doStart(context, out);
        _jettag_c_get_10_6.doEnd();
        RuntimeTagElement _jettag_c_get_10_44 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_10_44); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_10_44.setRuntimeParent(null);
        _jettag_c_get_10_44.setTagInfo(_td_c_get_10_44);
        _jettag_c_get_10_44.doStart(context, out);
        _jettag_c_get_10_44.doEnd();
        out.write(".subflow\" ");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_11_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_11_5); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_11_5.setRuntimeParent(null);
        _jettag_c_if_11_5.setTagInfo(_td_c_if_11_5);
        _jettag_c_if_11_5.doStart(context, out);
        while (_jettag_c_if_11_5.okToProcessBody()) {
            out.write("    xmlns:");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_12_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_12_11); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_12_11.setRuntimeParent(_jettag_c_if_11_5);
            _jettag_c_get_12_11.setTagInfo(_td_c_get_12_11);
            _jettag_c_get_12_11.doStart(context, out);
            _jettag_c_get_12_11.doEnd();
            RuntimeTagElement _jettag_c_get_12_49 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_12_49); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_12_49.setRuntimeParent(_jettag_c_if_11_5);
            _jettag_c_get_12_49.setTagInfo(_td_c_get_12_49);
            _jettag_c_get_12_49.doStart(context, out);
            _jettag_c_get_12_49.doEnd();
            out.write(".subflow=");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    \"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_13_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_13_6); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_13_6.setRuntimeParent(_jettag_c_if_11_5);
            _jettag_c_get_13_6.setTagInfo(_td_c_get_13_6);
            _jettag_c_get_13_6.doStart(context, out);
            _jettag_c_get_13_6.doEnd();
            RuntimeTagElement _jettag_c_get_13_44 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_13_44); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_13_44.setRuntimeParent(_jettag_c_if_11_5);
            _jettag_c_get_13_44.setTagInfo(_td_c_get_13_44);
            _jettag_c_get_13_44.doStart(context, out);
            _jettag_c_get_13_44.doEnd();
            out.write(".subflow\" ");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_11_5.handleBodyContent(out);
        }
        _jettag_c_if_11_5.doEnd();
        out.write("    xmlns:");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_15_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_15_11); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_15_11.setRuntimeParent(null);
        _jettag_c_get_15_11.setTagInfo(_td_c_get_15_11);
        _jettag_c_get_15_11.doStart(context, out);
        _jettag_c_get_15_11.doEnd();
        RuntimeTagElement _jettag_c_get_15_49 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_15_49); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_15_49.setRuntimeParent(null);
        _jettag_c_get_15_49.setTagInfo(_td_c_get_15_49);
        _jettag_c_get_15_49.doStart(context, out);
        _jettag_c_get_15_49.doEnd();
        out.write(".subflow=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_16_43 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_16_43); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_16_43.setRuntimeParent(null);
        _jettag_c_get_16_43.setTagInfo(_td_c_get_16_43);
        _jettag_c_get_16_43.doStart(context, out);
        _jettag_c_get_16_43.doEnd();
        RuntimeTagElement _jettag_c_get_16_81 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_16_81); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_16_81.setRuntimeParent(null);
        _jettag_c_get_16_81.setTagInfo(_td_c_get_16_81);
        _jettag_c_get_16_81.doStart(context, out);
        _jettag_c_get_16_81.doEnd();
        out.write(".subflow\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:ecore=\"http://www.eclipse.org/emf/2002/Ecore\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:eflow=\"http://www.ibm.com/wbi/2005/eflow\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:utility=\"http://www.ibm.com/wbi/2005/eflow_utility\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    nsURI=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_20_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_20_12); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_20_12.setRuntimeParent(null);
        _jettag_c_get_20_12.setTagInfo(_td_c_get_20_12);
        _jettag_c_get_20_12.doStart(context, out);
        _jettag_c_get_20_12.doEnd();
        RuntimeTagElement _jettag_c_get_20_50 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_20_50); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_20_50.setRuntimeParent(null);
        _jettag_c_get_20_50.setTagInfo(_td_c_get_20_50);
        _jettag_c_get_20_50.doStart(context, out);
        _jettag_c_get_20_50.doEnd();
        out.write(".msgflow\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    nsPrefix=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_21_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_21_15); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_21_15.setRuntimeParent(null);
        _jettag_c_get_21_15.setTagInfo(_td_c_get_21_15);
        _jettag_c_get_21_15.doStart(context, out);
        _jettag_c_get_21_15.doEnd();
        RuntimeTagElement _jettag_c_get_21_53 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_21_53); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_21_53.setRuntimeParent(null);
        _jettag_c_get_21_53.setTagInfo(_td_c_get_21_53);
        _jettag_c_get_21_53.doStart(context, out);
        _jettag_c_get_21_53.doEnd();
        out.write(".msgflow\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  <eClassifiers xmi:type=\"eflow:FCMComposite\" name=\"FCMComposite_1\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <eSuperTypes href=\"http://www.ibm.com/wbi/2005/eflow#//FCMBlock\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_24_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_24_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_24_1.setRuntimeParent(null);
        _jettag_c_if_24_1.setTagInfo(_td_c_if_24_1);
        _jettag_c_if_24_1.doStart(context, out);
        while (_jettag_c_if_24_1.okToProcessBody()) {
            out.write("    <eStructuralFeatures xmi:type=\"ecore:EAttribute\" xmi:id=\"Property.ErrorLoggingOn\" name=\"ErrorLoggingOn\" lowerBound=\"1\" defaultValueLiteral=\"true\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      <eType xmi:type=\"ecore:EDataType\" href=\"http://www.eclipse.org/emf/2002/Ecore#//EBoolean\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    </eStructuralFeatures>");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_24_1.handleBodyContent(out);
        }
        _jettag_c_if_24_1.doEnd();
        RuntimeTagElement _jettag_c_if_29_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_29_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_29_1.setRuntimeParent(null);
        _jettag_c_if_29_1.setTagInfo(_td_c_if_29_1);
        _jettag_c_if_29_1.doStart(context, out);
        while (_jettag_c_if_29_1.okToProcessBody()) {
            out.write("    <eStructuralFeatures xmi:type=\"ecore:EAttribute\" xmi:id=\"Property.ResponseLoggingOn\" name=\"ResponseLoggingOn\" lowerBound=\"1\" defaultValueLiteral=\"true\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      <eType xmi:type=\"ecore:EDataType\" href=\"http://www.eclipse.org/emf/2002/Ecore#//EBoolean\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    </eStructuralFeatures>");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_29_1.handleBodyContent(out);
        }
        _jettag_c_if_29_1.doEnd();
        out.write("    <translation xmi:type=\"utility:TranslatableString\" key=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_34_61 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_34_61); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_34_61.setRuntimeParent(null);
        _jettag_c_get_34_61.setTagInfo(_td_c_get_34_61);
        _jettag_c_get_34_61.doStart(context, out);
        _jettag_c_get_34_61.doEnd();
        out.write("\" bundleName=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_34_108 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_34_108); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_34_108.setRuntimeParent(null);
        _jettag_c_get_34_108.setTagInfo(_td_c_get_34_108);
        _jettag_c_get_34_108.doStart(context, out);
        _jettag_c_get_34_108.doEnd();
        RuntimeTagElement _jettag_c_get_34_146 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_34_146); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_34_146.setRuntimeParent(null);
        _jettag_c_get_34_146.setTagInfo(_td_c_get_34_146);
        _jettag_c_get_34_146.doStart(context, out);
        _jettag_c_get_34_146.doEnd();
        out.write("\" pluginId=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_34_191 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_34_191); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_34_191.setRuntimeParent(null);
        _jettag_c_get_34_191.setTagInfo(_td_c_get_34_191);
        _jettag_c_get_34_191.doStart(context, out);
        _jettag_c_get_34_191.doEnd();
        out.write("\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <colorGraphic16 xmi:type=\"utility:GIFFileGraphic\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    resourceName=\"platform:/plugin/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_36_36 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_36_36); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_36_36.setRuntimeParent(null);
        _jettag_c_get_36_36.setTagInfo(_td_c_get_36_36);
        _jettag_c_get_36_36.doStart(context, out);
        _jettag_c_get_36_36.doEnd();
        out.write("/icons/full/obj16/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_36_90 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_36_90); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_36_90.setRuntimeParent(null);
        _jettag_c_get_36_90.setTagInfo(_td_c_get_36_90);
        _jettag_c_get_36_90.doStart(context, out);
        _jettag_c_get_36_90.doEnd();
        out.write(".gif\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <colorGraphic32 xmi:type=\"utility:GIFFileGraphic\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    resourceName=\"platform:/plugin/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_38_36 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_38_36); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_38_36.setRuntimeParent(null);
        _jettag_c_get_38_36.setTagInfo(_td_c_get_38_36);
        _jettag_c_get_38_36.doStart(context, out);
        _jettag_c_get_38_36.doEnd();
        out.write("/icons/full/obj30/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_38_90 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_38_90); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_38_90.setRuntimeParent(null);
        _jettag_c_get_38_90.setTagInfo(_td_c_get_38_90);
        _jettag_c_get_38_90.doStart(context, out);
        _jettag_c_get_38_90.doEnd();
        out.write(".gif\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("   \t<shortDescription xmi:type=\"utility:ConstantString\" string=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_39_65 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_39_65); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_39_65.setRuntimeParent(null);
        _jettag_c_get_39_65.setTagInfo(_td_c_get_39_65);
        _jettag_c_get_39_65.doStart(context, out);
        _jettag_c_get_39_65.doEnd();
        out.write("\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <longDescription xmi:type=\"utility:ConstantString\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    string=\"Generated by ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_41_26 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_41_26); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_41_26.setRuntimeParent(null);
        _jettag_c_get_41_26.setTagInfo(_td_c_get_41_26);
        _jettag_c_get_41_26.doStart(context, out);
        _jettag_c_get_41_26.doEnd();
        out.write(" Version ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_41_71 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_41_71); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_41_71.setRuntimeParent(null);
        _jettag_c_get_41_71.setTagInfo(_td_c_get_41_71);
        _jettag_c_get_41_71.doStart(context, out);
        _jettag_c_get_41_71.doEnd();
        out.write(NL);         
        out.write("    &#xD;&#xA;");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_42_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_42_15); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_42_15.setRuntimeParent(null);
        _jettag_c_get_42_15.setTagInfo(_td_c_get_42_15);
        _jettag_c_get_42_15.doStart(context, out);
        _jettag_c_get_42_15.doEnd();
        out.write(NL);         
        out.write("    &#xD;&#xA;$MQSI patternName=");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_43_33 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_43_33); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_43_33.setRuntimeParent(null);
        _jettag_c_get_43_33.setTagInfo(_td_c_get_43_33);
        _jettag_c_get_43_33.doStart(context, out);
        _jettag_c_get_43_33.doEnd();
        out.write(" MQSI$");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    &#xD;&#xA;$MQSI patternVersion=");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_44_36 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_44_36); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_44_36.setRuntimeParent(null);
        _jettag_c_get_44_36.setTagInfo(_td_c_get_44_36);
        _jettag_c_get_44_36.doStart(context, out);
        _jettag_c_get_44_36.doEnd();
        out.write(" MQSI$");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    \"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <version xmi:type=\"utility:ConstantString\" string=\"1\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <composition>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <nodes xmi:type=\"ComIbmMQInput.msgnode:FCMComposite_1\" xmi:id=\"FCMComposite_1_7\" location=\"-3,135\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" queueName=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_49_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_49_13); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_49_13.setRuntimeParent(null);
        _jettag_c_get_49_13.setTagInfo(_td_c_get_49_13);
        _jettag_c_get_49_13.doStart(context, out);
        _jettag_c_get_49_13.doEnd();
        RuntimeTagElement _jettag_c_get_49_50 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_49_50); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_49_50.setRuntimeParent(null);
        _jettag_c_get_49_50.setTagInfo(_td_c_get_49_50);
        _jettag_c_get_49_50.doStart(context, out);
        _jettag_c_get_49_50.doEnd();
        RuntimeTagElement _jettag_c_get_49_87 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_49_87); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_49_87.setRuntimeParent(null);
        _jettag_c_get_49_87.setTagInfo(_td_c_get_49_87);
        _jettag_c_get_49_87.doStart(context, out);
        _jettag_c_get_49_87.doEnd();
        out.write("\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\ttransactionMode=\"no\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        RuntimeTagElement _jettag_c_choose_52_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_52_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_choose_52_1.setRuntimeParent(null);
        _jettag_c_choose_52_1.setTagInfo(_td_c_choose_52_1);
        _jettag_c_choose_52_1.doStart(context, out);
        JET2Writer _jettag_c_choose_52_1_saved_out = out;
        while (_jettag_c_choose_52_1.okToProcessBody()) {
            out = out.newNestedContentWriter();
            RuntimeTagElement _jettag_c_when_53_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_53_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_when_53_1.setRuntimeParent(_jettag_c_choose_52_1);
            _jettag_c_when_53_1.setTagInfo(_td_c_when_53_1);
            _jettag_c_when_53_1.doStart(context, out);
            JET2Writer _jettag_c_when_53_1_saved_out = out;
            while (_jettag_c_when_53_1.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("     >");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_when_53_1.handleBodyContent(out);
            }
            out = _jettag_c_when_53_1_saved_out;
            _jettag_c_when_53_1.doEnd();
            RuntimeTagElement _jettag_c_otherwise_56_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_56_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_otherwise_56_1.setRuntimeParent(_jettag_c_choose_52_1);
            _jettag_c_otherwise_56_1.setTagInfo(_td_c_otherwise_56_1);
            _jettag_c_otherwise_56_1.doStart(context, out);
            JET2Writer _jettag_c_otherwise_56_1_saved_out = out;
            while (_jettag_c_otherwise_56_1.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("      \tvalidateTiming=\"immediate\"");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("      \tvalidateMaster=\"");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_58_24 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_58_24); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_58_24.setRuntimeParent(_jettag_c_otherwise_56_1);
                _jettag_c_get_58_24.setTagInfo(_td_c_get_58_24);
                _jettag_c_get_58_24.doStart(context, out);
                _jettag_c_get_58_24.doEnd();
                out.write("\"");  //$NON-NLS-1$        
                out.write(NL);         
                RuntimeTagElement _jettag_c_choose_59_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_59_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_choose_59_1.setRuntimeParent(_jettag_c_otherwise_56_1);
                _jettag_c_choose_59_1.setTagInfo(_td_c_choose_59_1);
                _jettag_c_choose_59_1.doStart(context, out);
                JET2Writer _jettag_c_choose_59_1_saved_out = out;
                while (_jettag_c_choose_59_1.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    RuntimeTagElement _jettag_c_when_60_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_60_1); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_when_60_1.setRuntimeParent(_jettag_c_choose_59_1);
                    _jettag_c_when_60_1.setTagInfo(_td_c_when_60_1);
                    _jettag_c_when_60_1.doStart(context, out);
                    JET2Writer _jettag_c_when_60_1_saved_out = out;
                    while (_jettag_c_when_60_1.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write("\t  messageDomainProperty=\"XMLNSC\"");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write("      messageSetProperty=\"");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_62_27 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_62_27); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_62_27.setRuntimeParent(_jettag_c_when_60_1);
                        _jettag_c_get_62_27.setTagInfo(_td_c_get_62_27);
                        _jettag_c_get_62_27.doStart(context, out);
                        _jettag_c_get_62_27.doEnd();
                        out.write("\">");  //$NON-NLS-1$        
                        out.write(NL);         
                        _jettag_c_when_60_1.handleBodyContent(out);
                    }
                    out = _jettag_c_when_60_1_saved_out;
                    _jettag_c_when_60_1.doEnd();
                    RuntimeTagElement _jettag_c_when_64_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_64_1); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_when_64_1.setRuntimeParent(_jettag_c_choose_59_1);
                    _jettag_c_when_64_1.setTagInfo(_td_c_when_64_1);
                    _jettag_c_when_64_1.doStart(context, out);
                    JET2Writer _jettag_c_when_64_1_saved_out = out;
                    while (_jettag_c_when_64_1.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write("\t  messageDomainProperty=\"MIME\">");  //$NON-NLS-1$        
                        out.write(NL);         
                        _jettag_c_when_64_1.handleBodyContent(out);
                    }
                    out = _jettag_c_when_64_1_saved_out;
                    _jettag_c_when_64_1.doEnd();
                    RuntimeTagElement _jettag_c_when_67_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_67_1); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_when_67_1.setRuntimeParent(_jettag_c_choose_59_1);
                    _jettag_c_when_67_1.setTagInfo(_td_c_when_67_1);
                    _jettag_c_when_67_1.doStart(context, out);
                    JET2Writer _jettag_c_when_67_1_saved_out = out;
                    while (_jettag_c_when_67_1.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write("\t  messageDomainProperty=\"MRM\"");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write("      messageSetProperty=\"");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_69_27 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_69_27); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_69_27.setRuntimeParent(_jettag_c_when_67_1);
                        _jettag_c_get_69_27.setTagInfo(_td_c_get_69_27);
                        _jettag_c_get_69_27.doStart(context, out);
                        _jettag_c_get_69_27.doEnd();
                        out.write("\"");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write("      messageTypeProperty=\"");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_70_28 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_70_28); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_70_28.setRuntimeParent(_jettag_c_when_67_1);
                        _jettag_c_get_70_28.setTagInfo(_td_c_get_70_28);
                        _jettag_c_get_70_28.doStart(context, out);
                        _jettag_c_get_70_28.doEnd();
                        out.write("\"");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write("      messageFormatProperty=\"");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_71_30 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_71_30); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_71_30.setRuntimeParent(_jettag_c_when_67_1);
                        _jettag_c_get_71_30.setTagInfo(_td_c_get_71_30);
                        _jettag_c_get_71_30.doStart(context, out);
                        _jettag_c_get_71_30.doEnd();
                        out.write("\">");  //$NON-NLS-1$        
                        out.write(NL);         
                        _jettag_c_when_67_1.handleBodyContent(out);
                    }
                    out = _jettag_c_when_67_1_saved_out;
                    _jettag_c_when_67_1.doEnd();
                    RuntimeTagElement _jettag_c_when_73_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_73_1); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_when_73_1.setRuntimeParent(_jettag_c_choose_59_1);
                    _jettag_c_when_73_1.setTagInfo(_td_c_when_73_1);
                    _jettag_c_when_73_1.doStart(context, out);
                    JET2Writer _jettag_c_when_73_1_saved_out = out;
                    while (_jettag_c_when_73_1.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write("\t  messageDomainProperty=\"MRM\"");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write("      messageSetProperty=\"");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_75_27 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_75_27); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_75_27.setRuntimeParent(_jettag_c_when_73_1);
                        _jettag_c_get_75_27.setTagInfo(_td_c_get_75_27);
                        _jettag_c_get_75_27.doStart(context, out);
                        _jettag_c_get_75_27.doEnd();
                        out.write("\"");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write("      messageTypeProperty=\"");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_76_28 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_76_28); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_76_28.setRuntimeParent(_jettag_c_when_73_1);
                        _jettag_c_get_76_28.setTagInfo(_td_c_get_76_28);
                        _jettag_c_get_76_28.doStart(context, out);
                        _jettag_c_get_76_28.doEnd();
                        out.write("\"");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write("      messageFormatProperty=\"");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_77_30 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_77_30); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_77_30.setRuntimeParent(_jettag_c_when_73_1);
                        _jettag_c_get_77_30.setTagInfo(_td_c_get_77_30);
                        _jettag_c_get_77_30.doStart(context, out);
                        _jettag_c_get_77_30.doEnd();
                        out.write("\">   ");  //$NON-NLS-1$        
                        out.write(NL);         
                        _jettag_c_when_73_1.handleBodyContent(out);
                    }
                    out = _jettag_c_when_73_1_saved_out;
                    _jettag_c_when_73_1.doEnd();
                    _jettag_c_choose_59_1.handleBodyContent(out);
                }
                out = _jettag_c_choose_59_1_saved_out;
                _jettag_c_choose_59_1.doEnd();
                _jettag_c_otherwise_56_1.handleBodyContent(out);
            }
            out = _jettag_c_otherwise_56_1_saved_out;
            _jettag_c_otherwise_56_1.doEnd();
            _jettag_c_choose_52_1.handleBodyContent(out);
        }
        out = _jettag_c_choose_52_1_saved_out;
        _jettag_c_choose_52_1.doEnd();
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"Read Response\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <nodes xmi:type=\"ComIbmMQGet.msgnode:FCMComposite_1\" xmi:id=\"FCMComposite_1_10\" location=\"398,57\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      queueName=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_86_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_86_18); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_86_18.setRuntimeParent(null);
        _jettag_c_get_86_18.setTagInfo(_td_c_get_86_18);
        _jettag_c_get_86_18.doStart(context, out);
        _jettag_c_get_86_18.doEnd();
        RuntimeTagElement _jettag_c_get_86_55 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_86_55); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_86_55.setRuntimeParent(null);
        _jettag_c_get_86_55.setTagInfo(_td_c_get_86_55);
        _jettag_c_get_86_55.doStart(context, out);
        _jettag_c_get_86_55.doEnd();
        RuntimeTagElement _jettag_c_get_86_89 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_86_89); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_86_89.setRuntimeParent(null);
        _jettag_c_get_86_89.setTagInfo(_td_c_get_86_89);
        _jettag_c_get_86_89.doStart(context, out);
        _jettag_c_get_86_89.doEnd();
        out.write("\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t   transactionMode=\"no\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("      copyMessage=\"copyEntireMessage\" minimumGetBufferSize=\"1\" getWithCorrelID=\"true\" outputDataLocation=\"OutputRoot.MQMD\" resultDataLocation=\"ResultRoot.MQMD\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"Retrieve\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <shortDescription xmi:type=\"utility:ConstantString\" string=\"Reads the original MQMD from the store\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <longDescription xmi:type=\"utility:ConstantString\" string=\"This MQ Get node reads  corresponding stored message, selected via the message correlator ID.  This message contains the original request MQMD containing the reply-to queue and queue manager name of the requestor application that was stored during the request flow\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <nodes xmi:type=\"ComIbmCompute.msgnode:FCMComposite_1\" xmi:id=\"FCMComposite_1_11\" location=\"561,61\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      computeExpression=\"esql://routine/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_95_41 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_95_41); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_95_41.setRuntimeParent(null);
        _jettag_c_get_95_41.setTagInfo(_td_c_get_95_41);
        _jettag_c_get_95_41.doStart(context, out);
        _jettag_c_get_95_41.doEnd();
        out.write("#HandleMQGetWarning.Main\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"MQ Warning\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <shortDescription xmi:type=\"utility:ConstantString\" string=\"Throw exception when MQGet returns a warning\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <longDescription xmi:type=\"utility:ConstantString\" string=\"This node is invoked when there something goes wrong when trying to retrieve the stored MQMD.  The node constructs and throws an appropriate exception.\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <nodes xmi:type=\"ComIbmCompute.msgnode:FCMComposite_1\" xmi:id=\"FCMComposite_1_12\" location=\"453,200\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      computeExpression=\"esql://routine/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_101_41 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_101_41); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_101_41.setRuntimeParent(null);
        _jettag_c_get_101_41.setTagInfo(_td_c_get_101_41);
        _jettag_c_get_101_41.doStart(context, out);
        _jettag_c_get_101_41.doEnd();
        out.write("#HandleMissingStoredMsg.Main\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"Missing Stored Msg\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <shortDescription xmi:type=\"utility:ConstantString\" string=\"Throw exception to handle case of missing stored MQMD\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <longDescription xmi:type=\"utility:ConstantString\" string=\"This node is invoked when there is no message on the 'STORE' queue with the matching CorrelId.  The node constructs and throws an appropriate exception.\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <nodes xmi:type=\"ComIbmMQReply.msgnode:FCMComposite_1\" xmi:id=\"FCMComposite_1_13\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      location=\"539,-25\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("   ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      transactionMode=\"no\" persistenceMode=\"no\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"Reply\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <nodes xmi:type=\"ComIbmCompute.msgnode:FCMComposite_1\" xmi:id=\"FCMComposite_1_9\" location=\"103,135\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      computeExpression=\"esql://routine/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_114_41 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_114_41); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_114_41.setRuntimeParent(null);
        _jettag_c_get_114_41.setTagInfo(_td_c_get_114_41);
        _jettag_c_get_114_41.doStart(context, out);
        _jettag_c_get_114_41.doEnd();
        out.write("#SetResponseMode.Main\" computeMode=\"destination\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"Initialise\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <nodes xmi:type=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_117_24 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_117_24); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_117_24.setRuntimeParent(null);
        _jettag_c_get_117_24.setTagInfo(_td_c_get_117_24);
        _jettag_c_get_117_24.doStart(context, out);
        _jettag_c_get_117_24.doEnd();
        RuntimeTagElement _jettag_c_get_117_62 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_117_62); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_117_62.setRuntimeParent(null);
        _jettag_c_get_117_62.setTagInfo(_td_c_get_117_62);
        _jettag_c_get_117_62.doStart(context, out);
        _jettag_c_get_117_62.doEnd();
        out.write(".subflow:FCMComposite_1\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      xmi:id=\"FCMComposite_1_1\" location=\"295,57\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"Response Processor\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <nodes xmi:type=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_121_24 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_121_24); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_121_24.setRuntimeParent(null);
        _jettag_c_get_121_24.setTagInfo(_td_c_get_121_24);
        _jettag_c_get_121_24.doStart(context, out);
        _jettag_c_get_121_24.doEnd();
        RuntimeTagElement _jettag_c_get_121_62 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_121_62); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_121_62.setRuntimeParent(null);
        _jettag_c_get_121_62.setTagInfo(_td_c_get_121_62);
        _jettag_c_get_121_62.doStart(context, out);
        _jettag_c_get_121_62.doEnd();
        out.write(".subflow:FCMComposite_1\" xmi:id=\"FCMComposite_1_2\" location=\"114,238\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"Error\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_124_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_124_2); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_124_2.setRuntimeParent(null);
        _jettag_c_if_124_2.setTagInfo(_td_c_if_124_2);
        _jettag_c_if_124_2.doStart(context, out);
        while (_jettag_c_if_124_2.okToProcessBody()) {
            out.write("      <nodes xmi:type=\"ComIbmFlowOrder.msgnode:FCMComposite_1\" xmi:id=\"FCMComposite_1_16\" location=\"182,136\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"Log after Reply\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      </nodes>      ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      <nodes xmi:type=\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_128_24 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_128_24); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_128_24.setRuntimeParent(_jettag_c_if_124_2);
            _jettag_c_get_128_24.setTagInfo(_td_c_get_128_24);
            _jettag_c_get_128_24.doStart(context, out);
            _jettag_c_get_128_24.doEnd();
            RuntimeTagElement _jettag_c_get_128_62 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_128_62); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_128_62.setRuntimeParent(_jettag_c_if_124_2);
            _jettag_c_get_128_62.setTagInfo(_td_c_get_128_62);
            _jettag_c_get_128_62.doStart(context, out);
            _jettag_c_get_128_62.doEnd();
            out.write(".subflow:FCMComposite_1\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      xmi:id=\"FCMComposite_1_3\" location=\"315,242\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"Log\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      </nodes>");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_124_2.handleBodyContent(out);
        }
        _jettag_c_if_124_2.doEnd();
        out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_1\" targetNode=\"FCMComposite_1_11\" sourceNode=\"FCMComposite_1_10\" sourceTerminalName=\"OutTerminal.warning\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_2\" targetNode=\"FCMComposite_1_12\" sourceNode=\"FCMComposite_1_10\" sourceTerminalName=\"OutTerminal.noMessage\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_3\" targetNode=\"FCMComposite_1_13\" sourceNode=\"FCMComposite_1_10\" sourceTerminalName=\"OutTerminal.out\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_4\" targetNode=\"FCMComposite_1_9\" sourceNode=\"FCMComposite_1_7\" sourceTerminalName=\"OutTerminal.out\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_7\" targetNode=\"FCMComposite_1_10\" sourceNode=\"FCMComposite_1_1\" sourceTerminalName=\"OutTerminal.Output\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_8\" targetNode=\"FCMComposite_1_2\" sourceNode=\"FCMComposite_1_7\" sourceTerminalName=\"OutTerminal.catch\" targetTerminalName=\"InTerminal.Input\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_11\" targetNode=\"FCMComposite_1_2\" sourceNode=\"FCMComposite_1_7\" sourceTerminalName=\"OutTerminal.failure\" targetTerminalName=\"InTerminal.Input\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_choose_140_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_140_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_choose_140_1.setRuntimeParent(null);
        _jettag_c_choose_140_1.setTagInfo(_td_c_choose_140_1);
        _jettag_c_choose_140_1.doStart(context, out);
        JET2Writer _jettag_c_choose_140_1_saved_out = out;
        while (_jettag_c_choose_140_1.okToProcessBody()) {
            out = out.newNestedContentWriter();
            RuntimeTagElement _jettag_c_when_141_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_141_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_when_141_2.setRuntimeParent(_jettag_c_choose_140_1);
            _jettag_c_when_141_2.setTagInfo(_td_c_when_141_2);
            _jettag_c_when_141_2.doStart(context, out);
            JET2Writer _jettag_c_when_141_2_saved_out = out;
            while (_jettag_c_when_141_2.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_5\" targetNode=\"FCMComposite_1_16\" sourceNode=\"FCMComposite_1_9\" sourceTerminalName=\"OutTerminal.out\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_6\" targetNode=\"FCMComposite_1_1\" sourceNode=\"FCMComposite_1_16\" sourceTerminalName=\"OutTerminal.first\" targetTerminalName=\"InTerminal.Input\"/>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("       <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_10\" targetNode=\"FCMComposite_1_3\" sourceNode=\"FCMComposite_1_16\" sourceTerminalName=\"OutTerminal.second\" targetTerminalName=\"InTerminal.Input\"/>");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_when_141_2.handleBodyContent(out);
            }
            out = _jettag_c_when_141_2_saved_out;
            _jettag_c_when_141_2.doEnd();
            RuntimeTagElement _jettag_c_otherwise_146_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_146_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_otherwise_146_2.setRuntimeParent(_jettag_c_choose_140_1);
            _jettag_c_otherwise_146_2.setTagInfo(_td_c_otherwise_146_2);
            _jettag_c_otherwise_146_2.doStart(context, out);
            JET2Writer _jettag_c_otherwise_146_2_saved_out = out;
            while (_jettag_c_otherwise_146_2.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_9\" targetNode=\"FCMComposite_1_1\" sourceNode=\"FCMComposite_1_9\" sourceTerminalName=\"OutTerminal.out\" targetTerminalName=\"InTerminal.Input\"/>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write(" ");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_otherwise_146_2.handleBodyContent(out);
            }
            out = _jettag_c_otherwise_146_2_saved_out;
            _jettag_c_otherwise_146_2.doEnd();
            _jettag_c_choose_140_1.handleBodyContent(out);
        }
        out = _jettag_c_choose_140_1_saved_out;
        _jettag_c_choose_140_1.doEnd();
        out.write("    </composition>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <propertyOrganizer>");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_153_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_153_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_153_1.setRuntimeParent(null);
        _jettag_c_if_153_1.setTagInfo(_td_c_if_153_1);
        _jettag_c_if_153_1.doStart(context, out);
        while (_jettag_c_if_153_1.okToProcessBody()) {
            out.write("      <propertyDescriptor groupName=\"Group.Basic\" configurable=\"true\" userDefined=\"true\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      describedAttribute=\"Property.ErrorLoggingOn\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        <propertyName xmi:type=\"utility:TranslatableString\" key=\"Property.ErrorLoggingOn\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("       bundleName=\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_157_20 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_157_20); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_157_20.setRuntimeParent(_jettag_c_if_153_1);
            _jettag_c_get_157_20.setTagInfo(_td_c_get_157_20);
            _jettag_c_get_157_20.doStart(context, out);
            _jettag_c_get_157_20.doEnd();
            RuntimeTagElement _jettag_c_get_157_58 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_157_58); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_157_58.setRuntimeParent(_jettag_c_if_153_1);
            _jettag_c_get_157_58.setTagInfo(_td_c_get_157_58);
            _jettag_c_get_157_58.doStart(context, out);
            _jettag_c_get_157_58.doEnd();
            out.write("\"  pluginId=\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_157_104 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_157_104); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_157_104.setRuntimeParent(_jettag_c_if_153_1);
            _jettag_c_get_157_104.setTagInfo(_td_c_get_157_104);
            _jettag_c_get_157_104.doStart(context, out);
            _jettag_c_get_157_104.doEnd();
            out.write("\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_153_1.handleBodyContent(out);
        }
        _jettag_c_if_153_1.doEnd();
        RuntimeTagElement _jettag_c_if_159_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_159_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_159_1.setRuntimeParent(null);
        _jettag_c_if_159_1.setTagInfo(_td_c_if_159_1);
        _jettag_c_if_159_1.doStart(context, out);
        while (_jettag_c_if_159_1.okToProcessBody()) {
            out.write("          <propertyDescriptor groupName=\"Group.Basic\" configurable=\"true\" userDefined=\"true\" describedAttribute=\"Property.ResponseLoggingOn\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("            <propertyName xmi:type=\"utility:TranslatableString\" key=\"Property.ResponseLoggingOn\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("            bundleName=\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_162_25 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_162_25); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_162_25.setRuntimeParent(_jettag_c_if_159_1);
            _jettag_c_get_162_25.setTagInfo(_td_c_get_162_25);
            _jettag_c_get_162_25.doStart(context, out);
            _jettag_c_get_162_25.doEnd();
            RuntimeTagElement _jettag_c_get_162_63 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_162_63); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_162_63.setRuntimeParent(_jettag_c_if_159_1);
            _jettag_c_get_162_63.setTagInfo(_td_c_get_162_63);
            _jettag_c_get_162_63.doStart(context, out);
            _jettag_c_get_162_63.doEnd();
            out.write("\"  pluginId=\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_162_108 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_162_108); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_162_108.setRuntimeParent(_jettag_c_if_159_1);
            _jettag_c_get_162_108.setTagInfo(_td_c_get_162_108);
            _jettag_c_get_162_108.doStart(context, out);
            _jettag_c_get_162_108.doEnd();
            out.write("\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("          </propertyDescriptor>");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_159_1.handleBodyContent(out);
        }
        _jettag_c_if_159_1.doEnd();
        RuntimeTagElement _jettag_c_if_165_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_165_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_165_1.setRuntimeParent(null);
        _jettag_c_if_165_1.setTagInfo(_td_c_if_165_1);
        _jettag_c_if_165_1.doStart(context, out);
        while (_jettag_c_if_165_1.okToProcessBody()) {
            out.write("      </propertyDescriptor>");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_165_1.handleBodyContent(out);
        }
        _jettag_c_if_165_1.doEnd();
        out.write("    </propertyOrganizer>");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_169_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_169_5); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_169_5.setRuntimeParent(null);
        _jettag_c_if_169_5.setTagInfo(_td_c_if_169_5);
        _jettag_c_if_169_5.doStart(context, out);
        while (_jettag_c_if_169_5.okToProcessBody()) {
            out.write("      <attributeLinks promotedAttribute=\"Property.ErrorLoggingOn\" overriddenNodes=\"FCMComposite_1_2\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      <overriddenAttribute href=\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_171_34 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_171_34); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_171_34.setRuntimeParent(_jettag_c_if_169_5);
            _jettag_c_get_171_34.setTagInfo(_td_c_get_171_34);
            _jettag_c_get_171_34.doStart(context, out);
            _jettag_c_get_171_34.doEnd();
            RuntimeTagElement _jettag_c_get_171_72 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_171_72); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_171_72.setRuntimeParent(_jettag_c_if_169_5);
            _jettag_c_get_171_72.setTagInfo(_td_c_get_171_72);
            _jettag_c_get_171_72.doStart(context, out);
            _jettag_c_get_171_72.doEnd();
            out.write(".subflow#Property.ErrorLoggingOn\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    </attributeLinks>");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_169_5.handleBodyContent(out);
        }
        _jettag_c_if_169_5.doEnd();
        out.write("  </eClassifiers>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("</ecore:EPackage>");  //$NON-NLS-1$        
        out.write(NL);         
    }
}
