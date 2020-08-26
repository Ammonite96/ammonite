package ru.JavaRush.JavaMultithreading.LvL26.lec2.sol2;

import java.util.Comparator;

/**
 * В таблице есть колонки, по которым можно сортировать.
 * Пользователь имеет возможность настроить под себя список колонок, которые будут сортироваться.
 * Напиши public static компаратор CustomizedComparator, который будет:
 * 1. В конструкторе принимать массив компараторов.
 * 2. Сортировать данные в порядке, соответствующем последовательности компараторов.
 * Все переданные компараторы сортируют дженерик тип Т.
 * В конструктор передается как минимум один компаратор.
 */

public class Solution {
    public static void main(String[] args) {

    }

    public static class CustomizedComparator<T> implements Comparator<T> {
        private Comparator<T>[] comparators;

        public CustomizedComparator(Comparator<T>... comparators) {
            this.comparators = comparators;
        }

        int result = 0;
        @Override
        public int compare(T o1, T o2) {
            for (Comparator comparator:comparators){
                result = comparator.compare(o1, o2);
                if (result == 0) return result;
            }
            return result;
        }
    }
}
