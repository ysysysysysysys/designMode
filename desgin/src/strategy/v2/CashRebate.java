package strategy.v2;

public class CashRebate extends CashSuper{
    private float rate;
    @Override
    public void acceptCash(Double money) {
        System.out.println("总数"+(money*rate));
    }

    public CashRebate(float rate) {
        this.rate = rate;
    }
}
