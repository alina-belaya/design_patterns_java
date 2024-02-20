class VolvoBus implements Bus {
    @Override
    public int getPurchaseCost() {
        return 6000000;
    }

    @Override
    public double getOperatingCost() {
        return 20;
    }
}