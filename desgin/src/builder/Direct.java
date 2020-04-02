package builder;

public class Direct {
    private Builder builder;

    public Direct(Builder builder) {
        this.builder = builder;
    }

    public Product build(){
        builder.addA();
        builder.addB();
        return builder.getResult();
    }
}
