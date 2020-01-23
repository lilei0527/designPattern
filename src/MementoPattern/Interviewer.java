package MementoPattern;
@SuppressWarnings("unused")
public class Interviewer {
    private Visitor visitor;

    Visitor intervie(String name, String phone) {
        System.out.println("intervie : "+name);
        return new Visitor(name, phone);
    }
    void intervie(Visitor visitor) {
        System.out.println("intervie : "+visitor.getName());
    }


    void setVisitor(Visitor visitor) {
        this.visitor = visitor;
    }

    public Visitor getVisitor() {
        return visitor;
    }
}
