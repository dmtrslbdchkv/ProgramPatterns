import factory.Clothing;
import factory.ClothingFactory;
import observer.ClothingStore;
import observer.Customer;

public class Main {
    public static void main(String[] args) {
        ClothingFactory factory = new ClothingFactory();

        Clothing blouse = factory.createClothing("blouse", "Красная блуза", 29.99);
        Clothing pants = factory.createClothing("pants", "Синие брюки", 49.99);
        Clothing shoes = factory.createClothing("shoes", "Кроссовки", 69.99);

        ClothingStore store = new ClothingStore();
        Customer customer1 = new Customer("Алексей");
        Customer customer2 = new Customer("Мария");
        Customer customer3 = new Customer("Антон");

        store.attach(customer1);
        store.attach(customer2);

        store.addNewCollection("Летняя коллекция");
        store.startSale("Скидки до 50% на все товары!");

        System.out.println(blouse.getDescription() + " - руб." + blouse.getPrice());
        System.out.println(pants.getDescription() + " - руб." + pants.getPrice());
        System.out.println(shoes.getDescription() + " - руб." + shoes.getPrice());

        store.detach(customer1);
        store.detach(customer2);

    }
}
