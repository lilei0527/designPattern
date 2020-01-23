package ObserverPattern;

/**
 * @author lilei
 **/
public class PrintListener implements ApplicationListener{
    @Override
    public void onStart(Application application) {
        System.out.println("application:"+application.getName()+" start");
    }

    @Override
    public void onFinish(Application application) {
        System.out.println("application:"+application.getName()+" finish");
    }

    @Override
    public void onStop(Application application) {
        System.out.println("application:"+application.getName()+" stop");
    }
}
