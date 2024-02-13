class Espresso implements Drink {
    @Override
    public void prepare() {
        System.out.println("Preparing Espresso");
    }

    @Override
    public double calculateCost() {
        double costOfCoffeeBeans = 1.0;
        double otherCosts = 0.5;
        double profitMargin = 0.4;

        return costOfCoffeeBeans + otherCosts + (costOfCoffeeBeans + otherCosts) * profitMargin;
    }
}