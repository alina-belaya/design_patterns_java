public class CarBuilder {
    private Wheel wheel;
    private Engine engine;

    public CarBuilder() {
        this.wheel = new Wheel(18);
        this.engine = new Engine(200);
    }

    public Car buildCar() {
        return new Car(wheel, engine);
    }
}