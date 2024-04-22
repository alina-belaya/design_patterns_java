class DivisionHandler extends Handler {
    @Override
    public void handleRequest(Request request) {
        if (request.getOperation().equals("divide")) {
            if (request.getNumber2() != 0) {
                System.out.println(request.getNumber1() + " / " + request.getNumber2() + " = " +
                        ((double) request.getNumber1() / request.getNumber2()));
            } else {
                System.out.println("Cannot divide by zero.");
            }
        } else if (successor != null) {
            successor.handleRequest(request);
        }
    }
}