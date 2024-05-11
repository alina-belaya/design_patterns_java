class ConcreteUser implements User {
    private String userId;
    private ChatMediator mediator;

    public ConcreteUser(String userId, ChatMediator mediator) {
        this.userId = userId;
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
    public void receiveMessage(String message, String userFrom) {
        System.out.println("User " + this.userId + " received message: " + message + " from " + userFrom);
    }

    @Override
    public String getId() {
        return userId;
    }
}