package singleton.v1;

import singleton.Singleton;

public class Class1 {
    private static Class1 class1;

    private Class1(){

    }

    public static Class1 getClass1(){
        if(class1 == null){
            class1 = new Class1();
        }
        return class1;
    }

}
