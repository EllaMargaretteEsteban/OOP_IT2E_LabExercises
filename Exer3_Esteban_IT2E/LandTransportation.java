public class LandTransport extends Transportation { //subclass land transport
    int numWheels;
    String fuelType;

    LandTransport(String name, int capacity, double speed, int numWheels, String fuelType) {
        super(name, capacity, speed);
        this.numWheels = numWheels;
        this.fuelType = fuelType;
    }

    @Override
    void move() {
        System.out.println(name + " is moving on the road.");
    }
}
//the types of land transports
class Truck extends LandTransport {
    Truck() {
        super("Truck", 2, 80, 6, "Diesel");
    }
}

class SUV extends LandTransport {
    SUV() {
        super("SUV", 7, 120, 4, "Gasoline");
    }
}

class Tricycle extends LandTransport {
    Tricycle() {
        super("Tricycle", 3, 40, 3, "Gasoline");
    }
}

class Motorcycle extends LandTransport {
    Motorcycle() {
        super("Motorcycle", 2, 100, 2, "Gasoline");
    }
}
