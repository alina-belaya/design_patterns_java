class WhippedCream extends CondimentDecorator {
    public WhippedCream(Beverage beverage) {
        super(beverage);
    }
    @Override
    public String description() {
        return beverage.description() + ", Whipped Cream";
    }
    @Override
    public float cost() {
        return beverage.cost() + 0.15f;
    }
}