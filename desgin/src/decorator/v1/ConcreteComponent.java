package decorator.v1;

public class ConcreteComponent extends Component{
    @Override
    public void Operation() {
        System.out.println("具体操作对象");
    }
}
