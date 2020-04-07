package memento.v1;

public class M {
    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setState("on");
        originator.show();

        Caretaker caretaker = new Caretaker();
        //创建备忘录
        Memento memento = originator.createMemento();
        //备忘录给caretaker保存
        caretaker.setMemento(memento);

        originator.setState("off");
        originator.show();

        //恢复
        //拿到备忘录
        Memento memento1 = caretaker.getMemento();
        //根据备忘录恢复
        originator.setMemento(memento1);
        originator.show();
    }
}
