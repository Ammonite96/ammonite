package ru.JavaRush.JavaCore.LvL18.lec5;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * С консоли считать имя файла.
 * Посчитать в файле количество символов ',', количество вывести на консоль.
 * Закрыть потоки.
 * Подсказка:
 * нужно сравнивать с ascii-кодом символа ','.
 */

public class CommaCounting {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nameFile = reader.readLine();

        FileInputStream fileInputStream = new FileInputStream(nameFile);
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;
        while (fileInputStream.available()>0){
            int byteData = fileInputStream.read();
            if (byteData == 44)
                count++;
            list.add(byteData);
        }
        fileInputStream.close();
        System.out.println(count);
        System.out.println(list.size());
    }
}
