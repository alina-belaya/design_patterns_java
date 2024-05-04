public class OffCommand implements Command {
    private Device device;

    public OffCommand(Device device) {
        this.device = device;
    }

    public void execute() {
        device.off();
    }
}