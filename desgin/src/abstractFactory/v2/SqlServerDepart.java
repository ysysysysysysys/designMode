package abstractFactory.v2;

public class SqlServerDepart implements IDepartment{
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
