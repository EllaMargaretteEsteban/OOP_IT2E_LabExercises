public class SUV extends LandTransport {
    public SUV(int capacity, int numWheels) {
        super("SUV", capacity, 120.0, numWheels, "Gasoline");
    }

    public void calculateSpeed() {
        speed = 120.0;
    }
}
