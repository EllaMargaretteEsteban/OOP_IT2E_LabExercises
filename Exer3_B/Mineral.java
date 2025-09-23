// Mineral subclass of Supplement
public class Mineral extends Supplement {
    private String mineral;

    public Mineral(int productID, String name, String description, double price, int stock,
                   String brand, String dosageForm, String mineral) {
        super(productID, name, description, price, stock, brand, dosageForm);
        this.mineral = mineral;
    }

    public void benefits() {
        System.out.println("This mineral supplement contains: " + mineral);
    }
}
