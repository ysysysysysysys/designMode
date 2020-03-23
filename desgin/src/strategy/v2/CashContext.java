package strategy.v2;

public class CashContext {
    CashSuper cashSuper;

    public CashContext(String type) {
        switch (type){
            case "1":
                this.cashSuper = new CashNormal();
                break;
            case "2":
                this.cashSuper = new CahsReturn(300d,50d);
                break;
            case "3":
                this.cashSuper = new CashRebate(0.8f);
                break;
        }
    }

    public void getResult(Double money){
        cashSuper.acceptCash(money);
    }
}
