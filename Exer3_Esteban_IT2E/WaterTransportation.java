class WaterTransport extends Transportation { //subclass water transport
    double displacement;
    String propulsionType;

    WaterTransport(String name, int capacity, double speed, double displacement, String propulsionType) {
        super(name, capacity, speed);
        this.displacement = displacement;
        this.propulsionType = propulsionType;
    }

    @Override
    void move() {
        System.out.println(name + " is sailing on water.");
    }
}
//the water transports 
class Boat extends WaterTransport {
    Boat() {
        super("Boat", 10, 30, 200, "Outboard Motor");
    }
}

class Jetski extends WaterTransport {
    Jetski() {
        super("Jetski", 2, 70, 300, "Jet Propulsion");
    }
}