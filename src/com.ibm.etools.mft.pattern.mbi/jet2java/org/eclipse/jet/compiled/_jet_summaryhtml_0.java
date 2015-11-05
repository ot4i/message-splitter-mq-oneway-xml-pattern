package org.eclipse.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_summaryhtml_0 implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_summaryhtml_0() {
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
    private static final TagInfo _td_c_get_57_6 = new TagInfo("c:get", //$NON-NLS-1$
            57, 6,
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
    private static final TagInfo _td_c_get_62_6 = new TagInfo("c:get", //$NON-NLS-1$
            62, 6,
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
    private static final TagInfo _td_c_get_67_6 = new TagInfo("c:get", //$NON-NLS-1$
            67, 6,
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
    private static final TagInfo _td_c_get_73_6 = new TagInfo("c:get", //$NON-NLS-1$
            73, 6,
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
    private static final TagInfo _td_c_choose_109_5 = new TagInfo("c:choose", //$NON-NLS-1$
            109, 5,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_110_6 = new TagInfo("c:when", //$NON-NLS-1$
            110, 6,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "string-length($root/logQueueManager) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_113_6 = new TagInfo("c:otherwise", //$NON-NLS-1$
            113, 6,
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
    private static final TagInfo _td_c_choose_121_5 = new TagInfo("c:choose", //$NON-NLS-1$
            121, 5,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_122_6 = new TagInfo("c:when", //$NON-NLS-1$
            122, 6,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "string-length($root/errorQueueManager) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_125_6 = new TagInfo("c:otherwise", //$NON-NLS-1$
            125, 6,
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
    private static final TagInfo _td_c_choose_153_3 = new TagInfo("c:choose", //$NON-NLS-1$
            153, 3,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_154_4 = new TagInfo("c:when", //$NON-NLS-1$
            154, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/loggingRequired='true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_163_4 = new TagInfo("c:otherwise", //$NON-NLS-1$
            163, 4,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_choose_170_3 = new TagInfo("c:choose", //$NON-NLS-1$
            170, 3,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_171_4 = new TagInfo("c:when", //$NON-NLS-1$
            171, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/errorMessageRequired='true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_180_4 = new TagInfo("c:otherwise", //$NON-NLS-1$
            180, 4,
            new String[] {
            },
            new String[] {
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;

com.ibm.etools.mft.pattern.mbi.plugin.PatternPlugin pattern = com.ibm.etools.mft.pattern.mbi.plugin.PatternPlugin.getInstance();
com.ibm.etools.mft.pattern.mbi.mrrc.synchmq.PatternMessages messages = new com.ibm.etools.mft.pattern.mbi.mrrc.synchmq.PatternMessages();

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
        out.write( pattern.getMessage(context, "com.ibm.etools.mft.pattern.mbi.mrrc.synchmq.summary.24", new Object[] { "$root/instanceName" }) );
        out.write("</h2>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<p>");  //$NON-NLS-1$        
        out.write( pattern.getMessage(context, "com.ibm.etools.mft.pattern.mbi.mrrc.synchmq.summary.1", new Object[] { "$root/instanceName" }) );
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
        out.write( pattern.getString("com.ibm.etools.mft.pattern.mbi.mrrc.synchmq.summary.101") );
        out.write("</h2>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t</div>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<div class=\"content\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<p>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t");  //$NON-NLS-1$        
        out.write( pattern.getString("com.ibm.etools.mft.pattern.mbi.mrrc.synchmq.summary.103") );
        out.write(NL);         
        out.write("\t\t\t");  //$NON-NLS-1$        
        out.write( pattern.getString("com.ibm.etools.mft.pattern.mbi.mrrc.synchmq.summary.104") );
        out.write(NL);         
        out.write("\t\t</p>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<p>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t");  //$NON-NLS-1$        
        out.write( pattern.getMessage(context, "com.ibm.etools.mft.pattern.mbi.mrrc.synchmq.summary.22", new Object[] { "$root/@projectname" }) );
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
        out.write( pattern.getString("com.ibm.etools.mft.pattern.mbi.mrrc.synchmq.summary.23") );
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
        out.write("\t\t\t\t\t");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_67_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_67_6); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_67_6.setRuntimeParent(null);
        _jettag_c_get_67_6.setTagInfo(_td_c_get_67_6);
        _jettag_c_get_67_6.doStart(context, out);
        _jettag_c_get_67_6.doEnd();
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
            out.write("\t\t\t\t\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_73_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_73_6); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_73_6.setRuntimeParent(_jettag_c_if_70_4);
            _jettag_c_get_73_6.setTagInfo(_td_c_get_73_6);
            _jettag_c_get_73_6.doStart(context, out);
            _jettag_c_get_73_6.doEnd();
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
        out.write("\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<div class=\"section\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<div class=\"tl\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<h2>");  //$NON-NLS-1$        
        out.write( pattern.getMessage(context, "com.ibm.etools.mft.pattern.mbi.mrrc.synchmq.summary.102", new Object[] { "$root/instanceName" }) );
        out.write("</h2>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t</div>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<div class=\"content\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<p>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t");  //$NON-NLS-1$        
        out.write( pattern.getString("com.ibm.etools.mft.pattern.mbi.mrrc.synchmq.summary.4") );
        out.write(NL);         
        out.write("\t\t</p>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<p>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t");  //$NON-NLS-1$        
        out.write( pattern.getString("com.ibm.etools.mft.pattern.mbi.mrrc.synchmq.summary.5") );
        out.write(NL);         
        out.write("\t\t</p>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<ul>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<li>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t");  //$NON-NLS-1$        
        out.write( pattern.getMessage(context, "com.ibm.etools.mft.pattern.mbi.mrrc.synchmq.summary.6", new Object[] { "$root/queuePrefix", "$root/readRequestQueue", "$root/queueSuffix" }) );
        out.write(NL);         
        out.write("\t\t\t</li>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<li>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t");  //$NON-NLS-1$        
        out.write( pattern.getMessage(context, "com.ibm.etools.mft.pattern.mbi.mrrc.synchmq.summary.7", new Object[] { "$root/queuePrefix", "$root/storeQueue", "$root/queueSuffix" }) );
        out.write(NL);         
        out.write("\t\t\t</li>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<li>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t");  //$NON-NLS-1$        
        out.write( pattern.getMessage(context, "com.ibm.etools.mft.pattern.mbi.mrrc.synchmq.summary.8", new Object[] { "$root/queuePrefix", "$root/responseQueue", "$root/queueSuffix" }) );
        out.write(NL);         
        out.write("\t\t\t</li>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t</ul>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<p>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t");  //$NON-NLS-1$        
        out.write( pattern.getString("com.ibm.etools.mft.pattern.mbi.mrrc.synchmq.summary.9") );
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
            out.write("\t\t\t<li>");  //$NON-NLS-1$        
            out.write(NL);         
            RuntimeTagElement _jettag_c_choose_109_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_109_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_choose_109_5.setRuntimeParent(_jettag_c_if_107_4);
            _jettag_c_choose_109_5.setTagInfo(_td_c_choose_109_5);
            _jettag_c_choose_109_5.doStart(context, out);
            JET2Writer _jettag_c_choose_109_5_saved_out = out;
            while (_jettag_c_choose_109_5.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_when_110_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_110_6); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_when_110_6.setRuntimeParent(_jettag_c_choose_109_5);
                _jettag_c_when_110_6.setTagInfo(_td_c_when_110_6);
                _jettag_c_when_110_6.doStart(context, out);
                JET2Writer _jettag_c_when_110_6_saved_out = out;
                while (_jettag_c_when_110_6.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write("\t\t\t\t\t\t");  //$NON-NLS-1$        
                    out.write( pattern.getMessage(context, "com.ibm.etools.mft.pattern.mbi.mrrc.synchmq.summary.10.queueManager", new Object[] { "$root/queuePrefix", "$root/logQueue", "$root/queueSuffix", "$root/logQueueManager" }) );
                    out.write(NL);         
                    _jettag_c_when_110_6.handleBodyContent(out);
                }
                out = _jettag_c_when_110_6_saved_out;
                _jettag_c_when_110_6.doEnd();
                RuntimeTagElement _jettag_c_otherwise_113_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_113_6); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_otherwise_113_6.setRuntimeParent(_jettag_c_choose_109_5);
                _jettag_c_otherwise_113_6.setTagInfo(_td_c_otherwise_113_6);
                _jettag_c_otherwise_113_6.doStart(context, out);
                JET2Writer _jettag_c_otherwise_113_6_saved_out = out;
                while (_jettag_c_otherwise_113_6.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write("\t\t\t\t\t\t");  //$NON-NLS-1$        
                    out.write( pattern.getMessage(context, "com.ibm.etools.mft.pattern.mbi.mrrc.synchmq.summary.10", new Object[] { "$root/queuePrefix", "$root/logQueue", "$root/queueSuffix" }) );
                    out.write(NL);         
                    _jettag_c_otherwise_113_6.handleBodyContent(out);
                }
                out = _jettag_c_otherwise_113_6_saved_out;
                _jettag_c_otherwise_113_6.doEnd();
                _jettag_c_choose_109_5.handleBodyContent(out);
            }
            out = _jettag_c_choose_109_5_saved_out;
            _jettag_c_choose_109_5.doEnd();
            out.write("\t\t\t</li>");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_107_4.handleBodyContent(out);
        }
        _jettag_c_if_107_4.doEnd();
        RuntimeTagElement _jettag_c_if_119_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_119_4); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_119_4.setRuntimeParent(null);
        _jettag_c_if_119_4.setTagInfo(_td_c_if_119_4);
        _jettag_c_if_119_4.doStart(context, out);
        while (_jettag_c_if_119_4.okToProcessBody()) {
            out.write("\t\t\t<li>");  //$NON-NLS-1$        
            out.write(NL);         
            RuntimeTagElement _jettag_c_choose_121_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_121_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_choose_121_5.setRuntimeParent(_jettag_c_if_119_4);
            _jettag_c_choose_121_5.setTagInfo(_td_c_choose_121_5);
            _jettag_c_choose_121_5.doStart(context, out);
            JET2Writer _jettag_c_choose_121_5_saved_out = out;
            while (_jettag_c_choose_121_5.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_when_122_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_122_6); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_when_122_6.setRuntimeParent(_jettag_c_choose_121_5);
                _jettag_c_when_122_6.setTagInfo(_td_c_when_122_6);
                _jettag_c_when_122_6.doStart(context, out);
                JET2Writer _jettag_c_when_122_6_saved_out = out;
                while (_jettag_c_when_122_6.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write("\t\t\t\t\t\t");  //$NON-NLS-1$        
                    out.write( pattern.getMessage(context, "com.ibm.etools.mft.pattern.mbi.mrrc.synchmq.summary.11.queueManager", new Object[] { "$root/queuePrefix", "$root/errorQueue", "$root/queueSuffix", "$root/errorQueueManager" }) );
                    out.write(" ");  //$NON-NLS-1$        
                    out.write(NL);         
                    _jettag_c_when_122_6.handleBodyContent(out);
                }
                out = _jettag_c_when_122_6_saved_out;
                _jettag_c_when_122_6.doEnd();
                RuntimeTagElement _jettag_c_otherwise_125_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_125_6); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_otherwise_125_6.setRuntimeParent(_jettag_c_choose_121_5);
                _jettag_c_otherwise_125_6.setTagInfo(_td_c_otherwise_125_6);
                _jettag_c_otherwise_125_6.doStart(context, out);
                JET2Writer _jettag_c_otherwise_125_6_saved_out = out;
                while (_jettag_c_otherwise_125_6.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write("\t\t\t\t\t\t");  //$NON-NLS-1$        
                    out.write( pattern.getMessage(context, "com.ibm.etools.mft.pattern.mbi.mrrc.synchmq.summary.11", new Object[] { "$root/queuePrefix", "$root/errorQueue", "$root/queueSuffix" }) );
                    out.write(" ");  //$NON-NLS-1$        
                    out.write(NL);         
                    _jettag_c_otherwise_125_6.handleBodyContent(out);
                }
                out = _jettag_c_otherwise_125_6_saved_out;
                _jettag_c_otherwise_125_6.doEnd();
                _jettag_c_choose_121_5.handleBodyContent(out);
            }
            out = _jettag_c_choose_121_5_saved_out;
            _jettag_c_choose_121_5.doEnd();
            out.write("\t\t\t</li>");  //$NON-NLS-1$        
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
                out.write( pattern.getMessage(context, "com.ibm.etools.mft.pattern.mbi.mrrc.synchmq.summary.12.queueManager", new Object[] { "$root/queuePrefix", "$root/providerRequestQueue", "$root/queueSuffix", "$root/providerRequestQueueManager" }) );
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
                out.write( pattern.getMessage(context, "com.ibm.etools.mft.pattern.mbi.mrrc.synchmq.summary.12", new Object[] { "$root/queuePrefix", "$root/providerRequestQueue", "$root/queueSuffix" }) );
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
        out.write("\t\t<p>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t");  //$NON-NLS-1$        
        out.write( pattern.getString("com.ibm.etools.mft.pattern.mbi.mrrc.synchmq.summary.14") );
        out.write(NL);         
        out.write("\t\t</p>");  //$NON-NLS-1$        
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
        out.write( pattern.getString("com.ibm.etools.mft.pattern.mbi.mrrc.synchmq.summary.105") );
        out.write("</h2>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t</div>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<div class=\"content\">");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_choose_153_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_153_3); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_choose_153_3.setRuntimeParent(null);
        _jettag_c_choose_153_3.setTagInfo(_td_c_choose_153_3);
        _jettag_c_choose_153_3.doStart(context, out);
        JET2Writer _jettag_c_choose_153_3_saved_out = out;
        while (_jettag_c_choose_153_3.okToProcessBody()) {
            out = out.newNestedContentWriter();
            RuntimeTagElement _jettag_c_when_154_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_154_4); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_when_154_4.setRuntimeParent(_jettag_c_choose_153_3);
            _jettag_c_when_154_4.setTagInfo(_td_c_when_154_4);
            _jettag_c_when_154_4.doStart(context, out);
            JET2Writer _jettag_c_when_154_4_saved_out = out;
            while (_jettag_c_when_154_4.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("\t\t\t\t<p>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t");  //$NON-NLS-1$        
                out.write( pattern.getString("com.ibm.etools.mft.pattern.mbi.mrrc.synchmq.summary.15") );
                out.write(NL);         
                out.write("\t\t\t\t</p>\t\t");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t<br>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t<p>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t");  //$NON-NLS-1$        
                out.write( pattern.getString("com.ibm.etools.mft.pattern.mbi.mrrc.synchmq.summary.16") );
                out.write(" ");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t</p>");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_when_154_4.handleBodyContent(out);
            }
            out = _jettag_c_when_154_4_saved_out;
            _jettag_c_when_154_4.doEnd();
            RuntimeTagElement _jettag_c_otherwise_163_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_163_4); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_otherwise_163_4.setRuntimeParent(_jettag_c_choose_153_3);
            _jettag_c_otherwise_163_4.setTagInfo(_td_c_otherwise_163_4);
            _jettag_c_otherwise_163_4.doStart(context, out);
            JET2Writer _jettag_c_otherwise_163_4_saved_out = out;
            while (_jettag_c_otherwise_163_4.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("\t\t\t\t<p>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t");  //$NON-NLS-1$        
                out.write( pattern.getString("com.ibm.etools.mft.pattern.mbi.mrrc.synchmq.summary.17") );
                out.write(NL);         
                out.write("\t\t\t\t</p>");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_otherwise_163_4.handleBodyContent(out);
            }
            out = _jettag_c_otherwise_163_4_saved_out;
            _jettag_c_otherwise_163_4.doEnd();
            _jettag_c_choose_153_3.handleBodyContent(out);
        }
        out = _jettag_c_choose_153_3_saved_out;
        _jettag_c_choose_153_3.doEnd();
        out.write("\t\t<br>");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_choose_170_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_170_3); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_choose_170_3.setRuntimeParent(null);
        _jettag_c_choose_170_3.setTagInfo(_td_c_choose_170_3);
        _jettag_c_choose_170_3.doStart(context, out);
        JET2Writer _jettag_c_choose_170_3_saved_out = out;
        while (_jettag_c_choose_170_3.okToProcessBody()) {
            out = out.newNestedContentWriter();
            RuntimeTagElement _jettag_c_when_171_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_171_4); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_when_171_4.setRuntimeParent(_jettag_c_choose_170_3);
            _jettag_c_when_171_4.setTagInfo(_td_c_when_171_4);
            _jettag_c_when_171_4.doStart(context, out);
            JET2Writer _jettag_c_when_171_4_saved_out = out;
            while (_jettag_c_when_171_4.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("\t\t\t\t<p>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t");  //$NON-NLS-1$        
                out.write( pattern.getString("com.ibm.etools.mft.pattern.mbi.mrrc.synchmq.summary.18") );
                out.write(NL);         
                out.write("\t\t\t\t</p>\t\t\t\t");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t<br>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t<p>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t");  //$NON-NLS-1$        
                out.write( pattern.getString("com.ibm.etools.mft.pattern.mbi.mrrc.synchmq.summary.19") );
                out.write(NL);         
                out.write("\t\t\t\t</p>");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_when_171_4.handleBodyContent(out);
            }
            out = _jettag_c_when_171_4_saved_out;
            _jettag_c_when_171_4.doEnd();
            RuntimeTagElement _jettag_c_otherwise_180_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_180_4); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_otherwise_180_4.setRuntimeParent(_jettag_c_choose_170_3);
            _jettag_c_otherwise_180_4.setTagInfo(_td_c_otherwise_180_4);
            _jettag_c_otherwise_180_4.doStart(context, out);
            JET2Writer _jettag_c_otherwise_180_4_saved_out = out;
            while (_jettag_c_otherwise_180_4.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("\t\t\t\t<p>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t");  //$NON-NLS-1$        
                out.write( pattern.getString("com.ibm.etools.mft.pattern.mbi.mrrc.synchmq.summary.20") );
                out.write(NL);         
                out.write("\t\t\t\t</p>");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_otherwise_180_4.handleBodyContent(out);
            }
            out = _jettag_c_otherwise_180_4_saved_out;
            _jettag_c_otherwise_180_4.doEnd();
            _jettag_c_choose_170_3.handleBodyContent(out);
        }
        out = _jettag_c_choose_170_3_saved_out;
        _jettag_c_choose_170_3.doEnd();
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
