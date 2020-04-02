package observer.v2;

public class Main {
    public static void main(String[] args) {
        SubjectA subjectA = new SubjectA();
        ObserverA observerA = new ObserverA();
        ObserverB observerB = new ObserverB();

        subjectA.add(observerA);
        subjectA.add(observerB);

        subjectA.tell();
    }
}
