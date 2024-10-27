package factory;

public class Pants implements Clothing {
    private final String description;
    private final double price;

    public Pants(String description, double price) {
        this.description = description;
        this.price = price;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getPrice() {
        return price;
    }
}