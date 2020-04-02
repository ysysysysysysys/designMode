package builder;

public class BuilderA extends Builder{
    private Product product = new Product();

    @Override
    public void addA() {
        product.add("A");
    }

    @Override
    public void addB() {
        product.add("B");
    }

    @Override
    public Product getResult() {

        return this.product;
    }
}
