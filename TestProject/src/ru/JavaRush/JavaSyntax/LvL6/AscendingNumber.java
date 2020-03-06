package ru.JavaRush.LvL6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;

/**
 * Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
 *
 * Пример ввода:
 * 3
 * 2
 * 15
 * 6
 * 17
 *
 * Пример вывода:
 * 2
 * 3
 * 6
 * 15
 * 17
 */

public class AscendingNumber {

    public static void main(String[] args) throws IOException {
        BufferedReader num = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> ascendingNum = new ArrayList<Integer>();
        int count = 0;

        while (true){
           int numbers = Integer.parseInt(num.readLine());
            ascendingNum.add(numbers);
            count++;
            if (count == 5)
                break;
        }

        ascendingNum.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 == o2)
                return 0;
                else if (o1 > o2)
                    return 1;
                else return -1;
            }
        });

        for(int i = 0; i<ascendingNum.size(); i++)
            System.out.println(ascendingNum.get(i));
    }
}
