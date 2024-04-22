class SubtractionHandler extends Handler {
    @Override
    public void handleRequest(Request request) {
        if (request.getOperation().equals("subtract")) {
            System.out.println(request.getNumber1() + " - " + request.getNumber2() + " = " +
                    (request.getNumber1() - request.getNumber2()));
        } else if (successor != null) {
            successor.handleRequest(request);
        }
    }
}