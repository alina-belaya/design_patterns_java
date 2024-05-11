import java.util.List;

public class Client {
    public static void main(String[] args) {
        ChatMediator mediator = new ChatRoom();

        User user1 = new ConcreteUser("User1", List.of("admin"), mediator);
        User user2 = new ConcreteUser("User2", List.of("admin", "moderator"), mediator);
        User user3 = new ConcreteUser("User3", List.of("user"), mediator);
        User user4 = new ConcreteUser("User4", List.of("moderator"), mediator);

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);

        user1.sendMessageAll("Hello, world!");
        user2.sendMessageToGroup("Admin message!", "admin");
    }
}