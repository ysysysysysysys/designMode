package status.v1;

public class ConcreateStateA extends State{
    @Override
    public void Handle(Context context) {
        context.name = "B";
        context.setState(new ConcreateStateB());
    }
}
