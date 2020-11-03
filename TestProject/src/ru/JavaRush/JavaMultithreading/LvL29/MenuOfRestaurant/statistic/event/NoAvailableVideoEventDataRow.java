package ru.JavaRush.JavaMultithreading.LvL29.MenuOfRestaurant.statistic.event;

/*
Событие - нет ни одного видео-ролика, который можно показать во время приготовления заказа
 */

import java.util.Date;

public class NoAvailableVideoEventDataRow implements EventDataRow {

    private int totalDuration;  //время приготоввляния заказа в секундах

    private Date currentDate;   // текущая дата;

    public NoAvailableVideoEventDataRow(int totalDuration) {
        this.totalDuration = totalDuration;
        this.currentDate = new Date();
    }

    @Override
    public EventType getType() {
        return EventType.NO_AVAILABLE_VIDEO;
    }

    @Override
    public Date getDate() {
        return currentDate;
    }

    @Override
    public int getTime() {
        return totalDuration;
    }
}
