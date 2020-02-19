package ru.JavaRush.LvL7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Ввести с клавиатуры 2 числа N и M.
 * Ввести N строк и заполнить ими список.
 * Переставить M первых строк в конец списка.
 * Вывести список на экран, каждое значение с новой строки.
 *
 * Примечание: запрещено создавать больше одного списка.
 */

public class ArrayListSwap {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());
        int count = 0;

        ArrayList<String> strings = new ArrayList<>();
        System.out.println("введите строки");
        while (true){
            strings.add(reader.readLine());
            count++;
            if (count == n)
                break;
        }
        for (int i = m; i > 0; i--){
            String str = strings.remove(0);
            strings.add(str);
        }

        for (String s : strings)
            System.out.println(s);
    }
}
