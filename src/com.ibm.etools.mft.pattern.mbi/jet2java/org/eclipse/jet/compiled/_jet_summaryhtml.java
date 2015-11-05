package org.eclipse.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_summaryhtml implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_summaryhtml() {
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
                "$root/@request", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_42_5 = new TagInfo("c:get", //$NON-NLS-1$
            42, 5,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@request", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_46_45 = new TagInfo("c:get", //$NON-NLS-1$
            46, 45,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/instanceName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_46_88 = new TagInfo("c:get", //$NON-NLS-1$
            46, 88,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_46_128 = new TagInfo("c:get", //$NON-NLS-1$
            46, 128,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@response", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_47_5 = new TagInfo("c:get", //$NON-NLS-1$
            47, 5,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@response", //$NON-NLS-1$
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
                "$root/@error", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_57_5 = new TagInfo("c:get", //$NON-NLS-1$
            57, 5,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@error", //$NON-NLS-1$
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
                "$root/@requestprocessor", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_62_5 = new TagInfo("c:get", //$NON-NLS-1$
            62, 5,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@requestprocessor", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_66_45 = new TagInfo("c:get", //$NON-NLS-1$
            66, 45,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/instanceName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_66_88 = new TagInfo("c:get", //$NON-NLS-1$
            66, 88,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_66_128 = new TagInfo("c:get", //$NON-NLS-1$
            66, 128,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@responseprocessor", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_67_5 = new TagInfo("c:get", //$NON-NLS-1$
            67, 5,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@responseprocessor", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_70_4 = new TagInfo("c:if", //$NON-NLS-1$
            70, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/loggingRequired='true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_72_45 = new TagInfo("c:get", //$NON-NLS-1$
            72, 45,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/instanceName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_72_88 = new TagInfo("c:get", //$NON-NLS-1$
            72, 88,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_72_128 = new TagInfo("c:get", //$NON-NLS-1$
            72, 128,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@log", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_73_5 = new TagInfo("c:get", //$NON-NLS-1$
            73, 5,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@log", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_107_4 = new TagInfo("c:if", //$NON-NLS-1$
            107, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/loggingRequired='true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_109_6 = new TagInfo("c:choose", //$NON-NLS-1$
            109, 6,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_110_7 = new TagInfo("c:when", //$NON-NLS-1$
            110, 7,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "string-length($root/logQueueManager) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_113_7 = new TagInfo("c:otherwise", //$NON-NLS-1$
            113, 7,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_if_119_4 = new TagInfo("c:if", //$NON-NLS-1$
            119, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/errorMessageRequired='true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_121_6 = new TagInfo("c:choose", //$NON-NLS-1$
            121, 6,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_122_7 = new TagInfo("c:when", //$NON-NLS-1$
            122, 7,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "string-length($root/errorQueueManager) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_125_7 = new TagInfo("c:otherwise", //$NON-NLS-1$
            125, 7,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_choose_132_5 = new TagInfo("c:choose", //$NON-NLS-1$
            132, 5,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_133_6 = new TagInfo("c:when", //$NON-NLS-1$
            133, 6,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "string-length($root/providerRequestQueueManager) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_136_6 = new TagInfo("c:otherwise", //$NON-NLS-1$
            136, 6,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_choose_155_3 = new TagInfo("c:choose", //$NON-NLS-1$
            155, 3,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_156_4 = new TagInfo("c:when", //$NON-NLS-1$
            156, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/loggingRequired='true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_165_4 = new TagInfo("c:otherwise", //$NON-NLS-1$
            165, 4,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_choose_172_3 = new TagInfo("c:choose", //$NON-NLS-1$
            172, 3,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_173_4 = new TagInfo("c:when", //$NON-NLS-1$
            173, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/errorMessageRequired='true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_182_4 = new TagInfo("c:otherwise", //$NON-NLS-1$
            182, 4,
            new String[] {
            },
            new String[] {
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;

com.ibm.etools.mft.pattern.mbi.plugin.PatternPlugin pattern = com.ibm.etools.mft.pattern.mbi.plugin.PatternPlugin.getInstance();
com.ibm.etools.mft.pattern.mbi.mrrc.relmq.PatternMessages messages = new com.ibm.etools.mft.pattern.mbi.mrrc.relmq.PatternMessages();

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
        out.write( pattern.getMessage(context, "com.ibm.etools.mft.pattern.mbi.mrrc.relmq.summary.25", new Object[] { "$root/instanceName" }) );
        out.write("</h2>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<p>");  //$NON-NLS-1$        
        out.write( pattern.getMessage(context, "com.ibm.etools.mft.pattern.mbi.mrrc.relmq.summary.1", new Object[] { "$root/instanceName" }) );
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
        out.write( pattern.getString("com.ibm.etools.mft.pattern.mbi.mrrc.relmq.summary.2") );
        out.write("</h2>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t</div>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<div class=\"content\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<p>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t");  //$NON-NLS-1$        
        out.write( pattern.getString("com.ibm.etools.mft.pattern.mbi.mrrc.relmq.summary.103") );
        out.write(NL);         
        out.write("\t\t\t");  //$NON-NLS-1$        
        out.write( pattern.getString("com.ibm.etools.mft.pattern.mbi.mrrc.relmq.summary.104") );
        out.write(NL);         
        out.write("\t\t</p>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<p>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t");  //$NON-NLS-1$        
        out.write( pattern.getMessage(context, "com.ibm.etools.mft.pattern.mbi.mrrc.relmq.summary.22", new Object[] { "$root/@projectname" }) );
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
        out.write("\t\t\t\t");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_42_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_42_5); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_42_5.setRuntimeParent(null);
        _jettag_c_get_42_5.setTagInfo(_td_c_get_42_5);
        _jettag_c_get_42_5.doStart(context, out);
        _jettag_c_get_42_5.doEnd();
        out.write(NL);         
        out.write("\t\t\t\t</a>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t</li>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<li>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t<a href=\"#NoPlace\" onclick=\"setStatus('/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_46_45 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_46_45); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_46_45.setRuntimeParent(null);
        _jettag_c_get_46_45.setTagInfo(_td_c_get_46_45);
        _jettag_c_get_46_45.doStart(context, out);
        _jettag_c_get_46_45.doEnd();
        out.write("_Flows/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_46_88 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_46_88); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_46_88.setRuntimeParent(null);
        _jettag_c_get_46_88.setTagInfo(_td_c_get_46_88);
        _jettag_c_get_46_88.doStart(context, out);
        _jettag_c_get_46_88.doEnd();
        RuntimeTagElement _jettag_c_get_46_128 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_46_128); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_46_128.setRuntimeParent(null);
        _jettag_c_get_46_128.setTagInfo(_td_c_get_46_128);
        _jettag_c_get_46_128.doStart(context, out);
        _jettag_c_get_46_128.doEnd();
        out.write(".msgflow')\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_47_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_47_5); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_47_5.setRuntimeParent(null);
        _jettag_c_get_47_5.setTagInfo(_td_c_get_47_5);
        _jettag_c_get_47_5.doStart(context, out);
        _jettag_c_get_47_5.doEnd();
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
        out.write( pattern.getString("com.ibm.etools.mft.pattern.mbi.mrrc.relmq.summary.23") );
        out.write(NL);         
        out.write("\t\t</p>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<ul>");  //$NON-NLS-1$        
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
        out.write("\t\t\t\t");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_57_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_57_5); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_57_5.setRuntimeParent(null);
        _jettag_c_get_57_5.setTagInfo(_td_c_get_57_5);
        _jettag_c_get_57_5.doStart(context, out);
        _jettag_c_get_57_5.doEnd();
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
        out.write("\t\t\t\t");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_62_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_62_5); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_62_5.setRuntimeParent(null);
        _jettag_c_get_62_5.setTagInfo(_td_c_get_62_5);
        _jettag_c_get_62_5.doStart(context, out);
        _jettag_c_get_62_5.doEnd();
        out.write(NL);         
        out.write("\t\t\t\t</a>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t</li>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<li>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t<a href=\"#NoPlace\" onclick=\"setStatus('/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_66_45 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_66_45); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_66_45.setRuntimeParent(null);
        _jettag_c_get_66_45.setTagInfo(_td_c_get_66_45);
        _jettag_c_get_66_45.doStart(context, out);
        _jettag_c_get_66_45.doEnd();
        out.write("_Flows/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_66_88 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_66_88); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_66_88.setRuntimeParent(null);
        _jettag_c_get_66_88.setTagInfo(_td_c_get_66_88);
        _jettag_c_get_66_88.doStart(context, out);
        _jettag_c_get_66_88.doEnd();
        RuntimeTagElement _jettag_c_get_66_128 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_66_128); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_66_128.setRuntimeParent(null);
        _jettag_c_get_66_128.setTagInfo(_td_c_get_66_128);
        _jettag_c_get_66_128.doStart(context, out);
        _jettag_c_get_66_128.doEnd();
        out.write(".subflow')\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_67_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_67_5); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_67_5.setRuntimeParent(null);
        _jettag_c_get_67_5.setTagInfo(_td_c_get_67_5);
        _jettag_c_get_67_5.doStart(context, out);
        _jettag_c_get_67_5.doEnd();
        out.write(NL);         
        out.write("\t\t\t\t</a>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t</li>");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_70_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_70_4); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_70_4.setRuntimeParent(null);
        _jettag_c_if_70_4.setTagInfo(_td_c_if_70_4);
        _jettag_c_if_70_4.doStart(context, out);
        while (_jettag_c_if_70_4.okToProcessBody()) {
            out.write("\t\t\t<li>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t\t<a href=\"#NoPlace\" onclick=\"setStatus('/");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_72_45 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_72_45); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_72_45.setRuntimeParent(_jettag_c_if_70_4);
            _jettag_c_get_72_45.setTagInfo(_td_c_get_72_45);
            _jettag_c_get_72_45.doStart(context, out);
            _jettag_c_get_72_45.doEnd();
            out.write("_Flows/");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_72_88 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_72_88); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_72_88.setRuntimeParent(_jettag_c_if_70_4);
            _jettag_c_get_72_88.setTagInfo(_td_c_get_72_88);
            _jettag_c_get_72_88.doStart(context, out);
            _jettag_c_get_72_88.doEnd();
            RuntimeTagElement _jettag_c_get_72_128 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_72_128); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_72_128.setRuntimeParent(_jettag_c_if_70_4);
            _jettag_c_get_72_128.setTagInfo(_td_c_get_72_128);
            _jettag_c_get_72_128.doStart(context, out);
            _jettag_c_get_72_128.doEnd();
            out.write(".subflow')\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_73_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_73_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_73_5.setRuntimeParent(_jettag_c_if_70_4);
            _jettag_c_get_73_5.setTagInfo(_td_c_get_73_5);
            _jettag_c_get_73_5.doStart(context, out);
            _jettag_c_get_73_5.doEnd();
            out.write(NL);         
            out.write("\t\t\t\t</a>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t</li>");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_70_4.handleBodyContent(out);
        }
        _jettag_c_if_70_4.doEnd();
        out.write("\t\t</ul>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t</div>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("</div>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("<div class=\"section\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<div class=\"tl\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<h2>");  //$NON-NLS-1$        
        out.write( pattern.getString("com.ibm.etools.mft.pattern.mbi.mrrc.relmq.summary.102") );
        out.write("</h2>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t</div>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<div class=\"content\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<p>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t");  //$NON-NLS-1$        
        out.write( pattern.getString("com.ibm.etools.mft.pattern.mbi.mrrc.relmq.summary.4") );
        out.write(NL);         
        out.write("\t\t</p>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<p>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t");  //$NON-NLS-1$        
        out.write( pattern.getString("com.ibm.etools.mft.pattern.mbi.mrrc.relmq.summary.5") );
        out.write(NL);         
        out.write("\t\t</p>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<ul>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<li>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t");  //$NON-NLS-1$        
        out.write( pattern.getMessage(context, "com.ibm.etools.mft.pattern.mbi.mrrc.relmq.summary.6", new Object[] { "$root/queueprefix", "$root/readRequestQueue", "$root/queuesuffix" }) );
        out.write(NL);         
        out.write("\t\t\t</li>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<li>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t");  //$NON-NLS-1$        
        out.write( pattern.getMessage(context, "com.ibm.etools.mft.pattern.mbi.mrrc.relmq.summary.7", new Object[] { "$root/queueprefix", "$root/storeQueue", "$root/queuesuffix" }) );
        out.write(NL);         
        out.write("\t\t\t</li>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<li>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t");  //$NON-NLS-1$        
        out.write( pattern.getMessage(context, "com.ibm.etools.mft.pattern.mbi.mrrc.relmq.summary.8", new Object[] { "$root/queueprefix", "$root/responseQueue", "$root/queuesuffix" }) );
        out.write(NL);         
        out.write("\t\t\t</li>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t</ul>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<p>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t");  //$NON-NLS-1$        
        out.write( pattern.getString("com.ibm.etools.mft.pattern.mbi.mrrc.relmq.summary.9") );
        out.write(NL);         
        out.write("\t\t</p>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<ul>");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_107_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_107_4); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_107_4.setRuntimeParent(null);
        _jettag_c_if_107_4.setTagInfo(_td_c_if_107_4);
        _jettag_c_if_107_4.doStart(context, out);
        while (_jettag_c_if_107_4.okToProcessBody()) {
            out.write("\t\t\t\t<li>");  //$NON-NLS-1$        
            out.write(NL);         
            RuntimeTagElement _jettag_c_choose_109_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_109_6); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_choose_109_6.setRuntimeParent(_jettag_c_if_107_4);
            _jettag_c_choose_109_6.setTagInfo(_td_c_choose_109_6);
            _jettag_c_choose_109_6.doStart(context, out);
            JET2Writer _jettag_c_choose_109_6_saved_out = out;
            while (_jettag_c_choose_109_6.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_when_110_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_110_7); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_when_110_7.setRuntimeParent(_jettag_c_choose_109_6);
                _jettag_c_when_110_7.setTagInfo(_td_c_when_110_7);
                _jettag_c_when_110_7.doStart(context, out);
                JET2Writer _jettag_c_when_110_7_saved_out = out;
                while (_jettag_c_when_110_7.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write("\t\t\t\t\t\t\t");  //$NON-NLS-1$        
                    out.write( pattern.getMessage(context, "com.ibm.etools.mft.pattern.mbi.mrrc.relmq.summary.10.queueManager", new Object[] { "$root/queueprefix", "$root/logQueue", "$root/queuesuffix", "$root/logQueueManager" }) );
                    out.write(NL);         
                    _jettag_c_when_110_7.handleBodyContent(out);
                }
                out = _jettag_c_when_110_7_saved_out;
                _jettag_c_when_110_7.doEnd();
                RuntimeTagElement _jettag_c_otherwise_113_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_113_7); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_otherwise_113_7.setRuntimeParent(_jettag_c_choose_109_6);
                _jettag_c_otherwise_113_7.setTagInfo(_td_c_otherwise_113_7);
                _jettag_c_otherwise_113_7.doStart(context, out);
                JET2Writer _jettag_c_otherwise_113_7_saved_out = out;
                while (_jettag_c_otherwise_113_7.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write("\t\t\t\t\t\t\t");  //$NON-NLS-1$        
                    out.write( pattern.getMessage(context, "com.ibm.etools.mft.pattern.mbi.mrrc.relmq.summary.10", new Object[] { "$root/queueprefix", "$root/logQueue", "$root/queuesuffix" }) );
                    out.write(NL);         
                    _jettag_c_otherwise_113_7.handleBodyContent(out);
                }
                out = _jettag_c_otherwise_113_7_saved_out;
                _jettag_c_otherwise_113_7.doEnd();
                _jettag_c_choose_109_6.handleBodyContent(out);
            }
            out = _jettag_c_choose_109_6_saved_out;
            _jettag_c_choose_109_6.doEnd();
            out.write("\t\t\t\t</li>");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_107_4.handleBodyContent(out);
        }
        _jettag_c_if_107_4.doEnd();
        RuntimeTagElement _jettag_c_if_119_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_119_4); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_119_4.setRuntimeParent(null);
        _jettag_c_if_119_4.setTagInfo(_td_c_if_119_4);
        _jettag_c_if_119_4.doStart(context, out);
        while (_jettag_c_if_119_4.okToProcessBody()) {
            out.write("\t\t\t\t<li>");  //$NON-NLS-1$        
            out.write(NL);         
            RuntimeTagElement _jettag_c_choose_121_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_121_6); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_choose_121_6.setRuntimeParent(_jettag_c_if_119_4);
            _jettag_c_choose_121_6.setTagInfo(_td_c_choose_121_6);
            _jettag_c_choose_121_6.doStart(context, out);
            JET2Writer _jettag_c_choose_121_6_saved_out = out;
            while (_jettag_c_choose_121_6.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_when_122_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_122_7); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_when_122_7.setRuntimeParent(_jettag_c_choose_121_6);
                _jettag_c_when_122_7.setTagInfo(_td_c_when_122_7);
                _jettag_c_when_122_7.doStart(context, out);
                JET2Writer _jettag_c_when_122_7_saved_out = out;
                while (_jettag_c_when_122_7.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write("\t\t\t\t\t\t\t");  //$NON-NLS-1$        
                    out.write( pattern.getMessage(context, "com.ibm.etools.mft.pattern.mbi.mrrc.relmq.summary.11.queueManager", new Object[] { "$root/queueprefix", "$root/errorQueue", "$root/queuesuffix", "$root/errorQueueManager" }) );
                    out.write(" ");  //$NON-NLS-1$        
                    out.write(NL);         
                    _jettag_c_when_122_7.handleBodyContent(out);
                }
                out = _jettag_c_when_122_7_saved_out;
                _jettag_c_when_122_7.doEnd();
                RuntimeTagElement _jettag_c_otherwise_125_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_125_7); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_otherwise_125_7.setRuntimeParent(_jettag_c_choose_121_6);
                _jettag_c_otherwise_125_7.setTagInfo(_td_c_otherwise_125_7);
                _jettag_c_otherwise_125_7.doStart(context, out);
                JET2Writer _jettag_c_otherwise_125_7_saved_out = out;
                while (_jettag_c_otherwise_125_7.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write("\t\t\t\t\t\t\t");  //$NON-NLS-1$        
                    out.write( pattern.getMessage(context, "com.ibm.etools.mft.pattern.mbi.mrrc.relmq.summary.11", new Object[] { "$root/queueprefix", "$root/errorQueue", "$root/queuesuffix" }) );
                    out.write(" ");  //$NON-NLS-1$        
                    out.write(NL);         
                    _jettag_c_otherwise_125_7.handleBodyContent(out);
                }
                out = _jettag_c_otherwise_125_7_saved_out;
                _jettag_c_otherwise_125_7.doEnd();
                _jettag_c_choose_121_6.handleBodyContent(out);
            }
            out = _jettag_c_choose_121_6_saved_out;
            _jettag_c_choose_121_6.doEnd();
            out.write("\t\t\t\t</li>");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_119_4.handleBodyContent(out);
        }
        _jettag_c_if_119_4.doEnd();
        out.write("\t\t\t<li>");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_choose_132_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_132_5); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_choose_132_5.setRuntimeParent(null);
        _jettag_c_choose_132_5.setTagInfo(_td_c_choose_132_5);
        _jettag_c_choose_132_5.doStart(context, out);
        JET2Writer _jettag_c_choose_132_5_saved_out = out;
        while (_jettag_c_choose_132_5.okToProcessBody()) {
            out = out.newNestedContentWriter();
            RuntimeTagElement _jettag_c_when_133_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_133_6); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_when_133_6.setRuntimeParent(_jettag_c_choose_132_5);
            _jettag_c_when_133_6.setTagInfo(_td_c_when_133_6);
            _jettag_c_when_133_6.doStart(context, out);
            JET2Writer _jettag_c_when_133_6_saved_out = out;
            while (_jettag_c_when_133_6.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("\t\t\t\t\t\t");  //$NON-NLS-1$        
                out.write( pattern.getMessage(context, "com.ibm.etools.mft.pattern.mbi.mrrc.relmq.summary.12.queueManager", new Object[] { "$root/queueprefix", "$root/providerRequestQueue", "$root/queuesuffix", "$root/providerRequestQueueManager" }) );
                out.write(NL);         
                _jettag_c_when_133_6.handleBodyContent(out);
            }
            out = _jettag_c_when_133_6_saved_out;
            _jettag_c_when_133_6.doEnd();
            RuntimeTagElement _jettag_c_otherwise_136_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_136_6); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_otherwise_136_6.setRuntimeParent(_jettag_c_choose_132_5);
            _jettag_c_otherwise_136_6.setTagInfo(_td_c_otherwise_136_6);
            _jettag_c_otherwise_136_6.doStart(context, out);
            JET2Writer _jettag_c_otherwise_136_6_saved_out = out;
            while (_jettag_c_otherwise_136_6.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("\t\t\t\t\t\t");  //$NON-NLS-1$        
                out.write( pattern.getMessage(context, "com.ibm.etools.mft.pattern.mbi.mrrc.relmq.summary.12", new Object[] { "$root/queueprefix", "$root/providerRequestQueue", "$root/queuesuffix" }) );
                out.write(NL);         
                _jettag_c_otherwise_136_6.handleBodyContent(out);
            }
            out = _jettag_c_otherwise_136_6_saved_out;
            _jettag_c_otherwise_136_6.doEnd();
            _jettag_c_choose_132_5.handleBodyContent(out);
        }
        out = _jettag_c_choose_132_5_saved_out;
        _jettag_c_choose_132_5.doEnd();
        out.write("\t\t\t</li>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t</ul>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<h3>");  //$NON-NLS-1$        
        out.write( pattern.getString("com.ibm.etools.mft.pattern.mbi.mrrc.relmq.summary.24") );
        out.write("</h3>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<p>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t");  //$NON-NLS-1$        
        out.write( pattern.getString("com.ibm.etools.mft.pattern.mbi.mrrc.relmq.summary.14") );
        out.write(NL);         
        out.write("\t\t</p>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t</div>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("</div>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write(NL);         
        out.write("<div class=\"section\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<div class=\"tl\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<h2>");  //$NON-NLS-1$        
        out.write( pattern.getString("com.ibm.etools.mft.pattern.mbi.mrrc.relmq.summary.105") );
        out.write("</h2>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t</div>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<div class=\"content\">");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_choose_155_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_155_3); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_choose_155_3.setRuntimeParent(null);
        _jettag_c_choose_155_3.setTagInfo(_td_c_choose_155_3);
        _jettag_c_choose_155_3.doStart(context, out);
        JET2Writer _jettag_c_choose_155_3_saved_out = out;
        while (_jettag_c_choose_155_3.okToProcessBody()) {
            out = out.newNestedContentWriter();
            RuntimeTagElement _jettag_c_when_156_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_156_4); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_when_156_4.setRuntimeParent(_jettag_c_choose_155_3);
            _jettag_c_when_156_4.setTagInfo(_td_c_when_156_4);
            _jettag_c_when_156_4.doStart(context, out);
            JET2Writer _jettag_c_when_156_4_saved_out = out;
            while (_jettag_c_when_156_4.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("\t\t\t\t<p>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t");  //$NON-NLS-1$        
                out.write( pattern.getString("com.ibm.etools.mft.pattern.mbi.mrrc.relmq.summary.15") );
                out.write(NL);         
                out.write("\t\t\t\t</p>\t\t\t\t");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t<br>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t<p>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t");  //$NON-NLS-1$        
                out.write( pattern.getString("com.ibm.etools.mft.pattern.mbi.mrrc.relmq.summary.16") );
                out.write(" ");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t</p>");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_when_156_4.handleBodyContent(out);
            }
            out = _jettag_c_when_156_4_saved_out;
            _jettag_c_when_156_4.doEnd();
            RuntimeTagElement _jettag_c_otherwise_165_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_165_4); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_otherwise_165_4.setRuntimeParent(_jettag_c_choose_155_3);
            _jettag_c_otherwise_165_4.setTagInfo(_td_c_otherwise_165_4);
            _jettag_c_otherwise_165_4.doStart(context, out);
            JET2Writer _jettag_c_otherwise_165_4_saved_out = out;
            while (_jettag_c_otherwise_165_4.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("\t\t\t\t<p>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t");  //$NON-NLS-1$        
                out.write( pattern.getString("com.ibm.etools.mft.pattern.mbi.mrrc.relmq.summary.17") );
                out.write(NL);         
                out.write("\t\t\t\t</p>");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_otherwise_165_4.handleBodyContent(out);
            }
            out = _jettag_c_otherwise_165_4_saved_out;
            _jettag_c_otherwise_165_4.doEnd();
            _jettag_c_choose_155_3.handleBodyContent(out);
        }
        out = _jettag_c_choose_155_3_saved_out;
        _jettag_c_choose_155_3.doEnd();
        out.write("\t\t<br>");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_choose_172_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_172_3); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_choose_172_3.setRuntimeParent(null);
        _jettag_c_choose_172_3.setTagInfo(_td_c_choose_172_3);
        _jettag_c_choose_172_3.doStart(context, out);
        JET2Writer _jettag_c_choose_172_3_saved_out = out;
        while (_jettag_c_choose_172_3.okToProcessBody()) {
            out = out.newNestedContentWriter();
            RuntimeTagElement _jettag_c_when_173_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_173_4); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_when_173_4.setRuntimeParent(_jettag_c_choose_172_3);
            _jettag_c_when_173_4.setTagInfo(_td_c_when_173_4);
            _jettag_c_when_173_4.doStart(context, out);
            JET2Writer _jettag_c_when_173_4_saved_out = out;
            while (_jettag_c_when_173_4.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("\t\t\t\t<p>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t");  //$NON-NLS-1$        
                out.write( pattern.getString("com.ibm.etools.mft.pattern.mbi.mrrc.relmq.summary.18") );
                out.write(NL);         
                out.write("\t\t\t\t</p>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t<br>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t<p>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t");  //$NON-NLS-1$        
                out.write( pattern.getString("com.ibm.etools.mft.pattern.mbi.mrrc.relmq.summary.19") );
                out.write(NL);         
                out.write("\t\t\t\t</p>");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_when_173_4.handleBodyContent(out);
            }
            out = _jettag_c_when_173_4_saved_out;
            _jettag_c_when_173_4.doEnd();
            RuntimeTagElement _jettag_c_otherwise_182_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_182_4); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_otherwise_182_4.setRuntimeParent(_jettag_c_choose_172_3);
            _jettag_c_otherwise_182_4.setTagInfo(_td_c_otherwise_182_4);
            _jettag_c_otherwise_182_4.doStart(context, out);
            JET2Writer _jettag_c_otherwise_182_4_saved_out = out;
            while (_jettag_c_otherwise_182_4.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("\t\t\t\t<p>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t");  //$NON-NLS-1$        
                out.write( pattern.getString("com.ibm.etools.mft.pattern.mbi.mrrc.relmq.summary.20") );
                out.write(NL);         
                out.write("\t\t\t\t</p>");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_otherwise_182_4.handleBodyContent(out);
            }
            out = _jettag_c_otherwise_182_4_saved_out;
            _jettag_c_otherwise_182_4.doEnd();
            _jettag_c_choose_172_3.handleBodyContent(out);
        }
        out = _jettag_c_choose_172_3_saved_out;
        _jettag_c_choose_172_3.doEnd();
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
