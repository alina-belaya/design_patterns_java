import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Controller {
    private Command onCommand;
    private List<Command> offCommands = new ArrayList<>();

    public Controller(Command onCommand, Command... offCommands) {
        this.onCommand = onCommand;
        this.offCommands.addAll(Arrays.asList(offCommands));
    }

    public void onButtonPressed() {
        if (onCommand != null) {
            onCommand.execute();
        }
    }

    public void offButtonPressed() {
        for (Command offCommand : offCommands) {
            offCommand.execute();
        }
    }
}