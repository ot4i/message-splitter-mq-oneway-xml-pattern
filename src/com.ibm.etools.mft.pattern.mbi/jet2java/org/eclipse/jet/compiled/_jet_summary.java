package org.eclipse.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_summary implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_summary() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_get_8_9 = new TagInfo("c:get", //$NON-NLS-1$
            8, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/instanceName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_41_45 = new TagInfo("c:get", //$NON-NLS-1$
            41, 45,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/instanceName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_41_88 = new TagInfo("c:get", //$NON-NLS-1$
            41, 88,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_41_128 = new TagInfo("c:get", //$NON-NLS-1$
            41, 128,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@messagesplitter", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_42_6 = new TagInfo("c:get", //$NON-NLS-1$
            42, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@messagesplitter", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_51_45 = new TagInfo("c:get", //$NON-NLS-1$
            51, 45,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/instanceName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_51_88 = new TagInfo("c:get", //$NON-NLS-1$
            51, 88,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_51_128 = new TagInfo("c:get", //$NON-NLS-1$
            51, 128,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@route", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_52_6 = new TagInfo("c:get", //$NON-NLS-1$
            52, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@route", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_56_45 = new TagInfo("c:get", //$NON-NLS-1$
            56, 45,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/instanceName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_56_88 = new TagInfo("c:get", //$NON-NLS-1$
            56, 88,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_56_128 = new TagInfo("c:get", //$NON-NLS-1$
            56, 128,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@messageprocessor", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_57_6 = new TagInfo("c:get", //$NON-NLS-1$
            57, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@messageprocessor", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_61_45 = new TagInfo("c:get", //$NON-NLS-1$
            61, 45,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/instanceName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_61_88 = new TagInfo("c:get", //$NON-NLS-1$
            61, 88,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_61_128 = new TagInfo("c:get", //$NON-NLS-1$
            61, 128,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@error", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_62_6 = new TagInfo("c:get", //$NON-NLS-1$
            62, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@error", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_65_4 = new TagInfo("c:if", //$NON-NLS-1$
            65, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/loggingRequired='true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_67_46 = new TagInfo("c:get", //$NON-NLS-1$
            67, 46,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/instanceName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_67_89 = new TagInfo("c:get", //$NON-NLS-1$
            67, 89,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_67_129 = new TagInfo("c:get", //$NON-NLS-1$
            67, 129,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@log", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_68_7 = new TagInfo("c:get", //$NON-NLS-1$
            68, 7,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@log", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_97_4 = new TagInfo("c:if", //$NON-NLS-1$
            97, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/loggingRequired='true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_99_6 = new TagInfo("c:choose", //$NON-NLS-1$
            99, 6,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_100_7 = new TagInfo("c:when", //$NON-NLS-1$
            100, 7,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "string-length($root/logQueueManager) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_103_7 = new TagInfo("c:otherwise", //$NON-NLS-1$
            103, 7,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_if_109_4 = new TagInfo("c:if", //$NON-NLS-1$
            109, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/errorMessageRequired='true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_111_6 = new TagInfo("c:choose", //$NON-NLS-1$
            111, 6,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_112_7 = new TagInfo("c:when", //$NON-NLS-1$
            112, 7,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "string-length($root/errorQueueManager) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_115_7 = new TagInfo("c:otherwise", //$NON-NLS-1$
            115, 7,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_if_121_4 = new TagInfo("c:if", //$NON-NLS-1$
            121, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/badMsgAction='Save'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_123_6 = new TagInfo("c:choose", //$NON-NLS-1$
            123, 6,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_124_7 = new TagInfo("c:when", //$NON-NLS-1$
            124, 7,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "string-length($root/badMsgQueueManager) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_127_7 = new TagInfo("c:otherwise", //$NON-NLS-1$
            127, 7,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_choose_134_4 = new TagInfo("c:choose", //$NON-NLS-1$
            134, 4,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_135_5 = new TagInfo("c:when", //$NON-NLS-1$
            135, 5,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/routingSubflow = 'routeRoute'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_136_6 = new TagInfo("c:iterate", //$NON-NLS-1$
            136, 6,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$root/route/row", //$NON-NLS-1$
                "currentOutput", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_138_8 = new TagInfo("c:choose", //$NON-NLS-1$
            138, 8,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_139_9 = new TagInfo("c:when", //$NON-NLS-1$
            139, 9,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "string-length($currentOutput/queueManager) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_143_9 = new TagInfo("c:otherwise", //$NON-NLS-1$
            143, 9,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_153_5 = new TagInfo("c:when", //$NON-NLS-1$
            153, 5,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/routingSubflow = 'destinationCache'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_154_6 = new TagInfo("c:if", //$NON-NLS-1$
            154, 6,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/cacheRefresh = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_171_5 = new TagInfo("c:otherwise", //$NON-NLS-1$
            171, 5,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_choose_192_3 = new TagInfo("c:choose", //$NON-NLS-1$
            192, 3,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_193_4 = new TagInfo("c:when", //$NON-NLS-1$
            193, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/loggingRequired='true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_202_4 = new TagInfo("c:otherwise", //$NON-NLS-1$
            202, 4,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_choose_209_3 = new TagInfo("c:choose", //$NON-NLS-1$
            209, 3,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_210_4 = new TagInfo("c:when", //$NON-NLS-1$
            210, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/errorMessageRequired='true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_219_4 = new TagInfo("c:otherwise", //$NON-NLS-1$
            219, 4,
            new String[] {
            },
            new String[] {
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;

com.ibm.etools.mft.pattern.mbi.plugin.PatternPlugin pattern = com.ibm.etools.mft.pattern.mbi.plugin.PatternPlugin.getInstance();
com.ibm.etools.mft.pattern.mbi.ms.xmlmq.PatternMessages messages = new com.ibm.etools.mft.pattern.mbi.ms.xmlmq.PatternMessages();

        out.write("<html>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<head>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<title>");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_8_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_8_9); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_8_9.setRuntimeParent(null);
        _jettag_c_get_8_9.setTagInfo(_td_c_get_8_9);
        _jettag_c_get_8_9.doStart(context, out);
        _jettag_c_get_8_9.doEnd();
        out.write("_summary.html</title>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<link rel=\"stylesheet\" href=\"summary.css\" media=\"screen\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("</head>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("<script type=\"text/javascript\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tfunction setStatus(txt){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\twindow.status = txt;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\twindow.status = \"\";");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("</script>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("<body>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<a name=\"NoPlace\"></a>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("<div id=\"banner\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<h2>");  //$NON-NLS-1$        
        out.write( pattern.getMessage(context, "com.ibm.etools.mft.pattern.mbi.ms.xmlmq.summary.33", new Object[] { "$root/instanceName" }) );
        out.write("</h2>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<p>");  //$NON-NLS-1$        
        out.write( pattern.getMessage(context, "com.ibm.etools.mft.pattern.mbi.ms.xmlmq.summary.1", new Object[] { "$root/instanceName" }) );
        out.write("</p>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("</div>\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("<div class=\"section\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<div class=\"tl\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<h2>");  //$NON-NLS-1$        
        out.write( pattern.getString("com.ibm.etools.mft.pattern.mbi.ms.xmlmq.summary.2") );
        out.write("</h2>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t</div>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<div class=\"content\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<p>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t");  //$NON-NLS-1$        
        out.write( pattern.getString("com.ibm.etools.mft.pattern.mbi.ms.xmlmq.summary.3") );
        out.write(NL);         
        out.write("\t\t\t");  //$NON-NLS-1$        
        out.write( pattern.getString("com.ibm.etools.mft.pattern.mbi.ms.xmlmq.summary.4") );
        out.write(NL);         
        out.write("\t\t</p>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<p>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t");  //$NON-NLS-1$        
        out.write( pattern.getMessage(context, "com.ibm.etools.mft.pattern.mbi.ms.xmlmq.summary.5", new Object[] { "$root/@projectname" }) );
        out.write(NL);         
        out.write("\t\t</p>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<ul>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<li>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t<a href=\"#NoPlace\" onclick=\"setStatus('/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_41_45 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_41_45); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_41_45.setRuntimeParent(null);
        _jettag_c_get_41_45.setTagInfo(_td_c_get_41_45);
        _jettag_c_get_41_45.doStart(context, out);
        _jettag_c_get_41_45.doEnd();
        out.write("_Flows/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_41_88 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_41_88); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_41_88.setRuntimeParent(null);
        _jettag_c_get_41_88.setTagInfo(_td_c_get_41_88);
        _jettag_c_get_41_88.doStart(context, out);
        _jettag_c_get_41_88.doEnd();
        RuntimeTagElement _jettag_c_get_41_128 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_41_128); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_41_128.setRuntimeParent(null);
        _jettag_c_get_41_128.setTagInfo(_td_c_get_41_128);
        _jettag_c_get_41_128.doStart(context, out);
        _jettag_c_get_41_128.doEnd();
        out.write(".msgflow')\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_42_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_42_6); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_42_6.setRuntimeParent(null);
        _jettag_c_get_42_6.setTagInfo(_td_c_get_42_6);
        _jettag_c_get_42_6.doStart(context, out);
        _jettag_c_get_42_6.doEnd();
        out.write(NL);         
        out.write("\t\t\t\t</a>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t</li>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t</ul>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<p>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t");  //$NON-NLS-1$        
        out.write( pattern.getString("com.ibm.etools.mft.pattern.mbi.ms.xmlmq.summary.6") );
        out.write(NL);         
        out.write("\t\t</p>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<ul>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<li>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t<a href=\"#NoPlace\" onclick=\"setStatus('/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_51_45 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_51_45); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_51_45.setRuntimeParent(null);
        _jettag_c_get_51_45.setTagInfo(_td_c_get_51_45);
        _jettag_c_get_51_45.doStart(context, out);
        _jettag_c_get_51_45.doEnd();
        out.write("_Flows/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_51_88 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_51_88); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_51_88.setRuntimeParent(null);
        _jettag_c_get_51_88.setTagInfo(_td_c_get_51_88);
        _jettag_c_get_51_88.doStart(context, out);
        _jettag_c_get_51_88.doEnd();
        RuntimeTagElement _jettag_c_get_51_128 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_51_128); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_51_128.setRuntimeParent(null);
        _jettag_c_get_51_128.setTagInfo(_td_c_get_51_128);
        _jettag_c_get_51_128.doStart(context, out);
        _jettag_c_get_51_128.doEnd();
        out.write(".subflow')\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_52_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_52_6); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_52_6.setRuntimeParent(null);
        _jettag_c_get_52_6.setTagInfo(_td_c_get_52_6);
        _jettag_c_get_52_6.doStart(context, out);
        _jettag_c_get_52_6.doEnd();
        out.write(NL);         
        out.write("\t\t\t\t</a>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t</li>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<li>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t<a href=\"#NoPlace\" onclick=\"setStatus('/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_56_45 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_56_45); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_56_45.setRuntimeParent(null);
        _jettag_c_get_56_45.setTagInfo(_td_c_get_56_45);
        _jettag_c_get_56_45.doStart(context, out);
        _jettag_c_get_56_45.doEnd();
        out.write("_Flows/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_56_88 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_56_88); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_56_88.setRuntimeParent(null);
        _jettag_c_get_56_88.setTagInfo(_td_c_get_56_88);
        _jettag_c_get_56_88.doStart(context, out);
        _jettag_c_get_56_88.doEnd();
        RuntimeTagElement _jettag_c_get_56_128 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_56_128); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_56_128.setRuntimeParent(null);
        _jettag_c_get_56_128.setTagInfo(_td_c_get_56_128);
        _jettag_c_get_56_128.doStart(context, out);
        _jettag_c_get_56_128.doEnd();
        out.write(".subflow')\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_57_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_57_6); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_57_6.setRuntimeParent(null);
        _jettag_c_get_57_6.setTagInfo(_td_c_get_57_6);
        _jettag_c_get_57_6.doStart(context, out);
        _jettag_c_get_57_6.doEnd();
        out.write(NL);         
        out.write("\t\t\t\t</a>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t</li>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<li>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t<a href=\"#NoPlace\" onclick=\"setStatus('/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_61_45 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_61_45); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_61_45.setRuntimeParent(null);
        _jettag_c_get_61_45.setTagInfo(_td_c_get_61_45);
        _jettag_c_get_61_45.doStart(context, out);
        _jettag_c_get_61_45.doEnd();
        out.write("_Flows/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_61_88 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_61_88); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_61_88.setRuntimeParent(null);
        _jettag_c_get_61_88.setTagInfo(_td_c_get_61_88);
        _jettag_c_get_61_88.doStart(context, out);
        _jettag_c_get_61_88.doEnd();
        RuntimeTagElement _jettag_c_get_61_128 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_61_128); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_61_128.setRuntimeParent(null);
        _jettag_c_get_61_128.setTagInfo(_td_c_get_61_128);
        _jettag_c_get_61_128.doStart(context, out);
        _jettag_c_get_61_128.doEnd();
        out.write(".subflow')\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_62_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_62_6); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_62_6.setRuntimeParent(null);
        _jettag_c_get_62_6.setTagInfo(_td_c_get_62_6);
        _jettag_c_get_62_6.doStart(context, out);
        _jettag_c_get_62_6.doEnd();
        out.write(NL);         
        out.write("\t\t\t\t</a>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t</li>");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_65_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_65_4); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_65_4.setRuntimeParent(null);
        _jettag_c_if_65_4.setTagInfo(_td_c_if_65_4);
        _jettag_c_if_65_4.doStart(context, out);
        while (_jettag_c_if_65_4.okToProcessBody()) {
            out.write("\t\t\t\t<li>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t\t\t<a href=\"#NoPlace\" onclick=\"setStatus('/");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_67_46 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_67_46); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_67_46.setRuntimeParent(_jettag_c_if_65_4);
            _jettag_c_get_67_46.setTagInfo(_td_c_get_67_46);
            _jettag_c_get_67_46.doStart(context, out);
            _jettag_c_get_67_46.doEnd();
            out.write("_Flows/");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_67_89 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_67_89); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_67_89.setRuntimeParent(_jettag_c_if_65_4);
            _jettag_c_get_67_89.setTagInfo(_td_c_get_67_89);
            _jettag_c_get_67_89.doStart(context, out);
            _jettag_c_get_67_89.doEnd();
            RuntimeTagElement _jettag_c_get_67_129 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_67_129); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_67_129.setRuntimeParent(_jettag_c_if_65_4);
            _jettag_c_get_67_129.setTagInfo(_td_c_get_67_129);
            _jettag_c_get_67_129.doStart(context, out);
            _jettag_c_get_67_129.doEnd();
            out.write(".subflow')\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t\t\t\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_68_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_68_7); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_68_7.setRuntimeParent(_jettag_c_if_65_4);
            _jettag_c_get_68_7.setTagInfo(_td_c_get_68_7);
            _jettag_c_get_68_7.doStart(context, out);
            _jettag_c_get_68_7.doEnd();
            out.write(NL);         
            out.write("\t\t\t\t\t</a>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t\t</li>");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_65_4.handleBodyContent(out);
        }
        _jettag_c_if_65_4.doEnd();
        out.write("\t\t</ul>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t</div>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("</div>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<div class=\"section\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<div class=\"tl\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<h2>");  //$NON-NLS-1$        
        out.write( pattern.getMessage(context, "com.ibm.etools.mft.pattern.mbi.ms.xmlmq.summary.7", new Object[] { "$root/instanceName" }) );
        out.write("</h2>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t</div>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<div class=\"content\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<h3>");  //$NON-NLS-1$        
        out.write( pattern.getString("com.ibm.etools.mft.pattern.mbi.ms.xmlmq.summary.8") );
        out.write("</h3>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<p>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t");  //$NON-NLS-1$        
        out.write( pattern.getString("com.ibm.etools.mft.pattern.mbi.ms.xmlmq.summary.9") );
        out.write(NL);         
        out.write("\t\t</p>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<p>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t");  //$NON-NLS-1$        
        out.write( pattern.getString("com.ibm.etools.mft.pattern.mbi.ms.xmlmq.summary.10") );
        out.write(NL);         
        out.write("\t\t</p>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<ul>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<li>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t");  //$NON-NLS-1$        
        out.write( pattern.getMessage(context, "com.ibm.etools.mft.pattern.mbi.ms.xmlmq.summary.11", new Object[] { "$root/queueprefix", "$root/inputQueue", "$root/queuesuffix" }) );
        out.write(NL);         
        out.write("\t\t\t</li>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t</ul>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<p>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t");  //$NON-NLS-1$        
        out.write( pattern.getString("com.ibm.etools.mft.pattern.mbi.ms.xmlmq.summary.12") );
        out.write(NL);         
        out.write("\t\t</p>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<ul>");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_97_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_97_4); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_97_4.setRuntimeParent(null);
        _jettag_c_if_97_4.setTagInfo(_td_c_if_97_4);
        _jettag_c_if_97_4.doStart(context, out);
        while (_jettag_c_if_97_4.okToProcessBody()) {
            out.write("\t\t\t\t<li>");  //$NON-NLS-1$        
            out.write(NL);         
            RuntimeTagElement _jettag_c_choose_99_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_99_6); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_choose_99_6.setRuntimeParent(_jettag_c_if_97_4);
            _jettag_c_choose_99_6.setTagInfo(_td_c_choose_99_6);
            _jettag_c_choose_99_6.doStart(context, out);
            JET2Writer _jettag_c_choose_99_6_saved_out = out;
            while (_jettag_c_choose_99_6.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_when_100_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_100_7); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_when_100_7.setRuntimeParent(_jettag_c_choose_99_6);
                _jettag_c_when_100_7.setTagInfo(_td_c_when_100_7);
                _jettag_c_when_100_7.doStart(context, out);
                JET2Writer _jettag_c_when_100_7_saved_out = out;
                while (_jettag_c_when_100_7.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write("\t\t\t\t\t\t\t");  //$NON-NLS-1$        
                    out.write( pattern.getMessage(context, "com.ibm.etools.mft.pattern.mbi.ms.xmlmq.summary.13.queueManager", new Object[] { "$root/queueprefix", "$root/logQueue", "$root/queuesuffix", "$root/logQueueManager" }) );
                    out.write(NL);         
                    _jettag_c_when_100_7.handleBodyContent(out);
                }
                out = _jettag_c_when_100_7_saved_out;
                _jettag_c_when_100_7.doEnd();
                RuntimeTagElement _jettag_c_otherwise_103_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_103_7); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_otherwise_103_7.setRuntimeParent(_jettag_c_choose_99_6);
                _jettag_c_otherwise_103_7.setTagInfo(_td_c_otherwise_103_7);
                _jettag_c_otherwise_103_7.doStart(context, out);
                JET2Writer _jettag_c_otherwise_103_7_saved_out = out;
                while (_jettag_c_otherwise_103_7.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write("\t\t\t\t\t\t\t");  //$NON-NLS-1$        
                    out.write( pattern.getMessage(context, "com.ibm.etools.mft.pattern.mbi.ms.xmlmq.summary.13", new Object[] { "$root/queueprefix", "$root/logQueue", "$root/queuesuffix" }) );
                    out.write(NL);         
                    _jettag_c_otherwise_103_7.handleBodyContent(out);
                }
                out = _jettag_c_otherwise_103_7_saved_out;
                _jettag_c_otherwise_103_7.doEnd();
                _jettag_c_choose_99_6.handleBodyContent(out);
            }
            out = _jettag_c_choose_99_6_saved_out;
            _jettag_c_choose_99_6.doEnd();
            out.write("\t\t\t\t</li>");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_97_4.handleBodyContent(out);
        }
        _jettag_c_if_97_4.doEnd();
        RuntimeTagElement _jettag_c_if_109_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_109_4); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_109_4.setRuntimeParent(null);
        _jettag_c_if_109_4.setTagInfo(_td_c_if_109_4);
        _jettag_c_if_109_4.doStart(context, out);
        while (_jettag_c_if_109_4.okToProcessBody()) {
            out.write("\t\t\t\t<li>");  //$NON-NLS-1$        
            out.write(NL);         
            RuntimeTagElement _jettag_c_choose_111_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_111_6); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_choose_111_6.setRuntimeParent(_jettag_c_if_109_4);
            _jettag_c_choose_111_6.setTagInfo(_td_c_choose_111_6);
            _jettag_c_choose_111_6.doStart(context, out);
            JET2Writer _jettag_c_choose_111_6_saved_out = out;
            while (_jettag_c_choose_111_6.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_when_112_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_112_7); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_when_112_7.setRuntimeParent(_jettag_c_choose_111_6);
                _jettag_c_when_112_7.setTagInfo(_td_c_when_112_7);
                _jettag_c_when_112_7.doStart(context, out);
                JET2Writer _jettag_c_when_112_7_saved_out = out;
                while (_jettag_c_when_112_7.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write("\t\t\t\t\t\t\t");  //$NON-NLS-1$        
                    out.write( pattern.getMessage(context, "com.ibm.etools.mft.pattern.mbi.ms.xmlmq.summary.14.queueManager", new Object[] { "$root/queueprefix", "$root/errorQueue", "$root/queuesuffix", "$root/errorQueueManager" }) );
                    out.write(" ");  //$NON-NLS-1$        
                    out.write(NL);         
                    _jettag_c_when_112_7.handleBodyContent(out);
                }
                out = _jettag_c_when_112_7_saved_out;
                _jettag_c_when_112_7.doEnd();
                RuntimeTagElement _jettag_c_otherwise_115_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_115_7); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_otherwise_115_7.setRuntimeParent(_jettag_c_choose_111_6);
                _jettag_c_otherwise_115_7.setTagInfo(_td_c_otherwise_115_7);
                _jettag_c_otherwise_115_7.doStart(context, out);
                JET2Writer _jettag_c_otherwise_115_7_saved_out = out;
                while (_jettag_c_otherwise_115_7.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write("\t\t\t\t\t\t\t");  //$NON-NLS-1$        
                    out.write( pattern.getMessage(context, "com.ibm.etools.mft.pattern.mbi.ms.xmlmq.summary.14", new Object[] { "$root/queueprefix", "$root/errorQueue", "$root/queuesuffix" }) );
                    out.write(" ");  //$NON-NLS-1$        
                    out.write(NL);         
                    _jettag_c_otherwise_115_7.handleBodyContent(out);
                }
                out = _jettag_c_otherwise_115_7_saved_out;
                _jettag_c_otherwise_115_7.doEnd();
                _jettag_c_choose_111_6.handleBodyContent(out);
            }
            out = _jettag_c_choose_111_6_saved_out;
            _jettag_c_choose_111_6.doEnd();
            out.write("\t\t\t\t</li>");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_109_4.handleBodyContent(out);
        }
        _jettag_c_if_109_4.doEnd();
        RuntimeTagElement _jettag_c_if_121_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_121_4); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_121_4.setRuntimeParent(null);
        _jettag_c_if_121_4.setTagInfo(_td_c_if_121_4);
        _jettag_c_if_121_4.doStart(context, out);
        while (_jettag_c_if_121_4.okToProcessBody()) {
            out.write("\t\t\t\t<li>");  //$NON-NLS-1$        
            out.write(NL);         
            RuntimeTagElement _jettag_c_choose_123_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_123_6); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_choose_123_6.setRuntimeParent(_jettag_c_if_121_4);
            _jettag_c_choose_123_6.setTagInfo(_td_c_choose_123_6);
            _jettag_c_choose_123_6.doStart(context, out);
            JET2Writer _jettag_c_choose_123_6_saved_out = out;
            while (_jettag_c_choose_123_6.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_when_124_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_124_7); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_when_124_7.setRuntimeParent(_jettag_c_choose_123_6);
                _jettag_c_when_124_7.setTagInfo(_td_c_when_124_7);
                _jettag_c_when_124_7.doStart(context, out);
                JET2Writer _jettag_c_when_124_7_saved_out = out;
                while (_jettag_c_when_124_7.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write("\t\t\t\t\t\t\t");  //$NON-NLS-1$        
                    out.write( pattern.getMessage(context, "com.ibm.etools.mft.pattern.mbi.ms.xmlmq.summary.15.queueManager", new Object[] { "$root/queueprefix", "$root/badMsgQueue", "$root/queuesuffix", "$root/badMsgQueueManager" }) );
                    out.write(NL);         
                    _jettag_c_when_124_7.handleBodyContent(out);
                }
                out = _jettag_c_when_124_7_saved_out;
                _jettag_c_when_124_7.doEnd();
                RuntimeTagElement _jettag_c_otherwise_127_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_127_7); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_otherwise_127_7.setRuntimeParent(_jettag_c_choose_123_6);
                _jettag_c_otherwise_127_7.setTagInfo(_td_c_otherwise_127_7);
                _jettag_c_otherwise_127_7.doStart(context, out);
                JET2Writer _jettag_c_otherwise_127_7_saved_out = out;
                while (_jettag_c_otherwise_127_7.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write("\t\t\t\t\t\t\t");  //$NON-NLS-1$        
                    out.write( pattern.getMessage(context, "com.ibm.etools.mft.pattern.mbi.ms.xmlmq.summary.15", new Object[] { "$root/queueprefix", "$root/badMsgQueue", "$root/queuesuffix" }) );
                    out.write(NL);         
                    _jettag_c_otherwise_127_7.handleBodyContent(out);
                }
                out = _jettag_c_otherwise_127_7_saved_out;
                _jettag_c_otherwise_127_7.doEnd();
                _jettag_c_choose_123_6.handleBodyContent(out);
            }
            out = _jettag_c_choose_123_6_saved_out;
            _jettag_c_choose_123_6.doEnd();
            out.write("\t\t\t\t</li>");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_121_4.handleBodyContent(out);
        }
        _jettag_c_if_121_4.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_c_choose_134_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_134_4); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_choose_134_4.setRuntimeParent(null);
        _jettag_c_choose_134_4.setTagInfo(_td_c_choose_134_4);
        _jettag_c_choose_134_4.doStart(context, out);
        JET2Writer _jettag_c_choose_134_4_saved_out = out;
        while (_jettag_c_choose_134_4.okToProcessBody()) {
            out = out.newNestedContentWriter();
            RuntimeTagElement _jettag_c_when_135_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_135_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_when_135_5.setRuntimeParent(_jettag_c_choose_134_4);
            _jettag_c_when_135_5.setTagInfo(_td_c_when_135_5);
            _jettag_c_when_135_5.doStart(context, out);
            JET2Writer _jettag_c_when_135_5_saved_out = out;
            while (_jettag_c_when_135_5.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_iterate_136_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_136_6); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_136_6.setRuntimeParent(_jettag_c_when_135_5);
                _jettag_c_iterate_136_6.setTagInfo(_td_c_iterate_136_6);
                _jettag_c_iterate_136_6.doStart(context, out);
                while (_jettag_c_iterate_136_6.okToProcessBody()) {
                    out.write("\t\t\t\t\t\t<li>");  //$NON-NLS-1$        
                    out.write(NL);         
                    RuntimeTagElement _jettag_c_choose_138_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_138_8); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_choose_138_8.setRuntimeParent(_jettag_c_iterate_136_6);
                    _jettag_c_choose_138_8.setTagInfo(_td_c_choose_138_8);
                    _jettag_c_choose_138_8.doStart(context, out);
                    JET2Writer _jettag_c_choose_138_8_saved_out = out;
                    while (_jettag_c_choose_138_8.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        RuntimeTagElement _jettag_c_when_139_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_139_9); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_when_139_9.setRuntimeParent(_jettag_c_choose_138_8);
                        _jettag_c_when_139_9.setTagInfo(_td_c_when_139_9);
                        _jettag_c_when_139_9.doStart(context, out);
                        JET2Writer _jettag_c_when_139_9_saved_out = out;
                        while (_jettag_c_when_139_9.okToProcessBody()) {
                            out = out.newNestedContentWriter();
                            out.write("\t\t\t\t\t\t\t\t\t");  //$NON-NLS-1$        
                            out.write( pattern.getMessage(context, "com.ibm.etools.mft.pattern.mbi.ms.xmlmq.summary.16.queueManager",
                    				                      new Object[] {"$root/queueprefix", "$currentOutput/queue", "$root/queuesuffix", "$currentOutput/queueManager" }) );
                            out.write(NL);         
                            _jettag_c_when_139_9.handleBodyContent(out);
                        }
                        out = _jettag_c_when_139_9_saved_out;
                        _jettag_c_when_139_9.doEnd();
                        RuntimeTagElement _jettag_c_otherwise_143_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_143_9); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_otherwise_143_9.setRuntimeParent(_jettag_c_choose_138_8);
                        _jettag_c_otherwise_143_9.setTagInfo(_td_c_otherwise_143_9);
                        _jettag_c_otherwise_143_9.doStart(context, out);
                        JET2Writer _jettag_c_otherwise_143_9_saved_out = out;
                        while (_jettag_c_otherwise_143_9.okToProcessBody()) {
                            out = out.newNestedContentWriter();
                            out.write("\t\t\t\t\t\t\t\t\t");  //$NON-NLS-1$        
                            out.write( pattern.getMessage(context, "com.ibm.etools.mft.pattern.mbi.ms.xmlmq.summary.16",
                    				                      new Object[] {"$root/queueprefix", "$currentOutput/queue", "$root/queuesuffix" }) );
                            out.write(NL);         
                            _jettag_c_otherwise_143_9.handleBodyContent(out);
                        }
                        out = _jettag_c_otherwise_143_9_saved_out;
                        _jettag_c_otherwise_143_9.doEnd();
                        _jettag_c_choose_138_8.handleBodyContent(out);
                    }
                    out = _jettag_c_choose_138_8_saved_out;
                    _jettag_c_choose_138_8.doEnd();
                    out.write("\t\t\t\t\t\t</li>");  //$NON-NLS-1$        
                    out.write(NL);         
                    _jettag_c_iterate_136_6.handleBodyContent(out);
                }
                _jettag_c_iterate_136_6.doEnd();
                out.write("\t\t</ul>");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_when_135_5.handleBodyContent(out);
            }
            out = _jettag_c_when_135_5_saved_out;
            _jettag_c_when_135_5.doEnd();
            out.write(NL);         
            RuntimeTagElement _jettag_c_when_153_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_153_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_when_153_5.setRuntimeParent(_jettag_c_choose_134_4);
            _jettag_c_when_153_5.setTagInfo(_td_c_when_153_5);
            _jettag_c_when_153_5.doStart(context, out);
            JET2Writer _jettag_c_when_153_5_saved_out = out;
            while (_jettag_c_when_153_5.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_if_154_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_154_6); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_154_6.setRuntimeParent(_jettag_c_when_153_5);
                _jettag_c_if_154_6.setTagInfo(_td_c_if_154_6);
                _jettag_c_if_154_6.doStart(context, out);
                while (_jettag_c_if_154_6.okToProcessBody()) {
                    out.write("\t\t\t\t\t\t<li>");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t");  //$NON-NLS-1$        
                    out.write( pattern.getMessage(context, "com.ibm.etools.mft.pattern.mbi.ms.xmlmq.summary.19",
                                          new Object[] {"$root/queueprefix", "$root/refreshQueue", "$root/queuesuffix" }) );
                    out.write(NL);         
                    out.write(" ");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t</li>");  //$NON-NLS-1$        
                    out.write(NL);         
                    _jettag_c_if_154_6.handleBodyContent(out);
                }
                _jettag_c_if_154_6.doEnd();
                out.write("\t\t</ul>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t<p>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t\t");  //$NON-NLS-1$        
                out.write( pattern.getString("com.ibm.etools.mft.pattern.mbi.ms.xmlmq.summary.18") );
                out.write(NL);         
                out.write("\t\t\t\t\t</p>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t<h3>");  //$NON-NLS-1$        
                out.write( pattern.getString("com.ibm.etools.mft.pattern.mbi.ms.xmlmq.summary.20") );
                out.write("</h3>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t<p>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t\t");  //$NON-NLS-1$        
                out.write( pattern.getMessage(context, "com.ibm.etools.mft.pattern.mbi.ms.xmlmq.summary.21", new Object[] { "$root/routingDB" }) );
                out.write(NL);         
                out.write("\t\t\t\t\t</p>");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_when_153_5.handleBodyContent(out);
            }
            out = _jettag_c_when_153_5_saved_out;
            _jettag_c_when_153_5.doEnd();
            out.write(NL);         
            RuntimeTagElement _jettag_c_otherwise_171_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_171_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_otherwise_171_5.setRuntimeParent(_jettag_c_choose_134_4);
            _jettag_c_otherwise_171_5.setTagInfo(_td_c_otherwise_171_5);
            _jettag_c_otherwise_171_5.doStart(context, out);
            JET2Writer _jettag_c_otherwise_171_5_saved_out = out;
            while (_jettag_c_otherwise_171_5.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("\t\t\t\t\t<li>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t\t");  //$NON-NLS-1$        
                out.write( pattern.getMessage(context, "com.ibm.etools.mft.pattern.mbi.ms.xmlmq.summary.16",
                                   new Object[] {"$root/queueprefix", "root/outputQueue", "$root/queuesuffix", "$root/outputQueueManager" }) );
                out.write(NL);         
                out.write("\t\t\t\t\t</li>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t</ul>");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_otherwise_171_5.handleBodyContent(out);
            }
            out = _jettag_c_otherwise_171_5_saved_out;
            _jettag_c_otherwise_171_5.doEnd();
            _jettag_c_choose_134_4.handleBodyContent(out);
        }
        out = _jettag_c_choose_134_4_saved_out;
        _jettag_c_choose_134_4.doEnd();
        out.write(NL);         
        out.write("\t\t\t<h3>");  //$NON-NLS-1$        
        out.write( pattern.getString("com.ibm.etools.mft.pattern.mbi.ms.xmlmq.summary.22") );
        out.write("</h3>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<p>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t");  //$NON-NLS-1$        
        out.write( pattern.getString("com.ibm.etools.mft.pattern.mbi.ms.xmlmq.summary.32") );
        out.write(NL);         
        out.write("\t\t\t</p>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t</div>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("</div>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<div class=\"section\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<div class=\"tl\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<h2>");  //$NON-NLS-1$        
        out.write( pattern.getString("com.ibm.etools.mft.pattern.mbi.ms.xmlmq.summary.25") );
        out.write("</h2>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t</div>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<div class=\"content\">");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_choose_192_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_192_3); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_choose_192_3.setRuntimeParent(null);
        _jettag_c_choose_192_3.setTagInfo(_td_c_choose_192_3);
        _jettag_c_choose_192_3.doStart(context, out);
        JET2Writer _jettag_c_choose_192_3_saved_out = out;
        while (_jettag_c_choose_192_3.okToProcessBody()) {
            out = out.newNestedContentWriter();
            RuntimeTagElement _jettag_c_when_193_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_193_4); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_when_193_4.setRuntimeParent(_jettag_c_choose_192_3);
            _jettag_c_when_193_4.setTagInfo(_td_c_when_193_4);
            _jettag_c_when_193_4.doStart(context, out);
            JET2Writer _jettag_c_when_193_4_saved_out = out;
            while (_jettag_c_when_193_4.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("\t\t\t\t<p>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t");  //$NON-NLS-1$        
                out.write( pattern.getString("com.ibm.etools.mft.pattern.mbi.ms.xmlmq.summary.26") );
                out.write(NL);         
                out.write("\t\t\t\t</p>\t\t\t\t");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t<br>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t<p>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t");  //$NON-NLS-1$        
                out.write( pattern.getString("com.ibm.etools.mft.pattern.mbi.ms.xmlmq.summary.27") );
                out.write(" ");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t</p>");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_when_193_4.handleBodyContent(out);
            }
            out = _jettag_c_when_193_4_saved_out;
            _jettag_c_when_193_4.doEnd();
            RuntimeTagElement _jettag_c_otherwise_202_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_202_4); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_otherwise_202_4.setRuntimeParent(_jettag_c_choose_192_3);
            _jettag_c_otherwise_202_4.setTagInfo(_td_c_otherwise_202_4);
            _jettag_c_otherwise_202_4.doStart(context, out);
            JET2Writer _jettag_c_otherwise_202_4_saved_out = out;
            while (_jettag_c_otherwise_202_4.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("\t\t\t\t<p>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t");  //$NON-NLS-1$        
                out.write( pattern.getString("com.ibm.etools.mft.pattern.mbi.ms.xmlmq.summary.28") );
                out.write(NL);         
                out.write("\t\t\t\t</p>");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_otherwise_202_4.handleBodyContent(out);
            }
            out = _jettag_c_otherwise_202_4_saved_out;
            _jettag_c_otherwise_202_4.doEnd();
            _jettag_c_choose_192_3.handleBodyContent(out);
        }
        out = _jettag_c_choose_192_3_saved_out;
        _jettag_c_choose_192_3.doEnd();
        out.write("\t\t<br>");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_choose_209_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_209_3); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_choose_209_3.setRuntimeParent(null);
        _jettag_c_choose_209_3.setTagInfo(_td_c_choose_209_3);
        _jettag_c_choose_209_3.doStart(context, out);
        JET2Writer _jettag_c_choose_209_3_saved_out = out;
        while (_jettag_c_choose_209_3.okToProcessBody()) {
            out = out.newNestedContentWriter();
            RuntimeTagElement _jettag_c_when_210_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_210_4); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_when_210_4.setRuntimeParent(_jettag_c_choose_209_3);
            _jettag_c_when_210_4.setTagInfo(_td_c_when_210_4);
            _jettag_c_when_210_4.doStart(context, out);
            JET2Writer _jettag_c_when_210_4_saved_out = out;
            while (_jettag_c_when_210_4.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("\t\t\t\t<p>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t");  //$NON-NLS-1$        
                out.write( pattern.getString("com.ibm.etools.mft.pattern.mbi.ms.xmlmq.summary.29") );
                out.write(NL);         
                out.write("\t\t\t\t</p>\t\t\t\t");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t<br>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t<p>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t");  //$NON-NLS-1$        
                out.write( pattern.getString("com.ibm.etools.mft.pattern.mbi.ms.xmlmq.summary.30") );
                out.write(NL);         
                out.write("\t\t\t\t</p>");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_when_210_4.handleBodyContent(out);
            }
            out = _jettag_c_when_210_4_saved_out;
            _jettag_c_when_210_4.doEnd();
            RuntimeTagElement _jettag_c_otherwise_219_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_219_4); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_otherwise_219_4.setRuntimeParent(_jettag_c_choose_209_3);
            _jettag_c_otherwise_219_4.setTagInfo(_td_c_otherwise_219_4);
            _jettag_c_otherwise_219_4.doStart(context, out);
            JET2Writer _jettag_c_otherwise_219_4_saved_out = out;
            while (_jettag_c_otherwise_219_4.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("\t\t\t\t<p>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t");  //$NON-NLS-1$        
                out.write( pattern.getString("com.ibm.etools.mft.pattern.mbi.ms.xmlmq.summary.31") );
                out.write(NL);         
                out.write("\t\t\t\t</p>");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_otherwise_219_4.handleBodyContent(out);
            }
            out = _jettag_c_otherwise_219_4_saved_out;
            _jettag_c_otherwise_219_4.doEnd();
            _jettag_c_choose_209_3.handleBodyContent(out);
        }
        out = _jettag_c_choose_209_3_saved_out;
        _jettag_c_choose_209_3.doEnd();
        out.write("\t</div>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("</div>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("</body>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("</html>");  //$NON-NLS-1$        
        out.write(NL);         
    }
}
