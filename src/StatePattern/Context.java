package StatePattern;
@SuppressWarnings("unused")
public class Context {
    private State state;
    private String name;

    Context(String name) {
        this.name = name;
        this.state = new InitState();
    }

    public State getState() {
        return state;
    }

    void setState(State state) {
        this.state = state;
    }

    void process(){
        state.doAction(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
