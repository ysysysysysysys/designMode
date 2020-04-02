package abstractFactory.v2;

public class AccessUser implements IUser {
    @Override
    public void Insert(User user) {
        System.out.println("access 插入");
    }

    @Override
    public User get(int id) {
        System.out.println("access 获得");
        return null;
    }
}
