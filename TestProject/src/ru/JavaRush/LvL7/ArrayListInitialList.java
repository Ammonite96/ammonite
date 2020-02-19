package ru.JavaRush.LvL7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * 1. Создай список строк в методе main.
 * 2. Добавь в него 10 строчек с клавиатуры, но только добавлять не в конец списка, а в начало.
 * 3. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
 */

public class ArrayListInitialList {
    public static void main(String[] args) throws IOException {
        BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<>();
        int count = 0;

        for (;true;){
            strings.add(0, str.readLine());
            count++;
            if (count == 10)
                break;
        }
        for (int i = 0; i < strings.size(); i++)
            System.out.println(strings.get(i));
    }
}
