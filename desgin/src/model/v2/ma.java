package model.v2;

public class ma {
    public static void main(String[] args) {
        AbstractClass a = new ConcreateA();
        a.TemplateMethod();

        AbstractClass abstractClass = new ConcreateA();
        abstractClass.TemplateMethod();
    }
}
