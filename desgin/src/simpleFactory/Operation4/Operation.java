package simpleFactory.Operation4;

public class Operation {
    private String numberA;
    private String numberB;

    public Operation(String numberA, String numberB) {
        this.numberA = numberA;
        this.numberB = numberB;
    }

    public String getNumberA() {
        return numberA;
    }

    public void setNumberA(String numberA) {
        this.numberA = numberA;
    }

    public String getNumberB() {
        return numberB;
    }

    public void setNumberB(String numberB) {
        this.numberB = numberB;
    }

    public double getresult(){
        return 0;
    }
}
