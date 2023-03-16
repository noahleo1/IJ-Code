package at.noah.oo.cars;



public class main {

    public static void main(String[] args) {
        Engine e1 = new Engine("Diesel",100);
        Engine e2 = new Engine("Benzin",150);

        Producer bentley = new Producer("bentley", "america", 0.1);
        Producer mercedes = new Producer("mercedes", "germany", 0.2);
        car c1 = new car("blue",100,20000, 5, e1, bentley,20000);
        car c2 = new car("blue",200,30000, 8, e2, mercedes,60000);

        c1.newPrice();
        c1.newConsumption();

        c2.newPrice();
        c2.newConsumption();


    }
}