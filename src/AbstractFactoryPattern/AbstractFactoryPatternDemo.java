package AbstractFactoryPattern;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        System.out.println("苹果产品:");
        AbstractFactory appleFactory = new AppleFactory();
        EarPhone beats = appleFactory.createEarPhone();
        System.out.println(beats.getName());

        Phone iphone = appleFactory.createPhone();
        System.out.println(iphone.getName());

        System.out.println("华为产品:");
        AbstractFactory huaWeiFactory = new HuaWeiFactory();
        EarPhone freeBuds = huaWeiFactory.createEarPhone();
        System.out.println(freeBuds.getName());

        Phone huaWei = huaWeiFactory.createPhone();
        System.out.println(huaWei.getName());
    }
}
