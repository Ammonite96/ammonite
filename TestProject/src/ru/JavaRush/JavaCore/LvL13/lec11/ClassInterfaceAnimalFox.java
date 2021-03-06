package ru.JavaRush.JavaCore.LvL13.lec11;

import java.awt.*;

/**
 * 1. Унаследовать Fox от интерфейса Animal.
 * 2. Поменяй код так, чтобы в классе Fox был только один метод - getName.
 * 3. Методы удалять нельзя!
 */

public class ClassInterfaceAnimalFox {
    public static void main(String[] args) throws Exception {
    }

    public interface Animal {
        Color getColor();

        Integer getAge();
    }

    public static abstract class Fox implements Animal {
        public String getName() {
            return "Fox";
        }
    }
}
