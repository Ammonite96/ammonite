package ru.JavaRush.JavaCore.LvL15.lec12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Считать с консоли URL-ссылку.
 * Вывести на экран через пробел список всех параметров (Параметры идут после ? и разделяются &, например, lvl=15).
 * URL содержит минимум 1 параметр.
 * Выводить параметры нужно в той же последовательности, в которой они представлены в URL.
 * Если присутствует параметр obj, то передать его значение в нужный метод alert.
 * alert(double value) - для чисел (дробные числа разделяются точкой)
 * alert(String value) - для строк
 * Обрати внимание на то, что метод alert необходимо вызывать ПОСЛЕ вывода списка всех параметров на экран.
 * Пример 1
 *
 * Ввод:
 * http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo
 *
 * Вывод:
 * lvl view name
 *
 * Пример 2
 *
 * Ввод:
 * http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo
 *
 * Вывод:
 * obj name
 * double: 3.14
 */

public class Solution9Parser {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        //add your code here
        String tmp;
        int a = s.lastIndexOf("?");
        tmp = s.substring(a + 1);
        String[] parts = tmp.split("&");
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < parts.length; i++) {
            if (parts[i].contains("=")) {
                int b = parts[i].lastIndexOf("=");
                list.add(parts[i].substring(0, b));
            } else {
                list.add(parts[i]);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        for (int i = 0; i < parts.length; i++) {
            if (parts[i].contains("obj")) {
                System.out.println("");
                int c = parts[i].lastIndexOf("=");
                try {
                    alert(Double.parseDouble(parts[i].substring(c + 1)));
                } catch (Exception e) {
                    alert(parts[i].substring(c + 1));
                }
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
