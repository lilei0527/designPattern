package ResponsibilityChainPattern;

/**
 * @author lilei
 **/
public abstract class LogValue extends ValueBase{

    abstract void invoke(Log log);
}
