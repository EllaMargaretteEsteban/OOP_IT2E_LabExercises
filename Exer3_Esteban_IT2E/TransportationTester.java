public class TransportationTester { // the main tester class
    public static void main(String[] args) {
        // Land transport run
        System.out.println("Land transports:");
        Truck truck = new Truck();
        truck.move();
        truck.displayInfo();
        System.out.println();

        SUV suv = new SUV();
        suv.move();
        suv.displayInfo();
        System.out.println();

        Tricycle tricycle = new Tricycle();
        tricycle.move();
        tricycle.displayInfo();
        System.out.println();

        Motorcycle motorcycle = new Motorcycle();
        motorcycle.move();
        motorcycle.displayInfo();
        System.out.println();

        // Air transport run
        System.out.println("Air transports:");
        Plane plane = new Plane();
        plane.move();
        plane.displayInfo();
        System.out.println();

        Helicopter heli = new Helicopter();
        heli.move();
        heli.displayInfo();
        System.out.println();

        // Water transport run
        System.out.println("Water transports:");
        Boat boat = new Boat();
        boat.move();
        boat.displayInfo();
        System.out.println();

        Jetski jetski = new Jetski();
        jetski.move();
        jetski.displayInfo();
    }
}