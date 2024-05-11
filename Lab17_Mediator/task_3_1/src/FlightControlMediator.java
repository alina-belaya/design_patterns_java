interface FlightControlMediator {
    boolean requestTakeOff(Plane plane);
    void notifyTakeOff(Plane plane);
    void addPlaneToGround(Plane plane);
    void removePlaneFromGround(Plane plane);
    void addPlaneToFlight(Plane plane);
}