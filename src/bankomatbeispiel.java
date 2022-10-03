import java.util.Scanner;
public class bankomatbeispiel {
    public static void main(String[] args) {
        int balance = 0;
        System.out.println("Wählen sie die gewünschte Funktion:");
        System.out.println("    1. Einzahlen");
        System.out.println("    2. Abheben");
        System.out.println("    3. Kontostand");
        System.out.println("    4. Maschine Stoppen");
        Scanner scanner = new Scanner(System.in);
        boolean isFinished = false;

        while (!isFinished) {
            int selection = scanner.nextInt();

            if (selection == 1) {
                System.out.println("Wie viel möchten sie einzahlen?");
                int payIn = scanner.nextInt();
                balance = balance + payIn;
                System.out.println("Sie haben " + payIn + "€ eingezahlt");
            }
            if (selection == 2) {

                System.out.println("Wie viel möchten sie abheben");
                int payOut = scanner.nextInt();
                balance = balance - payOut;
                System.out.println("Sie haben " + payOut + "€ abgehoben");
            }
            if (selection == 3) {

                System.out.println("Ihr Kontostand ist " + balance + "€");

            }
            if (selection == 4) {

                System.out.println("Die Maschine hat gestoppt");
                isFinished = true;

            }
        }
    }
}
