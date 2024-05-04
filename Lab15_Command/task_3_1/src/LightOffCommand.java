public class LightOffCommand implements Command {
    private Lamp lamp;

    public LightOffCommand(Lamp lamp) {
        this.lamp = lamp;
    }

    @Override
    public void execute() {
        lamp.lightOff();
    }
}