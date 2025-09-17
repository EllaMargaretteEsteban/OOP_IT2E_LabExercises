public abstract class Transportation { //the superclass
    String name; //the instances (instance variables)
    int capacity;
    double speed;

    Transportation(String name, int capacity, double speed) { //the constructor
        this.name = name;
        this.capacity = capacity;
        this.speed = speed;
    }

    void move() { //method when transportation is moving
        System.out.println(name + " is moving...");
    }

    void displayInfo() { //method to display the data
        System.out.println("Name: " + name + ", Capacity: " + capacity + ", Speed: " + speed + " km/h");
    }
}

public class Main { //the main class
    public static void main(String[] args) {
        //land transport run
        System.out.println("land transports:");
        Truck truck = new Truck();
        truck.move();
        truck.displayInfo();
        System.out.println(); //separator
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
        //air
        System.out.println("air transports:");
        Plane plane = new Plane();
        plane.move();
        plane.displayInfo();
        System.out.println();
        Helicopter heli = new Helicopter();
        heli.move();
        heli.displayInfo();
        System.out.println();
        //water
        System.out.println("water transports:");
        Boat boat = new Boat();
        boat.move();
        boat.displayInfo();
        System.out.println();
        Jetski jetski = new Jetski();
        jetski.move();
        jetski.displayInfo();
    }
}
