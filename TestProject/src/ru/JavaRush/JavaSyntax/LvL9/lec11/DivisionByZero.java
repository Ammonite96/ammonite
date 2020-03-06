package ru.JavaRush.LvL9.lec11;

/**
 * Создай метод public static void divideByZero, в котором подели любое число на ноль и выведи на экран результат деления.
 * Оберни вызов метода divideByZero в try..catch. Выведи стек-трейс исключения используя метод exception.printStackTrace()
 */

public class DivisionByZero {
    public static void main(String[] args) {
        try {
            divideByZero();
        } catch (ArithmeticException a){
            a.printStackTrace();
        }
    }

    public static void divideByZero() throws ArithmeticException {
        System.out.println(50/0);
    }
}
