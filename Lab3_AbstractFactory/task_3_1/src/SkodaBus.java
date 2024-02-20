class SkodaBus implements Bus {
    @Override
    public int getPurchaseCost() {
        return 4500000;
    }

    @Override
    public double getOperatingCost() {
        return 25;
    }
}