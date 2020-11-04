package ru.JavaRush.JavaMultithreading.LvL29.MenuOfRestaurant.statistic;

/*
Класс регистрирует события в хранилище
Тут одно хранилище и одна точка входа
 */

import ru.JavaRush.JavaMultithreading.LvL29.MenuOfRestaurant.kitchen.Cook;
import ru.JavaRush.JavaMultithreading.LvL29.MenuOfRestaurant.statistic.event.CookedOrderEventDataRow;
import ru.JavaRush.JavaMultithreading.LvL29.MenuOfRestaurant.statistic.event.EventDataRow;
import ru.JavaRush.JavaMultithreading.LvL29.MenuOfRestaurant.statistic.event.EventType;
import ru.JavaRush.JavaMultithreading.LvL29.MenuOfRestaurant.statistic.event.VideoSelectedEventDataRow;

import java.text.SimpleDateFormat;
import java.util.*;


public class StatisticManager {

    private static StatisticManager instance;
    private StatisticStorage statisticStorage = new StatisticStorage();

    private Set<Cook> cooks = new HashSet<>();
    private SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
    private List<EventDataRow> dataRowList;

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

    public Set<Cook> getCooks() {
        return cooks;
    }

    public Map<String, Double> totalProfitForEachDay() {      // метод который из хранилища достанет все данные, относящиеся к отображению рекламы, и посчитает общую прибыль за каждый день.
        Map<String, Double> returnMap = new TreeMap<>(Collections.reverseOrder());
        dataRowList = statisticStorage.getStorage().get(EventType.SELECTED_VIDEOS);

        for (EventDataRow eventDataRow : dataRowList) {
            VideoSelectedEventDataRow dataRow = (VideoSelectedEventDataRow) eventDataRow;
            double amount = dataRow.getAmount() / 100;
            returnMap.put(dateFormat.format(dataRow.getDate()), amount);
        }

        return returnMap;
    }

    public Map<String, Map<String, Integer>> totalCookWorkload() {
        Map<String, Map<String, Integer>> returnMap = new TreeMap<>(Collections.reverseOrder());
        dataRowList = statisticStorage.getStorage().get(EventType.COOKED_ORDER);
        Map<String, Integer> nameAndTimeCook = new TreeMap<>(Collections.reverseOrder());

        for (EventDataRow eventDataRow : dataRowList) {
            CookedOrderEventDataRow cookedRow = (CookedOrderEventDataRow) eventDataRow;

            nameAndTimeCook.put(cookedRow.getCookName(), cookedRow.getTime());
            returnMap.put(dateFormat.format(cookedRow.getDate()), nameAndTimeCook);
        }

        return returnMap;
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
