package ru.JavaRush.LvL7;

/**
 * Написать программу, которая ведёт обратный отсчёт с 30 до 0, а в конце выводит на экран текст "Бум!".
 * Программа должна уменьшать число 10 раз в секунду. Для того чтобы вставить в программу задержку, воспользуйся функцией:
 * Thread.sleep(100); //задержка на одну десятую секунды.
 *
 * Пример:
 * 30
 * 29
 * ...
 * 1
 * 0
 * Бум!
 */

public class CountDown {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 30; i >= 0; i--) {
            System.out.println(i);
            Thread.sleep(100);
        }
        System.out.println("Бум!");
    }
}
