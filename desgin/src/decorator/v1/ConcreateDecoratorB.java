package decorator.v1;

public class ConcreateDecoratorB extends Decorator{
    private String addedState;

    @Override
    public void Operation() {
        super.Operation();
        addedState = "456";
        System.out.println("B");
    }
}
