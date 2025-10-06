// BloodPressureMonitor subclass of Equipment
public class BloodPressureMonitor extends Equipment {
    private String pressureRange;

    public BloodPressureMonitor(int productID, String name, String description, double price, int stock,
                                String type, String warranty, String pressureRange) {
        super(productID, name, description, price, stock, type, warranty);
        this.pressureRange = pressureRange;
    }

    public void measureBP() {
        System.out.println("Measuring blood pressure, valid range: " + pressureRange);
    }
    
    @Override
    //overrides the overridden back from subclass of the superclass
    public void displayType() {
        System.out.println("This is a Blood Pressure Monitor from Equipment Category.");
    }
}
