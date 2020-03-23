package simpleFactory.Operation4;

public class SubOper extends Operation{
    public SubOper(String numberA, String numberB) {
        super(numberA, numberB);
    }

    @Override
    public double getresult() {
        return Double.valueOf(super.getNumberA())-Double.valueOf(super.getNumberB());
    }
}
