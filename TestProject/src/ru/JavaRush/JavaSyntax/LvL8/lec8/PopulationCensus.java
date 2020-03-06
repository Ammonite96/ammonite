package ru.JavaRush.LvL8.lec8;

import java.util.HashMap;
import java.util.Map;

/**
 * Создать словарь (Map<String, String>) занести в него десять записей по принципу "Фамилия" - "Имя".
 *         Проверить сколько людей имеют совпадающие с заданным именем или фамилией.
 */


public class PopulationCensus {
    public static Map<String, String> createMap() {
        Map<String,String> listName = new HashMap<>();
        listName.put("Ахонин", "Денис");
        listName.put("Антонов", "Антон");
        listName.put("Антонова", "Ксюша");
        listName.put("Антоновв", "Артём");
        listName.put("Антипин", "Саша");
        listName.put("Веприцкая", "Лариса");
        listName.put("Лангина", "Саша");
        listName.put("Лангин", "Алексей");
        listName.put("Сорокина", "Алина");
        listName.put("Сорокин", "Тимур");

        return listName;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        int count = 0;
        for (Map.Entry<String,String> listName : map.entrySet()){
            if (listName.getValue().equals(name))
                count++;
        }
        return count;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        int count = 0;
        for (Map.Entry<String,String> listName:map.entrySet()){
           if (listName.getKey().equals(lastName))
               count++;
            }
        return count;
    }

    public static void main(String[] args) {

    }
}

/*
String [] name = {"Денис", "Тимур", "Ксюша","Антон", "Артём", "Саша", "Саша", "Лара", "Алина", "Алексей"};
        String [] lastName = {"Ахонин","Сорокин","Антонова","Антонов","Антоновв","Лангина","Антипин","Веприцкая","Сорокина","Лангин"};
 */