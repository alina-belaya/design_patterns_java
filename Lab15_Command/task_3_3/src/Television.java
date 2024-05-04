public class Television implements Device {
    private int volume = 50;
    private int channel = 1;
    private boolean isOn = false;

    @Override
    public void on() {
        if (!isOn) {
            System.out.println("Television is on");
            isOn = true;
        }
    }

    @Override
    public void off() {
        if (isOn) {
            System.out.println("Television is off");
            isOn = false;
        }
    }

    @Override
    public void volumeUp() {
        if (isOn) {
            volume++;
            System.out.println("Volume increased to: " + volume);
        }
    }

    @Override
    public void volumeDown() {
        if (isOn) {
            volume--;
            System.out.println("Volume decreased to: " + volume);
        }
    }

    @Override
    public void nextChanel() {
        if (isOn) {
            channel++;
            System.out.println("Channel changed to: " + channel);
        }
    }

    @Override
    public void prevChanel() {
        if (isOn) {
            channel--;
            System.out.println("Channel changed to: " + channel);
        }
    }
}