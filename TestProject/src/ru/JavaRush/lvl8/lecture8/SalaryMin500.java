package ru.JavaRush.lvl8.lecture8;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Создать словарь (Map<String, Integer>) и занести в него десять записей по принципу: "фамилия" - "зарплата".
 * Удалить из словаря всех людей, у которых зарплата ниже 500.
 */

public class SalaryMin500 {
    public static Map<String, Integer> createMap() {
        Map<String, Integer> zp = new HashMap<>();
        zp.put("Ахонин", 100);
        zp.put("Антонов", 500);
        zp.put("Антонова", 1000);
        zp.put("Антоновв", 400);
        zp.put("Антипин", 2000);
        zp.put("Веприцкая", 2000);
        zp.put("Лангина", 200);
        zp.put("Лангин", 300);
        zp.put("Сорокина", 4000);
        zp.put("Сорокин", 4500);

        return zp;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        Iterator<Map.Entry<String, Integer>> iter = map.entrySet().iterator();
        while (iter.hasNext()){
            Map.Entry<String, Integer> pair = iter.next();
            int salary = pair.getValue();
            if (salary < 500)
                iter.remove();
        }
    }

    public static void main(String[] args) {
    Map<String, Integer> m = new HashMap<>(createMap());
    removeItemFromMap(m);
    for (Map.Entry<String, Integer> pair : m.entrySet())
        System.out.println(pair.getKey()+ " " + pair.getValue());
    }
}
