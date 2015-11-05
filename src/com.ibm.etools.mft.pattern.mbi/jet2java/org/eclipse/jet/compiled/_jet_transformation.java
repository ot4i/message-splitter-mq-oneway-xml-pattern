package org.eclipse.jet.compiled;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2TemplateLoader;
import org.eclipse.jet.JET2TemplateLoaderExtension;

public class _jet_transformation implements JET2TemplateLoader,
        JET2TemplateLoaderExtension {

    private JET2TemplateLoader delegate = null;

    private final static Map pathToTemplateOrdinalMap = new HashMap(48);
    static {
        pathToTemplateOrdinalMap.put("mbi/mrrc/relmq/templates/dump.jet", //$NON-NLS-1$
                new Integer(0));
        pathToTemplateOrdinalMap.put("mbi/mrrc/relmq/templates/main.jet", //$NON-NLS-1$
                new Integer(1));
        pathToTemplateOrdinalMap.put("mbi/mrrc/relmq/templates/root/Error.esql.jet", //$NON-NLS-1$
                new Integer(2));
        pathToTemplateOrdinalMap.put("mbi/mrrc/relmq/templates/root/Error.subflow.jet", //$NON-NLS-1$
                new Integer(3));
        pathToTemplateOrdinalMap.put("mbi/mrrc/relmq/templates/root/Intermediary.esql.jet", //$NON-NLS-1$
                new Integer(4));
        pathToTemplateOrdinalMap.put("mbi/mrrc/relmq/templates/root/Log.esql.jet", //$NON-NLS-1$
                new Integer(5));
        pathToTemplateOrdinalMap.put("mbi/mrrc/relmq/templates/root/Log.subflow.jet", //$NON-NLS-1$
                new Integer(6));
        pathToTemplateOrdinalMap.put("mbi/mrrc/relmq/templates/root/Request.msgflow.jet", //$NON-NLS-1$
                new Integer(7));
        pathToTemplateOrdinalMap.put("mbi/mrrc/relmq/templates/root/RequestProcessor.subflow.jet", //$NON-NLS-1$
                new Integer(8));
        pathToTemplateOrdinalMap.put("mbi/mrrc/relmq/templates/root/Response.msgflow.jet", //$NON-NLS-1$
                new Integer(9));
        pathToTemplateOrdinalMap.put("mbi/mrrc/relmq/templates/root/ResponseProcessor.subflow.jet", //$NON-NLS-1$
                new Integer(10));
        pathToTemplateOrdinalMap.put("mbi/mrrc/relmq/templates/root/project.jet", //$NON-NLS-1$
                new Integer(11));
        pathToTemplateOrdinalMap.put("mbi/mrrc/relmq/templates/root/summary.html.jet", //$NON-NLS-1$
                new Integer(12));
        pathToTemplateOrdinalMap.put("mbi/mrrc/synchmq/templates/dump.jet", //$NON-NLS-1$
                new Integer(13));
        pathToTemplateOrdinalMap.put("mbi/mrrc/synchmq/templates/main.jet", //$NON-NLS-1$
                new Integer(14));
        pathToTemplateOrdinalMap.put("mbi/mrrc/synchmq/templates/root/Error.esql.jet", //$NON-NLS-1$
                new Integer(15));
        pathToTemplateOrdinalMap.put("mbi/mrrc/synchmq/templates/root/Error.subflow.jet", //$NON-NLS-1$
                new Integer(16));
        pathToTemplateOrdinalMap.put("mbi/mrrc/synchmq/templates/root/Intermediary.esql.jet", //$NON-NLS-1$
                new Integer(17));
        pathToTemplateOrdinalMap.put("mbi/mrrc/synchmq/templates/root/Log.esql.jet", //$NON-NLS-1$
                new Integer(18));
        pathToTemplateOrdinalMap.put("mbi/mrrc/synchmq/templates/root/Log.subflow.jet", //$NON-NLS-1$
                new Integer(19));
        pathToTemplateOrdinalMap.put("mbi/mrrc/synchmq/templates/root/Request.msgflow.jet", //$NON-NLS-1$
                new Integer(20));
        pathToTemplateOrdinalMap.put("mbi/mrrc/synchmq/templates/root/RequestProcessor.subflow.jet", //$NON-NLS-1$
                new Integer(21));
        pathToTemplateOrdinalMap.put("mbi/mrrc/synchmq/templates/root/Response.msgflow.jet", //$NON-NLS-1$
                new Integer(22));
        pathToTemplateOrdinalMap.put("mbi/mrrc/synchmq/templates/root/ResponseProcessor.subflow.jet", //$NON-NLS-1$
                new Integer(23));
        pathToTemplateOrdinalMap.put("mbi/mrrc/synchmq/templates/root/project.jet", //$NON-NLS-1$
                new Integer(24));
        pathToTemplateOrdinalMap.put("mbi/mrrc/synchmq/templates/root/summary.html.jet", //$NON-NLS-1$
                new Integer(25));
        pathToTemplateOrdinalMap.put("mbi/ms/xmlmq/templates/dump.jet", //$NON-NLS-1$
                new Integer(26));
        pathToTemplateOrdinalMap.put("mbi/ms/xmlmq/templates/main.jet", //$NON-NLS-1$
                new Integer(27));
        pathToTemplateOrdinalMap.put("mbi/ms/xmlmq/templates/root/CancelError.subflow.jet", //$NON-NLS-1$
                new Integer(28));
        pathToTemplateOrdinalMap.put("mbi/ms/xmlmq/templates/root/Error.esql.jet", //$NON-NLS-1$
                new Integer(29));
        pathToTemplateOrdinalMap.put("mbi/ms/xmlmq/templates/root/Log.esql.jet", //$NON-NLS-1$
                new Integer(30));
        pathToTemplateOrdinalMap.put("mbi/ms/xmlmq/templates/root/Log.subflow.jet", //$NON-NLS-1$
                new Integer(31));
        pathToTemplateOrdinalMap.put("mbi/ms/xmlmq/templates/root/MessageProcessor.subflow.jet", //$NON-NLS-1$
                new Integer(32));
        pathToTemplateOrdinalMap.put("mbi/ms/xmlmq/templates/root/MessageSplitter.esql.jet", //$NON-NLS-1$
                new Integer(33));
        pathToTemplateOrdinalMap.put("mbi/ms/xmlmq/templates/root/MessageSplitter.msgflow.jet", //$NON-NLS-1$
                new Integer(34));
        pathToTemplateOrdinalMap.put("mbi/ms/xmlmq/templates/root/MovetoContainer.esql.jet", //$NON-NLS-1$
                new Integer(35));
        pathToTemplateOrdinalMap.put("mbi/ms/xmlmq/templates/root/MovetoRoot.esql.jet", //$NON-NLS-1$
                new Integer(36));
        pathToTemplateOrdinalMap.put("mbi/ms/xmlmq/templates/root/SaveError.subflow.jet", //$NON-NLS-1$
                new Integer(37));
        pathToTemplateOrdinalMap.put("mbi/ms/xmlmq/templates/root/destinationCache/declarecache.esql.jet", //$NON-NLS-1$
                new Integer(38));
        pathToTemplateOrdinalMap.put("mbi/ms/xmlmq/templates/root/destinationCache/destination_cache-2k.esql.jet", //$NON-NLS-1$
                new Integer(39));
        pathToTemplateOrdinalMap.put("mbi/ms/xmlmq/templates/root/destinationCache/destination_cache.subflow.jet", //$NON-NLS-1$
                new Integer(40));
        pathToTemplateOrdinalMap.put("mbi/ms/xmlmq/templates/root/destinationCache/destination_cache_1k.esql.jet", //$NON-NLS-1$
                new Integer(41));
        pathToTemplateOrdinalMap.put("mbi/ms/xmlmq/templates/root/project.jet", //$NON-NLS-1$
                new Integer(42));
        pathToTemplateOrdinalMap.put("mbi/ms/xmlmq/templates/root/routeDefault/route_default.subflow.jet", //$NON-NLS-1$
                new Integer(43));
        pathToTemplateOrdinalMap.put("mbi/ms/xmlmq/templates/root/routeRoute/route_route.esql.jet", //$NON-NLS-1$
                new Integer(44));
        pathToTemplateOrdinalMap.put("mbi/ms/xmlmq/templates/root/routeRoute/route_route.subflow.jet", //$NON-NLS-1$
                new Integer(45));
        pathToTemplateOrdinalMap.put("mbi/ms/xmlmq/templates/root/summary.jet", //$NON-NLS-1$
                new Integer(46));
        pathToTemplateOrdinalMap.put("mbi/templates/main.jet", //$NON-NLS-1$
                new Integer(47));
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.jet.JET2TemplateLoader#getTemplate(java.lang.String)
     */
    public JET2Template getTemplate(final String templatePath) {
        final Integer ordinal = (Integer)pathToTemplateOrdinalMap.get(templatePath);
        if(ordinal != null) {
           switch (ordinal.intValue()) {
            case 0: // mbi/mrrc/relmq/templates/dump.jet
                return new org.eclipse.jet.compiled._jet_dump();
            case 1: // mbi/mrrc/relmq/templates/main.jet
                return new org.eclipse.jet.compiled._jet_main_2();
            case 2: // mbi/mrrc/relmq/templates/root/Error.esql.jet
                return new org.eclipse.jet.compiled._jet_Erroresql();
            case 3: // mbi/mrrc/relmq/templates/root/Error.subflow.jet
                return new org.eclipse.jet.compiled._jet_Errorsubflow_0();
            case 4: // mbi/mrrc/relmq/templates/root/Intermediary.esql.jet
                return new org.eclipse.jet.compiled._jet_Intermediaryesql();
            case 5: // mbi/mrrc/relmq/templates/root/Log.esql.jet
                return new org.eclipse.jet.compiled._jet_Logesql();
            case 6: // mbi/mrrc/relmq/templates/root/Log.subflow.jet
                return new org.eclipse.jet.compiled._jet_Logsubflow_0();
            case 7: // mbi/mrrc/relmq/templates/root/Request.msgflow.jet
                return new org.eclipse.jet.compiled._jet_Requestmsgflow_0();
            case 8: // mbi/mrrc/relmq/templates/root/RequestProcessor.subflow.jet
                return new org.eclipse.jet.compiled._jet_RequestProcessorsubflow_0();
            case 9: // mbi/mrrc/relmq/templates/root/Response.msgflow.jet
                return new org.eclipse.jet.compiled._jet_Responsemsgflow_0();
            case 10: // mbi/mrrc/relmq/templates/root/ResponseProcessor.subflow.jet
                return new org.eclipse.jet.compiled._jet_ResponseProcessorsubflow_0();
            case 11: // mbi/mrrc/relmq/templates/root/project.jet
                return new org.eclipse.jet.compiled._jet_project();
            case 12: // mbi/mrrc/relmq/templates/root/summary.html.jet
                return new org.eclipse.jet.compiled._jet_summaryhtml();
            case 13: // mbi/mrrc/synchmq/templates/dump.jet
                return new org.eclipse.jet.compiled._jet_dump_0();
            case 14: // mbi/mrrc/synchmq/templates/main.jet
                return new org.eclipse.jet.compiled._jet_main_0();
            case 15: // mbi/mrrc/synchmq/templates/root/Error.esql.jet
                return new org.eclipse.jet.compiled._jet_Erroresql_0();
            case 16: // mbi/mrrc/synchmq/templates/root/Error.subflow.jet
                return new org.eclipse.jet.compiled._jet_Errorsubflow();
            case 17: // mbi/mrrc/synchmq/templates/root/Intermediary.esql.jet
                return new org.eclipse.jet.compiled._jet_Intermediaryesql_0();
            case 18: // mbi/mrrc/synchmq/templates/root/Log.esql.jet
                return new org.eclipse.jet.compiled._jet_Logesql_0();
            case 19: // mbi/mrrc/synchmq/templates/root/Log.subflow.jet
                return new org.eclipse.jet.compiled._jet_Logsubflow();
            case 20: // mbi/mrrc/synchmq/templates/root/Request.msgflow.jet
                return new org.eclipse.jet.compiled._jet_Requestmsgflow();
            case 21: // mbi/mrrc/synchmq/templates/root/RequestProcessor.subflow.jet
                return new org.eclipse.jet.compiled._jet_RequestProcessorsubflow();
            case 22: // mbi/mrrc/synchmq/templates/root/Response.msgflow.jet
                return new org.eclipse.jet.compiled._jet_Responsemsgflow();
            case 23: // mbi/mrrc/synchmq/templates/root/ResponseProcessor.subflow.jet
                return new org.eclipse.jet.compiled._jet_ResponseProcessorsubflow();
            case 24: // mbi/mrrc/synchmq/templates/root/project.jet
                return new org.eclipse.jet.compiled._jet_project_0();
            case 25: // mbi/mrrc/synchmq/templates/root/summary.html.jet
                return new org.eclipse.jet.compiled._jet_summaryhtml_0();
            case 26: // mbi/ms/xmlmq/templates/dump.jet
                return new org.eclipse.jet.compiled._jet_dump_1();
            case 27: // mbi/ms/xmlmq/templates/main.jet
                return new org.eclipse.jet.compiled._jet_main_1();
            case 28: // mbi/ms/xmlmq/templates/root/CancelError.subflow.jet
                return new org.eclipse.jet.compiled._jet_CancelErrorsubflow();
            case 29: // mbi/ms/xmlmq/templates/root/Error.esql.jet
                return new org.eclipse.jet.compiled._jet_Erroresql_1();
            case 30: // mbi/ms/xmlmq/templates/root/Log.esql.jet
                return new org.eclipse.jet.compiled._jet_Logesql_1();
            case 31: // mbi/ms/xmlmq/templates/root/Log.subflow.jet
                return new org.eclipse.jet.compiled._jet_Logsubflow_1();
            case 32: // mbi/ms/xmlmq/templates/root/MessageProcessor.subflow.jet
                return new org.eclipse.jet.compiled._jet_MessageProcessorsubflow();
            case 33: // mbi/ms/xmlmq/templates/root/MessageSplitter.esql.jet
                return new org.eclipse.jet.compiled._jet_MessageSplitteresql();
            case 34: // mbi/ms/xmlmq/templates/root/MessageSplitter.msgflow.jet
                return new org.eclipse.jet.compiled._jet_MessageSplittermsgflow();
            case 35: // mbi/ms/xmlmq/templates/root/MovetoContainer.esql.jet
                return new org.eclipse.jet.compiled._jet_MovetoContaineresql();
            case 36: // mbi/ms/xmlmq/templates/root/MovetoRoot.esql.jet
                return new org.eclipse.jet.compiled._jet_MovetoRootesql();
            case 37: // mbi/ms/xmlmq/templates/root/SaveError.subflow.jet
                return new org.eclipse.jet.compiled._jet_SaveErrorsubflow();
            case 38: // mbi/ms/xmlmq/templates/root/destinationCache/declarecache.esql.jet
                return new org.eclipse.jet.compiled._jet_declarecacheesql();
            case 39: // mbi/ms/xmlmq/templates/root/destinationCache/destination_cache-2k.esql.jet
                return new org.eclipse.jet.compiled._jet_destination_cache2kesql();
            case 40: // mbi/ms/xmlmq/templates/root/destinationCache/destination_cache.subflow.jet
                return new org.eclipse.jet.compiled._jet_destination_cachesubflow();
            case 41: // mbi/ms/xmlmq/templates/root/destinationCache/destination_cache_1k.esql.jet
                return new org.eclipse.jet.compiled._jet_destination_cache_1kesql();
            case 42: // mbi/ms/xmlmq/templates/root/project.jet
                return new org.eclipse.jet.compiled._jet_project_1();
            case 43: // mbi/ms/xmlmq/templates/root/routeDefault/route_default.subflow.jet
                return new org.eclipse.jet.compiled._jet_route_defaultsubflow();
            case 44: // mbi/ms/xmlmq/templates/root/routeRoute/route_route.esql.jet
                return new org.eclipse.jet.compiled._jet_route_routeesql();
            case 45: // mbi/ms/xmlmq/templates/root/routeRoute/route_route.subflow.jet
                return new org.eclipse.jet.compiled._jet_route_routesubflow();
            case 46: // mbi/ms/xmlmq/templates/root/summary.jet
                return new org.eclipse.jet.compiled._jet_summary();
            case 47: // mbi/templates/main.jet
                return new org.eclipse.jet.compiled._jet_main();
            default:
                break;
            }
        }
        return this.delegate != null ? this.delegate.getTemplate(templatePath) : null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.jet.JET2TemplateLoaderExtension#getDelegateLoader()
     */
    public JET2TemplateLoader getDelegateLoader() {
        return this.delegate;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.eclipse.jet.JET2TemplateLoaderExtension#setDelegateLoader(org.eclipse
     * .jet.JET2TemplateLoader)
     */
    public void setDelegateLoader(final JET2TemplateLoader loader) {
        this.delegate = loader;
    }
}
