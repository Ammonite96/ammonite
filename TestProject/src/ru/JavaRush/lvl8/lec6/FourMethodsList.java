package ru.JavaRush.lvl8.lec6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Реализовать 4 метода.
 * Каждый из них должен возвращать список, который лучше всего подходит для выполнения данных операций (быстрее всего справится с большим количеством операций).
 * Ничего измерять не нужно.
 */

public class FourMethodsList {
    public static List getListForGet() {
        ArrayList arrayList = new ArrayList();
        return arrayList;
    }

    public static List getListForSet() {
        ArrayList arrayList = new ArrayList();
        return arrayList;

    }

    public static List getListForAddOrInsert() {
        LinkedList linkedList = new LinkedList();
        return linkedList;
    }

    public static List getListForRemove() {
        LinkedList linkedList = new LinkedList();
        return linkedList;
    }

    public static void main(String[] args) {

    }
}
