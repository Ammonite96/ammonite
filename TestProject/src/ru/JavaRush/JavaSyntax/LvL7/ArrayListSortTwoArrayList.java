package ru.JavaRush.LvL7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * 1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
 * Число нацело делится на 3 (x%3==0), нацело делится на 2 (x%2==0) и все остальные.
 * Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
 * Порядок объявления списков очень важен.
 * 2. Метод printList должен выводить на экран все элементы списка с новой строки.
 * 3. Используя метод printList выведи эти три списка на экран. Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
 */

public class ArrayListSortTwoArrayList {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> num = new ArrayList<>();
        ArrayList<Integer> three = new ArrayList<>();
        ArrayList<Integer> two = new ArrayList<>();
        ArrayList<Integer> noThreeTwo = new ArrayList<>();

        for (int i = 0; i < 20; i++){
            num.add(Integer.parseInt(r.readLine()));
        }

        for (int i = 0; i < num.size(); i++){
            Integer a = num.get(i);
            if (a % 3 == 0)
                three.add(a);
        }

        for (int i = 0; i < num.size(); i++){
            Integer a = num.get(i);
            if(a % 2 == 0)
                two.add(a);
        }

        for (int i = 0; i < num.size(); i++){
            Integer a = num.get(i);
            if(!(a % 3 == 0) && !(a % 2 == 0))
                noThreeTwo.add(a);
        }

        printList(three);
        printList(two);
        printList(noThreeTwo);
    }

    public static ArrayList<Integer> printList(ArrayList<Integer> list) {
        for (Integer s : list){
            System.out.println(s);

        }
        return list;
    }
}
