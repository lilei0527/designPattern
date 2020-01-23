package ResponsibilityChainPattern;

/**
 * @author lilei
 **/
public interface Value {
    Value getNext();

    void setNext(Value value);

    void invoke();


}
