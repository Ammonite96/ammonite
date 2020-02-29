package ru.JavaRush.lvl8.lec3;

import java.util.HashSet;
import java.util.Set;

/**
 * Создать коллекцию Set (реализация HashSet) с типом элементов String.
 * Добавить в неё 10 строк:
 * арбуз
 * банан
 * вишня
 * груша
 * дыня
 * ежевика
 * женьшень
 * земляника
 * ирис
 * картофель
 *
 * Вывести содержимое коллекции на экран, каждый элемент с новой строки.
 * Посмотреть, как изменился порядок добавленных элементов.
 */

public class SetCollection {
    public static void main(String[] args) {
        Set<String> fruit = new HashSet<>();
        fruit.add("арбуз");
        fruit.add("банан");
        fruit.add("вишня");
        fruit.add("груша");
        fruit.add("дыня");
        fruit.add("ежевика");
        fruit.add("женьшень");
        fruit.add("земляника");
        fruit.add("ирис");
        fruit.add("картофель");

        for (String s : fruit)
            System.out.println(s);
    }
}
