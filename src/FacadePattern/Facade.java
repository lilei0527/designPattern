package FacadePattern;

/**
 * @author lilei
 **/
public class Facade {
    private SubClassA subClassA = new SubClassA();
    private SubClassB subClassB = new SubClassB();
    void method(){
        //在外观类中提供方法，封装在子系统A和子系统B中的方法并可以添加额外逻辑
        subClassA.method();
        System.out.println("额外逻辑.......");
        subClassB.method();
        System.out.println("额外逻辑.......");
    }
}
