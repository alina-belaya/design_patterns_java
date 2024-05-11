interface User {
    void sendMessageAll(String message);
    void sendMessage(String message, String userId);
    void receiveMessage(String message, String userFrom);
    String getId();
}