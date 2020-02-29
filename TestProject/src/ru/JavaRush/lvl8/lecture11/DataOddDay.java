package ru.JavaRush.lvl8.lecture11;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
 * 2. String date передается в формате FEBRUARY 1 2013
 * Не забудьте учесть первый день года.
 *
 * Пример:
 * JANUARY 1 2000 = true
 * JANUARY 2 2020 = false
 */

public class DataOddDay {
    public static void main(String[] args) {
        System.out.println(isDateOdd("FEBRUARY 1 2013"));
    }

    public static boolean isDateOdd(String date) {
        DateFormat format = new SimpleDateFormat("MMMMM d yyyy");
        Date day = new Date(date);
        if (day.getDate() % 2 == 0)
            return false;
        else
            return true;
    }
}
