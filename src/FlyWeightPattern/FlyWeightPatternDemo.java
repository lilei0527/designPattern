package FlyWeightPattern;

/**
 * @author lilei
 * 享元模式 重用现有的同类对象,大大减少对象的创建，降低系统的内存，使效率提高
 **/
public class FlyWeightPatternDemo {
    public static void main(String[] args) {
        Shape circle1 = ShapeFactory.getShape("circle");
        Shape circle2 = ShapeFactory.getShape("circle");
        System.out.println(circle1==circle2);
    }
}
