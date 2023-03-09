package at.noah.oo.cars;

public class car {
    private String colour;
    private int maxSpeed;
    private int baseprice;
    private double baseConsumption;
    private Producer producer;
    private Engine engine;

    public car(String colour,
               int maxSpeed,
               int baseprice,
               double baseConsumption,
               Engine engine,
               Producer producer) {
        this.colour = colour;
        this.maxSpeed = maxSpeed;
        this.baseprice = baseprice;
        this.baseConsumption= baseConsumption;
        this.producer = producer;
        this.engine = engine;
    }
}
