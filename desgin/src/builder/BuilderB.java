package builder;

public class BuilderB extends Builder{
    private Product product = new Product();
    @Override
    public void addA() {
        product.add("C");
    }

    @Override
    public void addB() {
        product.add("D");
    }

    @Override
    public Product getResult() {
        return this.product;
    }
}
