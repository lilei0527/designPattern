package visitorPattern;

public class AdapterVisitor implements Visitor {
    @Override
    public void visit(Keyboard keyboard) {
        adapterKeyBord(keyboard);
    }

    @Override
    public void visit(Mouse mouse) {
        adapterMouse(mouse);
    }

    private void adapterKeyBord(Keyboard keyboard) {
        System.out.println("adapter " + keyboard.getName());
    }

    private void adapterMouse(Mouse mouse) {
        System.out.println("adapter " + mouse.getName());
    }
}
