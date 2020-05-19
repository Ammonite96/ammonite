package ru.JavaRush.JavaCore.LvL19.lec5;

import java.util.Arrays;

public class Test111 {

    public static void selectionSort(int[] number){
        int a, b, c;
        for (int i = 0; i < number.length-1; i++){
            int m = i; b = 10;
            for (int j = i+1; j < number.length; j++){
                if (number[j]<number[m])
                    a = b;
                m=j;
            }
        }
    }

    public static void main(String[] args) {
        Test111 test = new Test111();
        int [] a = {1,2,5,4};
        selectionSort(a);
        System.out.println(Arrays.toString(a));
    }
}
