package ru.JavaRush.JavaMultithreading.LvL29.MenuOfRestaurant;

/*
main Класс
 */

import ru.JavaRush.JavaMultithreading.LvL29.MenuOfRestaurant.kitchen.Cook;
import ru.JavaRush.JavaMultithreading.LvL29.MenuOfRestaurant.kitchen.Waiter;

public class Restaurant {
    public static void main(String[] args) throws Exception {
        Tablet tablet = new Tablet(5);
        Cook cook = new Cook("Pedro");
        Waiter waiter = new Waiter();
        tablet.addObserver(cook);
        cook.addObserver(waiter);

        tablet.createOrder();
    }
}
