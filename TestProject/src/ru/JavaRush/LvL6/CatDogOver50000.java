package ru.JavaRush.LvL6;

import java.util.ArrayList;

/**
 * Создать в цикле по 50 000 объектов Cat и Dog.
 * (Java-машина должна начать уничтожать неиспользуемые, и метод finalize хоть раз да вызовется).
 */

public class CatDogOver50000 {
    public static void main(String[] args) throws Throwable {
        Cat cat;
        Dog1 dog;

        for (int i = 1; i <= 50000; i++) {
            cat = new Cat();
            dog = new Dog1();
            dog.finalize();
            cat.finalize();
        }

    }
}

    class Cat {
        // @Override
        protected void finalize() throws Throwable {
            super.finalize();
            System.out.println("A Cat was destroyed");
        }
    }

    class Dog1 {
       // @Override
        protected void finalize() throws Throwable {
            super.finalize();
            System.out.println("A Dog was destroyed");
        }
    }

