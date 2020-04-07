package status.v2;

public class RestState extends Status{
    @Override
    public void write(Work work) {
        System.out.println("下班回家喽");
    }
}
