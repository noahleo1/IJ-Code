
import java.util.Random;

public class ifTask2 {
    public static void main(String[] args) {
        // Erstelle eine Zufallszahl zwischen 0 und 100
            Random random = new Random();
            int randomNumber = random.nextInt(100);
            int randomNumber1 = random.nextInt(100);
            System.out.println("Zahl 1 " + randomNumber);
            System.out.println("Zahl 2 "+ randomNumber1);
        if ((randomNumber < randomNumber1) && (randomNumber < 50)) {
            System.out.println("Zahl 1 ist kleiner als Zahl 2 und Mini");
        }
        if ((randomNumber < 30) || (randomNumber1 < 30)) {
            System.out.println("eine der beiden Zahlen ist kleiner als 30");
        }
        if ((randomNumber < 50) && (randomNumber1 !=50)) {
            System.out.println("Zahl 1 ist klein und Zahl 2 kein 50er");
        }

    }
}
