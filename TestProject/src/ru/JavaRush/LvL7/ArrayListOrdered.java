package ru.JavaRush.LvL7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * 1. Введи с клавиатуры 10 слов в список строк.
 * 2. Определить, является ли список упорядоченным по возрастанию длины строки.
 * 3. В случае отрицательного ответа вывести на экран индекс первого элемента, нарушающего такую упорядоченность.
 */

public class ArrayListOrdered {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> arrayOrder = new ArrayList<>();

        for (int j = 0; j < 10; j++){
            arrayOrder.add(reader.readLine());
        }

        for (int i = 0; i < (arrayOrder.size() - 1); i++){
            String str = arrayOrder.get(i);
            String str1 = arrayOrder.get(i+1);
            int length = str.length();
            int length1 = str1.length();
            if (length1 < length){
                System.out.println(i+1);
                break;
            }
        }
    }
}
