import java.util.List;

interface User {
    void sendMessageAll(String message);
    void sendMessage(String message, String userId);
    void sendMessageToGroup(String message, String group);
    void receiveMessage(String message, String userFrom);
    String getId();
    List<String> getGroups();
}