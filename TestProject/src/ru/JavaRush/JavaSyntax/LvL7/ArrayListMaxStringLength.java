package ru.JavaRush.LvL7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.lang.CharSequence;



/**
 * 1. Создай список строк.
 * 2. Считай с клавиатуры 5 строк и добавь в список.
 * 3. Используя цикл, найди самую длинную строку в списке.
 * 4. Выведи найденную строку на экран. Если таких строк несколько, выведи каждую с новой строки.
 */

public class ArrayListMaxStringLength {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        strings = new ArrayList<String>();
        int count = 0;
        int maxlength = 0;

        while (true) {
            strings.add(reader.readLine());
            count++;
            if (count == 5)
                break;
        }

        //strings.sort((a, b) -> CharSequence.compare(b, a)); // Сортировка массива ArrayList в обратном порядке
        for (int i = 0; i < strings.size(); i++) {
            String str = strings.get(i);
            if (str.length() >= maxlength)
                maxlength = str.length();
        }
        for (int j = 0; j < strings.size(); j++){
            String st = strings.get(j);
            if (st.length() == maxlength)
                System.out.println(st);
        }
    }
}

