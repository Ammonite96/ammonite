package ru.JavaRush.LvL9.lec11;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Есть класс кот - Cat, с полем "имя" (String).
 * Создать словарь Map<String, Cat> и добавить туда 10 котов в виде "Имя"-"Кот".
 * Получить из Map множество(Set) всех котов и вывести его на экран.
 */

public class TenCatInMap {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        Map<String, Cat> mapCat = new HashMap<>();
        String[] nameCat = {"Вася", "Рома", "Крюк", "Марсик", "Оскар", "Жираф", "Сеня", "Адольф", "Гитлер", "Капут"};
        for (int i = 0; i < 10; i++) {
            String value = nameCat[i];
            mapCat.put(nameCat[i], new Cat(value));
        }
        return mapCat;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {

        Set<Cat> setCat = new HashSet<>();
        for (Map.Entry<String, Cat> pair : map.entrySet()){
            Cat value = pair.getValue();
            setCat.add(value);
        }
        return setCat;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
