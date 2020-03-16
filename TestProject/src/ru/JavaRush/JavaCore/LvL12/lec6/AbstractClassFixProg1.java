package ru.JavaRush.JavaCore.LvL12.lec6;

/**
 * Исправь код, чтобы программа компилировалась.
 */

public class AbstractClassFixProg1 {
    public static void main(String[] args) {

    }

    public static abstract class Pet {
        public String getName() {
            return "Я - котенок";
        }

        public abstract Pet getChild();
    }
}
