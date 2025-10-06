// Superclass for all healthcare-related products
public class HealthcareProduct {
    protected int productID;
    protected String name;
    protected String description;
    protected double price;
    protected int stock;

    // Constructor
    public HealthcareProduct(int productID, String name, String description, double price, int stock) {
        this.productID = productID;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stock = stock;
    }

    // Method to return all details as a formatted string
    public String getDetails() {
        return "Product ID: " + productID +
               "\nName: " + name +
               "\nDescription: " + description +
               "\nPrice: ₱" + price +
               "\nStock: " + stock;
    }
    
    // Morph :)
    public void displayType() {
        System.out.println("This is a general healthcare product.");
    }
}