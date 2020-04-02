package abstractFactory.v1;

public class AccessFactory implements IFactory{
    @Override
    public IUser get() {
        return new AccessUser();
    }
}
