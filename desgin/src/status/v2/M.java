package status.v2;

public class M {
    public static void main(String[] args) {
        Work work = new Work();
        work.setStatus(new ForenoonState());
        work.setTime(22);
        work.setFinished(false);
        work.write();


    }
}
