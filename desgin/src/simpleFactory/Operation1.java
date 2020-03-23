package simpleFactory;

import java.util.Scanner;

public class Operation1 {
    public static void main(String[] args) {
        System.out.println("输入数字A");
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        System.out.println("请输入符号 + - * /");
        String B = sc.next();
        System.out.println("请输入数组B");
        String C = sc.next();
        double v = 0;

        if(B.equals("+")){
             v = Double.valueOf(A) + Double.valueOf(C);
        }else if("-".equals(B)){
            v = Double.valueOf(A) - Double.valueOf(C);
        }else if("*".equals(B)){
            v = Double.valueOf(A) * Double.valueOf(C);
        }else if("/".equals(B)){
            v = Double.valueOf(A) / Double.valueOf(C);
        }

        System.out.println("结果"+v);
    }
}
