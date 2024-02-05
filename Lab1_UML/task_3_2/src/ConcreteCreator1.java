public class ConcreteCreator1 extends Creator {
    public Product CreateProduct() {
        return new Product1();
    }
}