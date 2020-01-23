package MementoPattern;

import java.util.ArrayList;
import java.util.List;

class VisitorMemento {
    private List<Visitor> visitors = new ArrayList<>();

    void addVisitor(Visitor visitor) {
        visitors.add(visitor);
    }
    @SuppressWarnings("SameParameterValue")
    Visitor getVisitor(int index) {
        return visitors.get(index);
    }

    @SuppressWarnings("unused")
    Visitor getVisitor(String name, String phone) {
        for (Visitor visitor : visitors) {
            if (name.equals(visitor.getName()) && phone.equals(visitor.getPhone())) {
                return visitor;
            }
        }
        return null;
    }

}
