package abstractFactory.v3;

import abstractFactory.v3.IUser;
import abstractFactory.v3.User;

public class SqlServerUser implements IUser {
    @Override
    public void Insert(User user) {
        System.out.println("sqlserver 插入");
    }

    @Override
    public User get(int id) {
        System.out.println("sqlserver 查询");
        return null;
    }
}
