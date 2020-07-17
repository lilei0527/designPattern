package ResponsibilityChainPattern;

/**
 * @author lilei
 **/
public abstract class ValueBase<V> implements Value<V> {
    Value<V> next;

    @Override
    public Value<V> getNext() {
        return next;
    }

    @Override
    public void setNext(Value<V> value) {
        this.next = value;
    }
}
