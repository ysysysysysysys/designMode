package Composite.v2;

public class Staff extends Compony{
    public Staff(String name) {
        super(name);
    }

    @Override
    public void add(Compony compony) {

    }

    @Override
    public void remove(Compony compony) {

    }

    @Override
    public void show(int depth) {
        System.out.println(this.append(depth)+name);
    }
}
