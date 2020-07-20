package AdapterPattern;

/**
 * @author lilei
 **/
public class Adaptor implements Target {
    private Adaptee adaptee;

    public Adaptor(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void doTarget() {
        adaptee.doSomething();
    }
}
