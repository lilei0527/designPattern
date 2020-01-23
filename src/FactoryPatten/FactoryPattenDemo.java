package FactoryPatten;

/**
* 工厂模式的好处：调用者创建对象的时候不用关心对象创建的过程，
* 对象的创建过程在工厂里已经封装完成，调用者只需要知道对象的名字即可
* */
public class FactoryPattenDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.getShape("RECTANGLE");
        shape.draw();
    }
}
