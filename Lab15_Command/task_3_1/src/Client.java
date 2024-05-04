public class Client {
    public static void main(String[] args) {
        Lamp kitchenLamp = new Lamp("Kitchen");
        Lamp hallLamp = new Lamp("Hall");
        Lamp bedroomLamp = new Lamp("Bedroom");
        Lamp bathroomLamp = new Lamp("Bathroom");

        LightOnCommand kitchenOn = new LightOnCommand(kitchenLamp);
        LightOffCommand kitchenOff = new LightOffCommand(kitchenLamp);

        LightOnCommand hallOn = new LightOnCommand(hallLamp);
        LightOffCommand hallOff = new LightOffCommand(hallLamp);

        LightOnCommand bedroomOn = new LightOnCommand(bedroomLamp);
        LightOffCommand bedroomOff = new LightOffCommand(bedroomLamp);

        LightOnCommand bathroomOn = new LightOnCommand(bathroomLamp);
        LightOffCommand bathroomOff = new LightOffCommand(bathroomLamp);

        Controller kitchenController = new Controller(kitchenOn, kitchenOff);
        Controller hallController = new Controller(hallOn, hallOff);
        Controller bedroomController = new Controller(bedroomOn, bedroomOff);
        Controller bathroomController = new Controller(bathroomOn, bathroomOff);

        Controller universalOff = new Controller(null, kitchenOff, hallOff, bedroomOff, bathroomOff);

        kitchenController.onButtonPressed();
        hallController.onButtonPressed();
        bedroomController.onButtonPressed();
        bathroomController.onButtonPressed();

        universalOff.offButtonPressed();
    }
}