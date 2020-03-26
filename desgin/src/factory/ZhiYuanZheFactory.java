package factory;

public class ZhiYuanZheFactory {
    private static ZhiYuanZhe zhiYuanZhe;

    private ZhiYuanZheFactory(){

    }

    public static ZhiYuanZhe getZhiYuanZhe(){
        if(zhiYuanZhe ==null){
            zhiYuanZhe = new ZhiYuanZhe();
            return zhiYuanZhe;
        } else{
            return zhiYuanZhe;
        }
    }

}
