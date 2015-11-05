package org.eclipse.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_Requestmsgflow_0 implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_Requestmsgflow_0() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_get_9_12 = new TagInfo("c:get", //$NON-NLS-1$
            9, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_9_50 = new TagInfo("c:get", //$NON-NLS-1$
            9, 50,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@error", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_9_92 = new TagInfo("c:get", //$NON-NLS-1$
            9, 92,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_9_130 = new TagInfo("c:get", //$NON-NLS-1$
            9, 130,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@error", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_10_5 = new TagInfo("c:if", //$NON-NLS-1$
            10, 5,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/loggingRequired = 'true'", //$NON-NLS-1$
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
    private static final TagInfo _td_c_get_11_89 = new TagInfo("c:get", //$NON-NLS-1$
            11, 89,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_11_127 = new TagInfo("c:get", //$NON-NLS-1$
            11, 127,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@log", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_13_11 = new TagInfo("c:get", //$NON-NLS-1$
            13, 11,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_13_49 = new TagInfo("c:get", //$NON-NLS-1$
            13, 49,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@requestprocessor", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_13_102 = new TagInfo("c:get", //$NON-NLS-1$
            13, 102,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_13_140 = new TagInfo("c:get", //$NON-NLS-1$
            13, 140,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@requestprocessor", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_17_12 = new TagInfo("c:get", //$NON-NLS-1$
            17, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_17_50 = new TagInfo("c:get", //$NON-NLS-1$
            17, 50,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@request", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_18_15 = new TagInfo("c:get", //$NON-NLS-1$
            18, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_18_53 = new TagInfo("c:get", //$NON-NLS-1$
            18, 53,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@request", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_21_1 = new TagInfo("c:if", //$NON-NLS-1$
            21, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/errorMessageRequired = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_26_1 = new TagInfo("c:if", //$NON-NLS-1$
            26, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/loggingRequired = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_32_10 = new TagInfo("c:get", //$NON-NLS-1$
            32, 10,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@request", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_33_17 = new TagInfo("c:get", //$NON-NLS-1$
            33, 17,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_33_55 = new TagInfo("c:get", //$NON-NLS-1$
            33, 55,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@request", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_34_15 = new TagInfo("c:get", //$NON-NLS-1$
            34, 15,
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
                "$root/@request", //$NON-NLS-1$
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
                "$root/@request", //$NON-NLS-1$
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
    private static final TagInfo _td_c_get_53_17 = new TagInfo("c:get", //$NON-NLS-1$
            53, 17,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/queueprefix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_53_54 = new TagInfo("c:get", //$NON-NLS-1$
            53, 54,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/readRequestQueue", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_53_94 = new TagInfo("c:get", //$NON-NLS-1$
            53, 94,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/queuesuffix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_54_1 = new TagInfo("c:if", //$NON-NLS-1$
            54, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "starts-with( $root/validationofRequest, 'content')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_56_23 = new TagInfo("c:get", //$NON-NLS-1$
            56, 23,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/validationofRequest", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_58_1 = new TagInfo("c:choose", //$NON-NLS-1$
            58, 1,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_59_1 = new TagInfo("c:when", //$NON-NLS-1$
            59, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/validationofRequest = 'None'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_62_1 = new TagInfo("c:otherwise", //$NON-NLS-1$
            62, 1,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_choose_63_1 = new TagInfo("c:choose", //$NON-NLS-1$
            63, 1,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_64_1 = new TagInfo("c:when", //$NON-NLS-1$
            64, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/inputDataType = 'XML'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_66_27 = new TagInfo("c:get", //$NON-NLS-1$
            66, 27,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "substring-after(substring-after($root/inputMessageSet,'/'),'/')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_when_68_1 = new TagInfo("c:when", //$NON-NLS-1$
            68, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/inputDataType = 'MIME'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_when_71_1 = new TagInfo("c:when", //$NON-NLS-1$
            71, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/inputDataType = 'binaryData'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_73_27 = new TagInfo("c:get", //$NON-NLS-1$
            73, 27,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "substring-after(substring-after($root/inputMessageSet,'/'),'/')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_74_28 = new TagInfo("c:get", //$NON-NLS-1$
            74, 28,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/inputMessageType", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_75_30 = new TagInfo("c:get", //$NON-NLS-1$
            75, 30,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/inputMessageFormat", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_when_77_1 = new TagInfo("c:when", //$NON-NLS-1$
            77, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/inputDataType = 'textData'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_79_27 = new TagInfo("c:get", //$NON-NLS-1$
            79, 27,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "substring-after(substring-after($root/inputMessageSet,'/'),'/')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_80_28 = new TagInfo("c:get", //$NON-NLS-1$
            80, 28,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/inputMessageType", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_81_30 = new TagInfo("c:get", //$NON-NLS-1$
            81, 30,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/inputMessageFormat", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_88_24 = new TagInfo("c:get", //$NON-NLS-1$
            88, 24,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_88_62 = new TagInfo("c:get", //$NON-NLS-1$
            88, 62,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@requestprocessor", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_95_19 = new TagInfo("c:get", //$NON-NLS-1$
            95, 19,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@mqmdExpiry", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_98_21 = new TagInfo("c:get", //$NON-NLS-1$
            98, 21,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/queueprefix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_98_58 = new TagInfo("c:get", //$NON-NLS-1$
            98, 58,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/responseQueue", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_98_95 = new TagInfo("c:get", //$NON-NLS-1$
            98, 95,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/queuesuffix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_104_25 = new TagInfo("c:get", //$NON-NLS-1$
            104, 25,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/providerRequestQueueManager", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_105_18 = new TagInfo("c:get", //$NON-NLS-1$
            105, 18,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/queueprefix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_105_55 = new TagInfo("c:get", //$NON-NLS-1$
            105, 55,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/providerRequestQueue", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_106_37 = new TagInfo("c:get", //$NON-NLS-1$
            106, 37,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/queuesuffix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_111_41 = new TagInfo("c:get", //$NON-NLS-1$
            111, 41,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_117_17 = new TagInfo("c:get", //$NON-NLS-1$
            117, 17,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@mqmdExpiry", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_124_13 = new TagInfo("c:get", //$NON-NLS-1$
            124, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@queueprefix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_124_51 = new TagInfo("c:get", //$NON-NLS-1$
            124, 51,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/storeQueue", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_124_85 = new TagInfo("c:get", //$NON-NLS-1$
            124, 85,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@queuesuffix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_131_24 = new TagInfo("c:get", //$NON-NLS-1$
            131, 24,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_131_62 = new TagInfo("c:get", //$NON-NLS-1$
            131, 62,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@error", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_135_141 = new TagInfo("c:get", //$NON-NLS-1$
            135, 141,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_138_1 = new TagInfo("c:if", //$NON-NLS-1$
            138, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/loggingRequired = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_143_24 = new TagInfo("c:get", //$NON-NLS-1$
            143, 24,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_143_62 = new TagInfo("c:get", //$NON-NLS-1$
            143, 62,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@log", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_157_1 = new TagInfo("c:choose", //$NON-NLS-1$
            157, 1,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_158_1 = new TagInfo("c:when", //$NON-NLS-1$
            158, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/loggingRequired = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_163_1 = new TagInfo("c:otherwise", //$NON-NLS-1$
            163, 1,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_if_169_1 = new TagInfo("c:if", //$NON-NLS-1$
            169, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/errorMessageRequired = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_173_21 = new TagInfo("c:get", //$NON-NLS-1$
            173, 21,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_173_59 = new TagInfo("c:get", //$NON-NLS-1$
            173, 59,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@request", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_174_19 = new TagInfo("c:get", //$NON-NLS-1$
            174, 19,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@projectname", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_176_1 = new TagInfo("c:if", //$NON-NLS-1$
            176, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/loggingRequired = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_179_23 = new TagInfo("c:get", //$NON-NLS-1$
            179, 23,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_179_61 = new TagInfo("c:get", //$NON-NLS-1$
            179, 61,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@request", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_180_21 = new TagInfo("c:get", //$NON-NLS-1$
            180, 21,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@projectname", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_183_1 = new TagInfo("c:if", //$NON-NLS-1$
            183, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/errorMessageRequired = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_187_5 = new TagInfo("c:if", //$NON-NLS-1$
            187, 5,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/errorMessageRequired = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_189_34 = new TagInfo("c:get", //$NON-NLS-1$
            189, 34,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_189_72 = new TagInfo("c:get", //$NON-NLS-1$
            189, 72,
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
        out.write("    xmlns:ComIbmMQHeader.msgnode=\"ComIbmMQHeader.msgnode\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:ComIbmMQInput.msgnode=\"ComIbmMQInput.msgnode\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:ComIbmMQOutput.msgnode=\"ComIbmMQOutput.msgnode\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("     xmlns:");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_9_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_9_12); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_9_12.setRuntimeParent(null);
        _jettag_c_get_9_12.setTagInfo(_td_c_get_9_12);
        _jettag_c_get_9_12.doStart(context, out);
        _jettag_c_get_9_12.doEnd();
        RuntimeTagElement _jettag_c_get_9_50 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_9_50); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_9_50.setRuntimeParent(null);
        _jettag_c_get_9_50.setTagInfo(_td_c_get_9_50);
        _jettag_c_get_9_50.doStart(context, out);
        _jettag_c_get_9_50.doEnd();
        out.write(".subflow=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_9_92 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_9_92); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_9_92.setRuntimeParent(null);
        _jettag_c_get_9_92.setTagInfo(_td_c_get_9_92);
        _jettag_c_get_9_92.doStart(context, out);
        _jettag_c_get_9_92.doEnd();
        RuntimeTagElement _jettag_c_get_9_130 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_9_130); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_9_130.setRuntimeParent(null);
        _jettag_c_get_9_130.setTagInfo(_td_c_get_9_130);
        _jettag_c_get_9_130.doStart(context, out);
        _jettag_c_get_9_130.doEnd();
        out.write(".subflow\" ");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_10_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_10_5); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_10_5.setRuntimeParent(null);
        _jettag_c_if_10_5.setTagInfo(_td_c_if_10_5);
        _jettag_c_if_10_5.doStart(context, out);
        while (_jettag_c_if_10_5.okToProcessBody()) {
            out.write("    xmlns:");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_11_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_11_11); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_11_11.setRuntimeParent(_jettag_c_if_10_5);
            _jettag_c_get_11_11.setTagInfo(_td_c_get_11_11);
            _jettag_c_get_11_11.doStart(context, out);
            _jettag_c_get_11_11.doEnd();
            RuntimeTagElement _jettag_c_get_11_49 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_11_49); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_11_49.setRuntimeParent(_jettag_c_if_10_5);
            _jettag_c_get_11_49.setTagInfo(_td_c_get_11_49);
            _jettag_c_get_11_49.doStart(context, out);
            _jettag_c_get_11_49.doEnd();
            out.write(".subflow=\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_11_89 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_11_89); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_11_89.setRuntimeParent(_jettag_c_if_10_5);
            _jettag_c_get_11_89.setTagInfo(_td_c_get_11_89);
            _jettag_c_get_11_89.doStart(context, out);
            _jettag_c_get_11_89.doEnd();
            RuntimeTagElement _jettag_c_get_11_127 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_11_127); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_11_127.setRuntimeParent(_jettag_c_if_10_5);
            _jettag_c_get_11_127.setTagInfo(_td_c_get_11_127);
            _jettag_c_get_11_127.doStart(context, out);
            _jettag_c_get_11_127.doEnd();
            out.write(".subflow\" ");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_10_5.handleBodyContent(out);
        }
        _jettag_c_if_10_5.doEnd();
        out.write("    xmlns:");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_13_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_13_11); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_13_11.setRuntimeParent(null);
        _jettag_c_get_13_11.setTagInfo(_td_c_get_13_11);
        _jettag_c_get_13_11.doStart(context, out);
        _jettag_c_get_13_11.doEnd();
        RuntimeTagElement _jettag_c_get_13_49 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_13_49); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_13_49.setRuntimeParent(null);
        _jettag_c_get_13_49.setTagInfo(_td_c_get_13_49);
        _jettag_c_get_13_49.doStart(context, out);
        _jettag_c_get_13_49.doEnd();
        out.write(".subflow=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_13_102 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_13_102); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_13_102.setRuntimeParent(null);
        _jettag_c_get_13_102.setTagInfo(_td_c_get_13_102);
        _jettag_c_get_13_102.doStart(context, out);
        _jettag_c_get_13_102.doEnd();
        RuntimeTagElement _jettag_c_get_13_140 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_13_140); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_13_140.setRuntimeParent(null);
        _jettag_c_get_13_140.setTagInfo(_td_c_get_13_140);
        _jettag_c_get_13_140.doStart(context, out);
        _jettag_c_get_13_140.doEnd();
        out.write(".subflow\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:ecore=\"http://www.eclipse.org/emf/2002/Ecore\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:eflow=\"http://www.ibm.com/wbi/2005/eflow\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:utility=\"http://www.ibm.com/wbi/2005/eflow_utility\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    nsURI=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_17_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_17_12); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_17_12.setRuntimeParent(null);
        _jettag_c_get_17_12.setTagInfo(_td_c_get_17_12);
        _jettag_c_get_17_12.doStart(context, out);
        _jettag_c_get_17_12.doEnd();
        RuntimeTagElement _jettag_c_get_17_50 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_17_50); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_17_50.setRuntimeParent(null);
        _jettag_c_get_17_50.setTagInfo(_td_c_get_17_50);
        _jettag_c_get_17_50.doStart(context, out);
        _jettag_c_get_17_50.doEnd();
        out.write(".msgflow\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    nsPrefix=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_18_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_18_15); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_18_15.setRuntimeParent(null);
        _jettag_c_get_18_15.setTagInfo(_td_c_get_18_15);
        _jettag_c_get_18_15.doStart(context, out);
        _jettag_c_get_18_15.doEnd();
        RuntimeTagElement _jettag_c_get_18_53 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_18_53); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_18_53.setRuntimeParent(null);
        _jettag_c_get_18_53.setTagInfo(_td_c_get_18_53);
        _jettag_c_get_18_53.doStart(context, out);
        _jettag_c_get_18_53.doEnd();
        out.write(".msgflow\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("   <eClassifiers xmi:type=\"eflow:FCMComposite\" name=\"FCMComposite_1\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <eSuperTypes href=\"http://www.ibm.com/wbi/2005/eflow#//FCMBlock\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_21_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_21_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_21_1.setRuntimeParent(null);
        _jettag_c_if_21_1.setTagInfo(_td_c_if_21_1);
        _jettag_c_if_21_1.doStart(context, out);
        while (_jettag_c_if_21_1.okToProcessBody()) {
            out.write("    <eStructuralFeatures xmi:type=\"ecore:EAttribute\" xmi:id=\"Property.ErrorLoggingOn\" name=\"ErrorLoggingOn\" lowerBound=\"1\" defaultValueLiteral=\"true\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      <eType xmi:type=\"ecore:EDataType\" href=\"http://www.eclipse.org/emf/2002/Ecore#//EBoolean\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    </eStructuralFeatures>");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_21_1.handleBodyContent(out);
        }
        _jettag_c_if_21_1.doEnd();
        RuntimeTagElement _jettag_c_if_26_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_26_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_26_1.setRuntimeParent(null);
        _jettag_c_if_26_1.setTagInfo(_td_c_if_26_1);
        _jettag_c_if_26_1.doStart(context, out);
        while (_jettag_c_if_26_1.okToProcessBody()) {
            out.write("    <eStructuralFeatures xmi:type=\"ecore:EAttribute\" xmi:id=\"Property.RequestLoggingOn\" name=\"RequestLoggingOn\" lowerBound=\"1\" defaultValueLiteral=\"true\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      <eType xmi:type=\"ecore:EDataType\" href=\"http://www.eclipse.org/emf/2002/Ecore#//EBoolean\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    </eStructuralFeatures>");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_26_1.handleBodyContent(out);
        }
        _jettag_c_if_26_1.doEnd();
        out.write("    <translation xmi:type=\"utility:TranslatableString\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    key=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_32_10 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_32_10); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_32_10.setRuntimeParent(null);
        _jettag_c_get_32_10.setTagInfo(_td_c_get_32_10);
        _jettag_c_get_32_10.doStart(context, out);
        _jettag_c_get_32_10.doEnd();
        out.write("\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    bundleName=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_33_17 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_33_17); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_33_17.setRuntimeParent(null);
        _jettag_c_get_33_17.setTagInfo(_td_c_get_33_17);
        _jettag_c_get_33_17.doStart(context, out);
        _jettag_c_get_33_17.doEnd();
        RuntimeTagElement _jettag_c_get_33_55 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_33_55); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_33_55.setRuntimeParent(null);
        _jettag_c_get_33_55.setTagInfo(_td_c_get_33_55);
        _jettag_c_get_33_55.doStart(context, out);
        _jettag_c_get_33_55.doEnd();
        out.write("\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    pluginId=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_34_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_34_15); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_34_15.setRuntimeParent(null);
        _jettag_c_get_34_15.setTagInfo(_td_c_get_34_15);
        _jettag_c_get_34_15.doStart(context, out);
        _jettag_c_get_34_15.doEnd();
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
        out.write("      <nodes xmi:type=\"ComIbmFlowOrder.msgnode:FCMComposite_1\" xmi:id=\"FCMComposite_1_3\" location=\"142,96\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"Save First\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <nodes xmi:type=\"ComIbmMQInput.msgnode:FCMComposite_1\" xmi:id=\"FCMComposite_1_1\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      location=\"-23,97\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("     queueName=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_53_17 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_53_17); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_53_17.setRuntimeParent(null);
        _jettag_c_get_53_17.setTagInfo(_td_c_get_53_17);
        _jettag_c_get_53_17.doStart(context, out);
        _jettag_c_get_53_17.doEnd();
        RuntimeTagElement _jettag_c_get_53_54 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_53_54); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_53_54.setRuntimeParent(null);
        _jettag_c_get_53_54.setTagInfo(_td_c_get_53_54);
        _jettag_c_get_53_54.doStart(context, out);
        _jettag_c_get_53_54.doEnd();
        RuntimeTagElement _jettag_c_get_53_94 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_53_94); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_53_94.setRuntimeParent(null);
        _jettag_c_get_53_94.setTagInfo(_td_c_get_53_94);
        _jettag_c_get_53_94.doStart(context, out);
        _jettag_c_get_53_94.doEnd();
        out.write("\"");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_54_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_54_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_54_1.setRuntimeParent(null);
        _jettag_c_if_54_1.setTagInfo(_td_c_if_54_1);
        _jettag_c_if_54_1.doStart(context, out);
        while (_jettag_c_if_54_1.okToProcessBody()) {
            out.write("\t validateTiming=\"immediate\"");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      validateMaster=\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_56_23 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_56_23); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_56_23.setRuntimeParent(_jettag_c_if_54_1);
            _jettag_c_get_56_23.setTagInfo(_td_c_get_56_23);
            _jettag_c_get_56_23.doStart(context, out);
            _jettag_c_get_56_23.doEnd();
            out.write("\"");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_54_1.handleBodyContent(out);
        }
        _jettag_c_if_54_1.doEnd();
        RuntimeTagElement _jettag_c_choose_58_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_58_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_choose_58_1.setRuntimeParent(null);
        _jettag_c_choose_58_1.setTagInfo(_td_c_choose_58_1);
        _jettag_c_choose_58_1.doStart(context, out);
        JET2Writer _jettag_c_choose_58_1_saved_out = out;
        while (_jettag_c_choose_58_1.okToProcessBody()) {
            out = out.newNestedContentWriter();
            RuntimeTagElement _jettag_c_when_59_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_59_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_when_59_1.setRuntimeParent(_jettag_c_choose_58_1);
            _jettag_c_when_59_1.setTagInfo(_td_c_when_59_1);
            _jettag_c_when_59_1.doStart(context, out);
            JET2Writer _jettag_c_when_59_1_saved_out = out;
            while (_jettag_c_when_59_1.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("     >");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_when_59_1.handleBodyContent(out);
            }
            out = _jettag_c_when_59_1_saved_out;
            _jettag_c_when_59_1.doEnd();
            RuntimeTagElement _jettag_c_otherwise_62_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_62_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_otherwise_62_1.setRuntimeParent(_jettag_c_choose_58_1);
            _jettag_c_otherwise_62_1.setTagInfo(_td_c_otherwise_62_1);
            _jettag_c_otherwise_62_1.doStart(context, out);
            JET2Writer _jettag_c_otherwise_62_1_saved_out = out;
            while (_jettag_c_otherwise_62_1.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_choose_63_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_63_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_choose_63_1.setRuntimeParent(_jettag_c_otherwise_62_1);
                _jettag_c_choose_63_1.setTagInfo(_td_c_choose_63_1);
                _jettag_c_choose_63_1.doStart(context, out);
                JET2Writer _jettag_c_choose_63_1_saved_out = out;
                while (_jettag_c_choose_63_1.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    RuntimeTagElement _jettag_c_when_64_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_64_1); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_when_64_1.setRuntimeParent(_jettag_c_choose_63_1);
                    _jettag_c_when_64_1.setTagInfo(_td_c_when_64_1);
                    _jettag_c_when_64_1.doStart(context, out);
                    JET2Writer _jettag_c_when_64_1_saved_out = out;
                    while (_jettag_c_when_64_1.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write("\t  messageDomainProperty=\"XMLNSC\"");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write("      messageSetProperty=\"");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_66_27 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_66_27); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_66_27.setRuntimeParent(_jettag_c_when_64_1);
                        _jettag_c_get_66_27.setTagInfo(_td_c_get_66_27);
                        _jettag_c_get_66_27.doStart(context, out);
                        _jettag_c_get_66_27.doEnd();
                        out.write("\">");  //$NON-NLS-1$        
                        out.write(NL);         
                        _jettag_c_when_64_1.handleBodyContent(out);
                    }
                    out = _jettag_c_when_64_1_saved_out;
                    _jettag_c_when_64_1.doEnd();
                    RuntimeTagElement _jettag_c_when_68_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_68_1); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_when_68_1.setRuntimeParent(_jettag_c_choose_63_1);
                    _jettag_c_when_68_1.setTagInfo(_td_c_when_68_1);
                    _jettag_c_when_68_1.doStart(context, out);
                    JET2Writer _jettag_c_when_68_1_saved_out = out;
                    while (_jettag_c_when_68_1.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write("\t  messageDomainProperty=\"MIME\">");  //$NON-NLS-1$        
                        out.write(NL);         
                        _jettag_c_when_68_1.handleBodyContent(out);
                    }
                    out = _jettag_c_when_68_1_saved_out;
                    _jettag_c_when_68_1.doEnd();
                    RuntimeTagElement _jettag_c_when_71_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_71_1); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_when_71_1.setRuntimeParent(_jettag_c_choose_63_1);
                    _jettag_c_when_71_1.setTagInfo(_td_c_when_71_1);
                    _jettag_c_when_71_1.doStart(context, out);
                    JET2Writer _jettag_c_when_71_1_saved_out = out;
                    while (_jettag_c_when_71_1.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write("\t  messageDomainProperty=\"MRM\"");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write("      messageSetProperty=\"");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_73_27 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_73_27); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_73_27.setRuntimeParent(_jettag_c_when_71_1);
                        _jettag_c_get_73_27.setTagInfo(_td_c_get_73_27);
                        _jettag_c_get_73_27.doStart(context, out);
                        _jettag_c_get_73_27.doEnd();
                        out.write("\"");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write("      messageTypeProperty=\"");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_74_28 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_74_28); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_74_28.setRuntimeParent(_jettag_c_when_71_1);
                        _jettag_c_get_74_28.setTagInfo(_td_c_get_74_28);
                        _jettag_c_get_74_28.doStart(context, out);
                        _jettag_c_get_74_28.doEnd();
                        out.write("\"");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write("      messageFormatProperty=\"");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_75_30 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_75_30); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_75_30.setRuntimeParent(_jettag_c_when_71_1);
                        _jettag_c_get_75_30.setTagInfo(_td_c_get_75_30);
                        _jettag_c_get_75_30.doStart(context, out);
                        _jettag_c_get_75_30.doEnd();
                        out.write("\">");  //$NON-NLS-1$        
                        out.write(NL);         
                        _jettag_c_when_71_1.handleBodyContent(out);
                    }
                    out = _jettag_c_when_71_1_saved_out;
                    _jettag_c_when_71_1.doEnd();
                    RuntimeTagElement _jettag_c_when_77_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_77_1); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_when_77_1.setRuntimeParent(_jettag_c_choose_63_1);
                    _jettag_c_when_77_1.setTagInfo(_td_c_when_77_1);
                    _jettag_c_when_77_1.doStart(context, out);
                    JET2Writer _jettag_c_when_77_1_saved_out = out;
                    while (_jettag_c_when_77_1.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write("\t  messageDomainProperty=\"MRM\"");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write("      messageSetProperty=\"");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_79_27 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_79_27); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_79_27.setRuntimeParent(_jettag_c_when_77_1);
                        _jettag_c_get_79_27.setTagInfo(_td_c_get_79_27);
                        _jettag_c_get_79_27.doStart(context, out);
                        _jettag_c_get_79_27.doEnd();
                        out.write("\"");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write("      messageTypeProperty=\"");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_80_28 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_80_28); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_80_28.setRuntimeParent(_jettag_c_when_77_1);
                        _jettag_c_get_80_28.setTagInfo(_td_c_get_80_28);
                        _jettag_c_get_80_28.doStart(context, out);
                        _jettag_c_get_80_28.doEnd();
                        out.write("\"");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write("      messageFormatProperty=\"");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_81_30 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_81_30); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_81_30.setRuntimeParent(_jettag_c_when_77_1);
                        _jettag_c_get_81_30.setTagInfo(_td_c_get_81_30);
                        _jettag_c_get_81_30.doStart(context, out);
                        _jettag_c_get_81_30.doEnd();
                        out.write("\">   ");  //$NON-NLS-1$        
                        out.write(NL);         
                        _jettag_c_when_77_1.handleBodyContent(out);
                    }
                    out = _jettag_c_when_77_1_saved_out;
                    _jettag_c_when_77_1.doEnd();
                    _jettag_c_choose_63_1.handleBodyContent(out);
                }
                out = _jettag_c_choose_63_1_saved_out;
                _jettag_c_choose_63_1.doEnd();
                _jettag_c_otherwise_62_1.handleBodyContent(out);
            }
            out = _jettag_c_otherwise_62_1_saved_out;
            _jettag_c_otherwise_62_1.doEnd();
            _jettag_c_choose_58_1.handleBodyContent(out);
        }
        out = _jettag_c_choose_58_1_saved_out;
        _jettag_c_choose_58_1.doEnd();
        out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"Read Request\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <nodes xmi:type=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_88_24 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_88_24); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_88_24.setRuntimeParent(null);
        _jettag_c_get_88_24.setTagInfo(_td_c_get_88_24);
        _jettag_c_get_88_24.doStart(context, out);
        _jettag_c_get_88_24.doEnd();
        RuntimeTagElement _jettag_c_get_88_62 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_88_62); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_88_62.setRuntimeParent(null);
        _jettag_c_get_88_62.setTagInfo(_td_c_get_88_62);
        _jettag_c_get_88_62.doStart(context, out);
        _jettag_c_get_88_62.doEnd();
        out.write(".subflow:FCMComposite_1\" xmi:id=\"FCMComposite_1_34\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        location=\"367,126\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"Request Processor\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <nodes xmi:type=\"ComIbmMQHeader.msgnode:FCMComposite_1\" xmi:id=\"FCMComposite_1_2\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      location=\"487,126\" mqmdAAAOptions=\"Modify header\" mqmdCodedCharSetId=\"Inherit\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      mqmdFormat=\"Inherit\"   mqmdMsgType=\"MQMT_REQUEST\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      mqmdExpiry=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_95_19 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_95_19); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_95_19.setRuntimeParent(null);
        _jettag_c_get_95_19.setTagInfo(_td_c_get_95_19);
        _jettag_c_get_95_19.doStart(context, out);
        _jettag_c_get_95_19.doEnd();
        out.write("\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      mqmdFeedback=\"Inherit\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      mqmdMsgId=\"Inherit\" mqmdCorrelId=\"Inherit\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      mqmdReplyToQ=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_98_21 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_98_21); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_98_21.setRuntimeParent(null);
        _jettag_c_get_98_21.setTagInfo(_td_c_get_98_21);
        _jettag_c_get_98_21.doStart(context, out);
        _jettag_c_get_98_21.doEnd();
        RuntimeTagElement _jettag_c_get_98_58 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_98_58); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_98_58.setRuntimeParent(null);
        _jettag_c_get_98_58.setTagInfo(_td_c_get_98_58);
        _jettag_c_get_98_58.doStart(context, out);
        _jettag_c_get_98_58.doEnd();
        RuntimeTagElement _jettag_c_get_98_95 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_98_95); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_98_95.setRuntimeParent(null);
        _jettag_c_get_98_95.setTagInfo(_td_c_get_98_95);
        _jettag_c_get_98_95.doStart(context, out);
        _jettag_c_get_98_95.doEnd();
        out.write("\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      mqmdReplyToQMgr=\"$Environment/Variables/BrokerQueueManager\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <translation xmi:type=\"utility:ConstantString\" string=\"Add Reply Address\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <nodes xmi:type=\"ComIbmMQOutput.msgnode:FCMComposite_1\" xmi:id=\"FCMComposite_1_4\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      location=\"600,130\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      queueManagerName=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_104_25 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_104_25); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_104_25.setRuntimeParent(null);
        _jettag_c_get_104_25.setTagInfo(_td_c_get_104_25);
        _jettag_c_get_104_25.doStart(context, out);
        _jettag_c_get_104_25.doEnd();
        out.write("\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      queueName=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_105_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_105_18); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_105_18.setRuntimeParent(null);
        _jettag_c_get_105_18.setTagInfo(_td_c_get_105_18);
        _jettag_c_get_105_18.doStart(context, out);
        _jettag_c_get_105_18.doEnd();
        RuntimeTagElement _jettag_c_get_105_55 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_105_55); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_105_55.setRuntimeParent(null);
        _jettag_c_get_105_55.setTagInfo(_td_c_get_105_55);
        _jettag_c_get_105_55.doStart(context, out);
        _jettag_c_get_105_55.doEnd();
        RuntimeTagElement _jettag_c_get_106_37 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_106_37); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_106_37.setRuntimeParent(null);
        _jettag_c_get_106_37.setTagInfo(_td_c_get_106_37);
        _jettag_c_get_106_37.doStart(context, out);
        _jettag_c_get_106_37.doEnd();
        out.write("\"      ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      transactionMode=\"yes\" persistenceMode=\"yes\"  validateMaster=\"none\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <translation xmi:type=\"utility:ConstantString\" string=\"Propagate Request\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <nodes xmi:type=\"ComIbmCompute.msgnode:FCMComposite_1\" xmi:id=\"FCMComposite_1_7\" location=\"246,22\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      computeExpression=\"esql://routine/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_111_41 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_111_41); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_111_41.setRuntimeParent(null);
        _jettag_c_get_111_41.setTagInfo(_td_c_get_111_41);
        _jettag_c_get_111_41.doStart(context, out);
        _jettag_c_get_111_41.doEnd();
        out.write("#ExtractOriginalMQMD.Main\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"Extract Original MQMD\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <nodes xmi:type=\"ComIbmMQHeader.msgnode:FCMComposite_1\" xmi:id=\"FCMComposite_1_8\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      location=\"480,23\" mqmdAAAOptions=\"Modify header\" mqmdCodedCharSetId=\"Inherit\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      mqmdFormat=\"Inherit\" mqmdMsgType=\"Inherit\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t  mqmdExpiry= \"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_117_17 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_117_17); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_117_17.setRuntimeParent(null);
        _jettag_c_get_117_17.setTagInfo(_td_c_get_117_17);
        _jettag_c_get_117_17.doStart(context, out);
        _jettag_c_get_117_17.doEnd();
        out.write("\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      mqmdFeedback=\"Inherit\" mqmdMsgId=\"Inherit\" mqmdCorrelId=\"Inherit\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      mqmdReplyToQ=\"Inherit\" mqmdReplyToQMgr=\"Inherit\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"Store Reply Address\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <nodes xmi:type=\"ComIbmMQOutput.msgnode:FCMComposite_1\" xmi:id=\"FCMComposite_1_9\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      location=\"600,27\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tqueueName=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_124_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_124_13); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_124_13.setRuntimeParent(null);
        _jettag_c_get_124_13.setTagInfo(_td_c_get_124_13);
        _jettag_c_get_124_13.doStart(context, out);
        _jettag_c_get_124_13.doEnd();
        RuntimeTagElement _jettag_c_get_124_51 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_124_51); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_124_51.setRuntimeParent(null);
        _jettag_c_get_124_51.setTagInfo(_td_c_get_124_51);
        _jettag_c_get_124_51.doStart(context, out);
        _jettag_c_get_124_51.doEnd();
        RuntimeTagElement _jettag_c_get_124_85 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_124_85); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_124_85.setRuntimeParent(null);
        _jettag_c_get_124_85.setTagInfo(_td_c_get_124_85);
        _jettag_c_get_124_85.doStart(context, out);
        _jettag_c_get_124_85.doEnd();
        out.write("\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("   ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      transactionMode=\"yes\" persistenceMode=\"yes\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"Save to Store\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <nodes xmi:type=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_131_24 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_131_24); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_131_24.setRuntimeParent(null);
        _jettag_c_get_131_24.setTagInfo(_td_c_get_131_24);
        _jettag_c_get_131_24.doStart(context, out);
        _jettag_c_get_131_24.doEnd();
        RuntimeTagElement _jettag_c_get_131_62 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_131_62); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_131_62.setRuntimeParent(null);
        _jettag_c_get_131_62.setTagInfo(_td_c_get_131_62);
        _jettag_c_get_131_62.doStart(context, out);
        _jettag_c_get_131_62.doEnd();
        out.write(".subflow:FCMComposite_1\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      xmi:id=\"FCMComposite_1_5\" location=\"241,279\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"Error\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <nodes xmi:type=\"ComIbmCompute.msgnode:FCMComposite_1\" xmi:id=\"FCMComposite_1_10\" location=\"90,278\" computeExpression=\"esql://routine/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_135_141 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_135_141); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_135_141.setRuntimeParent(null);
        _jettag_c_get_135_141.setTagInfo(_td_c_get_135_141);
        _jettag_c_get_135_141.doStart(context, out);
        _jettag_c_get_135_141.doEnd();
        out.write("#Request_Initialise.Main\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"Set Request Mode\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_138_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_138_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_138_1.setRuntimeParent(null);
        _jettag_c_if_138_1.setTagInfo(_td_c_if_138_1);
        _jettag_c_if_138_1.doStart(context, out);
        while (_jettag_c_if_138_1.okToProcessBody()) {
            out.write("      <nodes xmi:type=\"ComIbmFlowOrder.msgnode:FCMComposite_1\" xmi:id=\"FCMComposite_1_36\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      location=\"230,126\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"Log after processing\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      </nodes>      ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      <nodes xmi:type=\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_143_24 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_143_24); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_143_24.setRuntimeParent(_jettag_c_if_138_1);
            _jettag_c_get_143_24.setTagInfo(_td_c_get_143_24);
            _jettag_c_get_143_24.doStart(context, out);
            _jettag_c_get_143_24.doEnd();
            RuntimeTagElement _jettag_c_get_143_62 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_143_62); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_143_62.setRuntimeParent(_jettag_c_if_138_1);
            _jettag_c_get_143_62.setTagInfo(_td_c_get_143_62);
            _jettag_c_get_143_62.doStart(context, out);
            _jettag_c_get_143_62.doEnd();
            out.write(".subflow:FCMComposite_1\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      xmi:id=\"FCMComposite_1_6\" location=\"399,259\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"Log\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      </nodes>");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_138_1.handleBodyContent(out);
        }
        _jettag_c_if_138_1.doEnd();
        out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_3\" targetNode=\"FCMComposite_1_3\" sourceNode=\"FCMComposite_1_1\" sourceTerminalName=\"OutTerminal.out\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_4\" targetNode=\"FCMComposite_1_2\" sourceNode=\"FCMComposite_1_34\" sourceTerminalName=\"OutTerminal.Output\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_5\" targetNode=\"FCMComposite_1_7\" sourceNode=\"FCMComposite_1_3\" sourceTerminalName=\"OutTerminal.first\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_6\" targetNode=\"FCMComposite_1_8\" sourceNode=\"FCMComposite_1_7\" sourceTerminalName=\"OutTerminal.out\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_7\" targetNode=\"FCMComposite_1_9\" sourceNode=\"FCMComposite_1_8\" sourceTerminalName=\"OutTerminal.out\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_8\" targetNode=\"FCMComposite_1_4\" sourceNode=\"FCMComposite_1_2\" sourceTerminalName=\"OutTerminal.out\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_11\" targetNode=\"FCMComposite_1_10\" sourceNode=\"FCMComposite_1_1\" sourceTerminalName=\"OutTerminal.failure\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_9\" targetNode=\"FCMComposite_1_10\" sourceNode=\"FCMComposite_1_1\" sourceTerminalName=\"OutTerminal.catch\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_10\" targetNode=\"FCMComposite_1_5\" sourceNode=\"FCMComposite_1_10\" sourceTerminalName=\"OutTerminal.out\" targetTerminalName=\"InTerminal.Input\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_choose_157_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_157_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_choose_157_1.setRuntimeParent(null);
        _jettag_c_choose_157_1.setTagInfo(_td_c_choose_157_1);
        _jettag_c_choose_157_1.doStart(context, out);
        JET2Writer _jettag_c_choose_157_1_saved_out = out;
        while (_jettag_c_choose_157_1.okToProcessBody()) {
            out = out.newNestedContentWriter();
            RuntimeTagElement _jettag_c_when_158_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_158_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_when_158_1.setRuntimeParent(_jettag_c_choose_157_1);
            _jettag_c_when_158_1.setTagInfo(_td_c_when_158_1);
            _jettag_c_when_158_1.doStart(context, out);
            JET2Writer _jettag_c_when_158_1_saved_out = out;
            while (_jettag_c_when_158_1.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_2\" targetNode=\"FCMComposite_1_36\" sourceNode=\"FCMComposite_1_3\" sourceTerminalName=\"OutTerminal.second\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_1\" targetNode=\"FCMComposite_1_34\" sourceNode=\"FCMComposite_1_36\" sourceTerminalName=\"OutTerminal.first\" targetTerminalName=\"InTerminal.Input\"/>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_12\" targetNode=\"FCMComposite_1_6\" sourceNode=\"FCMComposite_1_36\" sourceTerminalName=\"OutTerminal.second\" targetTerminalName=\"InTerminal.Input\"/>");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_when_158_1.handleBodyContent(out);
            }
            out = _jettag_c_when_158_1_saved_out;
            _jettag_c_when_158_1.doEnd();
            RuntimeTagElement _jettag_c_otherwise_163_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_163_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_otherwise_163_1.setRuntimeParent(_jettag_c_choose_157_1);
            _jettag_c_otherwise_163_1.setTagInfo(_td_c_otherwise_163_1);
            _jettag_c_otherwise_163_1.doStart(context, out);
            JET2Writer _jettag_c_otherwise_163_1_saved_out = out;
            while (_jettag_c_otherwise_163_1.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_2\" targetNode=\"FCMComposite_1_34\" sourceNode=\"FCMComposite_1_3\" sourceTerminalName=\"OutTerminal.second\" targetTerminalName=\"InTerminal.Input\"/>");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_otherwise_163_1.handleBodyContent(out);
            }
            out = _jettag_c_otherwise_163_1_saved_out;
            _jettag_c_otherwise_163_1.doEnd();
            _jettag_c_choose_157_1.handleBodyContent(out);
        }
        out = _jettag_c_choose_157_1_saved_out;
        _jettag_c_choose_157_1.doEnd();
        out.write("</composition>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <propertyOrganizer>");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_169_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_169_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_169_1.setRuntimeParent(null);
        _jettag_c_if_169_1.setTagInfo(_td_c_if_169_1);
        _jettag_c_if_169_1.doStart(context, out);
        while (_jettag_c_if_169_1.okToProcessBody()) {
            out.write("      <propertyDescriptor groupName=\"Group.Basic\" configurable=\"true\" userDefined=\"true\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("          describedAttribute=\"Property.ErrorLoggingOn\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        <propertyName xmi:type=\"utility:TranslatableString\" key=\"Property.ErrorLoggingOn\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        bundleName=\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_173_21 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_173_21); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_173_21.setRuntimeParent(_jettag_c_if_169_1);
            _jettag_c_get_173_21.setTagInfo(_td_c_get_173_21);
            _jettag_c_get_173_21.doStart(context, out);
            _jettag_c_get_173_21.doEnd();
            RuntimeTagElement _jettag_c_get_173_59 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_173_59); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_173_59.setRuntimeParent(_jettag_c_if_169_1);
            _jettag_c_get_173_59.setTagInfo(_td_c_get_173_59);
            _jettag_c_get_173_59.doStart(context, out);
            _jettag_c_get_173_59.doEnd();
            out.write("\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        pluginId=\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_174_19 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_174_19); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_174_19.setRuntimeParent(_jettag_c_if_169_1);
            _jettag_c_get_174_19.setTagInfo(_td_c_get_174_19);
            _jettag_c_get_174_19.doStart(context, out);
            _jettag_c_get_174_19.doEnd();
            out.write("\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_169_1.handleBodyContent(out);
        }
        _jettag_c_if_169_1.doEnd();
        RuntimeTagElement _jettag_c_if_176_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_176_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_176_1.setRuntimeParent(null);
        _jettag_c_if_176_1.setTagInfo(_td_c_if_176_1);
        _jettag_c_if_176_1.doStart(context, out);
        while (_jettag_c_if_176_1.okToProcessBody()) {
            out.write("        <propertyDescriptor groupName=\"Group.Basic\" configurable=\"true\" userDefined=\"true\" describedAttribute=\"Property.RequestLoggingOn\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("          <propertyName xmi:type=\"utility:TranslatableString\" key=\"Property.RequestLoggingOn\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("          bundleName=\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_179_23 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_179_23); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_179_23.setRuntimeParent(_jettag_c_if_176_1);
            _jettag_c_get_179_23.setTagInfo(_td_c_get_179_23);
            _jettag_c_get_179_23.doStart(context, out);
            _jettag_c_get_179_23.doEnd();
            RuntimeTagElement _jettag_c_get_179_61 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_179_61); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_179_61.setRuntimeParent(_jettag_c_if_176_1);
            _jettag_c_get_179_61.setTagInfo(_td_c_get_179_61);
            _jettag_c_get_179_61.doStart(context, out);
            _jettag_c_get_179_61.doEnd();
            out.write("\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("          pluginId=\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_180_21 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_180_21); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_180_21.setRuntimeParent(_jettag_c_if_176_1);
            _jettag_c_get_180_21.setTagInfo(_td_c_get_180_21);
            _jettag_c_get_180_21.doStart(context, out);
            _jettag_c_get_180_21.doEnd();
            out.write("\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        </propertyDescriptor>");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_176_1.handleBodyContent(out);
        }
        _jettag_c_if_176_1.doEnd();
        RuntimeTagElement _jettag_c_if_183_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_183_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_183_1.setRuntimeParent(null);
        _jettag_c_if_183_1.setTagInfo(_td_c_if_183_1);
        _jettag_c_if_183_1.doStart(context, out);
        while (_jettag_c_if_183_1.okToProcessBody()) {
            out.write("      </propertyDescriptor>");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_183_1.handleBodyContent(out);
        }
        _jettag_c_if_183_1.doEnd();
        out.write("    </propertyOrganizer>");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_187_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_187_5); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_187_5.setRuntimeParent(null);
        _jettag_c_if_187_5.setTagInfo(_td_c_if_187_5);
        _jettag_c_if_187_5.doStart(context, out);
        while (_jettag_c_if_187_5.okToProcessBody()) {
            out.write("      <attributeLinks promotedAttribute=\"Property.ErrorLoggingOn\" overriddenNodes=\"FCMComposite_1_5\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      <overriddenAttribute href=\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_189_34 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_189_34); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_189_34.setRuntimeParent(_jettag_c_if_187_5);
            _jettag_c_get_189_34.setTagInfo(_td_c_get_189_34);
            _jettag_c_get_189_34.doStart(context, out);
            _jettag_c_get_189_34.doEnd();
            RuntimeTagElement _jettag_c_get_189_72 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_189_72); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_189_72.setRuntimeParent(_jettag_c_if_187_5);
            _jettag_c_get_189_72.setTagInfo(_td_c_get_189_72);
            _jettag_c_get_189_72.doStart(context, out);
            _jettag_c_get_189_72.doEnd();
            out.write(".subflow#Property.ErrorLoggingOn\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    </attributeLinks>");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_187_5.handleBodyContent(out);
        }
        _jettag_c_if_187_5.doEnd();
        out.write("  </eClassifiers>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("</ecore:EPackage>");  //$NON-NLS-1$        
        out.write(NL);         
    }
}
