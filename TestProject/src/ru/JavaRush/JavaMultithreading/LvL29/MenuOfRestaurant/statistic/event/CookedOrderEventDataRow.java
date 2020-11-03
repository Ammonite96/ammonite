package ru.JavaRush.JavaMultithreading.LvL29.MenuOfRestaurant.statistic.event;

/*
Событие - повар приготовил заказ
 */

import ru.JavaRush.JavaMultithreading.LvL29.MenuOfRestaurant.kitchen.Dish;

import java.util.Date;
import java.util.List;

public class CookedOrderEventDataRow implements EventDataRow {

    private String tabletName;     // Имя планшета
    private String cookName;       // Имя повара
    private int cookingTimeSeconds; // Время приготовления заказа в секундах
    List<Dish> cookingDishs;        // список блюд для приготовления

    private Date currentDate;   // текущая дата;

    public CookedOrderEventDataRow(String tabletName, String cookName, int cookingTimeSeconds, List<Dish> cookingDishs) {
        this.tabletName = tabletName;
        this.cookName = cookName;
        this.cookingTimeSeconds = cookingTimeSeconds;
        this.cookingDishs = cookingDishs;
        this.currentDate = new Date();
    }

    @Override
    public EventType getType() {
        return EventType.COOKED_ORDER;
    }

    @Override
    public Date getDate() {
        return currentDate;
    }

    @Override
    public int getTime() {
        return cookingTimeSeconds;
    }

    public String getCookName() {
        return cookName;
    }
}
