package abstractFactory.v3;

public class DateAccess {
    static String path = "abstractFactory.v3";
    static String db = "SqlServer";
    public static IUser getUser() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        String classPath = path+"."+db+"User";
        Class<?> aClass =  Class.forName(classPath);
        return (IUser) aClass.newInstance();
    }

    public static IDepartment getDepart() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        String classPath = path+"."+db+"Department";
        Class<?> aClass = Class.forName(classPath);
        return (IDepartment) aClass.newInstance();
    }
}
