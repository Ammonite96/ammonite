package ru.JavaRush.JavaMultithreading.LvL23.lec6.sol1;

/**
 * В методе main присвой объекту Object obj экземпляр класса TEST.
 * Не изменяй ничего кроме метода main.
 */

public class Solution {
    public static final String TEST = "test";

    public static class TEST {
        @Override
        public String toString() {
            return "test class";
        }
    }

    static Object obj;

    public static void main(String[] args) {
        obj = new Solution.TEST();
        System.out.println(obj);
    }
}
