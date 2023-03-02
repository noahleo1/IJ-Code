package carPart2OO;


public class car {
    public int fuelConsuption;

    public int totalFuelAmount;
    public int fuelAmount;
    public String brand;
    public String serialNumber;
    public String color;
    public int totalfuelAmount;


    public car(int fuelConsuption, int totalFuelAmount, int fuelAmount, String brand, String serialNumber, String color) {
        this.fuelConsuption = fuelConsuption;
        this.totalFuelAmount = totalFuelAmount;
        this.fuelAmount = fuelAmount;
        this.brand = brand;
        this.serialNumber = serialNumber;
        this.color = color;

    }

    public car() {

    }

    public void breack() {
        System.out.println("Ich bremse");
    }

    public void drive() {
        this.fuelAmount = this.fuelAmount - fuelConsuption;
        System.out.println("I am driving");
    }

    public void superboost() {
        if (this.totalFuelAmount * 0.1 < this.fuelAmount) {
            System.out.println("SupperBoostMode is possible");
        } else {
            System.out.println("not enough fuel for Superboost");
        }

    }

    public void honk(int amountOfReps) {

        for (int i = 0; i < amountOfReps; i++) {
            System.out.println("honk");
        }
    }


}
