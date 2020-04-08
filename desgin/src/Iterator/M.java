package Iterator;

import java.util.ArrayList;
import java.util.List;

public class M {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("1");
        strings.add("2");
        strings.add("3");
        strings.add("4");
        strings.add("5");
        strings.add("6");
        ConcreteAggregate concreteAggregate = new ConcreteAggregate(strings);

        Iterator iterator = concreteAggregate.CreateIterator();
        Object first = iterator.First();
        System.out.println(first.toString());
        while(iterator.IsDone()){
            Object next = iterator.Next();
            System.out.println(next.toString());
        }

    }
}
