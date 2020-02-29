package ru.JavaRush.lvl8.lec8;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: "фамилия" - "дата рождения".
 * Удалить из словаря всех людей, родившихся летом.
 */

public class DeleteSummerPeople {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Сталлоне", dateFormat.parse("MAY 1 2012"));
        map.put("Антонова", dateFormat.parse("AUG 08 1990"));
        map.put("Ахонин", dateFormat.parse("JUL 15 1989"));
        map.put("Веприцкая", dateFormat.parse("JUN 31 1991"));
        map.put("Сорокин", dateFormat.parse("MAY 2 1990"));
        map.put("Сорокина", dateFormat.parse("SEP 28 1991"));
        map.put("Антонов", dateFormat.parse("JAN 07 1990"));
        map.put("Брызгалов", dateFormat.parse("APR 25 1990"));
        map.put("Антипин", dateFormat.parse("JAN 19 1990"));
        map.put("Гордеев", dateFormat.parse("JAN 31 1990"));

        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {

        Iterator<Map.Entry<String, Date>> iter = map.entrySet().iterator();
        while (iter.hasNext()){
            Map.Entry<String, Date> k = iter.next();
            Date date = k.getValue();
            if (date.getMonth() == 5 || date.getMonth() == 6 || date.getMonth() == 7)
                iter.remove();
        }
    }

    public static void main(String[] args) throws ParseException {

    }
}
