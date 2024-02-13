class Latte implements Drink {
    @Override
    public void prepare() {
        System.out.println("Preparing Latte");
    }

    @Override
    public double calculateCost() {
        double costOfCoffeeBeans = 1.4;
        double costOfMilk = 1.0;
        double otherCosts = 1.0;
        double profitMargin = 0.4;

        return costOfCoffeeBeans + costOfMilk + otherCosts + (costOfCoffeeBeans + costOfMilk + otherCosts) * profitMargin;
    }
}