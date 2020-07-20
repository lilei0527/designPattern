package ObserverPattern;

import java.util.List;

/**
 * @author lilei
 **/
public class Application {
    private String name;
    private String state;
    private List<ApplicationListener> listeners;

    public Application(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public List<ApplicationListener> getListeners() {
        return listeners;
    }

    public void setListeners(List<ApplicationListener> listeners) {
        this.listeners = listeners;
    }

    public void fireOnStart() {
        for (ApplicationListener listener : listeners) {
            listener.onStart(this);
        }
    }

    public void fireOnStop() {
        for (ApplicationListener listener : listeners) {
            listener.onStop(this);
        }
    }



    public void fireOnFinish() {
        for (ApplicationListener listener : listeners) {
            listener.onFinish(this);
        }
    }
}
