// Thermometer subclass of Equipment
public class Thermometer extends Equipment {
    private double accuracy;

    public Thermometer(int productID, String name, String description, double price, int stock,
                       String type, String warranty, double accuracy) {
        super(productID, name, description, price, stock, type, warranty);
        this.accuracy = accuracy;
    }

    public void measureTemp() {
        System.out.println("Measuring temperature with accuracy: " + accuracy + "°C");
    }
}
