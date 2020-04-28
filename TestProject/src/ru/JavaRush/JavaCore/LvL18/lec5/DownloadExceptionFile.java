package ru.JavaRush.JavaCore.LvL18.lec5;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 1 Считывать с консоли имена файлов.
 * 2 Если файл меньше 1000 байт, то:
 * 2.1 Закрыть потоки работы с файлами.
 * 2.2 Выбросить исключение DownloadException.
 */

public class DownloadExceptionFile {
    public static void main(String[] args) throws DownloadException {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String nameFile;
            while ((nameFile = reader.readLine()) != null){
                FileInputStream inputStream = new FileInputStream(nameFile);
                while (inputStream.available() < 1000){
                    throw new DownloadException();
                }
                inputStream.close();
            }
        }catch (IOException io){io.getMessage();}
    }

    public static class DownloadException extends Exception {

    }
}
