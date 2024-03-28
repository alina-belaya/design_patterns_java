public abstract class Beverage {
    protected final int sugar;
    protected Preparation preparation;

    public Beverage(int sugar, Preparation preparation) {
        this.sugar = sugar;
        this.preparation = preparation;
    }

    public abstract void prepare();
    public abstract void drink();
    public abstract int cost();
}