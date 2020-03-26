package proxy.v1;

public class Pursuit implements IGiveGift{
    private SchoolGirl schoolGirl;

    public Pursuit(SchoolGirl schoolGirl) {
        this.schoolGirl = schoolGirl;
    }

    @Override
    public void GiveDolls() {
        System.out.println("送"+schoolGirl.name);
    }

    @Override
    public void GiveFlowers() {
        System.out.println("送"+schoolGirl.name);
    }

    @Override
    public void GiveChocolate() {
        System.out.println("送"+schoolGirl.name);
    }
}
