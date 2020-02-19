package ru.JavaRush.LvL7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collection;

/**
 * 1. Создать массив на 10 строк.
 * 2. Ввести с клавиатуры 8 строк и сохранить их в массив.
 * 3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки.
 */

public class ArrayStringRevers {

    public static void main(String[] args) throws IOException {
        BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = new String[10];


        for (int i=0; i<strings.length-2;i++)
            strings[i] = str.readLine();

        for(int j = strings.length -1; j >= 0; j--)
            System.out.println(strings[j]);
    }
}
