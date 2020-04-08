package status.v3;

public class Evening extends Status {
    @Override
    public void work(Work work) {
        if (work.time < 20) {
            System.out.println("想下班");
        }else{
            System.out.println("困死了");
        }
    }
}
