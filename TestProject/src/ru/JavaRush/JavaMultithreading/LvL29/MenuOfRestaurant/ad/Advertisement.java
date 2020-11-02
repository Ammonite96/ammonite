package ru.JavaRush.JavaMultithreading.LvL29.MenuOfRestaurant.ad;

/*
Класс Рекламное объявление
 */

import java.util.Comparator;

public class Advertisement {

    private Object content;     // видео
    private String name;        // имя, название
    private long initialAmount; // начальная сумма, стоимость рекламы в копейках.
    private int hits;           // количество оплаченных показов
    private int duration;       // продолжительность в секундах

    private long amountPerOneDisplaying;    // стоимости одного показа рекламного объявления

    public Advertisement(Object content, String name, long initialAmount, int hits, int duration) {
        this.content = content;
        this.name = name;
        this.initialAmount = initialAmount;
        this.hits = hits;
        this.duration = duration;
        this.amountPerOneDisplaying = hits > 0 ? initialAmount / hits : 0;
    }

    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }

    public int getHits() {
        return hits;
    }

    public long getAmountPerOneDisplaying() {
        return amountPerOneDisplaying;
    }

    public void revalidate() {
        if (hits <= 0) {
            throw new UnsupportedOperationException();
        }
        hits--;
    }

    @Override
    public String toString() {
        return getName() + " is displaying..." + getAmountPerOneDisplaying() + " " + getAmountPerOneDisplaying() * 1000 / getDuration();
    }
}


