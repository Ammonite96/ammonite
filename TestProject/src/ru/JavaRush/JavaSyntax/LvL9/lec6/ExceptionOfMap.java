package ru.JavaRush.LvL9.lec6;

import java.util.HashMap;

/**
 * Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
 * HashMap map = new HashMap(null);
 * map.put(null, null);
 * map.remove(null);
 */

public class ExceptionOfMap {
    public static void main(String[] args) {

        try {
            HashMap<String, String> map = new HashMap<String, String>(null);
            map.put(null, null);
            map.remove(null);
        } catch (NullPointerException n){
            System.out.println("NullPointerException");
        }
    }
}
