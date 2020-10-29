package ru.JavaRush.JavaMultithreading.LvL29.MenuOfRestaurant.kitchen;

/*
Класс повара. Наблюдающий обьект за классом Планшета (Tablet). А так же объект оповещающий (Waiter)
 */

import ru.JavaRush.JavaMultithreading.LvL29.MenuOfRestaurant.ConsoleHelper;

import java.util.Observable;
import java.util.Observer;

public class Cook extends Observable implements Observer  {

    private final String name;

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
        ConsoleHelper.writeMessage("Start cooking - " + arg);
        setChanged();
        notifyObservers(arg);
    }
}
