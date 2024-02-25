class Car {
    private final CarType carType;
    private final CarColor carColor;
    private final Wheel wheel;
    private final Engine engine;
    private final Transmission transmission;

    public Car(CarType carType, CarColor carColor, Wheel wheel, Engine engine, Transmission transmission) {
        this.carType = carType;
        this.carColor = carColor;
        this.wheel = wheel;
        this.engine = engine;
        this.transmission = transmission;
    }

    @Override
    public String toString() {
        return "Car:\n" +
                "type=" + carType +
                ",\ncolor=" + carColor +
                ",\nwheel=" + wheel +
                ",\nengine=" + engine +
                ",\ntransmission=" + transmission +
                '\n';
    }
}