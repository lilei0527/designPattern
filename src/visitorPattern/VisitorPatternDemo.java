package visitorPattern;

/*访问者模式*/
public class VisitorPatternDemo {
    public static void main(String[] args) {
        Accept mouse = new Mouse("罗技");
        Accept keyboard = new Keyboard("樱桃");

        Visitor displayVisitor = new DisplayVisitor();
        Visitor adapterVisitor = new AdapterVisitor();

        mouse.accept(displayVisitor);
        keyboard.accept(displayVisitor);

        mouse.accept(adapterVisitor);
        keyboard.accept(adapterVisitor);
    }
}
