package ru.JavaRush.JavaMultithreading.LvL22.lec9.sol3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 В методе main считай с консоли имя файла, который содержит слова, разделенные пробелом.
 В методе getLine используя StringBuilder расставь все слова в таком порядке, чтобы последняя буква данного слова совпадала с первой буквой следующего не учитывая регистр.
 Каждое слово должно участвовать 1 раз.
 Считай, что абсолютно все слова из исходного списка могут (и должны!) быть включены в результат (лишних слов нет).
 Метод getLine должен возвращать любой правильный вариант при наличии нескольких таковых (см. пример).
 Слова разделять пробелом.
 Вывести полученную строку на экран.

 Пример тела входного файла:
 Киев Нью-Йорк Амстердам Вена Мельбурн

 Результат:
 Амстердам Мельбурн Нью-Йорк Киев Вена
 или
 Вена Амстердам Мельбурн Нью-Йорк Киев
 или
 Мельбурн Нью-Йорк Киев Вена Амстердам
 и т.п.

 */

public class Solution {
    public static void main(String[] args) throws IOException {
        //...
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        BufferedReader readerFile = new BufferedReader(new FileReader(fileName));

        ArrayList<String> wordsList = new ArrayList<>();
        while (readerFile.ready()){
            wordsList.addAll(Arrays.asList(readerFile.readLine().split(" "))) ;
        }
        readerFile.close();
        String[] words = wordsList.toArray(new String[wordsList.size()]);

        StringBuilder result = getLine(words);
        System.out.println(result.toString());
    }

    public static StringBuilder getLine(String... words) {
        if (words==null || words.length==0) return new StringBuilder();//проверки
        if (words.length==1 || words[0].equals("")) return new StringBuilder(words[0]);

        StringBuilder result = new StringBuilder();
        ArrayList<String> wordsList = new ArrayList<>(Arrays.asList(words));

        while (isYes(wordsList)) {
            Collections.shuffle(wordsList);
        }

        for (String word: wordsList){
            result.append(word+" ");
        }
        result.deleteCharAt(result.length()-1);
        return result;
    }

    public static boolean isYes(ArrayList<String> wordsList){
        for (int i = 0; i < wordsList.size()-1; i++) {
            String firstWord = wordsList.get(i).toLowerCase();
            String secondWord = wordsList.get(i+1).toLowerCase();
            if (firstWord.charAt(firstWord.length()-1)!=secondWord.charAt(0)) return true;
        }
        return false;
    }
}

