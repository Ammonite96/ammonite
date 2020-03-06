package ru.JavaRush.LvL5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Текущая реализация: Программа вводит два числа с клавиатуры и выводит минимальное из них на экран.
 * Новая задача: Программа вводит пять чисел с клавиатуры и выводит минимальное из них на экран.
 */

public class MinOf5Numbers {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());

        int minimum = min(a, b, c, d, e);

        System.out.println("Minimum = " + minimum);
    }


    public static int min(int a, int b, int c, int d, int e) {
        if (a <= b && a <= c && a <= d && a <= e)
            return a;
        else if (a >= b && b <= c && b <=d && b <= e)
            return b;
        else if (c <= b && a >= c && c <= d && c <= e)
            return c;
        else if (d <= b && d <= c && a >= d && d <= e)
            return d;
        else
            return e;
    }
}
