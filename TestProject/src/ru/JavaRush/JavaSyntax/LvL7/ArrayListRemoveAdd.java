package ru.JavaRush.LvL7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * 1. Создай список строк.
 * 2. Добавь в него 5 строк с клавиатуры.
 * 3. Выполни 13 раз: удалить последнюю строку и вставить её в начало.
 * 4. Используя цикл выведи содержимое результирующего списка на экран, каждое значение с новой строки.
 */

public class ArrayListRemoveAdd {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> stringArrayList = new ArrayList<>();
        int count = 0;
        String str = null;
        while (true){
            stringArrayList.add(reader.readLine());
            count++;
            if (count == 5)
                break;

        }
        for (int i = 0; i < 13; i++) {
            str = stringArrayList.remove(4);
            stringArrayList.add(0, str);
        }
        for (int j = 0; j < stringArrayList.size(); j++)
            System.out.println(stringArrayList.get(j));
    }
}

/*
        String str = stringArrayList.get(4);
        System.out.println(stringArrayList.get(4));  //машина
        System.out.println(" ");
        stringArrayList.remove(4);
        System.out.println(stringArrayList.get(3)); //программа
        System.out.println(" ");
        stringArrayList.add(0, str);
        System.out.println(stringArrayList.get(0)); //машина
 */