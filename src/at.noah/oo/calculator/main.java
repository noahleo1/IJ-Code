package at.noah.oo.calculator;

public class main {
    public static void main(String[] args) {

        BasicCalculator b1 = new BasicCalculator("TexasInstruments");

        b1.addition(1, 2);
        b1.substraction(2, 1);

        ScientificCalculator s1 = new ScientificCalculator();

        s1.cosCalc(10);

        RootCalculator r1 = new RootCalculator();

        r1.rootCalc(20);
    }

}
