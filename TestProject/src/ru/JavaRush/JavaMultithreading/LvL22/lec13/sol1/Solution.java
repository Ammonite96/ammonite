package ru.JavaRush.JavaMultithreading.LvL22.lec13.sol1;

import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * Используя StringTokenizer разделить query на части по разделителю delimiter.
 * <p>
 * Пример
 * getTokens("level22.lesson13.task01", ".")
 * <p>
 * возвращает массив строк
 * {"level22", "lesson13", "task01"}
 */

public class Solution {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getTokens("level22.lesson13.task01", ".")));
    }

    public static String[] getTokens(String query, String delimiter) {
        StringTokenizer tokenizer = new StringTokenizer(query, delimiter);

        int count = 0;
        String [] result = new String[tokenizer.countTokens()];
        while (tokenizer.hasMoreTokens()){
            result[count] = tokenizer.nextToken();
            count++;
        }

        return result;
    }
}
