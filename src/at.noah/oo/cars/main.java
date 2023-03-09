package at.noah.oo.cars;



public class main {

    public static void main(String[] args) {
        Engine e1 = new Engine("Diesel",100);
        Engine e2 = new Engine("Benzin",150);

        Producer bentley = new Producer("bentley", "america", 10);
        Producer mercedes = new Producer("mercedes", "germany", 20);
        car c1 = new car("blue",100,20000, 5, e1, bentley);
        car c2 = new car("blue",200,30000, 8, e2, mercedes);




    }
}