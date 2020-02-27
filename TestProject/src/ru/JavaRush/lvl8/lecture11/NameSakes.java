package ru.JavaRush.lvl8.lecture11;

import java.util.HashMap;
import java.util.Map;

/**
 * 1. Создать словарь Map (<String, String>) и добавить туда 10 человек в виде "Фамилия"-"Имя".
 * 2. Пусть среди этих 10 человек есть люди с одинаковыми именами.
 * 3. Пусть среди этих 10 человек есть люди с одинаковыми фамилиями.
 * 4. Вывести содержимое Map на экран.
 */

public class NameSakes {
    public static void main(String[] args) {
        Map<String, String> names = new HashMap<>();
        String[] name = {"Денис", "Тимур", "Ксюша", "Антон", "Артём", "Саша", "Саша", "Лара", "Алина", "Алексей"};
        String[] lastName = {"Ахонин", "Сорокин", "Антонова", "Антонов", "Антонов", "Лангина", "Антипин", "Веприцкая", "Сорокина", "Лангин"};

        for (int i = 0; i < 10; i++)
            names.put(lastName[i], name[i]);

        for (Map.Entry<String, String> pair : names.entrySet()){
            String key = pair.getKey();
            String value = pair.getValue();

            System.out.println(key + " " + value);
        }
    }
}


/*

    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
        //напишите тут ваш код

        return null;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }

 */
