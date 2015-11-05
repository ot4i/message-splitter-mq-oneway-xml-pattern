package org.eclipse.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_main_2 implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$
    private static final String _jetns_ws = "org.eclipse.jet.workspaceTags"; //$NON-NLS-1$

    public _jet_main_2() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_setVariable_8_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            8, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "/*", //$NON-NLS-1$
                "root", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_10_1 = new TagInfo("c:if", //$NON-NLS-1$
            10, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "boolean($root/maximumResponseTime) = false", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_log_11_2 = new TagInfo("c:log", //$NON-NLS-1$
            11, 2,
            new String[] {
                "severity", //$NON-NLS-1$
            },
            new String[] {
                "error", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_16_1 = new TagInfo("c:set", //$NON-NLS-1$
            16, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "mqmdExpiry", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_16_41 = new TagInfo("c:get", //$NON-NLS-1$
            16, 41,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/maximumResponseTime", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_17_1 = new TagInfo("c:choose", //$NON-NLS-1$
            17, 1,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_18_2 = new TagInfo("c:when", //$NON-NLS-1$
            18, 2,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/maximumResponseTime = 'MQEI_UNLIMITED'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_when_19_2 = new TagInfo("c:when", //$NON-NLS-1$
            19, 2,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/maximumResponseTime > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_20_3 = new TagInfo("c:if", //$NON-NLS-1$
            20, 3,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/maximumResponseTime > 9999999999", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_21_4 = new TagInfo("c:set", //$NON-NLS-1$
            21, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "mqmdExpiry", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_24_1 = new TagInfo("c:otherwise", //$NON-NLS-1$
            24, 1,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_log_25_2 = new TagInfo("c:log", //$NON-NLS-1$
            25, 2,
            new String[] {
                "severity", //$NON-NLS-1$
            },
            new String[] {
                "error", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_33_1 = new TagInfo("c:if", //$NON-NLS-1$
            33, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "boolean($isMessageSetValid) = false", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_log_34_2 = new TagInfo("c:log", //$NON-NLS-1$
            34, 2,
            new String[] {
                "severity", //$NON-NLS-1$
            },
            new String[] {
                "error", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_41_1 = new TagInfo("c:set", //$NON-NLS-1$
            41, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "projectname", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_41_42 = new TagInfo("c:get", //$NON-NLS-1$
            41, 42,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/instanceName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_42_1 = new TagInfo("c:set", //$NON-NLS-1$
            42, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "patternName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_42_42 = new TagInfo("c:get", //$NON-NLS-1$
            42, 42,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "namespace-uri($root)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_43_1 = new TagInfo("c:set", //$NON-NLS-1$
            43, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "patternVersion", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_46_1 = new TagInfo("c:set", //$NON-NLS-1$
            46, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "request", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_46_38 = new TagInfo("c:get", //$NON-NLS-1$
            46, 38,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/flowprefix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_46_79 = new TagInfo("c:get", //$NON-NLS-1$
            46, 79,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/flowsuffix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_47_1 = new TagInfo("c:set", //$NON-NLS-1$
            47, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "requestprocessor", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_47_47 = new TagInfo("c:get", //$NON-NLS-1$
            47, 47,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/flowprefix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_47_97 = new TagInfo("c:get", //$NON-NLS-1$
            47, 97,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/flowsuffix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_48_1 = new TagInfo("c:set", //$NON-NLS-1$
            48, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "response", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_48_39 = new TagInfo("c:get", //$NON-NLS-1$
            48, 39,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/flowprefix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_48_81 = new TagInfo("c:get", //$NON-NLS-1$
            48, 81,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/flowsuffix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_49_1 = new TagInfo("c:set", //$NON-NLS-1$
            49, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "responseprocessor", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_49_48 = new TagInfo("c:get", //$NON-NLS-1$
            49, 48,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/flowprefix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_49_99 = new TagInfo("c:get", //$NON-NLS-1$
            49, 99,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/flowsuffix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_50_1 = new TagInfo("c:set", //$NON-NLS-1$
            50, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "error", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_50_36 = new TagInfo("c:get", //$NON-NLS-1$
            50, 36,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/flowprefix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_50_75 = new TagInfo("c:get", //$NON-NLS-1$
            50, 75,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/flowsuffix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_51_1 = new TagInfo("c:set", //$NON-NLS-1$
            51, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "log", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_51_34 = new TagInfo("c:get", //$NON-NLS-1$
            51, 34,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/flowprefix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_51_71 = new TagInfo("c:get", //$NON-NLS-1$
            51, 71,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/flowsuffix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_52_1 = new TagInfo("c:set", //$NON-NLS-1$
            52, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "queueprefix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_52_42 = new TagInfo("c:get", //$NON-NLS-1$
            52, 42,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/queueprefix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_53_1 = new TagInfo("c:set", //$NON-NLS-1$
            53, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "queuesuffix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_53_42 = new TagInfo("c:get", //$NON-NLS-1$
            53, 42,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/queuesuffix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_project_57_1 = new TagInfo("ws:project", //$NON-NLS-1$
            57, 1,
            new String[] {
                "name", //$NON-NLS-1$
            },
            new String[] {
                "{$root/instanceName}", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_58_2 = new TagInfo("ws:file", //$NON-NLS-1$
            58, 2,
            new String[] {
                "encoding", //$NON-NLS-1$
                "path", //$NON-NLS-1$
                "replace", //$NON-NLS-1$
                "template", //$NON-NLS-1$
            },
            new String[] {
                "UTF-8", //$NON-NLS-1$
                "{$patternConfigurationFolderName}/{$root/instanceName}_summary.html", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "mbi/mrrc/relmq/templates/root/summary.html.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_60_2 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            60, 2,
            new String[] {
                "src", //$NON-NLS-1$
                "srcContext", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "css/summary.css", //$NON-NLS-1$
                "transform", //$NON-NLS-1$
                "{$patternConfigurationFolderName}/summary.css", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_folder_63_2 = new TagInfo("ws:folder", //$NON-NLS-1$
            63, 2,
            new String[] {
                "path", //$NON-NLS-1$
            },
            new String[] {
                "{$patternConfigurationFolderName}/icons", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_64_3 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            64, 3,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "srcContext", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "icons/header-gradient.gif", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "transform", //$NON-NLS-1$
                "header-gradient.gif", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_66_3 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            66, 3,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "srcContext", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "icons/section.gif", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "transform", //$NON-NLS-1$
                "section.gif", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_68_3 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            68, 3,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "srcContext", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "icons/summary-title.gif", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "transform", //$NON-NLS-1$
                "summary-title.gif", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_70_3 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            70, 3,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "srcContext", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "icons/title-gradient.gif", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "transform", //$NON-NLS-1$
                "title-gradient.gif", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_project_75_1 = new TagInfo("ws:project", //$NON-NLS-1$
            75, 1,
            new String[] {
                "name", //$NON-NLS-1$
            },
            new String[] {
                "{$root/@projectname}", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_76_2 = new TagInfo("ws:file", //$NON-NLS-1$
            76, 2,
            new String[] {
                "encoding", //$NON-NLS-1$
                "path", //$NON-NLS-1$
                "replace", //$NON-NLS-1$
                "template", //$NON-NLS-1$
            },
            new String[] {
                "UTF-8", //$NON-NLS-1$
                ".project", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "mbi/mrrc/relmq/templates/root/project.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_77_4 = new TagInfo("ws:file", //$NON-NLS-1$
            77, 4,
            new String[] {
                "encoding", //$NON-NLS-1$
                "path", //$NON-NLS-1$
                "replace", //$NON-NLS-1$
                "template", //$NON-NLS-1$
            },
            new String[] {
                "UTF-8", //$NON-NLS-1$
                "{$root/@brokerSchema2}Error.esql", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "mbi/mrrc/relmq/templates/root/Error.esql.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_78_4 = new TagInfo("ws:file", //$NON-NLS-1$
            78, 4,
            new String[] {
                "encoding", //$NON-NLS-1$
                "path", //$NON-NLS-1$
                "replace", //$NON-NLS-1$
                "template", //$NON-NLS-1$
            },
            new String[] {
                "UTF-8", //$NON-NLS-1$
                "{$root/@brokerSchema2}{$root/@error}.subflow", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "mbi/mrrc/relmq/templates/root/Error.subflow.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_80_2 = new TagInfo("c:if", //$NON-NLS-1$
            80, 2,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/loggingRequired = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_81_3 = new TagInfo("ws:file", //$NON-NLS-1$
            81, 3,
            new String[] {
                "encoding", //$NON-NLS-1$
                "path", //$NON-NLS-1$
                "replace", //$NON-NLS-1$
                "template", //$NON-NLS-1$
            },
            new String[] {
                "UTF-8", //$NON-NLS-1$
                "{$root/@brokerSchema2}Log.esql", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "mbi/mrrc/relmq/templates/root/Log.esql.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_82_5 = new TagInfo("ws:file", //$NON-NLS-1$
            82, 5,
            new String[] {
                "encoding", //$NON-NLS-1$
                "path", //$NON-NLS-1$
                "replace", //$NON-NLS-1$
                "template", //$NON-NLS-1$
            },
            new String[] {
                "UTF-8", //$NON-NLS-1$
                "{$root/@brokerSchema2}{$root/@log}.subflow", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "mbi/mrrc/relmq/templates/root/Log.subflow.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_85_2 = new TagInfo("ws:file", //$NON-NLS-1$
            85, 2,
            new String[] {
                "encoding", //$NON-NLS-1$
                "path", //$NON-NLS-1$
                "replace", //$NON-NLS-1$
                "template", //$NON-NLS-1$
            },
            new String[] {
                "UTF-8", //$NON-NLS-1$
                "{$root/@brokerSchema2}{$root/@request}.msgflow", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "mbi/mrrc/relmq/templates/root/Request.msgflow.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_86_2 = new TagInfo("ws:file", //$NON-NLS-1$
            86, 2,
            new String[] {
                "encoding", //$NON-NLS-1$
                "path", //$NON-NLS-1$
                "replace", //$NON-NLS-1$
                "template", //$NON-NLS-1$
            },
            new String[] {
                "UTF-8", //$NON-NLS-1$
                "{$root/@brokerSchema2}{$root/@requestprocessor}.subflow", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "mbi/mrrc/relmq/templates/root/RequestProcessor.subflow.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_87_2 = new TagInfo("ws:file", //$NON-NLS-1$
            87, 2,
            new String[] {
                "encoding", //$NON-NLS-1$
                "path", //$NON-NLS-1$
                "replace", //$NON-NLS-1$
                "template", //$NON-NLS-1$
            },
            new String[] {
                "UTF-8", //$NON-NLS-1$
                "{$root/@brokerSchema2}{$root/@response}.msgflow", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "mbi/mrrc/relmq/templates/root/Response.msgflow.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_88_2 = new TagInfo("ws:file", //$NON-NLS-1$
            88, 2,
            new String[] {
                "encoding", //$NON-NLS-1$
                "path", //$NON-NLS-1$
                "replace", //$NON-NLS-1$
                "template", //$NON-NLS-1$
            },
            new String[] {
                "UTF-8", //$NON-NLS-1$
                "{$root/@brokerSchema2}{$root/@responseprocessor}.subflow", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "mbi/mrrc/relmq/templates/root/ResponseProcessor.subflow.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_89_2 = new TagInfo("ws:file", //$NON-NLS-1$
            89, 2,
            new String[] {
                "encoding", //$NON-NLS-1$
                "path", //$NON-NLS-1$
                "replace", //$NON-NLS-1$
                "template", //$NON-NLS-1$
            },
            new String[] {
                "UTF-8", //$NON-NLS-1$
                "{$root/@brokerSchema2}Intermediary.esql", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "mbi/mrrc/relmq/templates/root/Intermediary.esql.jet", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;

com.ibm.etools.mft.pattern.mbi.plugin.PatternPlugin pattern = com.ibm.etools.mft.pattern.mbi.plugin.PatternPlugin.getInstance();
com.ibm.etools.mft.pattern.mbi.mrrc.relmq.PatternMessages messages = new com.ibm.etools.mft.pattern.mbi.mrrc.relmq.PatternMessages();

        out.write(NL);         
        // Define variables the root element in the model 
        RuntimeTagElement _jettag_c_setVariable_8_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_8_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_8_1.setRuntimeParent(null);
        _jettag_c_setVariable_8_1.setTagInfo(_td_c_setVariable_8_1);
        _jettag_c_setVariable_8_1.doStart(context, out);
        _jettag_c_setVariable_8_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_10_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_10_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_10_1.setRuntimeParent(null);
        _jettag_c_if_10_1.setTagInfo(_td_c_if_10_1);
        _jettag_c_if_10_1.doStart(context, out);
        while (_jettag_c_if_10_1.okToProcessBody()) {
            RuntimeTagElement _jettag_c_log_11_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "log", "c:log", _td_c_log_11_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_log_11_2.setRuntimeParent(_jettag_c_if_10_1);
            _jettag_c_log_11_2.setTagInfo(_td_c_log_11_2);
            _jettag_c_log_11_2.doStart(context, out);
            JET2Writer _jettag_c_log_11_2_saved_out = out;
            while (_jettag_c_log_11_2.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("\t    ");  //$NON-NLS-1$        
                out.write( pattern.getString("com.ibm.etools.mft.pattern.mbi.mrrc.relmq.jet.1") );
                out.write(NL);         
                _jettag_c_log_11_2.handleBodyContent(out);
            }
            out = _jettag_c_log_11_2_saved_out;
            _jettag_c_log_11_2.doEnd();
     if (true) return; 
            _jettag_c_if_10_1.handleBodyContent(out);
        }
        _jettag_c_if_10_1.doEnd();
        RuntimeTagElement _jettag_c_set_16_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_16_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_set_16_1.setRuntimeParent(null);
        _jettag_c_set_16_1.setTagInfo(_td_c_set_16_1);
        _jettag_c_set_16_1.doStart(context, out);
        JET2Writer _jettag_c_set_16_1_saved_out = out;
        while (_jettag_c_set_16_1.okToProcessBody()) {
            out = out.newNestedContentWriter();
            RuntimeTagElement _jettag_c_get_16_41 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_16_41); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_16_41.setRuntimeParent(_jettag_c_set_16_1);
            _jettag_c_get_16_41.setTagInfo(_td_c_get_16_41);
            _jettag_c_get_16_41.doStart(context, out);
            _jettag_c_get_16_41.doEnd();
            _jettag_c_set_16_1.handleBodyContent(out);
        }
        out = _jettag_c_set_16_1_saved_out;
        _jettag_c_set_16_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_c_choose_17_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_17_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_choose_17_1.setRuntimeParent(null);
        _jettag_c_choose_17_1.setTagInfo(_td_c_choose_17_1);
        _jettag_c_choose_17_1.doStart(context, out);
        JET2Writer _jettag_c_choose_17_1_saved_out = out;
        while (_jettag_c_choose_17_1.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.write("\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_when_18_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_18_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_when_18_2.setRuntimeParent(_jettag_c_choose_17_1);
            _jettag_c_when_18_2.setTagInfo(_td_c_when_18_2);
            _jettag_c_when_18_2.doStart(context, out);
            JET2Writer _jettag_c_when_18_2_saved_out = out;
            while (_jettag_c_when_18_2.okToProcessBody()) {
                out = out.newNestedContentWriter();
                _jettag_c_when_18_2.handleBodyContent(out);
            }
            out = _jettag_c_when_18_2_saved_out;
            _jettag_c_when_18_2.doEnd();
            out.write(NL);         
            RuntimeTagElement _jettag_c_when_19_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_19_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_when_19_2.setRuntimeParent(_jettag_c_choose_17_1);
            _jettag_c_when_19_2.setTagInfo(_td_c_when_19_2);
            _jettag_c_when_19_2.doStart(context, out);
            JET2Writer _jettag_c_when_19_2_saved_out = out;
            while (_jettag_c_when_19_2.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_if_20_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_20_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_20_3.setRuntimeParent(_jettag_c_when_19_2);
                _jettag_c_if_20_3.setTagInfo(_td_c_if_20_3);
                _jettag_c_if_20_3.doStart(context, out);
                while (_jettag_c_if_20_3.okToProcessBody()) {
                    out.write("\t\t\t");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_set_21_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_21_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_set_21_4.setRuntimeParent(_jettag_c_if_20_3);
                    _jettag_c_set_21_4.setTagInfo(_td_c_set_21_4);
                    _jettag_c_set_21_4.doStart(context, out);
                    JET2Writer _jettag_c_set_21_4_saved_out = out;
                    while (_jettag_c_set_21_4.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write("999999999");  //$NON-NLS-1$        
                        _jettag_c_set_21_4.handleBodyContent(out);
                    }
                    out = _jettag_c_set_21_4_saved_out;
                    _jettag_c_set_21_4.doEnd();
                    out.write(NL);         
                    _jettag_c_if_20_3.handleBodyContent(out);
                }
                _jettag_c_if_20_3.doEnd();
                _jettag_c_when_19_2.handleBodyContent(out);
            }
            out = _jettag_c_when_19_2_saved_out;
            _jettag_c_when_19_2.doEnd();
            RuntimeTagElement _jettag_c_otherwise_24_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_24_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_otherwise_24_1.setRuntimeParent(_jettag_c_choose_17_1);
            _jettag_c_otherwise_24_1.setTagInfo(_td_c_otherwise_24_1);
            _jettag_c_otherwise_24_1.doStart(context, out);
            JET2Writer _jettag_c_otherwise_24_1_saved_out = out;
            while (_jettag_c_otherwise_24_1.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_log_25_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "log", "c:log", _td_c_log_25_2); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_log_25_2.setRuntimeParent(_jettag_c_otherwise_24_1);
                _jettag_c_log_25_2.setTagInfo(_td_c_log_25_2);
                _jettag_c_log_25_2.doStart(context, out);
                JET2Writer _jettag_c_log_25_2_saved_out = out;
                while (_jettag_c_log_25_2.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write("\t    ");  //$NON-NLS-1$        
                    out.write( pattern.getString("com.ibm.etools.mft.pattern.mbi.mrrc.relmq.jet.2") );
                    out.write(NL);         
                    _jettag_c_log_25_2.handleBodyContent(out);
                }
                out = _jettag_c_log_25_2_saved_out;
                _jettag_c_log_25_2.doEnd();
         if (true) return; 
                _jettag_c_otherwise_24_1.handleBodyContent(out);
            }
            out = _jettag_c_otherwise_24_1_saved_out;
            _jettag_c_otherwise_24_1.doEnd();
            _jettag_c_choose_17_1.handleBodyContent(out);
        }
        out = _jettag_c_choose_17_1_saved_out;
        _jettag_c_choose_17_1.doEnd();
        out.write(NL);         
 com.ibm.etools.mft.pattern.mbi.plugin.PatternUtility.checkMessageSetIsValidOrEmpty(context, "$root/responseMessageSet", "isMessageSetValid"); 
        RuntimeTagElement _jettag_c_if_33_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_33_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_33_1.setRuntimeParent(null);
        _jettag_c_if_33_1.setTagInfo(_td_c_if_33_1);
        _jettag_c_if_33_1.doStart(context, out);
        while (_jettag_c_if_33_1.okToProcessBody()) {
            RuntimeTagElement _jettag_c_log_34_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "log", "c:log", _td_c_log_34_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_log_34_2.setRuntimeParent(_jettag_c_if_33_1);
            _jettag_c_log_34_2.setTagInfo(_td_c_log_34_2);
            _jettag_c_log_34_2.doStart(context, out);
            JET2Writer _jettag_c_log_34_2_saved_out = out;
            while (_jettag_c_log_34_2.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("\t    ");  //$NON-NLS-1$        
                out.write( pattern.getString("com.ibm.etools.mft.pattern.mbi.mrrc.relmq.jet.3") );
                out.write(NL);         
                _jettag_c_log_34_2.handleBodyContent(out);
            }
            out = _jettag_c_log_34_2_saved_out;
            _jettag_c_log_34_2.doEnd();
     if (true) return; 
            _jettag_c_if_33_1.handleBodyContent(out);
        }
        _jettag_c_if_33_1.doEnd();
        out.write(NL);         
        // Set top level pattern characteristics 
        RuntimeTagElement _jettag_c_set_41_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_41_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_set_41_1.setRuntimeParent(null);
        _jettag_c_set_41_1.setTagInfo(_td_c_set_41_1);
        _jettag_c_set_41_1.doStart(context, out);
        JET2Writer _jettag_c_set_41_1_saved_out = out;
        while (_jettag_c_set_41_1.okToProcessBody()) {
            out = out.newNestedContentWriter();
            RuntimeTagElement _jettag_c_get_41_42 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_41_42); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_41_42.setRuntimeParent(_jettag_c_set_41_1);
            _jettag_c_get_41_42.setTagInfo(_td_c_get_41_42);
            _jettag_c_get_41_42.doStart(context, out);
            _jettag_c_get_41_42.doEnd();
            out.write("_Flows");  //$NON-NLS-1$        
            _jettag_c_set_41_1.handleBodyContent(out);
        }
        out = _jettag_c_set_41_1_saved_out;
        _jettag_c_set_41_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_c_set_42_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_42_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_set_42_1.setRuntimeParent(null);
        _jettag_c_set_42_1.setTagInfo(_td_c_set_42_1);
        _jettag_c_set_42_1.doStart(context, out);
        JET2Writer _jettag_c_set_42_1_saved_out = out;
        while (_jettag_c_set_42_1.okToProcessBody()) {
            out = out.newNestedContentWriter();
            RuntimeTagElement _jettag_c_get_42_42 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_42_42); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_42_42.setRuntimeParent(_jettag_c_set_42_1);
            _jettag_c_get_42_42.setTagInfo(_td_c_get_42_42);
            _jettag_c_get_42_42.doStart(context, out);
            _jettag_c_get_42_42.doEnd();
            _jettag_c_set_42_1.handleBodyContent(out);
        }
        out = _jettag_c_set_42_1_saved_out;
        _jettag_c_set_42_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_c_set_43_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_43_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_set_43_1.setRuntimeParent(null);
        _jettag_c_set_43_1.setTagInfo(_td_c_set_43_1);
        _jettag_c_set_43_1.doStart(context, out);
        JET2Writer _jettag_c_set_43_1_saved_out = out;
        while (_jettag_c_set_43_1.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.write("1.0");  //$NON-NLS-1$        
            _jettag_c_set_43_1.handleBodyContent(out);
        }
        out = _jettag_c_set_43_1_saved_out;
        _jettag_c_set_43_1.doEnd();
        out.write(NL);         
        out.write(NL);         
        // Make a name for each message flow 
        RuntimeTagElement _jettag_c_set_46_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_46_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_set_46_1.setRuntimeParent(null);
        _jettag_c_set_46_1.setTagInfo(_td_c_set_46_1);
        _jettag_c_set_46_1.doStart(context, out);
        JET2Writer _jettag_c_set_46_1_saved_out = out;
        while (_jettag_c_set_46_1.okToProcessBody()) {
            out = out.newNestedContentWriter();
            RuntimeTagElement _jettag_c_get_46_38 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_46_38); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_46_38.setRuntimeParent(_jettag_c_set_46_1);
            _jettag_c_get_46_38.setTagInfo(_td_c_get_46_38);
            _jettag_c_get_46_38.doStart(context, out);
            _jettag_c_get_46_38.doEnd();
            out.write("Request");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_46_79 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_46_79); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_46_79.setRuntimeParent(_jettag_c_set_46_1);
            _jettag_c_get_46_79.setTagInfo(_td_c_get_46_79);
            _jettag_c_get_46_79.doStart(context, out);
            _jettag_c_get_46_79.doEnd();
            _jettag_c_set_46_1.handleBodyContent(out);
        }
        out = _jettag_c_set_46_1_saved_out;
        _jettag_c_set_46_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_c_set_47_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_47_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_set_47_1.setRuntimeParent(null);
        _jettag_c_set_47_1.setTagInfo(_td_c_set_47_1);
        _jettag_c_set_47_1.doStart(context, out);
        JET2Writer _jettag_c_set_47_1_saved_out = out;
        while (_jettag_c_set_47_1.okToProcessBody()) {
            out = out.newNestedContentWriter();
            RuntimeTagElement _jettag_c_get_47_47 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_47_47); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_47_47.setRuntimeParent(_jettag_c_set_47_1);
            _jettag_c_get_47_47.setTagInfo(_td_c_get_47_47);
            _jettag_c_get_47_47.doStart(context, out);
            _jettag_c_get_47_47.doEnd();
            out.write("RequestProcessor");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_47_97 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_47_97); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_47_97.setRuntimeParent(_jettag_c_set_47_1);
            _jettag_c_get_47_97.setTagInfo(_td_c_get_47_97);
            _jettag_c_get_47_97.doStart(context, out);
            _jettag_c_get_47_97.doEnd();
            _jettag_c_set_47_1.handleBodyContent(out);
        }
        out = _jettag_c_set_47_1_saved_out;
        _jettag_c_set_47_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_c_set_48_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_48_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_set_48_1.setRuntimeParent(null);
        _jettag_c_set_48_1.setTagInfo(_td_c_set_48_1);
        _jettag_c_set_48_1.doStart(context, out);
        JET2Writer _jettag_c_set_48_1_saved_out = out;
        while (_jettag_c_set_48_1.okToProcessBody()) {
            out = out.newNestedContentWriter();
            RuntimeTagElement _jettag_c_get_48_39 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_48_39); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_48_39.setRuntimeParent(_jettag_c_set_48_1);
            _jettag_c_get_48_39.setTagInfo(_td_c_get_48_39);
            _jettag_c_get_48_39.doStart(context, out);
            _jettag_c_get_48_39.doEnd();
            out.write("Response");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_48_81 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_48_81); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_48_81.setRuntimeParent(_jettag_c_set_48_1);
            _jettag_c_get_48_81.setTagInfo(_td_c_get_48_81);
            _jettag_c_get_48_81.doStart(context, out);
            _jettag_c_get_48_81.doEnd();
            _jettag_c_set_48_1.handleBodyContent(out);
        }
        out = _jettag_c_set_48_1_saved_out;
        _jettag_c_set_48_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_c_set_49_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_49_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_set_49_1.setRuntimeParent(null);
        _jettag_c_set_49_1.setTagInfo(_td_c_set_49_1);
        _jettag_c_set_49_1.doStart(context, out);
        JET2Writer _jettag_c_set_49_1_saved_out = out;
        while (_jettag_c_set_49_1.okToProcessBody()) {
            out = out.newNestedContentWriter();
            RuntimeTagElement _jettag_c_get_49_48 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_49_48); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_49_48.setRuntimeParent(_jettag_c_set_49_1);
            _jettag_c_get_49_48.setTagInfo(_td_c_get_49_48);
            _jettag_c_get_49_48.doStart(context, out);
            _jettag_c_get_49_48.doEnd();
            out.write("ResponseProcessor");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_49_99 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_49_99); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_49_99.setRuntimeParent(_jettag_c_set_49_1);
            _jettag_c_get_49_99.setTagInfo(_td_c_get_49_99);
            _jettag_c_get_49_99.doStart(context, out);
            _jettag_c_get_49_99.doEnd();
            _jettag_c_set_49_1.handleBodyContent(out);
        }
        out = _jettag_c_set_49_1_saved_out;
        _jettag_c_set_49_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_c_set_50_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_50_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_set_50_1.setRuntimeParent(null);
        _jettag_c_set_50_1.setTagInfo(_td_c_set_50_1);
        _jettag_c_set_50_1.doStart(context, out);
        JET2Writer _jettag_c_set_50_1_saved_out = out;
        while (_jettag_c_set_50_1.okToProcessBody()) {
            out = out.newNestedContentWriter();
            RuntimeTagElement _jettag_c_get_50_36 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_50_36); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_50_36.setRuntimeParent(_jettag_c_set_50_1);
            _jettag_c_get_50_36.setTagInfo(_td_c_get_50_36);
            _jettag_c_get_50_36.doStart(context, out);
            _jettag_c_get_50_36.doEnd();
            out.write("Error");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_50_75 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_50_75); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_50_75.setRuntimeParent(_jettag_c_set_50_1);
            _jettag_c_get_50_75.setTagInfo(_td_c_get_50_75);
            _jettag_c_get_50_75.doStart(context, out);
            _jettag_c_get_50_75.doEnd();
            _jettag_c_set_50_1.handleBodyContent(out);
        }
        out = _jettag_c_set_50_1_saved_out;
        _jettag_c_set_50_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_c_set_51_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_51_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_set_51_1.setRuntimeParent(null);
        _jettag_c_set_51_1.setTagInfo(_td_c_set_51_1);
        _jettag_c_set_51_1.doStart(context, out);
        JET2Writer _jettag_c_set_51_1_saved_out = out;
        while (_jettag_c_set_51_1.okToProcessBody()) {
            out = out.newNestedContentWriter();
            RuntimeTagElement _jettag_c_get_51_34 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_51_34); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_51_34.setRuntimeParent(_jettag_c_set_51_1);
            _jettag_c_get_51_34.setTagInfo(_td_c_get_51_34);
            _jettag_c_get_51_34.doStart(context, out);
            _jettag_c_get_51_34.doEnd();
            out.write("Log");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_51_71 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_51_71); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_51_71.setRuntimeParent(_jettag_c_set_51_1);
            _jettag_c_get_51_71.setTagInfo(_td_c_get_51_71);
            _jettag_c_get_51_71.doStart(context, out);
            _jettag_c_get_51_71.doEnd();
            _jettag_c_set_51_1.handleBodyContent(out);
        }
        out = _jettag_c_set_51_1_saved_out;
        _jettag_c_set_51_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_c_set_52_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_52_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_set_52_1.setRuntimeParent(null);
        _jettag_c_set_52_1.setTagInfo(_td_c_set_52_1);
        _jettag_c_set_52_1.doStart(context, out);
        JET2Writer _jettag_c_set_52_1_saved_out = out;
        while (_jettag_c_set_52_1.okToProcessBody()) {
            out = out.newNestedContentWriter();
            RuntimeTagElement _jettag_c_get_52_42 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_52_42); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_52_42.setRuntimeParent(_jettag_c_set_52_1);
            _jettag_c_get_52_42.setTagInfo(_td_c_get_52_42);
            _jettag_c_get_52_42.doStart(context, out);
            _jettag_c_get_52_42.doEnd();
            _jettag_c_set_52_1.handleBodyContent(out);
        }
        out = _jettag_c_set_52_1_saved_out;
        _jettag_c_set_52_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_c_set_53_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_53_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_set_53_1.setRuntimeParent(null);
        _jettag_c_set_53_1.setTagInfo(_td_c_set_53_1);
        _jettag_c_set_53_1.doStart(context, out);
        JET2Writer _jettag_c_set_53_1_saved_out = out;
        while (_jettag_c_set_53_1.okToProcessBody()) {
            out = out.newNestedContentWriter();
            RuntimeTagElement _jettag_c_get_53_42 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_53_42); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_53_42.setRuntimeParent(_jettag_c_set_53_1);
            _jettag_c_get_53_42.setTagInfo(_td_c_get_53_42);
            _jettag_c_get_53_42.doStart(context, out);
            _jettag_c_get_53_42.doEnd();
            _jettag_c_set_53_1.handleBodyContent(out);
        }
        out = _jettag_c_set_53_1_saved_out;
        _jettag_c_set_53_1.doEnd();
        out.write(NL);         
        out.write(NL);         
 com.ibm.etools.mft.pattern.mbi.plugin.PatternUtility.getPatternConfigurationFolderName(context, "patternConfigurationFolderName"); 
        out.write(NL);         
        RuntimeTagElement _jettag_ws_project_57_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "project", "ws:project", _td_ws_project_57_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_project_57_1.setRuntimeParent(null);
        _jettag_ws_project_57_1.setTagInfo(_td_ws_project_57_1);
        _jettag_ws_project_57_1.doStart(context, out);
        while (_jettag_ws_project_57_1.okToProcessBody()) {
            out.write("\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_ws_file_58_2 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_58_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_ws_file_58_2.setRuntimeParent(_jettag_ws_project_57_1);
            _jettag_ws_file_58_2.setTagInfo(_td_ws_file_58_2);
            _jettag_ws_file_58_2.doStart(context, out);
            _jettag_ws_file_58_2.doEnd();
            out.write("\t\t");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_ws_copyFile_60_2 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_60_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_ws_copyFile_60_2.setRuntimeParent(_jettag_ws_project_57_1);
            _jettag_ws_copyFile_60_2.setTagInfo(_td_ws_copyFile_60_2);
            _jettag_ws_copyFile_60_2.doStart(context, out);
            _jettag_ws_copyFile_60_2.doEnd();
            out.write(NL);         
            out.write(NL);         
            RuntimeTagElement _jettag_ws_folder_63_2 = context.getTagFactory().createRuntimeTag(_jetns_ws, "folder", "ws:folder", _td_ws_folder_63_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_ws_folder_63_2.setRuntimeParent(_jettag_ws_project_57_1);
            _jettag_ws_folder_63_2.setTagInfo(_td_ws_folder_63_2);
            _jettag_ws_folder_63_2.doStart(context, out);
            while (_jettag_ws_folder_63_2.okToProcessBody()) {
                out.write("\t\t");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_ws_copyFile_64_3 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_64_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_ws_copyFile_64_3.setRuntimeParent(_jettag_ws_folder_63_2);
                _jettag_ws_copyFile_64_3.setTagInfo(_td_ws_copyFile_64_3);
                _jettag_ws_copyFile_64_3.doStart(context, out);
                _jettag_ws_copyFile_64_3.doEnd();
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_ws_copyFile_66_3 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_66_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_ws_copyFile_66_3.setRuntimeParent(_jettag_ws_folder_63_2);
                _jettag_ws_copyFile_66_3.setTagInfo(_td_ws_copyFile_66_3);
                _jettag_ws_copyFile_66_3.doStart(context, out);
                _jettag_ws_copyFile_66_3.doEnd();
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_ws_copyFile_68_3 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_68_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_ws_copyFile_68_3.setRuntimeParent(_jettag_ws_folder_63_2);
                _jettag_ws_copyFile_68_3.setTagInfo(_td_ws_copyFile_68_3);
                _jettag_ws_copyFile_68_3.doStart(context, out);
                _jettag_ws_copyFile_68_3.doEnd();
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_ws_copyFile_70_3 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_70_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_ws_copyFile_70_3.setRuntimeParent(_jettag_ws_folder_63_2);
                _jettag_ws_copyFile_70_3.setTagInfo(_td_ws_copyFile_70_3);
                _jettag_ws_copyFile_70_3.doStart(context, out);
                _jettag_ws_copyFile_70_3.doEnd();
                out.write(NL);         
                _jettag_ws_folder_63_2.handleBodyContent(out);
            }
            _jettag_ws_folder_63_2.doEnd();
            _jettag_ws_project_57_1.handleBodyContent(out);
        }
        _jettag_ws_project_57_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_project_75_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "project", "ws:project", _td_ws_project_75_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_project_75_1.setRuntimeParent(null);
        _jettag_ws_project_75_1.setTagInfo(_td_ws_project_75_1);
        _jettag_ws_project_75_1.doStart(context, out);
        while (_jettag_ws_project_75_1.okToProcessBody()) {
            out.write("\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_ws_file_76_2 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_76_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_ws_file_76_2.setRuntimeParent(_jettag_ws_project_75_1);
            _jettag_ws_file_76_2.setTagInfo(_td_ws_file_76_2);
            _jettag_ws_file_76_2.doStart(context, out);
            _jettag_ws_file_76_2.doEnd();
            out.write(NL);         
            out.write("  \t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_ws_file_77_4 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_77_4); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_ws_file_77_4.setRuntimeParent(_jettag_ws_project_75_1);
            _jettag_ws_file_77_4.setTagInfo(_td_ws_file_77_4);
            _jettag_ws_file_77_4.doStart(context, out);
            _jettag_ws_file_77_4.doEnd();
            out.write(NL);         
            out.write("  \t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_ws_file_78_4 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_78_4); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_ws_file_78_4.setRuntimeParent(_jettag_ws_project_75_1);
            _jettag_ws_file_78_4.setTagInfo(_td_ws_file_78_4);
            _jettag_ws_file_78_4.doStart(context, out);
            _jettag_ws_file_78_4.doEnd();
            out.write(NL);         
            out.write(NL);         
            RuntimeTagElement _jettag_c_if_80_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_80_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_80_2.setRuntimeParent(_jettag_ws_project_75_1);
            _jettag_c_if_80_2.setTagInfo(_td_c_if_80_2);
            _jettag_c_if_80_2.doStart(context, out);
            while (_jettag_c_if_80_2.okToProcessBody()) {
                out.write("\t\t");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_ws_file_81_3 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_81_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_ws_file_81_3.setRuntimeParent(_jettag_c_if_80_2);
                _jettag_ws_file_81_3.setTagInfo(_td_ws_file_81_3);
                _jettag_ws_file_81_3.doStart(context, out);
                _jettag_ws_file_81_3.doEnd();
                out.write("   ");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t  \t");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_ws_file_82_5 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_82_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_ws_file_82_5.setRuntimeParent(_jettag_c_if_80_2);
                _jettag_ws_file_82_5.setTagInfo(_td_ws_file_82_5);
                _jettag_ws_file_82_5.doStart(context, out);
                _jettag_ws_file_82_5.doEnd();
                out.write(NL);         
                _jettag_c_if_80_2.handleBodyContent(out);
            }
            _jettag_c_if_80_2.doEnd();
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_ws_file_85_2 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_85_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_ws_file_85_2.setRuntimeParent(_jettag_ws_project_75_1);
            _jettag_ws_file_85_2.setTagInfo(_td_ws_file_85_2);
            _jettag_ws_file_85_2.doStart(context, out);
            _jettag_ws_file_85_2.doEnd();
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_ws_file_86_2 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_86_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_ws_file_86_2.setRuntimeParent(_jettag_ws_project_75_1);
            _jettag_ws_file_86_2.setTagInfo(_td_ws_file_86_2);
            _jettag_ws_file_86_2.doStart(context, out);
            _jettag_ws_file_86_2.doEnd();
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_ws_file_87_2 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_87_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_ws_file_87_2.setRuntimeParent(_jettag_ws_project_75_1);
            _jettag_ws_file_87_2.setTagInfo(_td_ws_file_87_2);
            _jettag_ws_file_87_2.doStart(context, out);
            _jettag_ws_file_87_2.doEnd();
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_ws_file_88_2 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_88_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_ws_file_88_2.setRuntimeParent(_jettag_ws_project_75_1);
            _jettag_ws_file_88_2.setTagInfo(_td_ws_file_88_2);
            _jettag_ws_file_88_2.doStart(context, out);
            _jettag_ws_file_88_2.doEnd();
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_ws_file_89_2 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_89_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_ws_file_89_2.setRuntimeParent(_jettag_ws_project_75_1);
            _jettag_ws_file_89_2.setTagInfo(_td_ws_file_89_2);
            _jettag_ws_file_89_2.doStart(context, out);
            _jettag_ws_file_89_2.doEnd();
            out.write(NL);         
            _jettag_ws_project_75_1.handleBodyContent(out);
        }
        _jettag_ws_project_75_1.doEnd();
    }
}
