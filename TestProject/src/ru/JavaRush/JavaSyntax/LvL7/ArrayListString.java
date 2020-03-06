package ru.JavaRush.LvL7;

import java.util.ArrayList;

/**
 * 1. Создай список строк.
 * 2. Добавь в него 5 различных строк.
 * 3. Выведи его размер на экран.
 * 4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.
 */

public class ArrayListString {
    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<>();
        str.add("a");
        str.add("aa");
        str.add("aaa");
        str.add("aaaa");
        str.add("aaaaa");
        System.out.println(str.size());
        for (int i = 0; i < str.size(); i++)
            System.out.println(str.get(i));
        }
    }

