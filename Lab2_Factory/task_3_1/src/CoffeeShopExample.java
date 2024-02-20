public class CoffeeShopExample {
    public static void main(String[] args) {
        CoffeeShop smallCoffeeShop = new SmallCoffeeShop();

        String[] orders = {"espresso", "americano", "cappuccino", "latte", "mocha", "macchiato"};

        for (String order : orders) {
            Drink drink = smallCoffeeShop.createDrink(order);
            drink.prepare();

            double cost = drink.calculateCost();
            System.out.println("Cost of one " + order + ": $" + cost);
            System.out.println();
        }
    }
}
