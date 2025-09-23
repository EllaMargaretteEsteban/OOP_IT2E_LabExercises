// Vitamin subclass of Supplement
public class Vitamin extends Supplement {
    private String type;
    private int recommendedAge;

    public Vitamin(int productID, String name, String description, double price, int stock,
                   String brand, String dosageForm, String type, int recommendedAge) {
        super(productID, name, description, price, stock, brand, dosageForm);
        this.type = type;
        this.recommendedAge = recommendedAge;
    }

    public void recommend() {
        System.out.println("Recommended for age " + recommendedAge + ": " + type);
    }
}
