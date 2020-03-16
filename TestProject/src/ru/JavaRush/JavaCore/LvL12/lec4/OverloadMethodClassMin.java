package ru.JavaRush.JavaCore.LvL12.lec4;

/**
 * Написать public static методы: int min(int, int), long min(long, long), double min(double, double).
 * Каждый метод должен возвращать минимальное из двух переданных в него чисел.
 */

public class OverloadMethodClassMin {
    public static void main(String[] args) {
        System.out.println(min(5, 2));
    }

    public static int min (int a, int b){
        if (a < b)
            return a;
        else return b;
    }

    public static long min (long a, long b){
        if (a < b)
            return a;
        else return b;
    }

    public static double min (double a, double b){
        if (a < b)
            return a;
        else return b;
    }
}
