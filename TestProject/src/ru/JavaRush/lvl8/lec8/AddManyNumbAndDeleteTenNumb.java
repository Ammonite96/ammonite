package ru.JavaRush.lvl8.lec8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * создать множество чисел Set<Integer> занести туда 20 чисел,
 * Удалить те которые больше 10.
 */

public class AddManyNumbAndDeleteTenNumb {
    public static Set<Integer> createSet() {
        Set<Integer> num = new HashSet<>();

        for (int i = 0; i < 20; i++)
            num.add(i);
        return num;
    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {

        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            if (number > 10)
                iterator.remove();
        }
        return set;
    }

    public static void main(String[] args) {
        System.out.println(createSet().size());
        System.out.println(removeAllNumbersGreaterThan10(createSet()).size());
    }
}

/*

 */