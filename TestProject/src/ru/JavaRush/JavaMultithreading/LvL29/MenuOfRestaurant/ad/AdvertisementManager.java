package ru.JavaRush.JavaMultithreading.LvL29.MenuOfRestaurant.ad;

/*
у каждого планшета будет свой объект менеджера, который будет подбирать оптимальный набор
роликов и их последовательность для каждого заказа.
Он также будет взаимодействовать с плеером и отображать ролики.
*/

import ru.JavaRush.JavaMultithreading.LvL29.MenuOfRestaurant.ConsoleHelper;

import java.util.*;

public class AdvertisementManager {
    private final AdvertisementStorage storage;
    private int timeSeconds;        // Общее время показа

    public AdvertisementManager(int timeSeconds) {
        storage = AdvertisementStorage.getInstance();
        this.timeSeconds = timeSeconds;
    }

    public void processVideos() {
        if (storage.list().isEmpty()) {
            throw new NoVideoAvailableException();
        }

        List<Advertisement> listVideo = new ArrayList<>(storage.list());
        Collections.sort(listVideo, (Comparator.comparingInt(Advertisement::getDuration)));
        Collections.sort(listVideo, ((o1, o2) -> (int) (o1.getAmountPerOneDisplaying() - o2.getAmountPerOneDisplaying())));
        Collections.reverse(listVideo);

        int time = timeSeconds;

        for (Advertisement advertisement : listVideo) {
            if (advertisement.getDuration() <= time && advertisement.getAmountPerOneDisplaying() > 0) {
                ConsoleHelper.writeMessage(advertisement.getName() + " is displaying... " + advertisement.getAmountPerOneDisplaying() +
                        ", " + advertisement.getAmountPerOneDisplaying() * 1000 / advertisement.getDuration());
                advertisement.revalidate();
                time = time - advertisement.getDuration();
            }
        }
    }
}

