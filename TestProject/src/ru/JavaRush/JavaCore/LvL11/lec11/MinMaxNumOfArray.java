package ru.JavaRush.JavaCore.LvL11.lec11;

import java.util.Arrays;

/**
 * Написать метод, который возвращает минимальное и максимальное числа в массиве.
 */

public class MinMaxNumOfArray {
    public static void main(String[] args) {
        int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};

        Pair<Integer, Integer> result = getMinimumAndMaximum(data);

        System.out.println("The minimum is " + result.x);
        System.out.println("The maximum is " + result.y);
    }

    public static Pair<Integer, Integer> getMinimumAndMaximum(int[] inputArray) {
        if (inputArray == null || inputArray.length == 0) {
            return new Pair<Integer, Integer>(null, null);
        }

        // напишите тут ваш код
        int[] copyArray = new int[inputArray.length];
        for (int i = 0; i < inputArray.length ; i++) {
            int num = inputArray[i];
            copyArray [i] = num;
        }
        Arrays.sort(copyArray);
        int min = copyArray[0];
        int max = copyArray[copyArray.length-1];

        return new Pair<Integer, Integer>(min, max);
    }

    public static class Pair<X, Y> {
        public X x;
        public Y y;

        public Pair(X x, Y y) {
            this.x = x;
            this.y = y;
        }
    }
}
