package ResponsibilityChainPattern;

/**
 * @author lilei
 **/
public class ErrorLogValue extends LogValue {


    @Override
    public void invoke(Log log) {
        System.out.println("error:");
        if (log.getLeave() == LogPipeline.ERROR_LEVEL) {
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
