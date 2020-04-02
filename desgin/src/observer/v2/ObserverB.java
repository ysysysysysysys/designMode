package observer.v2;

public class ObserverB implements Observer{
    @Override
    public void call() {
        System.out.println("观察者B接收到通知");
    }
}
