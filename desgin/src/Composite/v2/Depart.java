package Composite.v2;

import java.util.ArrayList;
import java.util.List;

public class Depart extends Compony {
    private List<Compony> departs = new ArrayList<>();

    public Depart(String name) {
        super(name);
    }

    @Override
    public void add(Compony compony) {
        departs.add(compony);
    }

    @Override
    public void remove(Compony compony) {
        departs.remove(compony);
    }

    @Override
    public void show(int depth) {
        System.out.println(this.append(depth)+name);
        for (Compony compony : departs) {
            compony.show(depth+2);
        }
    }
}
