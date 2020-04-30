package ru.JavaRush.JavaCore.LvL18.lec11;

import java.io.*;
import java.util.ArrayList;

/**
 * Считать с консоли 2 имени файла.
 * В начало первого файла записать содержимое второго файла так, чтобы получилось объединение файлов.
 * Закрыть потоки.
 */

public class MergeFile {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nameFile = reader.readLine();
        String nameFile1 = reader.readLine();

        FileInputStream inputStream = new FileInputStream(nameFile);
        byte[] bytes = new byte[inputStream.available()];
        while (inputStream.available()>0){
            int ch = inputStream.read(bytes);
        }
        FileInputStream inputStream1 = new FileInputStream(nameFile1);
        byte[] bytes1 = new byte[inputStream1.available()];
        while (inputStream1.available()>0){
            int ch1 = inputStream1.read(bytes1);
        }
        FileOutputStream outputStream = new FileOutputStream(nameFile);
        outputStream.write(bytes1, 0, bytes1.length);
        outputStream.write(bytes, 0, bytes.length);
        inputStream.close();
        inputStream1.close();
        outputStream.close();
    }
}
