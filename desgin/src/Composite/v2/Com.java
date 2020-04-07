package Composite.v2;

import Composite.v1.Component;

import java.util.ArrayList;
import java.util.List;

public class Com extends Compony{
    private List<Compony> list = new ArrayList<>();
    public Com(String name) {
        super(name);
    }

    @Override
    public void add(Compony compony) {
        list.add(compony);
    }

    @Override
    public void remove(Compony compony) {
        list.remove(compony);
    }

    @Override
    public void show(int depth) {
        System.out.println(this.append(depth)+name);
        for (Compony compony : list) {
            compony.show(depth+2);
        }
    }
}
