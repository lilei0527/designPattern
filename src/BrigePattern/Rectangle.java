package BrigePattern;

public class Rectangle extends Shape{

    Rectangle(ColorApi api) {
        super(api);
    }

    @Override
    public void draw() {
        api.draw(this);
    }

    @Override
    public String getName() {
        return "长方形";
    }
}
