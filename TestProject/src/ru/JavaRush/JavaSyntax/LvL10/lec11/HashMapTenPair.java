package ru.JavaRush.JavaSyntax.LvL10.lec11;

/**
 * Задача: Программа демонстрирует работу HashMap:
 * вводит с клавиатуры набор пар (номер и строку), помещает их в HashMap и выводит на экран содержимое HashMap.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class HashMapTenPair {
    HashMap<Integer, String> map;
    static Integer index;
    static String name;

    public HashMapTenPair() {
        this.map = new HashMap<Integer, String>();
        //map.put(index, name);
    }

    public static void main(String[] args) throws IOException {
        HashMapTenPair hashMapTenPair = new HashMapTenPair();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            int index = Integer.parseInt(reader.readLine());
            String name = reader.readLine();
            hashMapTenPair.map.put(index, name);
        }

        for (Map.Entry<Integer, String> pair : hashMapTenPair.map.entrySet()) {
            index = pair.getKey();
            name = pair.getValue();
            System.out.println("Id=" + index + " Name=" + name);
        }
    }
}
