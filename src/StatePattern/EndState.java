package StatePattern;

public class EndState implements State {
    @Override
    public void doAction(Context context) {
        end(context);
    }

    private void end(Context context){
        System.out.println(context.getName() +"执行结束状态对应的操作");
    }
}
