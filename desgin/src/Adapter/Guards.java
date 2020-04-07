package Adapter;

public class Guards extends Player{
    public Guards(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println(this.name+"进攻");
    }

    @Override
    public void defense() {
        System.out.println(this.name+"防守");
    }
}
