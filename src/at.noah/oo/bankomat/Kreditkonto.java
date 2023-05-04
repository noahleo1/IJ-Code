package at.noah.oo.bankomat;

public class Kreditkonto {

        private double balance;

        public Kreditkonto(double balance) {
            this.balance = balance;
        }

        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }

        public void showBalance() {
            System.out.println("Der aktuelle Kontostand beträgt: " + this.balance + "€");
        }



        public void withdraw(double withdrawValue) {
            this.balance = this.balance - withdrawValue;
            System.out.println("Es wurde Geld abgehoben, Der neue Kontostand beträgt nun: " + this.balance + "€");
        }
    }

