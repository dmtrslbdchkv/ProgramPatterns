package observer;

import java.util.ArrayList;
import java.util.List;

public class ClothingStore implements Subject {
    private final List<Observer> observers = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    // Метод для добавления новой коллекции или распродажи
    public void addNewCollection(String collectionName) {
        notifyObservers("Новая коллекция: " + collectionName + " теперь доступна!");
    }

    public void startSale(String saleDetails) {
        notifyObservers("Распрадажа! " + saleDetails);
    }
}