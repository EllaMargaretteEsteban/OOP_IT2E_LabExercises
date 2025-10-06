// Equipment subclass of HealthcareProduct
public class Equipment extends HealthcareProduct {
    protected String type;
    protected String warranty;

    public Equipment(int productID, String name, String description, double price, int stock,
                     String type, String warranty) {
        super(productID, name, description, price, stock);
        this.type = type;
        this.warranty = warranty;
    }

    public void checkWarranty() {
        System.out.println(name + " has warranty: " + warranty);
    }
    
    @Override
    //overriding means to declare more redefined method inherited 
    public void displayType() {
        System.out.println("This is a Equipment .");
}
}
