public class Truck extends LandTransport {
    public Truck(int capacity, int numWheels) {
        super("Truck", capacity, 80.0, numWheels, "Diesel");
    }

    public void calculateSpeed() {
        speed = 80.0;
    }
}
