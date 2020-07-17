package ResponsibilityChainPattern;

/**
 * @author lilei
 **/
public class InfoLogValue extends LogValue {


    @Override
    public void invoke(Log log) {
        System.out.println("info:");
        if (log.getLeave() <= LogPipeline.INFO_LEVEL) {
            log.printLog();
        }
        invokeNext(log);
    }
}
