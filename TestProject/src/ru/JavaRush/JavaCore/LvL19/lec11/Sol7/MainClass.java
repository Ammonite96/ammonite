package ru.JavaRush.JavaCore.LvL19.lec11.Sol7;

/**
 * Считать с консоли имя файла.
 * Вывести в консоль все строки из файла, которые содержат всего 2 слова из списка words.
 * Закрыть потоки.
 * Пример:
 * words содержит слова А, Б, В
 * <p>
 * Строки:
 * В Б А Д //3 слова из words, не подходит
 * А Б А Д //3 слова из words, не подходит
 * Д А Д //1 слово из words, не подходит
 * Д А Б Д //2 слова - подходит, выводим
 * Д А А Д //2 слова - подходит, выводим
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
        while (fileReader.ready()) {
            String fileData = fileReader.readLine();
            String[] arrayData = fileData.split(" ");
            int count = 0;
            for (String s : arrayData) {
                if (words.contains(s))
                    count++;
            }
            if (count == 2)
                System.out.println(fileData);
        }
        fileReader.close();
    }
}
