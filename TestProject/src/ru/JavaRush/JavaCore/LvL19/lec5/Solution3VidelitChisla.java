package ru.JavaRush.JavaCore.LvL19.lec5;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Считать с консоли 2 имени файла.
 * Вывести во второй файл все числа, которые есть в первом файле.
 * Числа выводить через пробел.
 * Закрыть потоки.
 * Пример тела файла:
 * 12 text var2 14 8ю 1
 * <p>
 * Результат:
 * 12 14 1
 */

public class Solution3VidelitChisla {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nameFile = reader.readLine();
        String nameFile1 = reader.readLine();
        reader.close();

        BufferedReader fileReader = new BufferedReader(new FileReader(nameFile));
        BufferedWriter fileWrite = new BufferedWriter(new FileWriter(nameFile1));

        while (fileReader.ready()){
            String dataFile = fileReader.readLine();
            Pattern pattern = Pattern.compile("\\b[0-9]+\\b");
            Matcher matcher = pattern.matcher(dataFile);
            while (matcher.find()) {
                String strNum = matcher.group();
                fileWrite.write(strNum+" ");
            }
        }
        fileReader.close();
        fileWrite.close();
    }
}
//(\s)|(([A-Za-zА-Яа-я]+\d+))|(\d+[A-Za-zА-Яа-я]+)|([A-Za-zА-Яа-я ]+)|(\n\t\r\f)
// \b[0-9]+\b