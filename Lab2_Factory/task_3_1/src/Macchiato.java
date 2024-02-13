class Macchiato implements Drink {
    @Override
    public void prepare() {
        System.out.println("Preparing Macchiato");
    }

    @Override
    public double calculateCost() {
        double costOfCoffeeBeans = 1.6;
        double costOfCaramelSyrup = 1.2;
        double otherCosts = 1.0;
        double profitMargin = 0.4;

        return costOfCoffeeBeans + costOfCaramelSyrup + otherCosts
                + (costOfCoffeeBeans + costOfCaramelSyrup + otherCosts) * profitMargin;
    }
}