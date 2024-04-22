import java.util.Map;

class GuestAuthenticationHandler implements AuthenticationHandler {
    private AuthenticationHandler next;

    @Override
    public void setNext(AuthenticationHandler handler) {
        this.next = handler;
    }

    @Override
    public void handleRequest(Account account, Map<String, String> accountStorage) {
        if (account.getAccessType() == Account.AccessType.Guest) {
            System.out.println("Guest access provided!");
        } else if (next != null) {
            next.handleRequest(account, accountStorage);
        }
    }
}