package decorator.v2;

public class Shoes extends Costume{
    @Override
    public void show() {
        super.show();
        System.out.println("穿鞋子");
    }
}
