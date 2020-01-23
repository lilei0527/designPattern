package BrigePattern;

public class BlueApi implements ColorApi {

    @Override
    public void draw(Shape shape) {
        System.out.println("画一个蓝色的"+shape.getName());
    }
}
