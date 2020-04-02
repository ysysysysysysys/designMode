package abstractFactory.v1;

public class M {
    public static void main(String[] args) {
        IFactory factory = new AccessFactory();
        IUser iUser = factory.get();
        iUser.Insert(new User());
        iUser.get(1);
    }
}
