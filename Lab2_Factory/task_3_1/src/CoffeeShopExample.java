public class CoffeeShopExample {
    public static void main(String[] args) {
        // Client code using the Factory Method pattern
        CoffeeShop smallCoffeeShop = new SmallCoffeeShop();

        // Example customer orders
        String[] orders = {"espresso", "americano", "cappuccino", "latte", "mocha", "macchiato"};

        for (String order : orders) {
            Drink drink = smallCoffeeShop.createDrink(order);
            drink.prepare();

            // Calculate and print the detailed cost breakdown for each drink
            double cost = drink.calculateCost();
            System.out.println("Cost of one " + order + ": $" + cost);
            System.out.println();
        }
    }
}
