package ResponsibilityChainPattern;

/**
 * @author lilei
 **/
public abstract class ValueBase implements Value{
    Value next;

    @Override
    public Value getNext() {
        return next;
    }

    @Override
    public void setNext(Value value) {
        this.next = value;
    }
}
