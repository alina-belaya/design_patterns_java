class SmallCoffeeShop implements CoffeeShop {
    @Override
    public Drink createDrink(String order) {
        switch (order.toLowerCase()) {
            case "espresso":
                return new Espresso();
            case "americano":
                return new Americano();
            case "cappuccino":
                return new Cappuccino();
            case "latte":
                return new Latte();
            case "mocha":
                return new Mocha();
            case "macchiato":
                return new Macchiato();
            default:
                throw new IllegalArgumentException("Invalid order: " + order);
        }
    }
}