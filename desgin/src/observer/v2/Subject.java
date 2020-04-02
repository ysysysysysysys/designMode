package observer.v2;

public interface Subject {
    public void add(Observer observer);
    public void delete(Observer observer);
    public void tell();

}
