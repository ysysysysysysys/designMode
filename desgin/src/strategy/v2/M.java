package strategy.v2;

public class M {
    public static void main(String[] args) {
        Double money = 300d;
        CashContext cashContext = new CashContext("1");
        cashContext.getResult(300d);

        cashContext = new CashContext("2");
        cashContext.getResult(300d);

        cashContext = new CashContext("3");
        cashContext.getResult(300d);


    }
}
