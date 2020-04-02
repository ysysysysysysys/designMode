package abstractFactory.v3;


import abstractFactory.v3.Department;

public interface IDepartment {
    public void Insert(Department d);
    public Department get(int id);
}
