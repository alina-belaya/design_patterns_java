public class Plane {
  private boolean isInTheAir;
  private int id;
  private FlightControlMediator mediator;

  public Plane(int id, FlightControlMediator mediator) {
    this.id = id;
    this.mediator = mediator;
    this.isInTheAir = false;
    this.mediator.addPlaneToGround(this);
  }

  public void takeOff() {
    if (mediator.requestTakeOff(this)) {
      mediator.notifyTakeOff(this);
    }
  }

  public boolean getIsInTheAir() {
    return isInTheAir;
  }

  public void setIsInTheAir(boolean isInTheAir) {
    this.isInTheAir = isInTheAir;
  }

  public int getId() {
    return id;
  }
}