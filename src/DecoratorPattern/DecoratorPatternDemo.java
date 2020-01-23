package DecoratorPattern;
/*
* 装饰器模式
* 动态地给一个对象添加一些额外的职责
* */
public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        iphone.sale();

        System.out.println();

        IphoneDecorator iphoneDecorator = new IphoneDecorator(iphone);
        iphoneDecorator.sale();

        System.out.println("----------------------------------");

        HuaWei huaWei = new HuaWei();
        huaWei.sale();

        System.out.println();

        HuaWeiDecorator huaWeiDecorator = new HuaWeiDecorator(huaWei);
        huaWeiDecorator.sale();
    }
}
