package status.v3;

public class M {
    public static void main(String[] args) {
        Work work = new Work();
        work.time= 27;
        work.setStatus(new Moring());
        work.test();
    }
}
