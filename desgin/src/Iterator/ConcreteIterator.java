package Iterator;

public class ConcreteIterator extends Iterator{

    private ConcreteAggregate concreteAggregate;
    private int current = 0;

    public ConcreteIterator(ConcreteAggregate concreteAggregate) {
        this.concreteAggregate = concreteAggregate;
    }

    @Override
    public Object First() {
        return concreteAggregate.getItem().get(0);
    }

    @Override
    public Object Next() {
        Object o = null;
        current++;
        if(current < concreteAggregate.count()){
            o = concreteAggregate.getItem().get(current);
        }
        return o;
    }

    @Override
    public boolean IsDone() {
        return current == concreteAggregate.count()-1 ? false:true;
    }

    @Override
    public Object CurrentItem() {
        return null;
    }
}
