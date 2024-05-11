import java.util.ArrayList;
import java.util.List;

class ChatRoom implements ChatMediator {
    private List<User> users;

    public ChatRoom() {
        this.users = new ArrayList<>();
    }

    @Override
    public void addUser(User user) {
        this.users.add(user);
    }

    @Override
    public void sendMessage(String message, User sender) {
        for (User user : users) {
            // Don't send the message back to the sender
            if (!user.getId().equals(sender.getId())) {
                user.receiveMessage(message, sender.getId());
            }
        }
    }

    @Override
    public void sendMessageToUser(String message, String userId, User sender) {
        for (User user : users) {
            if (user.getId().equals(userId)) {
                user.receiveMessage(message, sender.getId());
                break;
            }
        }
    }
}