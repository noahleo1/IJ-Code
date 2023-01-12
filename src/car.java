
public class car {


    public int fuelConsuption;
    public int fuelAmount;
    public String brand;
    public String serialNumber;

    private String color;

    public void drive(){
        this.fuelAmount = this.fuelAmount - fuelConsuption;
        System.out.println("I am driving");
    }

}
