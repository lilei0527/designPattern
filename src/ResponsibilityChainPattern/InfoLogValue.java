package ResponsibilityChainPattern;

/**
 * @author lilei
 **/
public class InfoLogValue extends LogValue {


    @Override
    public void invoke(Log log) {
        System.out.println("info:");
        if (log.getLeave() == LogPipeline.INFO_LEVEL) {
            log.printLog();
        }
        if (getNext() != null) {
            if (getNext() instanceof LogValue) {
                ((LogValue)getNext()).invoke(log);
            }
        }
    }

    @Override
    public void invoke() {

    }
}
