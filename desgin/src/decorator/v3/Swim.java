package decorator.v3;

public class Swim extends Type{
    @Override
    public void moveAtoB(String type) {
        super.moveAtoB(type);
        System.out.println("在学骑车之前我会游泳");
    }
}
