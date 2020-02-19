package ru.JavaRush.LvL6;

import java.util.ArrayList;

/**
 * 1. В классе Cat добавь публичную статическую переменную cats (ArrayList<Cat>).
 * 2. Пусть при каждом создании кота (нового объекта Cat) в переменную cats добавляется этот новый кот. Создать 10 объектов Cat.
 * 3. Метод printCats должен выводить всех котов на экран. Нужно использовать переменную cats.
 */

public class CatStatic {

    public static ArrayList<CatStatic> cats = new ArrayList<CatStatic>();
    int count;
    public CatStatic() {
        count++;
    }

    public static void main(String[] args) {
        for (int a = 0; a < 10; a++) {
            CatStatic cat = new CatStatic();
            cats.add(cat);
        }
        printCats();
    }

    public static void printCats() {
        for (int i = 0; i < 10; i++){
            System.out.println(cats.get(i));
        }
    }
}
