package ru.JavaRush.JavaCore.LvL18.lec3;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Ввести с консоли имя файла.
 * Найти байт или байты с максимальным количеством повторов.
 * Вывести их на экран через пробел.
 * Закрыть поток ввода-вывода.
 */

public class ByteRepeat {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileInputStream inputStream = new FileInputStream(fileName);
        ArrayList<Integer> byteList = new ArrayList<>();
        while (inputStream.available() > 0){
            int b = inputStream.read();
            byteList.add(b);
        }
        inputStream.close();

        Collections.sort(byteList);
        Map<Integer, Integer> mapResult = new HashMap<>();
        int count = 0;
        for (int i = 0; i < byteList.size()-1; i++){
            if (byteList.get(i) == byteList.get(i+1)){
                count++;
                mapResult.put(byteList.get(i), count);
            } else count = 0;
        }
        int max = Collections.max(mapResult.values());
        mapResult.forEach((integer, integer2) -> {
            if(integer2 == max)
                System.out.println(integer);
        });
    }
}



/*

String fileName = new BufferedReader(new InputStreamReader(System.in)).readLine();
        FileInputStream fileInputStream = new FileInputStream(fileName);

//массив где будут индексы-"высота байта",значения счетчик частоты этих байт
byte[] bytes = new byte[256];
    byte byteHigh;
//заносим в массив
        while (fileInputStream.available() > 0) {
                byteHigh = (byte) fileInputStream.read();
                bytes[byteHigh] += 1;
                }

                //вычисляем "наибольшую частоту встречаемости байта"
                int maxValue = bytes[0];
                for (int i = 0; i < bytes.length; i++) {
        int tmpData = (int) bytes[i];
        if (tmpData > maxValue)
        maxValue = tmpData;
        }


        //в соответствии с частотой выводим байт
        for (int i = 0; i < bytes.length; i++) {
        if (bytes[i] == maxValue) {
        System.out.print(i);
        System.out.print(" ");
        }
        }

        fileInputStream.close();
        System.in.close();
        System.out.close();

 */

