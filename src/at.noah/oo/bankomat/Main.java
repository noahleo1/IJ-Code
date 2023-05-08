package at.noah.oo.bankomat;

public class Main {

    public static void main(String[] args) {
        Girokonto acc1 = new Girokonto(1000);
        acc1.showBalance();
        acc1.deposit(50);
        acc1.withdraw(120);

        Sparbuch acc2 = new Sparbuch(1000);
        acc2.showBalance();
        acc2.deposit(90);


        Kreditkonto acc3 = new Kreditkonto(-1000);
        acc3.showBalance();

        acc3.withdraw(130);
    }
}