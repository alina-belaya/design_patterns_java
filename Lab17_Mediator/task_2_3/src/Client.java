public class Client {
    public static void main(String[] args) {
        ChatMediator mediator = new ChatRoom();

        User user1 = new ConcreteUser("User1", mediator);
        User user2 = new ConcreteUser("User2", mediator);
        User user3 = new ConcreteUser("User3", mediator);
        User user4 = new ConcreteUser("User4", mediator);

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);

        user1.sendMessageAll("Hello, world!");
        user2.sendMessage("Hello!", "User1");
    }
}