package ru.JavaRush.LvL8.lec11;

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
        Date yearStartTime = new Date(date);
        yearStartTime.setHours(0);
        yearStartTime.setMinutes(0);
        yearStartTime.setSeconds(0);

        yearStartTime.setDate(1);      // первое число
        yearStartTime.setMonth(0);     // месяц январь, нумерация для месяцев 0-11

        Date currentTime = new Date(date);
        long msTimeDistance = currentTime.getTime() - yearStartTime.getTime();
        long msDay = 24 * 60 * 60 * 1000;  //сколько миллисекунд в одних сутках

        int dayCount = (int) (msTimeDistance / msDay); //количество целых дней

        if (dayCount % 2 != 0)
            return false;
        else
            return true;
    }
}

/*

 */