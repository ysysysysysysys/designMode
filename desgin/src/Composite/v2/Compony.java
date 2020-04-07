package Composite.v2;

public abstract class Compony {
    public String name;

    public Compony(String name) {
        this.name = name;
    }

    public abstract void add(Compony compony);

    public abstract void remove(Compony compony);

    public abstract void show(int depth);

    public String append(int depth) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            stringBuilder.append("-");
        }
        return stringBuilder.toString();
    }
}
