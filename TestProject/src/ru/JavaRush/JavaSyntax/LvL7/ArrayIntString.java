package ru.JavaRush.LvL7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 1. Создать массив на 10 строк.
 * 2. Создать массив на 10 чисел.
 * 3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
 * 4. В каждую ячейку массива чисел записать длину строки из массива строк, индекс/номер ячейки которой совпадает с текущим индексом из массива чисел.
 *
 * Вывести содержимое массива чисел на экран, каждое значение выводить с новой строки.
 */

public class ArrayIntString {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] str = new String[10];
        int[] intstrlength = new int[10];
        int length = 0;

        for (int i = 0; i < str.length; i++){
             str[i] = reader.readLine();
             length = str[i].length();
             intstrlength[i] = length;
        }

        for (int k = 0; k < 10; k++)
         System.out.println(intstrlength[k]);
    }
}
