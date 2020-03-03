package ru.JavaRush.LvL9.lec11;

import java.io.BufferedReader;
import java.io.InputStreamReader;


/**
 * Написать программу, которая вводит с клавиатуры строку текста.
 * Программа должна вывести на экран две строки:
 * 1. первая строка содержит только гласные буквы из введённой строки.
 * 2. вторая - только согласные буквы и знаки препинания из введённой строки.
 * Буквы соединять пробелом, каждая строка должна заканчиваться пробелом.
 * Пример ввода:
 * Мама мыла раму.
 *
 * Пример вывода:
 * а а ы а а у
 * М м м л р м .
 */

public class VowelsAndConsonants {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine();
        String textReplace = text.replaceAll(" ", "");
        char[] chars = textReplace.toCharArray();

        for (int i = 0; i < chars.length; i++){
            char c = chars[i];
            boolean vowel = isVowel(c);
            if (vowel == true){
                System.out.print(c + " ");
            }
        }
        System.out.println();

        for (int j = 0; j < chars.length; j++){
            char c = chars[j];
            boolean consonants = isVowel(c);
            if (consonants == false)
                System.out.print(c + " ");
        }

    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char d : vowels) {  // ищем среди массива гласных
            if (c == d) {
                return true;
            }
        }
        return false;
    }
}

