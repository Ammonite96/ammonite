package ru.JavaRush.LvL5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Написать программу, которая:
 * 1. считывает с консоли число N, которое должно быть больше 0
 * 2. потом считывает N чисел с консоли
 * 3. выводит на экран максимальное из введенных N чисел.
 */

public class MaxEnteredNumbers {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = Integer.parseInt(reader.readLine());
        ArrayList<Integer> numbers = new ArrayList<>();
        int count = 0; // Счётчик
        int i;
        if (maximum > 0) {
            for (; true; ) {
                int num = Integer.parseInt(reader.readLine());
                numbers.add(num);
                count++;
                if (count == maximum)
                    break;
            }
            numbers.sort((a, b) -> Integer.compare(b, a));
            for (i = 0; i < 1; i++) {
                System.out.println(numbers.get(i));
            }
        }
    }
}


