package ru.JavaRush.lvl8.lecture11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 1. Внутри класса Solution создать public static класс кот - Cat.
 * 2. Реализовать метод createCats, он должен создавать множество (Set) котов и добавлять в него 3 кота.
 * 3. В методе main удалите одного кота из Set cats.
 * 4. Реализовать метод printCats, он должен вывести на экран всех котов, которые остались во множестве.
 * Каждый кот с новой строки.
 */

public class SetArrayCat {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        //напишите тут ваш код. step 3 - пункт 3
        Iterator<Cat> iterator = cats.iterator();
        iterator.next();
        iterator.remove();

        printCats(cats);
    }

    public static Set<Cat> createCats() {
        //напишите тут ваш код. step 2 - пункт 2
        Set<Cat> catArray = new HashSet<>();
        for (int i = 0; i < 3; i++){
            catArray.add(new Cat());
        }
        return catArray;
    }

    public static void printCats(Set<Cat> cats) {
        // step 4 - пункт 4
        for (Object o : cats)
            System.out.println(o);
    }

    // step 1 - пункт 1
    public static class Cat{

    }
}
