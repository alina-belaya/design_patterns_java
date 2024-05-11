public class Main {
  public static void main(String[] args) {
    FlightControlMediator mediator = new FlightControlMediatorImpl();
    Plane plane = new Plane(123, mediator);
    plane.takeOff();
  }
}