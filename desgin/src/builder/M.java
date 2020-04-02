package builder;

public class M {
    public static void main(String[] args) {
        Direct directB = new Direct(new BuilderB());
        Direct directA = new Direct(new BuilderA());

        Product build = directA.build();
        Product build1 = directB.build();

        build.show();
        build1.show();
    }
}
