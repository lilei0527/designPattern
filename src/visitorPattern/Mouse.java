package visitorPattern;

public class Mouse implements Accept {
    private String name;

    Mouse(String name) {
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
