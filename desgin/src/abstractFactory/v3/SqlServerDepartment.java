package abstractFactory.v3;

import abstractFactory.v3.Department;
import abstractFactory.v3.IDepartment;

public class SqlServerDepartment implements IDepartment{
    @Override
    public void Insert(Department d) {
        System.out.println("sqlserver 插入depart");
    }

    @Override
    public Department get(int id) {
        System.out.println("sqlserver 获得depart");
        return null;
    }
}
