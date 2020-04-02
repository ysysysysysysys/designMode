package abstractFactory.v2;

public class AccessFactory implements IFactory {
    @Override
    public IUser get() {
        return new AccessUser();
    }

    @Override
    public IDepartment getDepart() {
        return new AccessDepartment();
    }
}
