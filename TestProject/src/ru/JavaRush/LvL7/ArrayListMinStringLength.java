package ru.JavaRush.LvL7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * 1. Создай список строк.
 * 2. Считай с клавиатуры 5 строк и добавь в список.
 * 3. Используя цикл, найди самую короткую строку в списке.
 * 4. Выведи найденную строку на экран.
 * 5. Если таких строк несколько, выведи каждую с новой строки.
 */

public class ArrayListMinStringLength {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<String>();
        int count = 0;
        int minlength = 0;

        while (true) {
            strings.add(reader.readLine());
            count++;
            if (count == 5)
                break;
        }

        minlength = strings.get(0).length();
        for (int i = 0; i < 5; i++) {
         if (strings.get(i).length() < minlength)
             minlength = strings.get(i).length();
        }
        for (int j =0; j < 5; j++)
            if (strings.get(j).length() == minlength)
                System.out.println(strings.get(j));
    }
}
//strings.sort((a, b) -> CharSequence.compare(b, a)); // Сортировка массива ArrayList в обратном порядке

