package simpleFactory.Operation4;

public class AddOper extends Operation{
    public AddOper(String numberA, String numberB) {
        super(numberA, numberB);
    }

    @Override
    public double getresult() {
        return Double.valueOf(super.getNumberA())+Double.valueOf(super.getNumberB());
    }

}
