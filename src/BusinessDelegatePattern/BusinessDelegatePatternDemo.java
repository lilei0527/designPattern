package BusinessDelegatePattern;

/*业务代表模式，客户端不涉及业务代码的实现，业务交由具体的业务类，提供一个工厂方法查找业务类
* 由一个业务代表类提供对业务方法的访问
* */
public class BusinessDelegatePatternDemo {

    public static void main(String[] args) {
        ServiceDelegate serviceDelegate = new ServiceDelegate();
        Client client = new Client(serviceDelegate);

        serviceDelegate.setServiceType("serviceA");
        client.doTask();

        serviceDelegate.setServiceType("serviceB");
        client.doTask();
    }


}
