package decorator.v1;

public class ConcreateDecoratorA extends Decorator{
    private String addedState;

    @Override
    public void Operation() {
        super.Operation();
        addedState = "123";
        System.out.println("A");
    }
}
