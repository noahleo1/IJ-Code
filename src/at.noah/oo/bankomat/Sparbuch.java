package at.noah.oo.bankomat;

public class Sparbuch {


        private double balance;

        public Sparbuch(double balance) {
            this.balance = balance;
        }

        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }

        public void showBalance() {
            System.out.println("Der aktuelle Sparbuchstand beträgt: " + this.balance + "€");
        }

        public void deposit(double depositValue) {
            this.balance = this.balance + depositValue;
            System.out.println("Es wurde Geld aufs Sparbuch eingezahlt, Der neue Sparbuchstand beträgt nun: " + this.balance + "€");
        }


    }

