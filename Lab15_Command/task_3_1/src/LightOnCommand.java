public class LightOnCommand implements Command {
    private Lamp lamp;

    public LightOnCommand(Lamp lamp) {
        this.lamp = lamp;
    }

    @Override
    public void execute() {
        lamp.lightOn();
    }
}