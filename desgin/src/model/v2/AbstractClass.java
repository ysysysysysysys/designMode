package model.v2;

import java.util.concurrent.ThreadPoolExecutor;

public abstract class AbstractClass {
    public abstract void oper1();
    public abstract void oper2();

    public void TemplateMethod(){
        oper1();
        oper2();
        System.out.println("hhhh");

    }
}
