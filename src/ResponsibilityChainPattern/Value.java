package ResponsibilityChainPattern;

/**
 * @author lilei
 **/
public interface Value<V> {
    Value<V> getNext();
    void setNext(Value<V> value);
    void invoke(V v);
}
