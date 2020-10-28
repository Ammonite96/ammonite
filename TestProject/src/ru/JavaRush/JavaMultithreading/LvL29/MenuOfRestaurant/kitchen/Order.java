package ru.JavaRush.JavaMultithreading.LvL29.MenuOfRestaurant.kitchen;

import ru.JavaRush.JavaMultithreading.LvL29.MenuOfRestaurant.ConsoleHelper;
import ru.JavaRush.JavaMultithreading.LvL29.MenuOfRestaurant.Tablet;

import java.io.IOException;
import java.util.List;

public class Order {

    private final Tablet tablet;
    protected List<Dish> dishes;

    public Order(Tablet tablet) throws IOException {
        this.tablet = tablet;
        dishes = ConsoleHelper.getAllDishesForOrder();
        ConsoleHelper.writeMessage(toString());
    }

    @Override
    public String toString() {
        if (dishes.isEmpty()){
            return "";
        } else {
            return "Your order: " + dishes.toString() + " of " + tablet;
        }
    }
}
