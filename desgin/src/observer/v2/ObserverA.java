package observer.v2;

public class ObserverA implements Observer{
    @Override
    public void call() {
        System.out.println("观察者A接收到通知");
    }
}
