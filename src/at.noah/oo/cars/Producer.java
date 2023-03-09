package at.noah.oo.cars;

public class Producer {

    private String producerName;
    private String creatingCountry;
    private double discount;

    public Producer(String producerName, String creatingCountry, double discount) {
        this.producerName = producerName;
        this.creatingCountry = creatingCountry;
        this.discount = discount;
    }
}
