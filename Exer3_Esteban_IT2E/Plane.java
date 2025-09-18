public class Plane extends AirTransport {
    public Plane(int capacity) {
        super("Plane", capacity, 900.0, 12000.0, "Jet Engine");
    }

    public void calculateSpeed() {
        speed = 900.0;
    }
}
