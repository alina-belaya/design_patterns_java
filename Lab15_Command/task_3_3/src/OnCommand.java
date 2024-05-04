public class OnCommand implements Command {
    private Device device;

    public OnCommand(Device device) {
        this.device = device;
    }

    public void execute() {
        device.on();
    }
}