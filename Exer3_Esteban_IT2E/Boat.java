public class Boat extends WaterTransport {
    public Boat(int capacity) {
        super("Boat", capacity, 30.0, 200.0, "Outboard Motor");
    }

    public void calculateSpeed() {
        speed = 30.0;
    }
}
