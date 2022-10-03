import java.util.Random;

public class WhileAufgabe {
    public static void main(String[] args) {

        int adder = 0;
        boolean isFinished = false;
        Random random = new Random();
        while (!isFinished) {
            int randomNumber = random.nextInt(10, 30);
            adder = adder + randomNumber;
            System.out.println(randomNumber);
            if ((randomNumber == 15) || (randomNumber == 25)) {
                isFinished = true;
                System.out.println("Die Summe aller generierten Zufallszahlen lautet " + adder);
            }
        }

    }


}
