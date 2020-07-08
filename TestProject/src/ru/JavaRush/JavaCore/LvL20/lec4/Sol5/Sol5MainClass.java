package ru.JavaRush.JavaCore.LvL20.lec4.Sol5;

import java.io.Serializable;

/**
 * Сделайте так, чтобы сериализация класса Object была возможной.
 */

public class Sol5MainClass {
    public static class Object implements Serializable {
        private Stringgg stringgg1;
        private Stringgg stringgg2;
    }

    public static int stringCount;

    public static class Stringgg implements Serializable {
        private final int number;

        public Stringgg() {
            number = ++stringCount;
        }

        public void print() {
            System.out.println("string #" + number);
        }
    }

    public static void main(Stringgg[] args) {

    }
}
