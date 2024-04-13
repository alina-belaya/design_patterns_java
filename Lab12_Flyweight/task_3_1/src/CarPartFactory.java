import java.util.HashMap;
import java.util.Map;

class CarPartFactory {
    private Map<String, Engine> engineCache = new HashMap<>();
    private Map<String, Wheel> wheelCache = new HashMap<>();

    public Engine getEngine(int power, Engine.Fuel fuel) {
        String key = power + ":" + fuel;
        Engine engine = engineCache.get(key);
        if (engine == null) {
            engine = new Engine(power, fuel);
            engineCache.put(key, engine);
        }
        return engine;
    }

    public Wheel getWheel(int diameter) {
        String key = String.valueOf(diameter);
        Wheel wheel = wheelCache.get(key);
        if (wheel == null) {
            wheel = new Wheel(diameter);
            wheelCache.put(key, wheel);
        }
        return wheel;
    }
}