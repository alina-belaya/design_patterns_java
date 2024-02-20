class VolvoTram implements Tram {
    @Override
    public int getPurchaseCost() {
        return 10000000;
    }

    @Override
    public double getOperatingCost() {
        return 7;
    }
}