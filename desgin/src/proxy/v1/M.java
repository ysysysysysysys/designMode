package proxy.v1;

public class M {
    public static void main(String[] args) {
        SchoolGirl schoolGirl = new SchoolGirl();
        schoolGirl.name ="yy";

        Proxy proxy = new Proxy(schoolGirl);
        proxy.GiveChocolate();
        proxy.GiveDolls();
        proxy.GiveFlowers();
    }
}
