package ResponsibilityChainPattern;

/**
 * @author lilei
 **/
public class ResponsibilityChainPatternDemo {
    public static void main(String[] args) {
        Log log = new Log(LogPipeline.ERROR_LEVEL, "这里有一个error级别错误");
        Pipeline logPipeline = new LogPipeline();
        LogValue debugLogValue = new DebugLogValue();
        LogValue infoLogValue = new InfoLogValue();
        LogValue errorLogValue = new ErrorLogValue();
        debugLogValue.setNext(infoLogValue);
        infoLogValue.setNext(errorLogValue);
        logPipeline.setFirst(debugLogValue);
        ((LogValue)logPipeline.getFirst()).invoke(log);
    }
}
