package ru.JavaRush.LvL6;

/**
 * Сделать класс Calculator, у которого будут 5 статических методов:
 * int plus(int a, int b) - возвращает сумму чисел a и b
 * int minus(int a, int b) - возвращает разницу чисел a и b
 * int multiply(int a, int b) - возвращает результат умножения числа a на число b
 * double division(int a, int b) - возвращает результат деления числа a на число b
 * double percent(int a, int b) - возвращает b процентов от числа a (например, percent(4, 50) должен вернуть 50% от 4)
 */

public class Calculator {

    static int plus(int a, int b) {
        int result = a + b;
        return result;
    }

    static int minus(int a, int b) {
        int result = a - b;
        return result;
    }

    static int multiply(int a, int b) {
        int result = a * b;
        return result;
    }

    static double division(int a, int b) {
        double result = (double) a / (double) b;
        return result;
    }

    static double percent(int a, int b) {
        double result = a * 0.01 * b;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(percent(4, 50));
        System.out.println(division(25,4));
    }
}
