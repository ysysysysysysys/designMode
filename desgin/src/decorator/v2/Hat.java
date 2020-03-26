package decorator.v2;

public class Hat extends Costume{
    @Override
    public void show() {
        super.show();
        System.out.println("戴帽子");
    }
}
