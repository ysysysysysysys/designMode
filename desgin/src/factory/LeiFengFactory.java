package factory;

public class LeiFengFactory {
    private static LeiFeng leiFeng;

    private LeiFengFactory() {
    }

    public static LeiFeng getLeiFeng(){
        if(leiFeng != null){
            return leiFeng;
        }else{
            leiFeng = new LeiFeng();
            return leiFeng;
        }
    }
}
