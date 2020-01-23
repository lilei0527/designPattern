package visitorPattern;

//处理外接设备
public interface Visitor {
    void visit(Keyboard keyboard);
    void visit(Mouse mouse);
}
