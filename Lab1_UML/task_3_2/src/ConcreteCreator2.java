public class ConcreteCreator2 extends Creator {
    public Product CreateProduct() {
        return new Product2();
    }
}