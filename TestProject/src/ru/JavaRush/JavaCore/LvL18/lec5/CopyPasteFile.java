package ru.JavaRush.JavaCore.LvL18.lec5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Исправить функциональность в соответствии с требованиями.
 * Программа должна:
 * 1. Переписать все байты одного файла в другой одним куском.
 * 2. Закрывать потоки ввода-вывода.
 *
 * Подсказка:
 * 4 ошибки.
 */

public class CopyPasteFile {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream("test");
        // Создаем поток-записи-байт-в-файл
        FileOutputStream outputStream = new FileOutputStream("test1");

        byte[] buffer1 = new byte[inputStream.available()];
        System.out.println(buffer1.length);

        for (byte b : buffer1){
            System.out.println(b);
        }

        if (inputStream.available() > 0) {
            //читаем весь файл одним куском
            byte[] buffer = new byte[inputStream.available()];
            System.out.println(buffer.length);
            int count = inputStream.read(buffer);
            outputStream.write(buffer, 0, count);
        }

        inputStream.close();
        outputStream.close();
    }
}
