package singleton.v1;

public class M1 {
    public static void main(String[] args) {
        Class1 class1 = Class1.getClass1();
        System.out.println(class1);
        Class1 class2 = Class1.getClass1();
        System.out.println(class2);
    }
}
