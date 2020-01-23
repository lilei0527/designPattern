package ResponsibilityChainPattern;

/**
 * @author lilei
 **/
public class DebugLogValue extends LogValue {

    @Override
    void invoke(Log log) {
        System.out.println("debug:");
        if (log.getLeave() == LogPipeline.DEBUG_LEVEL) {
            log.printLog();
        }
        if (getNext() != null) {
            if (getNext() instanceof LogValue) {
                ((LogValue) getNext()).invoke(log);
            }
        }
    }

    @Override
    public void invoke() {

    }
}


