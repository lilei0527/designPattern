package ResponsibilityChainPattern;

import java.util.List;

public interface Pipeline {

    Value getFirst();

    void setFirst(Value value);

    List<Value> getValues();

    void removeValue(Value value);
}
