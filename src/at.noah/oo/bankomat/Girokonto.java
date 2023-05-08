package at.noah.oo.bankomat;

public class Girokonto {
    private double balance=0;

    public Girokonto(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void showBalance() {
        System.out.println("Der Kontostand beträgt: " + this.balance + "€");
    }

    public void deposit(double depositValue) {
        this.balance = this.balance + depositValue;
        System.out.println("Es wurde Geld eingezahlt, Der neue Kontostand beträgt nun: " + this.balance + "€");
    }

    public void withdraw(double withdrawValue) {
        this.balance = this.balance - withdrawValue;

        System.out.println("Es wurde Geld abgehoben, Der neue Kontostand beträgt nun: " + this.balance + "€");
    }
}

