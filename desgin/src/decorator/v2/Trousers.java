package decorator.v2;

public class Trousers extends Costume{
    @Override
    public void show() {
        super.show();
        System.out.println("穿鞋子");
    }
}
