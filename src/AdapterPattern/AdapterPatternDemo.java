package AdapterPattern;

/**
 * @author lilei
 **/
public class AdapterPatternDemo {
    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Target target = new Adaptor(adaptee);
        target.doTarget();
    }
}
