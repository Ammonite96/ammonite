package ru.JavaRush.LvL6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class AscendingNumberBubbleSort {
//    public static void main(String[] args) throws IOException {
//        BufferedReader num = new BufferedReader(new InputStreamReader(System.in));
//
//        int[] numbers = new int[5];
//
//        for(int i = 0; i<numbers.length; i++){
//            numbers[i] = Integer.parseInt(num.readLine());
//        }
//        Arrays.sort(numbers);
//        for (int j=0; j<numbers.length;j++)
//            System.out.println(numbers[j]);
//    }

    public static void main(String[] args) throws IOException {
        BufferedReader num = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++)
            numbers[i] = Integer.parseInt(num.readLine());

        bubbleSort(numbers);
        for (int k=0; k<numbers.length;k++)
        System.out.println(numbers[k]);
    }

    public static void bubbleSort(int[] arr) {
    /*Внешний цикл каждый раз сокращает фрагмент массива,
      так как внутренний цикл каждый раз ставит в конец
      фрагмента максимальный элемент*/
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
            /*Сравниваем элементы попарно,
              если они имеют неправильный порядок,
              то меняем местами */
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }
}
