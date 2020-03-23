package simpleFactory;

import java.util.Scanner;

public class Operation2 {
    public static void main(String[] args) {
        System.out.println("输入数字A");
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        System.out.println("请输入符号 + - * /");
        String B = sc.next();
        System.out.println("请输入数组B");
        String C = sc.next();
        double v = 0d;
        switch (B){
            case "+":
                v = Double.valueOf(A) + Double.valueOf(C);
                break;
            case "-":
                v = Double.valueOf(A) - Double.valueOf(C);
                break;
            case "*":
                v = Double.valueOf(A) * Double.valueOf(C);
                break;
            case "/":
                if(Double.valueOf(C)==0){
                    throw new RuntimeException("分母有误");
                }
                v = Double.valueOf(A) / Double.valueOf(C);
                break;
        }
        System.out.println(v);
    }
}
