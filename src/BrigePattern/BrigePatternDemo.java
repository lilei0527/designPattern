package BrigePattern;
/*
* 聚合关联关系建立在抽象层
* 对于两个独立变化的维度，使用桥接模式再适合不过了
* */
public class BrigePatternDemo {
    public static void main(String[] args) {
        ColorApi redApi = new RedApi();
        Shape circle = new Circle(redApi);
        circle.draw();

        ColorApi blueApi = new BlueApi();
        Shape rectangle = new Rectangle(blueApi);
        rectangle.draw();
    }
}
