import java.util.HashMap;
import java.util.Map;

public class Client {

    public static void main(String[] args) {

        // Login and passwords for administrators
        Map<String, String> adminsAccounts = new HashMap<>();
        adminsAccounts.put("admin", "123qweASD");

        // Login and passwords for users
        Map<String, String> usersAccounts = new HashMap<>();
        usersAccounts.put("jane", "1234");
        usersAccounts.put("alice", "securePassword!");
        usersAccounts.put("john", "john1234");

        Account[] users = {
            Account.createAdmin("admin", "123qweASD"),
            Account.createAdmin("administrator", "1234"),
            Account.createUser("jane", "1234"),
            Account.createGuest(),
            Account.createUser("alice", "securepassword!"),
            Account.createUser("john", "john1234"),
            Account.createGuest(),
        };

        AuthenticationHandler adminHandler = new AdminAuthenticationHandler();
        AuthenticationHandler userHandler = new UserAuthenticationHandler();
        AuthenticationHandler guestHandler = new GuestAuthenticationHandler();

        adminHandler.setNext(userHandler);
        userHandler.setNext(guestHandler);

        for (Account user : users) {
            if (user.getAccessType() == Account.AccessType.Administrator) {
                adminHandler.handleRequest(user, adminsAccounts);
            } else if (user.getAccessType() == Account.AccessType.User) {
                userHandler.handleRequest(user, usersAccounts);
            } else {
                guestHandler.handleRequest(user, null);
            }
        }
    }
}
