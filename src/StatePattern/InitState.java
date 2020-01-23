package StatePattern;

public class InitState implements State {
    @Override
    public void doAction(Context context) {
        if (init(context)) {
            context.setState(new StartState());
        } else {
            context.setState(new EndState());
        }
        context.process();
    }

    private boolean init(Context context) {
        System.out.println(context.getName() + "执行初始化状态对应的操作");
        return true;
    }
}
