package abstractFactory.v1;

public class SqlServerFactory implements IFactory{
    @Override
    public IUser get() {
        return new SqlServerUser();
    }
}
