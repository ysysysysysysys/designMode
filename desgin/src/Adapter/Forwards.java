package Adapter;

public class Forwards extends Player{
    public Forwards(String name) {
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
