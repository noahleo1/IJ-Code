package at.noah.oo.remote;

public class main {
    public static void main(String[] args) {
        battery b1 = new battery(100,1);
        battery b2 = new battery(90,2);

        remote r1 = new remote();

        r1.addbatteries(b1);
        r1.addbatteries(b2);

        r1.getStatus();
        r1.turnOff();
        r1.turnOff();
        r1.getStatus();
    }

}
