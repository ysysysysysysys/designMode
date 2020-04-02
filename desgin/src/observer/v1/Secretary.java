package observer.v1;

import java.util.ArrayList;
import java.util.List;

public class Secretary {
    private List<StockObserver> list = new ArrayList<>();
    private String action;

    public void Attach(StockObserver stockObserver) {
        list.add(stockObserver);
    }

    public void Notify(){
        for (StockObserver stockObserver : list) {
            stockObserver.tell();
        }
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
}
