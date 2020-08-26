package ru.JavaRush.JavaSyntax.LvL7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 1. Создать массив на 20 чисел.
 * 2. Ввести в него значения с клавиатуры.
 * 3. Создать два массива на 10 чисел каждый.
 * 4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
 * 5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
 */

public class ArrayBigArrayTwoSmall {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] bigArray = new int[20];
        int[] smallArrayOne = new int[10];
        int[] smallArrayTwo = new int[10];

        for (int a = 0; a < 20; a++) {
            bigArray[a] = Integer.parseInt(reader.readLine());
        }

        for (int i = 0; i < smallArrayTwo.length; i++) {
            smallArrayTwo[i] = bigArray[i+10];
            System.out.println(smallArrayTwo[i]);
        }
    }
}
