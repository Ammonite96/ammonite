package ru.JavaRush.lvl8.lecture8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Создать словарь (Map<String, String>) занести в него десять записей по принципу "фамилия" - "имя".
 * Удалить людей, имеющих одинаковые имена.
 */

public class RemoveNameDuplicates {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        String[] name = {"Денис", "Тимур", "Ксюша", "Антон", "Артём", "Саша", "Саша", "Лара", "Алина", "Алексей"};
        String[] lastName = {"Ахонин", "Сорокин", "Антонова", "Антонов", "Антоновв", "Лангина", "Антипин", "Веприцкая", "Сорокина", "Лангин"};

        for (int i = 0; i < 10; i++) {
            map.put(lastName[i], name[i]);
        }
        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        ArrayList<String> arrayList = new ArrayList<>(map.values());
        ArrayList<String> repName = new ArrayList<>();
        Collections.sort(arrayList);
        for (int i = 1; i < arrayList.size(); i++){
            if (arrayList.get(i-1).equals(arrayList.get(i))) {
                repName.add(arrayList.get(i));
            }
        }
        for (int j = 0; j < repName.size(); j++){
            String value = repName.get(j);
            removeItemFromMapByValue(map, value);
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
        removeTheFirstNameDuplicates(createMap());
    }
}