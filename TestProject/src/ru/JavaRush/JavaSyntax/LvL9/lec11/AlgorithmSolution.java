package ru.JavaRush.LvL9.lec11;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Задача: Пользователь вводит с клавиатуры список слов (и чисел).
 * Слова вывести в возрастающем порядке, числа - в убывающем.
 *
 * Пример ввода:
 * Вишня
 * 1
 * Боб
 * 3
 * Яблоко
 * 22
 * 0
 * Арбуз
 *
 * Пример вывода:
 * Арбуз
 * 22
 * Боб
 * 3
 * Вишня
 * 1
 * 0
 * Яблоко
 */

public class AlgorithmSolution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) {
                break;
            }
            list.add(s);
        }

        String[] array = list.toArray(new String[0]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (!isNumber(array[i]) && !isNumber(array[j])){
                    if (isGreaterThan(array[i], array[j])){
                        String b = array[j];
                        array[j] = array[i];
                        array[i] = b;
                    }
                }
                if (isNumber(array[i]) && isNumber(array[j])){
                    if (Integer.parseInt(array[i]) < Integer.parseInt(array[j])){
                        String b = array[j];
                        array[j] = array[i];
                        array[i] = b;
                    }
                }
            }
        }
    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) {
            return false;
        }

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // Строка содержит '-'
                    || (!Character.isDigit(c) && c != '-') // или не цифра и не начинается с '-'
                    || (chars.length == 1 && c == '-')) // или одиночный '-'
            {
                return false;
            }
        }
        return true;
    }
}

/*

12
Перерыв
Скакун
18
11
9
Яблоко

 */