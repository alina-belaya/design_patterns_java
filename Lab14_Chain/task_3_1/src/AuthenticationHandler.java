import java.util.Map;

interface AuthenticationHandler {
    void setNext(AuthenticationHandler handler);
    void handleRequest(Account account, Map<String, String> accountStorage);
}