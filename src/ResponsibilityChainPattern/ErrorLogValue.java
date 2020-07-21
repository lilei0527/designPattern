package ResponsibilityChainPattern;

/**
 * @author lilei
 **/
public class ErrorLogValue extends LogValue {

    @Override
    public void invoke(Log log) {
        System.out.println("error:");
        if (log.getLeave() <= ERROR_LEVEL) {
            log.printLog();
        }
        invokeNext(log);
    }


}
