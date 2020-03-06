package ru.JavaRush.LvL7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * 1. Введи с клавиатуры 10 слов в список строк.
 *
 * 2. Метод doubleValues должен удваивать слова по принципу:
 * "альфа", "бета", "гамма" -> "альфа", "альфа", "бета", "бета", "гамма", "гамма"
 *
 * 3. Выведи результат на экран, каждое значение с новой строки.
 */

public class ArrayListDoubleValues {
    public static void main(String[] args) throws Exception {
        BufferedReader str = new BufferedReader(new InputStreamReader(System.in));// Считать строки с консоли и объявить ArrayList list тут
        ArrayList<String> list = new ArrayList<>();
        int count = 0;

        while (true){
            list.add(str.readLine());
            count++;
            if (count == 10)
                break;
        }

        ArrayList<String> result = doubleValues(list);
        for (String s : result)
            System.out.println(s);
        // Вывести на экран result
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++){
            String str = list.get(i);
            list.add(i++, str);
        }
        return list;
    }
}
