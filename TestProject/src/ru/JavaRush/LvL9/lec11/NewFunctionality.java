package ru.JavaRush.LvL9.lec11;

import java.io.*;

/**
 * Задача: Программа вводит два имени файла. И копирует первый файл на место, заданное вторым именем.
 * Новая задача: Программа вводит два имени файла. И копирует первый файл на место, заданное вторым именем.
 * Если файла (который нужно копировать) с указанным именем не существует, то программа должна вывести надпись "Файл не существует."
 * и еще один раз прочитать имя файла с консоли, а уже потом считывать файл для записи.
 */

public class NewFunctionality {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            String sourceFileName = reader.readLine();
            InputStream fileInputStream = getInputStream(sourceFileName);
            String destinationFileName = reader.readLine();
            OutputStream fileOutputStream = getOutputStream(destinationFileName);
            while (fileInputStream.available() > 0) {
                int data = fileInputStream.read();
                fileOutputStream.write(data);
            }

            fileInputStream.close();
            fileOutputStream.close();
        } catch (FileNotFoundException fl) {
            System.out.println("Файл не существует.");
            String sourceFileName = reader.readLine();
            String destinationFileName = reader.readLine();
            InputStream fileInputStream = getInputStream(sourceFileName);
            OutputStream fileOutputStream = getOutputStream(destinationFileName);

            while (fileInputStream.available() > 0) {
                int data = fileInputStream.read();
                fileOutputStream.write(data);
            }

            fileInputStream.close();
            fileOutputStream.close();
        }
    }

    public static InputStream getInputStream(String fileName) throws IOException {
        return new FileInputStream(fileName);
    }

    public static OutputStream getOutputStream(String fileName) throws IOException {
        return new FileOutputStream(fileName);
    }
}
