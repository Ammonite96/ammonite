package ru.JavaRush.JavaCore.LvL19.lec5;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Считать с консоли 2 имени файла.
 * Вывести во второй файл все числа, которые есть в первом файле.
 * Числа выводить через пробел.
 * Закрыть потоки.
 * Пример тела файла:
 * 12 text var2 14 8ю 1
 * <p>
 * Результат:
 * 12 14 1
 */

public class Solution3VidelitChisla {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nameFile = reader.readLine();
        String nameFile1 = reader.readLine();
        reader.close();

        BufferedReader fileReader = new BufferedReader(new FileReader(nameFile));
        BufferedWriter fileWrite = new BufferedWriter(new FileWriter(nameFile1));

        ArrayList<Integer> numList = new ArrayList<>();
        while (fileReader.ready()){
            String dataFile = fileReader.readLine();
            String[] buffer = dataFile.split("(\\s)|(([A-Za-zА-Яа-я]+\\d+))|(\\d+[A-Za-zА-Яа-я]+)|([A-Za-zА-Яа-я ]+)|(\\n\\t\\r\\f)");
            System.out.println(buffer.length);
            for (int i = 0; i < buffer.length; i++ ){
                String num = buffer[i];
                System.out.println(num);
               // int m = Integer.parseInt(num);
                //numList.add(m);
            }
        }

        for (Integer i : numList){
            fileWrite.write(i);
            System.out.println(i);
        }
        fileReader.close();
        fileWrite.close();
    }
}
//(\s)|(([A-Za-zА-Яа-я]+\d+))|(\d+[A-Za-zА-Яа-я]+)|([A-Za-zА-Яа-я ]+)|(\n\t\r\f)