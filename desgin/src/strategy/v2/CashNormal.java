package strategy.v2;

public class CashNormal extends CashSuper{
    @Override
    public void acceptCash(Double money) {
        System.out.println("最终价格"+money);
    }
}
