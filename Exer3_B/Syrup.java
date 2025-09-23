// Syrup subclass of Medicine
public class Syrup extends Medicine {
    private String flavor;

    public Syrup(int productID, String name, String description, double price, int stock,
                 String dosage, String expiryDate, String flavor) {
        super(productID, name, description, price, stock, dosage, expiryDate);
        this.flavor = flavor;
    }

    public void drink() {
        System.out.println("Drinking syrup with flavor: " + flavor);
    }
}
