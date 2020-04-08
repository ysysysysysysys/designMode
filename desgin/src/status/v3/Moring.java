package status.v3;

public class Moring extends Status{
    @Override
    public void work(Work work) {
        if(work.time < 12){
            System.out.println("有精神");
        }else{
            work.setStatus(new Afternoon());
            work.test();
        }
    }
}
