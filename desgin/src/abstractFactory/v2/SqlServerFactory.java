package abstractFactory.v2;

public class SqlServerFactory implements IFactory {
    @Override
    public IUser get() {
        return new SqlServerUser();
    }

    @Override
    public IDepartment getDepart() {
        return new SqlServerDepart();
    }
}
