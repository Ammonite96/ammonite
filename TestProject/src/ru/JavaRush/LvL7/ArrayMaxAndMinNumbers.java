package ru.JavaRush.LvL7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Создать массив на 20 чисел.
 * Заполнить его числами с клавиатуры.
 * Найти максимальное и минимальное числа в массиве.
 * Вывести на экран максимальное и минимальное числа через пробел.
 */

public class ArrayMaxAndMinNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int [] numbers = new int[20];
        int maximum;
        int minimum;

        for (int i = 0; i < numbers.length; i++){
            numbers[i] = Integer.parseInt(reader.readLine());
        }

        Arrays.sort(numbers);
        minimum = numbers[0];
        maximum = numbers[19];

        System.out.print(maximum + " " + minimum);
    }
}
