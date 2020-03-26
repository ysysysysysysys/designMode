package decorator.v2;

public class Clothes extends Costume{
    @Override
    public void show() {
        super.show();
        System.out.println("穿衣服");
    }
}
