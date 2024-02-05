public class Engine {
    final private int horsepower;

    public Engine(int horsepower) {
        this.horsepower = horsepower;
    }

    public void start() {
        System.out.println("Engine is starting.");
    }

    public void stop() {
        System.out.println("Engine is stopping.");
    }
}