package status.v2;

public class AfternoonState extends Status {
    @Override
    public void write(Work work) {
        if(work.getTime() < 17){
            System.out.println("当前"+work.getTime()+"点 状态不错");
        }else{
            work.setStatus(new NewEvening());
            work.write();
        }
    }
}
