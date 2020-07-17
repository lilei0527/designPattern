package ResponsibilityChainPattern;

import java.util.List;

public interface Pipeline<V> {

    Value<V> getFirst();

    void setFirst(Value<V> value);

    List<Value<V>> getValues();

    void removeValue(Value<V> value);
}
