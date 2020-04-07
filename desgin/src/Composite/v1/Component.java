package Composite.v1;


public abstract class Component {
    protected String name;

    public Component(String name) {
        this.name = name;
    }

    public abstract void add(Component component);
    public abstract void remove(Component component);
    public abstract void display(int depth);

    public String append(int depth){
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i<depth ;i++){
            stringBuilder.append("-");
        }
        return stringBuilder.toString();
    }
}
