package ru.JavaRush.JavaMultithreading.LvL29.MenuOfRestaurant.statistic;

/*
Класс регистрирует события в хранилище
Тут одно хранилище и одна точка входа
 */

import ru.JavaRush.JavaMultithreading.LvL29.MenuOfRestaurant.kitchen.Cook;
import ru.JavaRush.JavaMultithreading.LvL29.MenuOfRestaurant.statistic.event.EventDataRow;
import ru.JavaRush.JavaMultithreading.LvL29.MenuOfRestaurant.statistic.event.EventType;
import ru.JavaRush.JavaMultithreading.LvL29.MenuOfRestaurant.statistic.event.VideoSelectedEventDataRow;

import java.util.*;
import java.util.stream.Collectors;

public class StatisticManager {

    private static StatisticManager instance;
    private StatisticStorage statisticStorage = new StatisticStorage();

    private Set<Cook> cooks = new HashSet<>();

    private StatisticManager() {
    }

    public static synchronized StatisticManager getInstance() {
        if (instance == null) {
            instance = new StatisticManager();
        }
        return instance;
    }

    public void register(EventDataRow data) {
        statisticStorage.put(data);
    }

    public void register(Cook cook) {
        cooks.add(cook);
    }

    public Map<EventType, List<EventDataRow>> getMapInInnerClass() {
        return statisticStorage.getStorage();
    }

    public Map<Date, Long> totalProfitForEachDay() {      // метод который из хранилища достанет все данные, относящиеся к отображению рекламы, и посчитает общую прибыль за каждый день.
        return statisticStorage.getStorage().get(EventType.SELECTED_VIDEOS).stream()
                .collect(Collectors.groupingBy(EventDataRow::getDate, Collectors.summingLong(e -> ((VideoSelectedEventDataRow) e).getAmount())));
    }

    private class StatisticStorage {

        private Map<EventType, List<EventDataRow>> storage = new HashMap<>();

        public StatisticStorage() {
            for (EventType eventType : EventType.values()) {
                storage.put(eventType, new ArrayList<>());
            }
        }

        private void put(EventDataRow data) {
            storage.get(data.getType()).add(data);
        }

        private Map<EventType, List<EventDataRow>> getStorage() {
            return storage;
        }
    }
}
