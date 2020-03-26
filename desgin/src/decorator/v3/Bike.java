package decorator.v3;

public class Bike extends Type{
    @Override
    public void moveAtoB(String type) {
        super.moveAtoB(type);
        System.out.println("我还会骑车");
    }
}
