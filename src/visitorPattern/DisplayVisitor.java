package visitorPattern;

//处理外接设备的显示
public class DisplayVisitor implements Visitor{
    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("display "+keyboard.getName());
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("display "+mouse.getName());
    }
}
