package abstractFactory.v3;

import abstractFactory.v3.User;

public interface IUser {
    public void Insert(User user);
    public User get(int id);
}
