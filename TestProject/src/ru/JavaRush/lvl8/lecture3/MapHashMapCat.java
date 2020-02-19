package ru.JavaRush.lvl8.lecture3;

import java.util.HashMap;
import java.util.Map;

/**
 * Есть класс Cat с полем имя (name, String).
 * Создать коллекцию Map<String, Cat> (реализация HashMap).
 * Добавить в коллекцию 10 котов, в качестве ключа использовать имя кота.
 * Вывести результат на экран, каждый элемент с новой строки.
 */

public class MapHashMapCat {
    public static void main(String[] args) throws Exception {
        String[] cats = new String[]{"васька", "мурка", "дымка", "рыжик", "серый", "снежок", "босс", "борис", "визя", "гарфи"};

        Map<String, Cat> map = addCatsToMap(cats);

        for (Map.Entry<String, Cat> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }


    public static Map<String, Cat> addCatsToMap(String[] cats) {
        Map<String, Cat> map = new HashMap<>();
        for (int i = 0; i < cats.length; i++){
            String name = cats[i];
            Cat cat = new Cat(cats[i]);
            map.put(name, cat);
        }
        return map;
    }


    public static class Cat {
        String name;

        public Cat(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name != null ? name.toUpperCase() : null;
        }
    }
}
