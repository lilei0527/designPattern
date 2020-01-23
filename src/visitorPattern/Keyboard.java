package visitorPattern;

public class Keyboard implements Accept{
    private String name;

    Keyboard(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }



    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
