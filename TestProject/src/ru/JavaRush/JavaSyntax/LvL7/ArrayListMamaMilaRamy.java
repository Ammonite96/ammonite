package ru.JavaRush.LvL7;

import java.util.ArrayList;

/**
 * 1. Создай список из слов "мама", "мыла", "раму".
 * 2. После каждого слова вставь в список строку, содержащую слово "именно".
 * 3. Вывести результат на экран, каждый элемент списка с новой строки.
 */

public class ArrayListMamaMilaRamy {
    public static void main(String[] args) {
        ArrayList<String> mamaMila = new ArrayList<>();
        mamaMila.add("мама");
        mamaMila.add("мыла");
        mamaMila.add("раму");

        for (int i = 0; i < mamaMila.size(); i++) {
            mamaMila.add(++i, "именно");
        }
        for (int j = 0; j < mamaMila.size(); j++ )
            System.out.println(mamaMila.get(j));
    }
}

/*
Другие способы решения

          for (int i = 0; i < mamaMila.size(); i++) {
            mamaMila.add((i = i + 1), "именно"); // Вместо выражения (i = i + 1) можно использовать ++i;



 mamaMila.add(1,"именно");
        mamaMila.add(3,"именно");
        mamaMila.add("именно");
 */