package ru.JavaRush.JavaMultithreading.LvL29.MenuOfRestaurant;
/*
Класс работы с консолью.
 */
import ru.JavaRush.JavaMultithreading.LvL29.MenuOfRestaurant.kitchen.Dish;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ConsoleHelper {

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void writeMessage(String message) {       // Метод выводит переданное сообщение (message) в консоль
        System.out.println(message);
    }

    public static String readString() throws IOException {      // Метод считывает строку с консоли
        return reader.readLine();
    }

    public static List<Dish> getAllDishesForOrder() throws IOException {        // Метод который просит пользователя выбрать блюдо и добавляет его в список.
        List<Dish> dishes = new ArrayList<>();
        writeMessage(Arrays.toString(Dish.values()));
        writeMessage("Выбери блюдо и введи название");
        writeMessage("Для выхода введи 'exit'");
        while (true) {
            String dishName = ConsoleHelper.readString().trim();
            if ("exit".equals(dishName)) {
                break;
            }

            try {
                Dish dish = Dish.valueOf(dishName);
                dishes.add(dish);
                writeMessage(dishName + " Добавлен в заказ");
            } catch (Exception e) {
                writeMessage(dishName + " Такого блюда нет");
            }
        }

        return dishes;
    }
}
