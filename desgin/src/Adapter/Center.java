package Adapter;

public class Center extends Player {

    public Center(String name) {
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
