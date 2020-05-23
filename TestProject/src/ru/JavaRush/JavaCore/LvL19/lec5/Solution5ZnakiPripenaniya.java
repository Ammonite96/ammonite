package ru.JavaRush.JavaCore.LvL19.lec5;

import java.io.*;

/**
 * Считать с консоли 2 имени файла.
 * Первый Файл содержит текст.
 * Считать содержимое первого файла, удалить все знаки пунктуации, включая символы новой строки.
 * Результат вывести во второй файл.
 *
 * Закрыть потоки.
 */

public class Solution5ZnakiPripenaniya {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nameFile1 = reader.readLine();
        String nameFile2 = reader.readLine();
        reader.close();

        BufferedReader fileReader = new BufferedReader(new FileReader(nameFile1));
        BufferedWriter fileWrite = new BufferedWriter(new FileWriter(nameFile2));

        while (fileReader.ready()){
            String dataFile = fileReader.readLine();
            String newStr = dataFile.replaceAll("\\p{P}", "");
            fileWrite.write(newStr);
        }
        fileReader.close();
        fileWrite.close();
    }
}
// ! % ^ & * ( ) – + = { } | ~ [ ] \ ; ' : " < > ? , . / #