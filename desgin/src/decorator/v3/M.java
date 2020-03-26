package decorator.v3;

public class M {
    public static void main(String[] args) {
        People people = new People();
        Bike bike = new Bike();
        Swim swim = new Swim();

        swim.setPeople(people);
        bike.setPeople(swim);
        bike.moveAtoB("走路");
    }
}
