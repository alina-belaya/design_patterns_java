public abstract class Tee extends Beverage {
    public Tee(int sugar, Preparation preparation) {
        super(sugar, preparation);
    }

    @Override
    public void prepare() {
        System.out.println("Put some tee...");
    }

    @Override
    public int cost() {
        return 7;
    }
}
