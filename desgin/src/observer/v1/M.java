package observer.v1;

public class M {
    public static void main(String[] args) {
        Secretary secretary = new Secretary();

        StockObserver a = new StockObserver("a", secretary);
        StockObserver b = new StockObserver("b", secretary);

        secretary.Attach(a);
        secretary.Attach(b);
        secretary.setAction("老板来了");

        secretary.Notify();
    }
}
