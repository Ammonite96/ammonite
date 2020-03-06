package ru.JavaRush.LvL9.lec11;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Ввести с клавиатуры дату в формате "2013-08-18"
 * Вывести на экран введенную дату в виде "AUG 18, 2013".
 * Воспользоваться объектом Date и SimpleDateFormat.
 */

public class DateFormatDate {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        Date date = simpleDateFormat.parse(reader.readLine());

        SimpleDateFormat dateFormat = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);
        String d = dateFormat.format(date);
        System.out.println(d.toUpperCase());
    }
}
