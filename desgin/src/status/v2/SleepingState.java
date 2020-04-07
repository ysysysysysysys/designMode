package status.v2;

public class SleepingState extends Status{
    @Override
    public void write(Work work) {
        System.out.println("我要睡着了");
    }
}
