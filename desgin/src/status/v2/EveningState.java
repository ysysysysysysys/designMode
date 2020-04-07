package status.v2;

public class EveningState extends Status {
    @Override
    public void write(Work work) {
        if(work.getFinished()){
            work.setStatus(new RestState());
            work.write();
        }else{
            if(work.getTime() < 21 ){
                System.out.println("极度疲惫");
            }else {
                work.setStatus(new SleepingState());
                work.write();
            }
        }
    }
}
