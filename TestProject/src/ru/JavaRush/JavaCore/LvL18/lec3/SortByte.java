package ru.JavaRush.JavaCore.LvL18.lec3;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Ввести с консоли имя файла.
 * Считать все байты из файла.
 * Не учитывая повторений - отсортировать их по байт-коду в возрастающем порядке.
 * Вывести на экран.
 * Закрыть поток ввода-вывода.
 *
 * Пример байт входного файла:
 * 44 83 44
 * Пример вывода:
 * 44 83
 */

public class SortByte {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nameFile = reader.readLine();
        FileInputStream inputStream = new FileInputStream(nameFile);

        ArrayList<Integer> byteList = new ArrayList<>();
        while (inputStream.available() > 0){
            int numByte = inputStream.read();
            byteList.add(numByte);
        }
        inputStream.close();

        Map<Integer, Integer> map = new TreeMap<>();
        int count = 0;
        for (int i = 0; i < byteList.size(); i++){
            for (int j = 0; j < byteList.size(); j++){
                if (byteList.get(i) == byteList.get(j))
                    count++;
            }
            map.put(byteList.get(i), count);
            count = 0;
        }

        map.forEach((integer, integer2) -> System.out.print(integer + " "));
    }
}
