package observer.v2;

import java.util.ArrayList;
import java.util.List;

public class SubjectA implements Subject{
    private List<Observer> list = new ArrayList<>();
    @Override
    public void add(Observer observer) {
        list.add(observer);
    }

    @Override
    public void delete(Observer observer) {
        list.remove(observer);
    }

    @Override
    public void tell() {
        for (Observer observer : list) {
            observer.call();
        }
    }
}
