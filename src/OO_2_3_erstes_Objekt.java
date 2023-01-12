public class OO_2_3_erstes_Objekt {
    public static void main(String[] args) {
        int a = 7;

        car c1 = new car();
        c1.brand="Audi";
        c1.fuelConsuption =7;
        c1.serialNumber="A1234";
        c1.fuelAmount = 70;

        car c2 = new car();
        c2.brand ="Mercedes";
        c2.fuelConsuption =6;
        c2.serialNumber= "M1234";
        c2.fuelAmount = 20;
        System.out.println("car2 is a "+ c2.brand+c2.serialNumber+" Benzinverbrauch von car 2:"+ c2.fuelConsuption );
        System.out.println(c2.fuelAmount + " =  currentfuel");
                c2.drive();

        System.out.println(c2.fuelAmount + " =  currentfuel");




        //D R Y
    }
   public static void turboBoost(String []Args){}
}