package ru.JavaRush.JavaMultithreading.LvL29.MenuOfRestaurant.statistic.event;

import java.util.Date;

public interface EventDataRow {

    EventType getType();
    Date getDate();
    int getTime();
}
