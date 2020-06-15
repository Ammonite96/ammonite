package ru.JavaRush.JavaCore.LvL20.lec4.sol4;

import java.io.Serializable;

/**
 * Сделай так, чтобы сериализация класса ClassWithStatic была возможной.
 */

public class Sol4MainClass {
    public static class ClassWithStatic implements Serializable {
        public static String staticString = "This is a static test string";
        public int i;
        public int j;
    }

    public static void main(String[] args) {

    }
}
