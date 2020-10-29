package ru.JavaRush.JavaMultithreading.LvL29.MenuOfRestaurant.kitchen;

import java.util.Arrays;

/*
Список блюд и в ремя их приготовления.
 */

public enum Dish {
    Fish (25), Steak(30), Soup(15), Juice(5), Water(3), Xyu(10);

    private int duration;

    Dish(int i) {
        this.duration = i;
    }

    public int getDuration() {
        return duration;
    }

    public static String allDishesToString() {      // Мутод возвращает строку в которой перечисленны все блюда.
        return Arrays.toString(Dish.values());
    }
}
