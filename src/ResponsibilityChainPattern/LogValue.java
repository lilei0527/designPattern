package ResponsibilityChainPattern;

/**
 * @author lilei
 **/
public abstract class LogValue extends ValueBase<Log> {

    void invokeNext(Log log) {
        if (getNext() != null) {
            getNext().invoke(log);
        }
    }
}
