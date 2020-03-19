package ru.JavaRush.JavaCore.LvL13.lec4;

import java.awt.*;

/**
 * 1. Реализуй в классе Fox интерфейс Animal.
 * 2. Поменяй код так, чтобы в классе Fox был только один метод - getName.
 * 3. Создавать дополнительные классы и удалять методы нельзя!
 */

public class FoxAnimalClass {
    public static void main(String[] args) throws Exception {
    }

    public interface Animal {
        Color getColor();
    }

    public static abstract class Fox implements Animal {
        public String getName() {
            return "Fox";
        }
    }
}
