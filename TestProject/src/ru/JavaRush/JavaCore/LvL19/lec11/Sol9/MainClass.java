package ru.JavaRush.JavaCore.LvL19.lec11.Sol9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 1. В статическом блоке инициализировать словарь map парами [число-слово] от 0 до 12 включительно.
 * Например, 0 - "ноль", 1 - "один", 2 - "два"
 * 2. Считать с консоли имя файла, считать содержимое файла.
 * 3. Заменить все числа на слова используя словарь map.
 * 4. Результат вывести на экран.
 * 5. Закрыть потоки.
 * Пример данных в файле:
 * Это стоит 1 бакс, а вот это - 12 .
 * Переменная имеет имя file1.
 * 110 - это число.
 * <p>
 * Пример вывода в консоль:
 * Это стоит один бакс, а вот это - двенадцать .
 * Переменная имеет имя file1.
 * 110 - это число.
 */

public class MainClass {
    public static Map<Integer, String> map = new HashMap<Integer, String>();

    static {
        String[] strNum = {"ноль", "один", "два", "три", "четыре", "пять", "шесть",
                "семь", "восемь", "девять", "десять", "одинадцать", "двенадцать"};
        for (int i = 0; i < strNum.length; i++)
            map.put(i, strNum[i]);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
        String fileData;

        while ((fileData = fileReader.readLine()) != null) {
            StringBuilder builder = new StringBuilder(fileData);
            Pattern pattern = Pattern.compile("[^\\S][0-9]+");
            Matcher matcher = pattern.matcher(builder);
            while (matcher.find())
                System.out.println(matcher.group());
        }
    }
}
