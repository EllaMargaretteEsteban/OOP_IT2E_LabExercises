public class AirTransport extends Transportation { //subclass air transport
    double altitudeLimit;
    String engineType;

    AirTransport(String name, int capacity, double speed, double altitudeLimit, String engineType) {
        super(name, capacity, speed);
        this.altitudeLimit = altitudeLimit;
        this.engineType = engineType;
    }

    @Override
    void move() {
        System.out.println(name + " is flying in the sky.");
    }
}
//the air transports 
class Plane extends AirTransport {
    Plane() {
        super("Plane", 180, 900, 12000, "Jet Engine");
    }
}

class Helicopter extends AirTransport {
    Helicopter() {
        super("Helicopter", 5, 250, 3000, "Turboshaft");
    }
}