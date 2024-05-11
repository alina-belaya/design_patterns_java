interface ChatMediator {
    void addUser(User user);
    void sendMessage(String message, User sender);
    void sendMessageToUser(String message, String userId, User sender);
}