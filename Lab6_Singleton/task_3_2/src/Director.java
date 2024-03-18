public class Director {
    private static Director instance;

    private Director() {}

    public static Director getInstance() {
        if (instance == null) {
            instance = new Director();
        }
        return instance;
    }

    public void constructHatchback(Builder builder) {
        builder.setCarType(CarType.Hatchback);
        builder.setCarColor(CarColor.Blue);
        builder.setWheel(new Wheel(Material.Alloy, 17));
        builder.setEngine(new Engine(1.5, 160, 150, Fuel.Petrol));
        builder.setTransmission(Transmission.Automatic);
    }

    public void constructSedan(Builder builder) {
        builder.setCarType(CarType.Sedan);
        builder.setCarColor(CarColor.Red);
        builder.setWheel(new Wheel(Material.Steel, 18));
        builder.setEngine(new Engine(2.0, 180, 200, Fuel.Diesel));
        builder.setTransmission(Transmission.Automatic);
    }

    public void constructSUV(Builder builder) {
        builder.setCarType(CarType.SUV);
        builder.setCarColor(CarColor.Grey);
        builder.setWheel(new Wheel(Material.Alloy, 20));
        builder.setEngine(new Engine(3.5, 250, 280, Fuel.Petrol));
        builder.setTransmission(Transmission.SemiAutomatic);
    }
}