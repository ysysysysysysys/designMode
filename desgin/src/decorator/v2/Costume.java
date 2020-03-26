package decorator.v2;

public class Costume extends Person{
    private Person person;
    @Override
    public void show() {
        person.show();
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
