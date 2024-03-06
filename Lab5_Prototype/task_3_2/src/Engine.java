public class Engine implements Cloneable {

    public enum Fuel {  // Тип пального
        Petrol,    // Бензин
        Diesel,    // Дізель
        Electric   // Електрика
    }

    final int power;     //  Потужність
    final int torque;    //  Крутний момент
    final Fuel fuel;     //  Вид пального
    final float volume;  //  Об'єм двигуна

    public Engine(int power, int torque, Fuel fuel, float volume) {
        this.power = power;
        this.torque = torque;
        this.fuel = fuel;
        this.volume = volume;
    }

    protected Engine(Engine other) {
        this.power = other.power;
        this.torque = other.torque;
        this.fuel = other.fuel;
        this.volume = other.volume;
    }

    @Override
    public Engine clone() {
        return new Engine(this);
    }

    @Override
    public String toString() {
        return "Engine{" +
                "power=" + power +
                ", torque=" + torque +
                ", fuel=" + fuel +
                ", volume=" + volume +
                '}';
    }
}
