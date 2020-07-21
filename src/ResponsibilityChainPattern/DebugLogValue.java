package ResponsibilityChainPattern;

/**
 * @author lilei
 **/
public class DebugLogValue extends LogValue {

    @Override
    public void invoke(Log log) {
        System.out.println("debug:");
        if (log.getLeave() <= DEBUG_LEVEL) {
            log.printLog();
        }
        invokeNext(log);
    }

}
