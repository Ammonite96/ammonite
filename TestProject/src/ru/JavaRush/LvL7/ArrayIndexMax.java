package ru.JavaRush.LvL7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 1. В методе initializeArray():
 * 1.1. Создайте массив на 20 чисел
 * 1.2. Считайте с консоли 20 чисел и заполните ими массив
 * 2. Метод max(int[] array) должен находить максимальное число из элементов массива
 */

public class ArrayIndexMax {

    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        BufferedReader num = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = new int[20];
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = Integer.parseInt(num.readLine());
        return numbers;
    }

    public static int max(int[] array) {
        int maximum = array[0];
        for (int j = 1; j < array.length; j++)
        {
            if (array[j] > maximum)
                maximum = array[j];
        }
        return maximum;
    }
}
