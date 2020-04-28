package ru.JavaRush.JavaCore.LvL18.lec5;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Считать с консоли 2 имени файла: файл1, файл2.
 * Записать в файл2 все байты из файл1, но в обратном порядке.
 * Закрыть потоки.
 */

public class ReverseFile {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nameFileRead = reader.readLine();
        String nameFileWrite = reader.readLine();

        FileInputStream inputStream = new FileInputStream(nameFileRead);
        FileOutputStream outputStream = new FileOutputStream(nameFileWrite);
        List<Integer> list = new ArrayList<>();
        byte[] bytes = new byte[inputStream.available()];
        while (inputStream.available() > 0){
            int data = inputStream.read();
            list.add(data);
        }
        Collections.reverse(list);
        for(int i = 0; i < list.size(); i++){
            int data = list.get(i);
            outputStream.write(data);
        }
        inputStream.close();
        outputStream.close();
    }
}
