package Adapter;

public class Translate extends Player{

    private YaoMing yaoMing = new YaoMing();
    public Translate(String name) {
        super(name);
    }

    @Override
    public void attack() {
        yaoMing.jingong(this.name);
    }

    @Override
    public void defense() {
        yaoMing.fangshou(this.name);
    }
}
