package status.v2;

public class NewEvening extends Status{
    @Override
    public void write(Work work) {
        if(work.getTime() < 20){
            System.out.println("新规定 强制早点下班 所以快点干");
        }else{
            System.out.println("关灯 必须下班");
        }
    }
}
