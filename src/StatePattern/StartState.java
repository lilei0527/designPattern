package StatePattern;

public class StartState implements State {
    @Override
    public void doAction(Context context) {
        if (start(context)) {
            context.setState(new EndState());
        }
        context.process();
    }

    private boolean start(Context context) {
        System.out.println(context.getName() +"执行开始状态对应的操作");
        return true;
    }
}
