package ru.JavaRush.JavaMultithreading.LvL29.MenuOfRestaurant;

import ru.JavaRush.JavaMultithreading.LvL29.MenuOfRestaurant.kitchen.Cook;
import ru.JavaRush.JavaMultithreading.LvL29.MenuOfRestaurant.kitchen.Order;

public class Restaurant {
    public static void main(String[] args) throws Exception {
        Tablet tablet = new Tablet(5);
        Cook cook = new Cook("Pedro");
        tablet.addObserver(cook);

        tablet.createOrder();


    }
}
