// Tablet subclass of Medicine
public class Tablet extends Medicine {
    private String form;

    public Tablet(int productID, String name, String description, double price, int stock,
                  String dosage, String expiryDate, String form) {
        super(productID, name, description, price, stock, dosage, expiryDate);
        this.form = form;
    }

    public void take() {
        System.out.println("Taking tablet in form: " + form);
    }
}
