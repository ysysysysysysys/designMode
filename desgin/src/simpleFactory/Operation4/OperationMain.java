package simpleFactory.Operation4;

import java.util.Scanner;

public class OperationMain {
    public static void main(String[] args) {
        System.out.println("输入数字A");
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        System.out.println("请输入符号 + - * /");
        String B = sc.next();
        System.out.println("请输入数组B");
        String C = sc.next();
        OperationFactory operationFactory = new OperationFactory();
        Operation operation = operationFactory.getOperation(B,A,C);
        double getresult = operation.getresult();
        System.out.println(getresult);
    }
}
