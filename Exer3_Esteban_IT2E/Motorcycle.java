public class Motorcycle extends LandTransport {
    public Motorcycle(int capacity, int numWheels) {
        super("Motorcycle", capacity, 100.0, numWheels, "Gasoline");
    }

    public void calculateSpeed() {
        speed = 100.0;
    }
}
