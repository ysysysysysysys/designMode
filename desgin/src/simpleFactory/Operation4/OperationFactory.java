package simpleFactory.Operation4;

public class OperationFactory {
    private Operation operation;

    public Operation getOperation(String ope,String NumA,String NumC){
        switch (ope) {
            case "+":
                operation = new AddOper(NumA,NumC);
                break;
            case "-":
                operation = new SubOper(NumA,NumC);
                break;
            case "*":
                operation = new MulOper(NumA,NumC);
                break;
            case "/":
                operation = new DivOper(NumA,NumC);
                break;
        }
        return operation;
    }
}
