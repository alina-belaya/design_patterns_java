public class FlightControlMediatorImpl implements FlightControlMediator {
    private Runway runway;
    private PlanesInFlight planesInFlight;
    private PlanesOnGround planesOnGround;

    public FlightControlMediatorImpl() {
        runway = new Runway();
        planesInFlight = new PlanesInFlight();
        planesOnGround = new PlanesOnGround();
    }

    @Override
    public boolean requestTakeOff(Plane plane) {
        if (!plane.getIsInTheAir() && runway.getIsAvailable()) {
            System.out.println("Plane " + plane.getId() + " is cleared for takeoff.");
            runway.setIsAvailable(false);
            return true;
        }
        return false;
    }

    @Override
    public void notifyTakeOff(Plane plane) {
        removePlaneFromGround(plane);
        addPlaneToFlight(plane);
        plane.setIsInTheAir(true);
    }

    @Override
    public void addPlaneToGround(Plane plane) {
        planesOnGround.addPlane(plane);
    }

    @Override
    public void removePlaneFromGround(Plane plane) {
        planesOnGround.removePlane(plane);
    }

    @Override
    public void addPlaneToFlight(Plane plane) {
        planesInFlight.addPlane(plane);
    }
}