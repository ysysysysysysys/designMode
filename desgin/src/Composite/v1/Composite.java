package Composite.v1;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {
    public List<Component> list = new ArrayList<Component>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        list.add(component);
    }

    @Override
    public void remove(Component component) {
        list.remove(component);
    }

    @Override
    public void display(int depth) {
        System.out.println(this.append(depth)+name);
        for (Component component : list) {
            component.display(depth+2);
        }
    }
}
