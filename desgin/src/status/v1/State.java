package status.v1;

public abstract class State {
    public abstract void Handle(Context context);
}
