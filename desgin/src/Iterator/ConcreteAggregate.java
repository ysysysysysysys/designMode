package Iterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregate extends Aggregate{
    private List<? extends Object> item = new ArrayList<>();

    @Override
    public Iterator CreateIterator() {
        return new ConcreteIterator(this);
    }

    public ConcreteAggregate(List<? extends Object> item) {
        this.item = item;
    }

    public int count(){
        return item.size();
    }

    public List<? extends Object> getItem() {
        return item;
    }

    public void setItem(List<? extends Object> item) {
        this.item = item;
    }
}
