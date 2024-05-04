public class Lamp {
    private String name;
    private boolean isLightOn = false;

    public Lamp(String name) {
        this.name = name;
    }

    public void lightOn() {
        if (!isLightOn) {
            System.out.println(name + ": Light is on");
            isLightOn = true;
        }
    }

    public void lightOff() {
        if (isLightOn) {
            System.out.println(name + ": Light is off");
            isLightOn = false;
        }
    }
}