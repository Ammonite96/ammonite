package ru.JavaRush.JavaMultithreading.LvL29.MenuOfRestaurant.statistic.event;

import ru.JavaRush.JavaMultithreading.LvL29.MenuOfRestaurant.ad.Advertisement;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class VideoSelectedEventDataRow implements EventDataRow {

    private List<Advertisement> optimalVideoSet;    // список видеороликов, отобранных для показа
    private long amount;        // сумма денег в копейках
    private int totalDuration;  // общая продолжительность показа отобранных рекламных роликов

    private Date currentDate;   // текущая дата;

    public VideoSelectedEventDataRow() {
    }

    public VideoSelectedEventDataRow(List<Advertisement> optimalVideoSet, long amount, int totalDuration) {
        this.optimalVideoSet = optimalVideoSet;
        this.amount = amount;
        this.totalDuration = totalDuration;
        this.currentDate = new Date();
    }

    @Override
    public EventType getType() {
        return EventType.SELECTED_VIDEOS;
    }

    @Override
    public Date getDate() {
        return currentDate;
    }

    @Override
    public int getTime() {
        return totalDuration;
    }

    public long getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "VideoSelectedEventDataRow{" +
                "amount=" + amount +
                '}';
    }
}
