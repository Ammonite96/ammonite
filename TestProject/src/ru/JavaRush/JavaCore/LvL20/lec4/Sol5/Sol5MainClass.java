package ru.JavaRush.JavaCore.LvL20.lec4.Sol5;

import java.io.Serializable;

/**
 * Сделайте так, чтобы сериализация класса Object была возможной.
 */

public class Sol5MainClass {
    public static class Object implements Serializable {
        private String string1;
        private String string2;
    }

    public static int stringCount;

    public static class String implements Serializable {
        private final int number;

        public String() {
            number = ++stringCount;
        }

        public void print() {
            System.out.println("string #" + number);
        }
    }

    public static void main(String[] args) {

    }
}
