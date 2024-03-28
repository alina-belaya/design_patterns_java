public abstract class Coffee extends Beverage {
    public Coffee(int sugar, Preparation preparation) {
        super(sugar, preparation);
    }

    @Override
    public void prepare() {
        preparation.prepare();
        System.out.println("Put some coffee...");
    }

    @Override
    public int cost() {
        return 10;
    }
}