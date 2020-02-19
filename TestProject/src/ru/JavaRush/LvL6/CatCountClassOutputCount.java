package ru.JavaRush.LvL6;

/**
 * В классе Cat создай статическую переменную public int catCount.
 * Создай конструктор [public Cat()].
 * Пусть при каждом создании кота (нового объекта Cat)
 * статическая переменная catCount увеличивается на 1.
 * Создать 10 объектов Cat и вывести значение переменной catCount на экран.
 */

public class CatCountClassOutputCount {
    public static void main(String[] args) {
        CatcatCount cat = new CatcatCount();
        CatcatCount cat1 = new CatcatCount();
        System.out.println(CatcatCount.catCount);
    }

    public static class CatcatCount {
        public static int catCount = 0;

        public CatcatCount() {
            catCount++;
        }
    }
}





