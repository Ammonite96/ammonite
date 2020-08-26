package ru.JavaRush.JavaMultithreading.LvL26.lec2.sol3;

import java.util.*;

/**
 * Реализуй логику метода sort, который должен сортировать данные в массиве по удаленности от его медианы.
 * Верни отсортированный массив от минимального расстояния до максимального.
 * Если удаленность одинаковая у нескольких чисел, то сортируй их в порядке возрастания.
 * <p>
 * Пример входящего массива:
 * 13, 8, 15, 5, 17
 * медиана - 13
 * <p>
 * Отсортированный масив:
 * 13, 15, 17, 8, 5
 */

public class Solution {
    public static void main(String[] args) {
        Integer[] numbers = {13, 8, 15, 5, 17};
        System.out.println(Arrays.toString(sort(numbers)));
    }

    public static Integer[] sort(Integer[] array) {
        Integer[] copy = Arrays.copyOf(array, array.length);
        final double median;
        Arrays.sort(copy);
        if (copy.length % 2 == 0)
            median = ((double) (copy[copy.length / 2] + copy[copy.length / 2 - 1]) / 2);
        else
            median = (double) copy[copy.length / 2];

        Comparator<Integer> compareByMedian = (o1, o2) -> {
            double value = Math.abs(o1 - median) - Math.abs(o2 - median);
            if (value == 0) {
                value = o1 - o2;
            }
            return (int) value;
        };
        Arrays.sort(copy, compareByMedian);
        return copy;
    }
}


/*нахождение медианы
public static double sort(Integer[] array) {
Arrays.sort(array);
        if (array.length % 2 == 0){
            return ((array[array.length / 2]+array[array.length / 2 - 1]) / 2);
        }
        return array[array.length / 2];
       }

 */