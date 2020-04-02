package abstractFactory.v2;

public class M {
    public static void main(String[] args) {
        IFactory factory = new AccessFactory();
        IUser iUser = factory.get();
        iUser.Insert(new User());
        iUser.get(1);

        IDepartment depart = factory.getDepart();
        depart.get(1);
        depart.Insert(new Department());
    }
}
