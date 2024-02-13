class Mocha implements Drink {
    @Override
    public void prepare() {
        System.out.println("Preparing Mocha");
    }

    @Override
    public double calculateCost() {
        double costOfCoffeeBeans = 1.4;
        double costOfChocolateSyrup = 1.2;
        double costOfMilk = 0.8;
        double otherCosts = 1.0;
        double profitMargin = 0.4;

        return costOfCoffeeBeans + costOfChocolateSyrup + costOfMilk + otherCosts
                + (costOfCoffeeBeans + costOfChocolateSyrup + costOfMilk + otherCosts) * profitMargin;
    }
}