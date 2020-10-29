package ru.JavaRush.JavaMultithreading.LvL29.MenuOfRestaurant.kitchen;

import ru.JavaRush.JavaMultithreading.LvL29.MenuOfRestaurant.ConsoleHelper;
import ru.JavaRush.JavaMultithreading.LvL29.MenuOfRestaurant.Tablet;

import java.io.IOException;
import java.util.List;

public class Order {

    private final Tablet tablet;
    protected List<Dish> dishes;        // Список выбранных блюд.

    public Order(Tablet tablet) throws IOException {
        this.tablet = tablet;
        dishes = ConsoleHelper.getAllDishesForOrder();
        ConsoleHelper.writeMessage(toString());
    }

    public int getTotalCookingTime() {      // Метод подсчёта времени приготовления блюд
        int totalTimeCooking = dishes.stream().mapToInt(Dish::getDuration).sum();
        return totalTimeCooking;
    }

    public boolean isEmpty(){       // Вспомогательный метод, служит для проверки есть ли в заказе блюда
        if (dishes.isEmpty()){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        if (dishes.isEmpty()){
            return "";
        } else {
            return "Your order: " + dishes.toString() + " of " + tablet + ", cooking time " + getTotalCookingTime() + "min";
        }
    }
}
