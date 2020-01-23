package NullObjectPattern;

/*空对象模式，按照条件获取不到的对象创建一个空对象，提供默认的行为*/
public class NullObjectPatternDemo {
    public static void main(String[] args) {
        Color red = ColorFactory.getColor("red");
        System.out.println(red.getName());

        Color blue = ColorFactory.getColor("blue");
        System.out.println(blue.getName());

        Color black = ColorFactory.getColor("black");
        System.out.println(black.getName());
    }
}
