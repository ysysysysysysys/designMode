package status.v2;

public class ForenoonState extends Status{
    @Override
    public void write(Work work) {
        if(work.getTime() < 12){
            System.out.println("当前时间"+work.getTime()+"精神百倍");
        }else{
            work.setStatus(new NoonState());
            work.write();
        }
    }
}
