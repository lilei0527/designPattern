package AbstractFactoryPattern;

public class AppleFactory implements AbstractFactory{

    @Override
    public Phone createPhone() {
        return new Iphone();
    }

    @Override
    public EarPhone createEarPhone() {
        return new Beats();
    }
}
