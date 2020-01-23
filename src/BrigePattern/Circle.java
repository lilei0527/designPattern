package BrigePattern;

public class Circle extends Shape {

    Circle(ColorApi colorApi) {
        super(colorApi);
    }

    @Override
    public void draw() {
        api.draw(this);
    }

    @Override
    public String getName() {
        return "圆形";
    }


}
