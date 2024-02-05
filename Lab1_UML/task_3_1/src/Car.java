public class Car {
    final private Wheel wheel;
    final private Engine engine;

    public Car(Wheel wheel, Engine engine) {
        this.wheel = wheel;
        this.engine = engine;
    }

    public void drive() {
        System.out.println("Car is moving.");
        wheel.rotate();
        engine.start();
    }

    public void stop() {
        engine.stop();
        System.out.println("Car has stopped.");
    }
}