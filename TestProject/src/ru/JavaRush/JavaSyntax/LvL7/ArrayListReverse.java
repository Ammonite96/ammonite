package ru.JavaRush.LvL7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Введи с клавиатуры 5 слов в список строк. Удали 3 - ий элемент списка, и выведи оставшиеся элементы в обратном порядке.
 */

public class ArrayListReverse {
    public static void main(String[] args) throws Exception {
        BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> arrString = new ArrayList<>();
        int count = 0;

        while (true){
            arrString.add(str.readLine());
            count++;
            if (count == 5)
                break;
        }

        arrString.remove(2);
        for(int j = arrString.size()-1; j >= 0; j--)
            System.out.println(arrString.get(j));
    }
}