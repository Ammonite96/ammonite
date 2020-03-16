package ru.JavaRush.JavaCore.LvL12.lec6;

/**
 * Исправь код, чтобы программа компилировалась.
 * Подсказка:
 * метод getChild должен остаться абстрактным.
 */

public class AbstractClassFixProg {
    public static void main(String[] args) {

    }

    public static abstract class Pet {
        public String getName() {
            return "Я - котенок";
        }

        public abstract Pet getChild();
    }
}
