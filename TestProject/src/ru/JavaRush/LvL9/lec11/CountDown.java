package ru.JavaRush.LvL9.lec11;

/**
 * Написать в цикле обратный отсчёт от 10 до 0. Для задержки использовать Thread.sleep(100);
 * Обернуть вызов sleep в try..catch.
 */

public class CountDown {
    public static void main(String[] args) {
        for (int i = 10; i >= 0; i--)
            System.out.println(i);
        try {
            Thread.sleep(100);
        } catch (Exception e){
            e.getStackTrace();
        }
    }
}
