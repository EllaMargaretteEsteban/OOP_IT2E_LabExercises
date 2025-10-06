// Supplement subclass of HealthcareProduct
public class Supplement extends HealthcareProduct {
    protected String brand;
    protected String dosageForm;

    public Supplement(int productID, String name, String description, double price, int stock,
                      String brand, String dosageForm) {
        super(productID, name, description, price, stock);
        this.brand = brand;
        this.dosageForm = dosageForm;
    }

    public void useSupplement() {
        System.out.println("Using supplement: " + name + " (" + brand + ")");
    }
    
    @Override
    //overriding means to declare more redefined method inherited 
    public void displayType() {
        System.out.println("This is a Supplement .");
    }
}