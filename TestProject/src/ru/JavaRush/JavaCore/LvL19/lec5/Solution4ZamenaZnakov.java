package ru.JavaRush.JavaCore.LvL19.lec5;

import java.io.*;

/**
 * Считать с консоли 2 имени файла.
 * Первый Файл содержит текст.
 * Считать содержимое первого файла и заменить все точки "." на знак "!".
 * Результат вывести во второй файл.
 * Закрыть потоки.
 */

public class Solution4ZamenaZnakov {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nameFile1 = reader.readLine();
        String nameFile2 = reader.readLine();
        reader.close();

        BufferedReader fileReader = new BufferedReader(new FileReader(nameFile1));
        BufferedWriter fileWrite = new BufferedWriter(new FileWriter(nameFile2));

        while (fileReader.ready()){
            String dataFile = fileReader.readLine();
            String newStr = dataFile.replaceAll("\\.", "!");
            fileWrite.write(newStr);
        }

        fileReader.close();
        fileWrite.close();
    }
}
