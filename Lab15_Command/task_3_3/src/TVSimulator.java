public class TVSimulator {
    public static void main(String[] args) {
        Device tv = new Television();
        RemoteController controller = new RemoteController();

        controller.setCommand("on", new OnCommand(tv));
        controller.setCommand("off", new OffCommand(tv));
        controller.setCommand("volumeUp", new VolumeUpCommand(tv));
        controller.setCommand("volumeDown", new VolumeDownCommand(tv));
        controller.setCommand("nextChannel", new NextChannelCommand(tv));
        controller.setCommand("prevChannel", new PrevChannelCommand(tv));

        controller.pressButton("on");
        controller.pressButton("volumeUp");
        controller.pressButton("volumeUp");
        controller.pressButton("nextChannel");
        controller.pressButton("prevChannel");
        controller.pressButton("volumeDown");
        controller.pressButton("off");
    }
}