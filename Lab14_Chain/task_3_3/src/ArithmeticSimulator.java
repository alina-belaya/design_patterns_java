public class ArithmeticSimulator {
    public static void main(String[] args) {
        Handler addHandler = new AdditionHandler();
        Handler subtractHandler = new SubtractionHandler();
        Handler multiplyHandler = new MultiplicationHandler();
        Handler divideHandler = new DivisionHandler();

        addHandler.setSuccessor(subtractHandler);
        subtractHandler.setSuccessor(multiplyHandler);
        multiplyHandler.setSuccessor(divideHandler);

        Request addRequest = new Request(5, 3, "add");
        addHandler.handleRequest(addRequest);

        Request subtractRequest = new Request(10, 6, "subtract");
        addHandler.handleRequest(subtractRequest);

        Request multiplyRequest = new Request(7, 8, "multiply");
        addHandler.handleRequest(multiplyRequest);

        Request divideRequest = new Request(15, 3, "divide");
        addHandler.handleRequest(divideRequest);

        Request divideByZeroRequest = new Request(10, 0, "divide");
        addHandler.handleRequest(divideByZeroRequest);
    }
}