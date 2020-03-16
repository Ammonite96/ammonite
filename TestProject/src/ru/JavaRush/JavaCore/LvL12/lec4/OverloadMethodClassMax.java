package ru.JavaRush.JavaCore.LvL12.lec4;

/**
 * Написать public static методы: int max(int, int), long max(long, long), double max(double, double).
 * Каждый метод должен возвращать максимальное из двух переданных в него чисел.
 */

public class OverloadMethodClassMax {
    public static void main(String[] args) {
        System.out.println(max(5, 6));
    }

    public static int max(int a, int b) {
        int result = (a > b) ? a : b;
        return result;
    }

    public static long max(long a, long b) {
        long result = (a > b) ? a : b;
        return result;
    }

    public static double max(double a, double b) {
        double result = (a > b) ? a : b;
        return result;
    }
}
