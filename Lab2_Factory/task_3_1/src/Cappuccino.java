class Cappuccino implements Drink {
    @Override
    public void prepare() {
        System.out.println("Preparing Cappuccino");
    }

    @Override
    public double calculateCost() {
        double costOfCoffeeBeans = 1.5;
        double costOfMilk = 0.8;
        double otherCosts = 1.0;
        double profitMargin = 0.4;

        return costOfCoffeeBeans + costOfMilk + otherCosts + (costOfCoffeeBeans + costOfMilk + otherCosts) * profitMargin;
    }
}