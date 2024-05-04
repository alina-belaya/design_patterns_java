public class VolumeUpCommand implements Command {
    private Device device;

    public VolumeUpCommand(Device device) {
        this.device = device;
    }

    public void execute() {
        device.volumeUp();
    }
}