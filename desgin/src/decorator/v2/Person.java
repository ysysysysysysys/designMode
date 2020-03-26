package decorator.v2;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public Person() {
    }

    public void show(){
        System.out.println("我叫"+name);
    }
}
