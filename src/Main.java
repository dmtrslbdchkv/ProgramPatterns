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

        // Создание магазина и клиентов
        ClothingStore store = new ClothingStore();
        Customer customer1 = new Customer("Алексей");
        Customer customer2 = new Customer("Мария");

        // Подписка клиентов на уведомления
        store.attach(customer1);
        store.attach(customer2);

        // Добавление новой коллекции и распродажа
        store.addNewCollection("Летняя коллекция");
        store.startSale("Скидки до 50% на все товары!");

        // Вывод информации о созданной одежде
        System.out.println(blouse.getDescription() + " - $" + blouse.getPrice());
        System.out.println(pants.getDescription() + " - $" + pants.getPrice());
        System.out.println(shoes.getDescription() + " - $" + shoes.getPrice());
    }
}
