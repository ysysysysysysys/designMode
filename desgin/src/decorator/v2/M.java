package decorator.v2;

public class M {
    public static void main(String[] args) {
        Person ys = new Person("ys");
        Hat hat = new Hat();
        Clothes clothes = new Clothes();
        Trousers trousers = new Trousers();
        Shoes shoes = new Shoes();

        trousers.setPerson(ys);
        clothes.setPerson(trousers);
        hat.setPerson(clothes);
        shoes.setPerson(hat);
        shoes.show();

    }
}
