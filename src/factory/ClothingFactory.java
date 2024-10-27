package factory;

public class ClothingFactory {

    public Clothing createClothing(String type, String description, double price) {
        switch (type.toLowerCase()) {
            case "blouse":
                return new Blouse(description, price);
            case "pants":
                return new Pants(description, price);
            case "shoes":
                return new Shoes(description, price);
            default:
                throw new IllegalArgumentException("Unknown clothing type");
        }
    }
}