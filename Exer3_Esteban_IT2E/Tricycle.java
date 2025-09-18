public class Tricycle extends LandTransport {
    public Tricycle(int capacity, int numWheels) {
        super("Tricycle", capacity, 40.0, numWheels, "Gasoline");
    }

    public void calculateSpeed() {
        speed = 40.0;
    }
}
