package ru.JavaRush.JavaCore.LvL18.lec3;

/**
 * Ввести с консоли имя файла.
 * Найти байт или байты с минимальным количеством повторов.
 * Вывести их на экран через пробел.
 * Закрыть поток ввода-вывода.
 */

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class RareByte {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileInputStream inputStream = new FileInputStream(fileName);
        ArrayList<Integer> byteList = new ArrayList<>();
        while (inputStream.available() > 0){
            int numByte = inputStream.read();
            byteList.add(numByte);
        }
        inputStream.close();
        Collections.sort(byteList);

        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < byteList.size(); i++){
          for (int j = 0; j < byteList.size(); j++){
              if (byteList.get(i) == byteList.get(j))
                  count++;
          }
          map.put(byteList.get(i), count);
          count = 0;
        }

        int min = Collections.min(map.values());
        map.forEach((integer, integer2) -> {
            if (integer2 == min){
                System.out.print(integer + " ");
            }
        });
    }
}
