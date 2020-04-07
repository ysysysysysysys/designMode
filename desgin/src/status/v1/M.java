package status.v1;

public class M {
    public static void main(String[] args) {
        Context context = new Context(new ConcreateStateA());
        context.Request();
        context.getState();
        context.Request();
        context.getState();
        context.Request();
        context.getState();
        context.Request();
        context.getState();

    }
}
