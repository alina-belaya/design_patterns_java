public class Creator {
    public Product createProduct() {
        Product[] products = { new Product1(), new Product2() };
        int randomIndex = (int) (Math.random() * products.length);
        return products[randomIndex];
    }

    public void someOperation() {
        Product p = createProduct();
        p.doSomething();
    }

}