class Engine {
    private double volume;
    private int power;
    private int torque;
    private Fuel fuelType;

    public Engine(double volume, int power, int torque, Fuel fuelType) {
        this.volume = volume;
        this.power = power;
        this.torque = torque;
        this.fuelType = fuelType;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "power=" + power +
                ", torque=" + torque +
                ", fuel=" + fuelType +
                ", volume=" + volume +
                '}';
    }
}