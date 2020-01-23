package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lilei
 **/
public class ObserverPatternDemo {
    public static void main(String[] args) {
        Application application = new Application("tomcat");
        ApplicationListener printListener = new PrintListener();
        ApplicationListener stateListener = new StateListener();
        List<ApplicationListener> listeners = new ArrayList<>();
        listeners.add(printListener);
        listeners.add(stateListener);
        application.setListeners(listeners);
        application.fireOnStart();
        application.fireOnStop();
        application.fireOnFinish();
    }

}
