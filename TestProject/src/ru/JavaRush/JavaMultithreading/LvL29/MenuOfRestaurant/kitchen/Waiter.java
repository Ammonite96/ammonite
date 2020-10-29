package ru.JavaRush.JavaMultithreading.LvL29.MenuOfRestaurant.kitchen;

/*
Класс Официанта. Объект наблюдатель за (Cook)
 */

import ru.JavaRush.JavaMultithreading.LvL29.MenuOfRestaurant.ConsoleHelper;

import java.util.Observable;
import java.util.Observer;

public class Waiter implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        ConsoleHelper.writeMessage(arg + " was cooked by " + o);
    }
}
