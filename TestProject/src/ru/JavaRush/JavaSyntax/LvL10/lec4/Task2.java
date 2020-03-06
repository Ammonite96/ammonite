package ru.JavaRush.LvL10.lec4;

/**
 * Расставьте правильно операторы приведения типа, чтобы получился ответ: d=3.765
 * int a = 15;
 * int b = 4;
 * float c = a / b;
 * double d = a * 1e-3 + c;
 */

public class Task2 {
    public static void main(String[] args) {
        int a = 15;
        int b = 4;
        float c = (float) a / b;
        double d = a * 1e-3 + c;

        System.out.println(d);
    }
}
