package abstractFactory.v3;

import abstractFactory.v3.Department;
import abstractFactory.v3.User;

public class M {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        IDepartment depart = DateAccess.getDepart();
        depart.get(1);
        depart.Insert(new Department());

        IUser user = DateAccess.getUser();
        user.get(1);
        user.Insert(new User());
    }
}
