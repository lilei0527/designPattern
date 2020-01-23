package ObserverPattern;

public interface ApplicationListener {
    void onStart(Application application);
    void onFinish(Application application);
    void onStop(Application application);
}
