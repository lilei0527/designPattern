package BrigePattern;

public abstract class Shape {
    ColorApi api;
    Shape(ColorApi api) {
        this.api = api;
    }

    public abstract void draw();
    public abstract String getName();
}
