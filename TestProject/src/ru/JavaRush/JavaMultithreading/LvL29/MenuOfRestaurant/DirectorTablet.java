package ru.JavaRush.JavaMultithreading.LvL29.MenuOfRestaurant;

import ru.JavaRush.JavaMultithreading.LvL29.MenuOfRestaurant.ad.Advertisement;
import ru.JavaRush.JavaMultithreading.LvL29.MenuOfRestaurant.ad.StatisticAdvertisementManager;
import ru.JavaRush.JavaMultithreading.LvL29.MenuOfRestaurant.statistic.StatisticManager;

import java.util.*;

public class DirectorTablet {

    public void printAdvertisementProfit() {
        Map<String, Double> map = StatisticManager.getInstance().totalProfitForEachDay();
        double totalAmount = 0;
        for (Map.Entry<String, Double> entry : map.entrySet()) {
            totalAmount += entry.getValue();
            if (entry.getValue() > 0) {
                ConsoleHelper.writeMessage(String.format(Locale.ENGLISH,"%s - %.2f", entry.getKey(), entry.getValue()));
                ConsoleHelper.writeMessage(String.format(Locale.ENGLISH,"Total - %.2f" , totalAmount));
            }
        }
    }

    public void printCookWorkloading() {
        Map<String, Map<String, Integer>> map = StatisticManager.getInstance().totalCookWorkload();
        map.forEach((s, stringIntegerMap) -> {
            ConsoleHelper.writeMessage(s);
            stringIntegerMap.forEach((s1, integer) -> {
                if (integer > 0) {
                    ConsoleHelper.writeMessage(s1 + " - " + integer + " min");
                }
            });
        });
    }

    public void printActiveVideoSet() {
        List<Advertisement> videoSet = StatisticAdvertisementManager.getInstance().getVideoSet(true);
        Collections.sort(videoSet, new Comparator<Advertisement>() {
            @Override
            public int compare(Advertisement o1, Advertisement o2) {
                return o1.getName().toLowerCase().compareTo(o2.getName().toLowerCase());
            }
        });

        for (Advertisement advertisement : videoSet) {
            System.out.println(advertisement.getName() + " - " + advertisement.getHits());
        }
    }

    public void printArchivedVideoSet() {
        List<Advertisement> videoSet = StatisticAdvertisementManager.getInstance().getVideoSet(false);
        Collections.sort(videoSet, new Comparator<Advertisement>() {
            @Override
            public int compare(Advertisement o1, Advertisement o2) {
                return o1.getName().toLowerCase().compareTo(o2.getName().toLowerCase());
            }
        });

        for (Advertisement advertisement : videoSet) {
            System.out.println(advertisement.getName());
        }
    }
}

/*



 */