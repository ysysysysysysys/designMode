package status.v1;

public class ConcreateStateB extends State{
    @Override
    public void Handle(Context context) {
        context.name = "A";
        context.setState(new ConcreateStateA());
    }
}
