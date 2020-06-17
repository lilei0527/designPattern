package ResponsibilityChainPattern;

/**
 * @author lilei
 **/
public abstract class LogValue extends ValueBase{

    abstract void invoke(Log log);

    void invokeNext(Log log){
        if (getNext() != null) {
            if (getNext() instanceof LogValue) {
                ((LogValue) getNext()).invoke(log);
            }
        }
    }
}
