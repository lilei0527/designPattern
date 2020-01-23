package ProxyPattern;

/**
 * @author lilei
 * 代理模式
 **/
public class ProxyPatternDemo {
    public static void main(String[] args) {
        ProxyImage proxyImage = new ProxyImage("1.txt");
        System.out.println("第一次展示图片:");
        proxyImage.display();
        System.out.println("第二次展示图片:");
        proxyImage.display();
    }
}
