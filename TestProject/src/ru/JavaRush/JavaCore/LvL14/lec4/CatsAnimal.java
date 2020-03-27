package ru.JavaRush.JavaCore.LvL14.lec4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * 1. Считывать строки(параметры) с консоли, пока пользователь не введет пустую строку(Enter).
 * 2. Каждый параметр соответствует имени кота.
 * Для каждого параметра:
 * 3. Создать объект cat класса Cat, который равен коту из getCatByKey(String параметр).
 * 4. Вывести на экран cat.toString().
 */

public class CatsAnimal {
    public static void main(String[] args) throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String nameCat;
        ArrayList<String> listName = new ArrayList<>();
        while (true){
            nameCat = read.readLine();
            if (nameCat.isEmpty())
                break;
            listName.add(nameCat);
        }
        Cat cat;
        for (int i = 0; i < listName.size(); i++){
            String lName = listName.get(i);
            cat = CatFactory.getCatByKey(lName);
            System.out.println(cat);
        }
    }

    static class CatFactory {
        static Cat getCatByKey(String key) {
            Cat cat = null;
            if ("vaska".equals(key)) {
                cat = new MaleCat("Василий");
            } else if ("murka".equals(key)) {
                cat = new FemaleCat("Мурочка");
            } else if ("kiska".equals(key)) {
                cat = new FemaleCat("Кисюлька");
            } else {
                cat = new Cat(key);
            }
            return cat;
        }
    }

    static class Cat {
        private String name;

        protected Cat(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        public String toString() {
            return "Я уличный кот " + getName();
        }
    }

    static class MaleCat extends Cat {
        MaleCat(String name) {
            super(name);
        }

        public String toString() {
            return "Я - солидный кошак по имени " + getName();
        }
    }

    static class FemaleCat extends Cat {
        FemaleCat(String name) {
            super(name);
        }

        public String toString() {
            return "Я - милая кошечка по имени " + getName();
        }
    }
}
