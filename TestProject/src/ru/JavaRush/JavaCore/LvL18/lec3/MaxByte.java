package ru.JavaRush.JavaCore.LvL18.lec3;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Ввести с консоли имя файла.
 * Найти максимальный байт в файле, вывести его на экран.
 * Закрыть поток ввода-вывода.
 */

public class MaxByte {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nameFile = reader.readLine();

        FileInputStream inputStream = new FileInputStream(nameFile);
        ArrayList<Long> maxByte = new ArrayList<>();
        while (inputStream.available()>0){
            int dataRead = inputStream.read();
            maxByte.add((long) dataRead);
        }
        inputStream.close();
        Collections.sort(maxByte);
        Collections.reverse(maxByte);
        System.out.println(maxByte.get(0));
    }
}
