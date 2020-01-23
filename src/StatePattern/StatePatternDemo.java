package StatePattern;

public class StatePatternDemo {
    public static void main(String[] args) {
        Context context = new Context("stateContext");
        context.process();
    }

}
