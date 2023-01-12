package OO.car.car;

public class car {
    public void breack(){
        System.out.println("Ich bremse");
    }
    public void drive(){
        this.fuelAmount = this.fuelAmount - fuelConsuption;
        System.out.println("I am driving");
    }
    public void superboost(){
        if (this.totalfuelAmount*0.1<this.fuelAmount)  {
            System.out.println("SupperBoostMode is possible");
        }
        else {
            System.out.println("not enough fuel for Superboost");
        }

    }
    public void honk(int amountOfReps){
        
        for (int i = 0; i < amountOfReps; i++) {
          System.out.println("honk");
        }
    }
    public int fuelConsuption;

    public int totalfuelAmount;
    public int fuelAmount;
    public String brand;
    public String serialNumber;

    private String color;






}
