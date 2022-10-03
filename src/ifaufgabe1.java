package at.ran.basics;

import java.util.Random;

public class ifaufgabe1 {
    public static void main(String[] args) {
        // Erstelle eine Zufallszahl zwischen 0 und 100
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        System.out.println(randomNumber);

        if ((randomNumber > 19) && (randomNumber < 51)) {
            System.out.println("Mittel");
        } else if (randomNumber < 20) {
            System.out.println("klein");
        } else {
            System.out.println("groß");
        }
    }
}