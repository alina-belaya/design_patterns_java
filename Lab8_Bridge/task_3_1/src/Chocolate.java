public abstract class Chocolate extends Beverage {
    public Chocolate(int sugar, Preparation preparation) {
        super(sugar, preparation);
    }

    @Override
    public void prepare() {
        preparation.prepare();
        System.out.println("Put some cacao...");
    }

    @Override
    public int cost() {
        return 15;
    }
}