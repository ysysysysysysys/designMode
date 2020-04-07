package status.v2;

public class NoonState extends Status{
    @Override
    public void write(Work work) {
        if(work.getTime() < 13){
            System.out.println("当前"+work.getTime()+"点 犯困");
        }else{
            work.setStatus(new AfternoonState());
            work.write();
        }
    }
}
