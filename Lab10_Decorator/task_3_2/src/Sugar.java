class Sugar extends CondimentDecorator {
    private int quantity;
    public Sugar(Beverage beverage, int quantity) {
        super(beverage);
        this.quantity = quantity;
    }
    @Override
    public String description() {
        return beverage.description() + ", Sugar x" + quantity;
    }
    @Override
    public float cost() {
        return beverage.cost() + 0.05f * quantity;
    }
}