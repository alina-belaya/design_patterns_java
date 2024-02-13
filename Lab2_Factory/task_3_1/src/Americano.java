class Americano implements Drink {
    @Override
    public void prepare() {
        System.out.println("Preparing Americano");
    }

    @Override
    public double calculateCost() {
        double costOfCoffeeBeans = 1.2;
        double otherCosts = 1.0;
        double profitMargin = 0.4;

        return costOfCoffeeBeans + otherCosts + (costOfCoffeeBeans + otherCosts) * profitMargin;
    }
}