package ru.JavaRush.LvL7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 1. Создать массив на 15 целых чисел.
 * 2. Ввести в него значения с клавиатуры.
 * 3. Пускай индекс элемента массива является номером дома, а значение - числом жителей, проживающих в доме.
 * Дома с нечетными номерами расположены на одной стороне улицы, с четными - на другой. Выяснить, на какой стороне улицы проживает больше жителей.
 * 4. Вывести на экран сообщение: "В домах с нечетными номерами проживает больше жителей." или "В домах с четными номерами проживает больше жителей."
 *
 * Примечание:
 * дом с порядковым номером 0 считать четным.
 */

public class ArrayEvenOdd {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] streetNumber = new int[15];
        int evenNumSum = 0;
        int oddNumSum = 0;

        for (int i = 0; i < 15; i++) {
            streetNumber[i] = Integer.parseInt(reader.readLine());
            if (i % 2 == 0)
                evenNumSum += streetNumber[i];
            else if (i % 2 == 1)
                oddNumSum += streetNumber[i];
        }
        String result =  (evenNumSum > oddNumSum)? "В домах с четными номерами проживает больше жителей." : "В домах с нечетными номерами проживает больше жителей.";
        System.out.println(result);
    }
}

// 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15