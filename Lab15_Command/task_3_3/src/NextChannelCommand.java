public class NextChannelCommand implements Command {
    private Device device;

    public NextChannelCommand(Device device) {
        this.device = device;
    }

    public void execute() {
        device.nextChanel();
    }
}