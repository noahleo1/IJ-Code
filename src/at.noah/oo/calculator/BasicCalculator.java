package at.noah.oo.calculator;

public class BasicCalculator {
    private String producer;


    public BasicCalculator(String producer) {
        this.producer = producer;

    }

    public String getProducer() {
        return producer;
    }



    public void addition(int firstNum, int secondNum) {
        int result;
        result = firstNum + secondNum;
        System.out.println("Das Ergebnis lautet: " + result);
    }

    public void substraction(int firstNum, int secondNum) {
        int result;
        result = firstNum - secondNum;
        System.out.println("Das Ergebnis lautet: " + result);
    }

    public void multiplication(int firstNum, int secondNum) {
        int result;
        result = firstNum * secondNum;
        System.out.println("Das Ergebnis lautet: " + result);
    }

    public void division(int firstNum, int secondNum) {
        int result;
        result = firstNum / secondNum;
        System.out.println("Das Ergebnis lautet: " + result);
    }
}
