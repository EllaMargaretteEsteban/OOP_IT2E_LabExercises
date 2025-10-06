public class HealthcareProjectTester { // the main tester class
    public static void main(String[] args) {
        // Medicine run
        System.out.println("Medicines:");
        Tablet tablet = new Tablet(101, "Paracetamol", "Used for fever", 10.5, 100, "500mg", "2025-12-31", "Round");
        tablet.displayType();
        tablet.prescribe();
        tablet.take();
        System.out.println(tablet.getDetails());
        System.out.println();

        Syrup syrup = new Syrup(102, "Cough Syrup", "Relieves cough", 55.0, 50, "10ml", "2024-10-10", "Cherry");
        syrup.displayType();
        syrup.prescribe();
        syrup.drink();
        System.out.println(syrup.getDetails());
        System.out.println();

        // Supplement run
        System.out.println("Supplements:");
        Vitamin vitamin = new Vitamin(201, "Vitamin C", "Boosts immune system", 20.0, 200, "BrandX", "Tablet", "Ascorbic Acid", 12);
        vitamin.displayType();
        vitamin.useSupplement();
        vitamin.recommend();
        System.out.println(vitamin.getDetails());
        System.out.println();

        Mineral mineral = new Mineral(202, "Calcium", "Strengthens bones", 30.0, 150, "BrandY", "Capsule", "Calcium Carbonate");
        mineral.displayType();
        mineral.useSupplement();
        mineral.benefits();
        System.out.println(mineral.getDetails());
        System.out.println();

        // Equipment run
        System.out.println("Equipments:");
        Thermometer thermometer = new Thermometer(301, "Digital Thermometer", "Measures body temperature", 150.0, 20, "Electronic", "1 year", 0.1);
        thermometer.displayType();
        thermometer.checkWarranty();
        thermometer.measureTemp();
        System.out.println(thermometer.getDetails());
        System.out.println();

        BloodPressureMonitor bpMonitor = new BloodPressureMonitor(302, "BP Monitor", "Measures blood pressure", 500.0, 10, "Electronic", "2 years", "40-260 mmHg");
       bpMonitor.displayType();
        bpMonitor.checkWarranty();
        bpMonitor.measureBP();
        System.out.println(bpMonitor.getDetails());
    }
}
