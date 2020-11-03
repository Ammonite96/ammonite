package ru.JavaRush.JavaMultithreading.LvL29.MenuOfRestaurant;

/*
main Класс
 */

import ru.JavaRush.JavaMultithreading.LvL29.MenuOfRestaurant.kitchen.Cook;
import ru.JavaRush.JavaMultithreading.LvL29.MenuOfRestaurant.kitchen.Waiter;
import ru.JavaRush.JavaMultithreading.LvL29.MenuOfRestaurant.statistic.StatisticManager;
import ru.JavaRush.JavaMultithreading.LvL29.MenuOfRestaurant.statistic.event.EventDataRow;
import ru.JavaRush.JavaMultithreading.LvL29.MenuOfRestaurant.statistic.event.EventType;
import ru.JavaRush.JavaMultithreading.LvL29.MenuOfRestaurant.statistic.event.VideoSelectedEventDataRow;

import java.util.List;
import java.util.Map;

public class Restaurant {
    public static void main(String[] args) throws Exception {
        Tablet tablet = new Tablet(5);
        Cook cook = new Cook("Pedro");
        Waiter waiter = new Waiter();
        tablet.addObserver(cook);
        cook.addObserver(waiter);

        tablet.createOrder();

        System.out.println(StatisticManager.getInstance().totalProfitForEachDay());

        DirectorTablet directorTablet = new DirectorTablet();
        directorTablet.printActiveVideoSet();
        directorTablet.printAdvertisementProfit();
        directorTablet.printArchivedVideoSet();
        directorTablet.printCookWorkloading();
    }
}
