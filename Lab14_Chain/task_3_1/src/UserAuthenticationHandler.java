import java.util.Map;

class UserAuthenticationHandler implements AuthenticationHandler {
    private AuthenticationHandler next;

    @Override
    public void setNext(AuthenticationHandler handler) {
        this.next = handler;
    }

    @Override
    public void handleRequest(Account account, Map<String, String> accountStorage) {
        if (account.getAccessType() == Account.AccessType.User) {
            String storedPassword = accountStorage.get(account.getLogin());
            if (account.getPassword().equals(storedPassword)) {
                System.out.println("User access provided: " + account.getLogin());
            } else {
                System.out.println("Access denied: " + account.getLogin());
            }
        } else if (next != null) {
            next.handleRequest(account, accountStorage);
        }
    }
}