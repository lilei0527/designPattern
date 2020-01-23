package ObserverPattern;

/**
 * @author lilei
 **/
public class StateListener implements ApplicationListener{
    @Override
    public void onStart(Application application) {
        application.setState("start");
    }

    @Override
    public void onFinish(Application application) {
        application.setState("finish");
    }

    @Override
    public void onStop(Application application) {
        application.setState("stop");
    }
}
