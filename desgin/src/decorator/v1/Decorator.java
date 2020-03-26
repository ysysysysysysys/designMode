package decorator.v1;

public class Decorator extends Component{
    private Component component;

    @Override
    public void Operation() {
        if(this.component != null){
            this.component.Operation();
        }
    }

    public Component getComponent() {
        return component;
    }

    public void setComponent(Component component) {
        this.component = component;
    }
}
