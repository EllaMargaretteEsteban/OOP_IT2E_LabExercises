public class Jetski extends WaterTransport {
    public Jetski(int capacity) {
        super("Jetski", capacity, 70.0, 300.0, "Jet Propulsion");
    }

    public void calculateSpeed() {
        speed = 70.0;
    }
}
