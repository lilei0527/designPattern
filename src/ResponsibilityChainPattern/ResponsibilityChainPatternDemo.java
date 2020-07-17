package ResponsibilityChainPattern;

/**
 * @author lilei
 **/
public class ResponsibilityChainPatternDemo {
    public static void main(String[] args) {
        Log log = new Log(LogPipeline.INFO_LEVEL, "这里有一个info级别错误");

        Pipeline<Log> logPipeline = new LogPipeline();
        Value<Log> debugLogValue = new DebugLogValue();
        Value<Log> infoLogValue = new InfoLogValue();
        Value<Log> errorLogValue = new ErrorLogValue();

        debugLogValue.setNext(infoLogValue);
        infoLogValue.setNext(errorLogValue);

        logPipeline.setFirst(debugLogValue);

        logPipeline.getFirst().invoke(log);
    }
}
