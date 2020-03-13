package ru.JavaRush.JavaSyntax.LvL10.lec11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Задача: Программа вводит с клавиатуры пару (число и строку) и выводит их на экран.
 * Новая задача: Программа вводит с клавиатуры пары (число и строку), сохраняет их в HashMap.
 * Пустая строка - конец ввода данных.
 * Числа могут повторяться.
 * Строки всегда уникальны.
 * Введенные данные не должны потеряться!
 * Затем программа выводит содержание HashMap на экран.
 * Каждую пару с новой строки.
 *
 * Пример ввода:
 * 1
 * Мама
 * 2
 * Рама
 * 1
 * Мыла
 *
 * Пример вывода:
 * 1 Мыла
 * 2 Рама
 * 1 Мама
 */

public class NewFunctionHashMapOutPut {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> hashMap = new HashMap<>();

        while (true) {
            String ids = reader.readLine();
            if (ids.length() == 0)
                break;
            int id = Integer.parseInt(ids);
            String name = reader.readLine();
            /*if (name.isEmpty())
                break;
             */
            hashMap.put(name, id);
        }

        for (Map.Entry<String, Integer> pair: hashMap.entrySet()){
            String name = pair.getKey();
            Integer id = pair.getValue();
            System.out.println(id + " " + name);
        }
    }
}
