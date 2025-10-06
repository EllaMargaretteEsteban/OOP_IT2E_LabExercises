// Medicine subclass of HealthcareProduct
public class Medicine extends HealthcareProduct {
    protected String dosage;
    protected String expiryDate;

    public Medicine(int productID, String name, String description, double price, int stock,
                    String dosage, String expiryDate) {
        super(productID, name, description, price, stock);
        this.dosage = dosage;
        this.expiryDate = expiryDate;
    }

    public void prescribe() {
        System.out.println(name + " prescribed with dosage: " + dosage);
    }
    
    @Override
    //overriding means to declare more redefined method inherited 
    public void displayType() {
        System.out.println("This is a Medicine .");
    }
}
