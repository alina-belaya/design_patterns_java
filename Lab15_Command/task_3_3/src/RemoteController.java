import java.util.HashMap;
import java.util.Map;

public class RemoteController {
    private Map<String, Command> commandMap = new HashMap<>();

    public void setCommand(String operation, Command command) {
        commandMap.put(operation, command);
    }

    public void pressButton(String operation) {
        Command command = commandMap.get(operation);
        if (command != null) {
            command.execute();
        } else {
            System.out.println("No command set for " + operation);
        }
    }
}