package ru.JavaRush.LvL8.lec11;

/**
 * Написать программу, которая вводит с клавиатуры строку текста.
 * Программа заменяет в тексте первые буквы всех слов на заглавные.
 * Вывести результат на экран.
 *
 * Пример ввода:
 * мама мыла раму.
 *
 * Пример вывода:
 * Мама Мыла Раму.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FirstUpperCase {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();

        StringBuilder builder = new StringBuilder(string);
        //выставляем первый символ заглавным, если это буква
        if (Character.isAlphabetic(string.codePointAt(0)))
            builder.setCharAt(0, Character.toUpperCase(string.charAt(0)));

        //крутимся в цикле, и меняем буквы, перед которыми пробел на заглавные
        for (int i = 1; i < string.length(); i++) {
            if (Character.isAlphabetic(string.charAt(i)) && Character.isSpaceChar(string.charAt(i - 1)))
              builder.setCharAt(i, Character.toUpperCase(string.charAt(i)));
        }
        System.out.println(builder);

    }
}
