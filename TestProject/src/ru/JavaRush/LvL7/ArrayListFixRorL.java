package ru.JavaRush.LvL7;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 1. Создай список слов, заполни его самостоятельно.
 * 2. Метод fix должен:
 * 2.1. удалять из списка строк все слова, содержащие букву "р"
 * 2.2. удваивать все слова содержащие букву "л".
 * 2.3. если слово содержит и букву "р" и букву "л", то оставить это слово без изменений.
 * 2.4. с другими словами ничего не делать.
 *
 * Пример:
 * роза
 * лира
 * лоза
 *
 * Выходные данные:
 * лира
 * лоза
 * лоза
 */

public class ArrayListFixRorL {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("лара");
        strings.add("лоза");
        strings.add("лира");
        strings.add("роза");
        strings.add("лапа");
        strings.add("рама");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {

        for (int i = 0; i < strings.size(); i++) {
            String str = strings.get(i);
            if (str.contains("р") && str.contains("л"))
                continue;
            if (str.contains("р")) {
                strings.remove(str);
                i--;
            }else if (str.contains("л")){
                strings.add(i, str);
                i++;
            }
        }
        return strings;
    }
}

/*
        strings.add("лара");
        strings.add("лоза");
        strings.add("лира");
        strings.add("роза");
        strings.add("лапа");
        strings.add("рама");
 */