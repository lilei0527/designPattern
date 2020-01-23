package visitorPattern;

/*访问者模式*/
public class VisitorPatternDemo {
    public static void main(String[] args) {
        Mouse mouse = new Mouse("罗技");
        Keyboard keyboard = new Keyboard("樱桃");

        DisplayVisitor displayVisitor = new DisplayVisitor();
        AdapterVisitor adapterVisitor = new AdapterVisitor();

        mouse.accept(displayVisitor);
        keyboard.accept(displayVisitor);

        mouse.accept(adapterVisitor);
        keyboard.accept(adapterVisitor);
    }
}
