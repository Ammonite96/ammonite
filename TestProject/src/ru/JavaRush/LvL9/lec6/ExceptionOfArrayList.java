package ru.JavaRush.LvL9.lec6;

import java.util.ArrayList;

/**
 * Перехватить исключение (и вывести его на экран, указав его тип), возникающее при выполнении кода:
 * ArrayList<String> list = new ArrayList<String>();
 * String s = list.get(18);
 */

public class ExceptionOfArrayList {
    public static void main(String[] args) {
        try {
            ArrayList<String> list = new ArrayList<>();
            String s = list.get(18);
        } catch (IndexOutOfBoundsException i){
            System.out.println("IndexOutOfBoundsException");
        }
    }
}
