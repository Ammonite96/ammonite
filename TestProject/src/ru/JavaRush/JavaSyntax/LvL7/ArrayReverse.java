package ru.JavaRush.LvL7;

import java.io.IOException;
import java.util.Scanner;

/**
 * 1. Создать массив на 10 чисел.
 * 2. Ввести с клавиатуры 10 чисел и записать их в массив.
 * 3. Вывести на экран элементы массива в обратном порядке, каждое значение выводить с новой строки.
 */

public class ArrayReverse {

    public static void main(String[] args) throws IOException {
        Scanner num = new Scanner(System.in);
        int[] nums = new int[10];

        for (int i = 0; i < nums.length; i++)
            nums[i] = num.nextInt();

        for (int j = 9; j >=0; j-- )
            System.out.println(nums[j]);
    }
}
