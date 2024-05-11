import java.util.List;

class ConcreteUser implements User {
    private String userId;
    private List<String> groups;
    private ChatMediator mediator;

    public ConcreteUser(String userId, List<String> groups, ChatMediator mediator) {
        this.userId = userId;
        this.groups = groups;
        this.mediator = mediator;
    }

    @Override
    public void sendMessageAll(String message) {
        mediator.sendMessage(message, this);
    }

    @Override
    public void sendMessage(String message, String userId) {
        mediator.sendMessageToUser(message, userId, this);
    }

    @Override
    public void sendMessageToGroup(String message, String group) {
        mediator.sendMessageToGroup(message, group, this);
    }

    @Override
    public void receiveMessage(String message, String userFrom) {
        System.out.println("User " + this.userId + " received message: " + message + " from " + userFrom);
    }

    @Override
    public String getId() {
        return userId;
    }

    @Override
    public List<String> getGroups() {
        return groups;
    }
}