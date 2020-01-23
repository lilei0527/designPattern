package BrigePattern;

public class RedApi implements ColorApi {


    @Override
    public void draw(Shape shape) {
        System.out.println("画一个红色的"+shape.getName());
    }
}
