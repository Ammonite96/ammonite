package ru.JavaRush.LvL5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Вводить с клавиатуры числа и вычислить среднее арифметическое.
 * Если пользователь ввел -1, вывести на экран среднее арифметическое всех чисел и завершить программу.
 * -1 не должно учитываться.
 *
 * Примеры:
 * а) при вводе чисел
 * 1
 * 2
 * 2
 * 4
 * 5
 * -1
 * получим вывод
 * 2.8
 *
 * б) при вводе чисел
 * 4
 * 3
 * 2
 * 1
 * -1
 * получим вывод
 * 2.5
 *
 * Подсказка: один из вариантов решения этой задачи, использовать конструкцию:
 *
 * while (true) {
 *     int number = считываем число;
 *     if (проверяем, что number -1)
 *         break;
 * }
 */

public class ArithmeticMean {
    public static void main(String[] args) throws IOException {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double arithmeticMean = 0;
        double count = 0;
        double arifMean = 0;
        for (; true; ) {
        double num = Double.parseDouble(reader.readLine());
        count = count + 1;
            if (num == -1)
                count = count - 1;
        arithmeticMean = arithmeticMean + num;
        arifMean = (arithmeticMean+1)/count;

        if (num == -1)
            break;
        }
        System.out.println(arifMean);
    }
}