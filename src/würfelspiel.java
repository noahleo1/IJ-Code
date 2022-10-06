import java.util.Scanner;
import java.util.Random;

public class würfelspiel {
    public static void main(String[] args) {
        int winPlayer = 0;
        int counter = 0;
        boolean isFinished = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Willkommen im WürfelSpiel(:");
        System.out.println("    Wähle 1 um sofort einen Wurf durchzuführen");
        System.out.println("    Wähle 2 um noch die Regeln durchzulesen");
        Random random = new Random();

        while (!isFinished) {
            int selection = scanner.nextInt();
            int randomNumber = random.nextInt(1, 7);
            int randomNumber2 = random.nextInt(1, 7);
            if (counter == 5) {
                isFinished = true;
                if (winPlayer > 0) {
                    System.out.println("Diese Runde geht an dich, gg");
                } else if (winPlayer > 0) {
                    System.out.println("Diese Runde geht an den Computer, gg");
                } else {
                    System.out.println("Gleichstand");
                }


            }

            if (selection == 2) {
                System.out.println("Du hast jetzt insgesamt 6 Würfe,");
                System.out.println("Der Computer ist dein Gegner, er generiert auch Würfe. ");
                System.out.println("Wer letzendlich mehr runden gewinnt ist der Sieger");

                System.out.println("Wähle nun 1 um je einen Wurf durchzuführen");
            }
            if ((selection == 1) && (randomNumber > randomNumber2)) {
                counter = counter + 1;
                System.out.println("dein Wurf " + randomNumber);
                System.out.println("der Wurf des Computers " + randomNumber2);
                System.out.println("Du gewinnst diese Runde");
                winPlayer = winPlayer + 1;
            } else if ((selection == 1) && (randomNumber < randomNumber2)) {
                counter = counter + 1;
                System.out.println("dein Wurf " + randomNumber);
                System.out.println("der Wurf des Computers " + randomNumber2);
                System.out.println("Der Computer gewinnt diese Runde");
                winPlayer = winPlayer - 1;
            } else{
                counter = counter + 1;
                System.out.println("Gleichstand");
            }
        }
        if (winPlayer > 0) {
            System.out.println("Diese Runde geht an dich, gg");
        } else if (winPlayer > 0) {
            System.out.println("Diese Runde geht an den Computer, gg");
        }
    }

}

