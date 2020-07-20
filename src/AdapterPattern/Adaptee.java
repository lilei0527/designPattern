package AdapterPattern;

/**
 * @author lilei
 * 系统中已有的类（不符合现在接口需要适配）
 **/
public class Adaptee {

    public void doSomething(){
        System.out.println("原系统类做的事情");
    }
}
