package ru.JavaRush.JavaMultithreading.LvL29.MenuOfRestaurant;

/*
Класс планшет. Объект оповещающий наблюдателя (Cook)
 */

import ru.JavaRush.JavaMultithreading.LvL29.MenuOfRestaurant.ad.AdvertisementManager;
import ru.JavaRush.JavaMultithreading.LvL29.MenuOfRestaurant.ad.NoVideoAvailableException;
import ru.JavaRush.JavaMultithreading.LvL29.MenuOfRestaurant.kitchen.Order;
import ru.JavaRush.JavaMultithreading.LvL29.MenuOfRestaurant.statistic.StatisticManager;
import ru.JavaRush.JavaMultithreading.LvL29.MenuOfRestaurant.statistic.event.NoAvailableVideoEventDataRow;

import java.io.IOException;
import java.util.Observable;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Tablet extends Observable {

    private final int number;       // номер планшета
    private static Logger logger = Logger.getLogger(Tablet.class.getName());

    public Tablet(int number) {
        this.number = number;
    }

    public Order createOrder() {        // метод создаёт заказ из тех блюд, которые выберет пользователь.
        Order order = null;
        AdvertisementManager advertisementManager = null;
        try {
            order = new Order(this);
            if (!order.isEmpty()) {
                advertisementManager = new AdvertisementManager(order.getTotalCookingTime() * 60);
                setChanged();
                notifyObservers(order);
                advertisementManager.processVideos();
            }
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Console is unavailable.");
        } catch (NoVideoAvailableException ex) {
            StatisticManager.getInstance().register(new NoAvailableVideoEventDataRow(order.getTotalCookingTime()));
            logger.log(Level.INFO, "No video is available for the order " + order);
        }
        return order;
    }

    public String toString() {
        return "Tablet{" +
                "number=" + number +
                '}';
    }
}
