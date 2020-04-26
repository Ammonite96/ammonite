package ru.JavaRush.JavaCore.LvL18.lec3;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Ввести с консоли имя файла.
 * Найти минимальный байт в файле, вывести его на экран.
 * Закрыть поток ввода-вывода.
 */

public class MinByte {
    public static void main(String[] args) throws Exception {
        BufferedReader readerFile = new BufferedReader(new InputStreamReader(System.in));
        String nameFile = readerFile.readLine();

        FileInputStream inputStream = new FileInputStream(nameFile);
        ArrayList<Long> minByte = new ArrayList<>();
        while (inputStream.available()>0){
            int dataRead = inputStream.read();
            minByte.add((long) dataRead);
        }
        inputStream.close();
        Collections.sort(minByte);
        System.out.println(minByte.get(0));
    }
}
