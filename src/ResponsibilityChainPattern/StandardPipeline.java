package ResponsibilityChainPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lilei
 **/
public class StandardPipeline<V> implements Pipeline<V> {
    Value<V> first = null;


    @Override
    public Value<V> getFirst() {
        return first;
    }

    @Override
    public void setFirst(Value<V> value) {
        this.first = value;
    }


    @Override
    public List<Value<V>> getValues() {
        List<Value<V>> values = new ArrayList<>();
        Value<V> current = first;
        while (current != null) {
            values.add(current);
            current = current.getNext();
        }
        return values;
    }

    @Override
    public void removeValue(Value<V> value) {

        Value<V> current;
        if (first == value) {
            first = first.getNext();
            current = null;
        } else {
            current = first;
        }
        while (current != null) {
            if (current.getNext() == value) {
                current.setNext(value.getNext());
                break;
            }
            current = current.getNext();
        }
    }
}
