package status.v1;

public class Context {
    public String name;
    private State state;

    public Context(State state) {
        this.state = state;
    }

    public State getState() {
        System.out.println(name);
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void Request(){
        state.Handle(this);
    }
}
