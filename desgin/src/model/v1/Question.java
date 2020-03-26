package model.v1;

public abstract class Question {
    public void q(){
        System.out.println("我是问题1");
        System.out.println("答案"+a());

    }

    public abstract String a();
}
