package ru.JavaRush.JavaMultithreading.LvL29.MenuOfRestaurant;

import com.sun.source.tree.IfTree;
import ru.JavaRush.JavaMultithreading.LvL29.MenuOfRestaurant.kitchen.Dish;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConsoleHelper {

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void writeMessage(String message) {
        System.out.println(message);
    }

    public static String readString() throws IOException {
        return reader.readLine();
    }

    public static List<Dish> getAllDishesForOrder() throws IOException {
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


/*

public static List<Dish> getAllDishesForOrder() throws Exception {
        List<Dish> dishes = new ArrayList<>();
        System.out.println(Arrays.toString(Dish.values()));
        writeMessage("Выбери блюдо и введи название");
        writeMessage("Для выхода введи 'exit'");

        while (true) {
            String dish = readString();
            if (dish.equals("exit")) {
                break;
            }
            List<Dish> copyDish = Arrays.asList(Dish.values());

            Dish s = copyDish.stream().filter(dish1 -> dish1.toString().equals(dish))
                    .findFirst()
                    .orElseThrow(() -> new Exception("Dishes is Empty"));

            dishes.add(s);


        }
            return dishes;
    }

 */