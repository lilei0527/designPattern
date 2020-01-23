package FacadePattern;

/**
 * @author lilei
 * 外观模式是一种通过为多个复杂的子系统提供一个一致的接口，而使这些子系统更加容易被访问的模式
 **/
public class FacadePatternDemo {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.method();
    }
}