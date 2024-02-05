public class CarSimulator {
    private final Car car;

    public CarSimulator(Car car) {
        this.car = car;
    }

    public void simulate() {
        System.out.println("Simulating the car...");
        car.drive();
        car.stop();
    }

    public static void main(String[] args) {
        CarBuilder carBuilder = new CarBuilder();
        Car car = carBuilder.buildCar();

        CarSimulator carSimulator = new CarSimulator(car);

        carSimulator.simulate();
    }
}