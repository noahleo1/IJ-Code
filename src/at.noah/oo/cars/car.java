package at.noah.oo.cars;

public class car {
    private String colour;
    private int maxSpeed;
    private int baseprice;
    private double baseConsumption;
    private Producer producer;
    private Engine engine;
    private int kilometres;

    public car(String colour,
               int maxSpeed,
               int baseprice,
               double baseConsumption,
               Engine engine,
               Producer producer, int kilometres) {
        this.colour = colour;
        this.maxSpeed = maxSpeed;
        this.baseprice = baseprice;
        this.baseConsumption = baseConsumption;
        this.producer = producer;
        this.engine = engine;
        this.kilometres = kilometres;
    }

    public void newPrice() {
        double newPrice = this.baseprice - (this.baseprice * this.producer.getDiscount());
        System.out.println("Der neue Preis  beträgt: " + newPrice + "€");
    }
//..
    public void newConsumption() {
        if (this.kilometres >= 50000) {
            double newFuelConsumption = this.baseConsumption + (this.baseConsumption * 0.098);
            System.out.println("Der neue Spritverbrauch beträgt für: " +this.producer.getProducerName()+": "+newFuelConsumption + "l/100km");
        }
        else{
            System.out.println("Der Spritverbrauch ist noch der selbe, er beträgt für: "+this.producer.getProducerName()+": " +this.baseConsumption+"l/100km");
        }
    }
}
