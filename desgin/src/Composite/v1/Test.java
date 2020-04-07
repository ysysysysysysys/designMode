package Composite.v1;

public class Test {
    public static void main(String[] args) {
        Composite root = new Composite("root");
        Leaf rootLeaf = new Leaf("rootLeaf1");
        Leaf leaf = new Leaf("rootLeaf2");

        Composite A = new Composite("A");
        Leaf A1 = new Leaf("A1");
        Leaf A2 = new Leaf("A2");
        Composite B = new Composite("B");
        Leaf B1 = new Leaf("B1");
        Leaf B2 = new Leaf("B2");
        B.add(B1);
        B.add(B2);
        A.add(A1);
        A.add(A2);
        A.add(B);

        root.add(rootLeaf);
        root.add(A);

        root.display(1);

    }
}
