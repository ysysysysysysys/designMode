package observer.v1;

public class StockObserver {
    private String name;
    private Secretary secretary;

    public StockObserver(String name, Secretary secretary) {
        this.name = name;
        this.secretary = secretary;
    }

    public void tell(){
        System.out.println(name+"关闭股票"+secretary.getAction());
    }

}
