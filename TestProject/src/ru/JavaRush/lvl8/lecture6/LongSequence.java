package ru.JavaRush.lvl8.lecture6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * 1. Создай список чисел.
 * 2. Добавь в список 10 чисел с клавиатуры.
 * 3. Вывести на экран длину самой длинной последовательности повторяющихся чисел в списке.
 *
 * Пример для списка 2, 4, 4, 4, 8, 8, 4, 12, 12, 14:
 * 3
 *
 * Искомое значение равно 3, т.к. самая длинная последовательность повторяющихся чисел состоит из трех четверок.
 */

public class LongSequence {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayList.add(Integer.parseInt(reader.readLine()));
        }

        int a = 1;
        int max = 0;
        for (int i = 1; i < 10; i++) {
            if (arrayList.get(i).equals(arrayList.get(i - 1))) {
                a++;
            } else {
                a = 1;
            }
            if (max < a)
                max = a;
        }
        System.out.println(max);
    }
}

