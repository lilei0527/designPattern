package ResponsibilityChainPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lilei
 **/
public  class StandardPipeline implements Pipeline {
    Value first = null;


    @Override
    public Value getFirst() {
        return first;
    }

    @Override
    public void setFirst(Value value) {
        this.first = value;
    }

    @Override
    public List<Value> getValues() {
        List<Value> values = new ArrayList<>();
        Value current = first;
        while (current != null) {
            values.add(current);
            current = current.getNext();
        }
        return values;
    }

    @Override
    public void removeValue(Value value) {

        Value current;
        if(first == value) {
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
