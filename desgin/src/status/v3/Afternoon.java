package status.v3;

public class Afternoon extends Status{
    @Override
    public void work(Work work) {
        if(work.time < 18){
            System.out.println("有些疲惫");
        }else{
            work.setStatus(new Evening());
            work.test();
        }
    }
}
