import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ChatRoom implements ChatMediator {
    private List<User> users;
    private Map<String, List<User>> groups;

    public ChatRoom() {
        this.users = new ArrayList<>();
        this.groups = new HashMap<>();
    }

    @Override
    public void addUser(User user) {
        this.users.add(user);
        user.getGroups().forEach(group -> {
            groups.computeIfAbsent(group, k -> new ArrayList<>()).add(user);
        });
    }

    @Override
    public void sendMessage(String message, User sender) {
        for (User user : users) {
            if (!user.getId().equals(sender.getId())) {
                user.receiveMessage(message, sender.getId());
            }
        }
    }

    @Override
    public void sendMessageToUser(String message, String userId, User sender) {
        users.stream()
                .filter(user -> user.getId().equals(userId))
                .findFirst()
                .ifPresent(user -> user.receiveMessage(message, sender.getId()));
    }

    @Override
    public void sendMessageToGroup(String message, String group, User sender) {
        if (groups.containsKey(group)) {
            groups.get(group).stream()
                    .filter(user -> !user.getId().equals(sender.getId()))
                    .forEach(user -> user.receiveMessage(message, sender.getId()));
        }
    }
}