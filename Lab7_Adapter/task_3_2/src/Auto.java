public class Auto {
    private final int age;
    private final String model;
    private final float damaged;
    private final int mileage;

    public Auto(int age, String model, float damaged, int mileage) {
        this.age = age;
        this.model = model;
        this.damaged = damaged;
        this.mileage = mileage;
    }

    public int getAge() {
        return age;
    }

    public String getModel() {
        return model;
    }

    public float getDamage() {
        return damaged;
    }

    public int getMileage() {
        return mileage;
    }
}
