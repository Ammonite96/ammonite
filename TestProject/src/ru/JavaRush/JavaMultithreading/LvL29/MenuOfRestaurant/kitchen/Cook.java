package ru.JavaRush.JavaMultithreading.LvL29.MenuOfRestaurant.kitchen;

import ru.JavaRush.JavaMultithreading.LvL29.MenuOfRestaurant.ConsoleHelper;
import ru.JavaRush.JavaMultithreading.LvL29.MenuOfRestaurant.Tablet;

import java.util.Observable;
import java.util.Observer;

public class Cook implements Observer {

    private final String name;
    private Tablet tablet;
    private Order order;

    public Cook(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cook{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void update(Observable o, Object arg) {
        this.order = (Order) arg;
        ConsoleHelper.writeMessage("Start cooking - " + order);
    }
}
