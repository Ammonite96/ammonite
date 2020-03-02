package ru.JavaRush.LvL8.lec8;

import java.util.HashSet;
import java.util.Set;

/**
 * Добавить 20 строк в Set
 */

public class TwentyStrings {
    public static Set<String> createSet() {
        String[] strings = new String[]{"Л", "Лл","Ллл","Лллл","Ллллл","Люба","Лифт","Лофт","Ленин", "Леноград","Лестница"
                ,"Ленфильм","Лук","Лак","Лерой","Лерутка","Лодка","Лезвие","Ло","Лыжа"};

        Set<String> setArray = new HashSet<>();

        for (int i = 0; i < strings.length; i++){
            setArray.add(strings[i]);
        }

        return setArray;
    }

    public static void main(String[] args) {
        createSet();
        System.out.println(createSet().size());
        System.out.println(createSet());
    }
}

