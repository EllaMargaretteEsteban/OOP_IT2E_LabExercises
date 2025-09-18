public class Helicopter extends AirTransport {
    public Helicopter(int capacity) {
        super("Helicopter", capacity, 250.0, 3000.0, "Turboshaft");
    }

    public void calculateSpeed() {
        speed = 250.0;
    }
}
