package decorator.v1;

public class M {
    public static void main(String[] args) {
        ConcreteComponent c = new ConcreteComponent();
        ConcreateDecoratorA concreateDecoratorA = new ConcreateDecoratorA();
        ConcreateDecoratorB concreateDecoratorB = new ConcreateDecoratorB();

        concreateDecoratorA.setComponent(c);
        concreateDecoratorB.setComponent(concreateDecoratorA);
        concreateDecoratorB.Operation();
    }
}
