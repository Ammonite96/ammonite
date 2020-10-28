package ru.JavaRush.JavaMultithreading.LvL29.MenuOfRestaurant.kitchen;

import java.util.Arrays;

public enum Dish {
    Fish, Steak, Soup, Juice, Water, Xyu;

    public static String allDishesToString() {
        return Arrays.toString(Dish.values());
    }
}
