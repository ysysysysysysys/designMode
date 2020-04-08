package singleton.v2;

public class Class2 {
    private volatile static Class2 class2;

    private Class2() {
    }

    public static Class2 getClass2(){
        if(class2 == null){
            synchronized (Class2.class2){
                if(class2 == null){
                    class2 = new Class2();
                }
            }
        }
        return class2;
    }
}
