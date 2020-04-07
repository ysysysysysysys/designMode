package Composite.v1;

public class Leaf extends Component{
    public Leaf(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        System.out.println("叶子节点没有add");
    }

    @Override
    public void remove(Component component) {
        System.out.println("叶子节点没有remove");
    }

    @Override
    public void display(int depth) {
        System.out.println(this.append(depth)+name);
    }
}
