package ProxyPattern;

/**
 * @author lilei
 * 代理模式 对开发人员屏蔽掉被代理对象的具体情况，开发人员只需要调用代理类的方法即可
 **/
public class ProxyImage implements Image{
    private String fileName;
    private RealImage realImage;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }


    @Override
    public void display() {
        if(realImage==null){
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
