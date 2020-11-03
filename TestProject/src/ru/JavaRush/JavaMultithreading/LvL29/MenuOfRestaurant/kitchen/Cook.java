package ru.JavaRush.JavaMultithreading.LvL29.MenuOfRestaurant.kitchen;

/*
Класс повара. Наблюдающий обьект за классом Планшета (Tablet). А так же объект оповещающий (Waiter)
 */

import ru.JavaRush.JavaMultithreading.LvL29.MenuOfRestaurant.ConsoleHelper;
import ru.JavaRush.JavaMultithreading.LvL29.MenuOfRestaurant.statistic.StatisticManager;
import ru.JavaRush.JavaMultithreading.LvL29.MenuOfRestaurant.statistic.event.CookedOrderEventDataRow;

import java.util.Observable;
import java.util.Observer;

public class Cook extends Observable implements Observer {

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
        Order order = (Order) arg;
        ConsoleHelper.writeMessage("Start cooking - " + arg);
        // Генерирует Событие повара
        StatisticManager.getInstance().register(new CookedOrderEventDataRow(
                o.toString(),
                this.name,
                order.getTotalCookingTime(),
                order.getDishes()));

        setChanged();
        notifyObservers(arg);
    }
}
