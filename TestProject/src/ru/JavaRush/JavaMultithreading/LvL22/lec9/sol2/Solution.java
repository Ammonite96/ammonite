package ru.JavaRush.JavaMultithreading.LvL22.lec9.sol2;

/**
 * Сформируй часть запроса WHERE используя StringBuilder.
 * Если значение null, то параметр не должен попадать в запрос.
 * <p>
 * Пример:
 * {name=Ivanov, country=Ukraine, city=Kiev, age=null}
 * <p>
 * Результат:
 * name = 'Ivanov' and country = 'Ukraine' and city = 'Kiev'
 */


import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("name", null);
        map.put("country", "Russia");
        map.put("city", "Yekaterinburg");
        map.put("age", null);
        System.out.println(getQuery(map));
    }

    public static String getQuery(Map<String, String> params) {
        StringBuilder builder = new StringBuilder();
        params.entrySet().stream()
                .filter(pair -> pair.getKey() != null
                        && pair.getValue() != null
                        && !pair.getKey().isEmpty()
                        && !pair.getValue().isEmpty()
                )
                .forEach(pair -> builder.append(pair.getKey())
                        .append(" = '")
                        .append(pair.getValue())
                        .append("' and ")
                );
        int len = builder.length();
        builder.setLength(len > 4 ? len - 5 : 0);
        return builder.toString();
    }
}
