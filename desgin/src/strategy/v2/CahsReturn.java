package strategy.v2;

public class CahsReturn extends CashSuper{
    private Double man;
    private Double jian;

    public CahsReturn(Double man, Double jian) {
        this.man = man;
        this.jian = jian;
    }

    @Override
    public void acceptCash(Double money) {
        int res = (int) (money/man);
        double result = money - res*jian;
        System.out.println("最后价格"+result);
    }

}
