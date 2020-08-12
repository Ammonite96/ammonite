package ru.JavaRush.JavaMultithreading.LvL25.lec2.sol3;

/**
 * Инициализируй поле wheels используя данные из loadWheelNamesFromDB.
 * Выкинь исключение в случае некорректных данных.
 *
 * Подсказка: если что-то не то с колесами, то это не машина!
 * Сигнатуры не менять.
 */

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static enum Wheel {
        FRONT_LEFT,
        FRONT_RIGHT,
        BACK_LEFT,
        BACK_RIGHT
    }

    public static class Car {
        protected List<Wheel> wheels;

        public Car() {
            //init wheels here
            wheels = new ArrayList<>();
            if (loadWheelNamesFromDB().length == 4) {
                for (int i = 0; i < loadWheelNamesFromDB().length; i++) {
                    String wheelStr = loadWheelNamesFromDB()[i];
                    wheels.add(Wheel.valueOf(wheelStr));
                }
            } else throw new IllegalArgumentException();
        }

        protected String[] loadWheelNamesFromDB() {
            //this method returns mock data
            return new String[]{"FRONT_LEFT", "FRONT_RIGHT", "BACK_LEFT", "BACK_RIGHT"};
        }
    }

    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.toString());
    }
}
