public class Loopsaufgabe2 {

    public static void main(String[] args) {
        int adder = 0;
        for (int i = 2; i < 1001; i = i + 2) {
            adder = adder + i;

        }

        System.out.println(adder);
    }
}

