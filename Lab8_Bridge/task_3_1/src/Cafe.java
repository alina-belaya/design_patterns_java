public class Cafe {
    public static void main(String[] args) {
        Preparation inHouse = new InHousePreparation();
        Preparation takeaway = new TakeawayPreparation();

        Beverage blackChocolate = new BlackChocolate(3, 200, inHouse);
        Beverage blackCoffee = new BlackCoffee(3, 200, true, takeaway);

        beverageInfo(blackChocolate);
        beverageInfo(blackCoffee);
    }

    private static void beverageInfo(Beverage beverage) {
        System.out.println("=========================");
        beverage.prepare();
        System.out.printf("Cost of beverage: %s grn\n",  beverage.cost());
        beverage.drink();
    }
}

