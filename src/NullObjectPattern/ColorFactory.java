package NullObjectPattern;

class ColorFactory {
    static Color getColor(String type) {
        if ("red".equalsIgnoreCase(type)) {
            return new Red();
        } else if ("blue".equalsIgnoreCase(type)) {
            return new Blue();
        } else {
            return new NullColor();
        }
    }
}
