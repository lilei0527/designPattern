package AbstractFactoryPattern;

public class HuaWeiFactory implements AbstractFactory{
    @Override
    public Phone createPhone() {
        return new HuaWei();
    }

    @Override
    public EarPhone createEarPhone() {
        return new FreeBuds();
    }
}
