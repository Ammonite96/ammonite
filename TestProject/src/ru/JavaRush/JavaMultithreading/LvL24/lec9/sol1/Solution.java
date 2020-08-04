package ru.JavaRush.JavaMultithreading.LvL24.lec9.sol1;

/**
 * Сделайте так, чтобы метод getIterator возвращал анонимный класс.
 * Перенесите логику LocalIterator в анонимный класс.
 * Меняйте только тело метода getIterator.
 */

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public static List<Iterator> iterators = new LinkedList<>();

    private int countItems;

    public Iterator getIterator(final String name) {
        countItems++;
        System.out.println(name + " item " + countItems);
        return new Iterator() {
            @Override
            public Iterator next() {
                return getIterator(name);
            }
        };
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        Iterator iterator = solution.getIterator("iterator");
        for (int i = 1; i < 5; i++) {
            iterators.add(iterator.next());
        }
    }
}

/*
class LocalIterator implements Iterator {
            public LocalIterator() {
                countItems++;
                System.out.println(name + " item " + countItems);
            }

            public Iterator next() {
                return new LocalIterator();
            }
        }
        return new LocalIterator();
 */

/*
Iterator iterator = new Iterator (){
            @Override
            public Iterator next() {
                countItems++;
                System.out.println(name + " item " + countItems);
                return this::next;
            }
        };
        return iterator;
 */