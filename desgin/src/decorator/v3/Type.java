package decorator.v3;

public class Type extends People{
    private People people;

    @Override
    public void moveAtoB(String type) {
        people.moveAtoB(type);
    }

    public People getPeople() {
        return people;
    }

    public void setPeople(People people) {
        this.people = people;
    }
}
