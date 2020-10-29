package ru.JavaRush.JavaMultithreading.LvL29.MenuOfRestaurant.ad;

/*
у каждого планшета будет свой объект менеджера, который будет подбирать оптимальный набор
роликов и их последовательность для каждого заказа.
Он также будет взаимодействовать с плеером и отображать ролики.
*/

import ru.JavaRush.JavaMultithreading.LvL29.MenuOfRestaurant.ConsoleHelper;

public class AdvertisementManager {
    private final AdvertisementStorage storage;
    private int timeSeconds;

    public AdvertisementManager(int timeSeconds) {
        storage = AdvertisementStorage.getInstance();
        this.timeSeconds = timeSeconds;
    }

    public void processVideos() {
        ConsoleHelper.writeMessage("calling processVideos method");
    }
}
