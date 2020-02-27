package ru.JavaRush.lvl8.lecture11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 1. Внутри класса Solution создать public static классы Cat, Dog без конструктора или с конструктором без параметров.
 * 2. Реализовать метод createCats, который должен возвращать множество с 4 котами.
 * 3. Реализовать метод createDogs, который должен возвращать множество с 3 собаками.
 * 4. Реализовать метод join, который должен возвращать объединенное множество всех животных - всех котов и собак.
 * 5. Реализовать метод removeCats, который должен удалять из множества pets всех котов, которые есть в множестве cats.
 * 6. Реализовать метод printPets, который должен выводить на экран всех животных, которые в нем есть.
 * Каждое животное с новой строки.
 */

public class ManyAllAnimals {
    public static class Cat{

    }
    public static class Dog{

    }

    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        Set<Cat> resultCat = new HashSet<Cat>();
        for (int i = 0; i < 4; i++)
            resultCat.add(new Cat());
        //напишите тут ваш код
        return resultCat;
    }

    public static Set<Dog> createDogs() {
        Set<Dog> resultDog = new HashSet<Dog>();
        for (int i = 0; i < 3; i++)
            resultDog.add(new Dog());
        //напишите тут ваш код
        return resultDog;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        Set<Object> join = new HashSet<>();
        ArrayList<Object> copyCat = new ArrayList<>(cats);
        ArrayList<Object> copyDog = new ArrayList<>(dogs);
        for (int c = 0; c < copyCat.size(); c++){
            Object catCopy = copyCat.get(c);
            join.add(catCopy);
        }
        for (int d = 0; d < copyDog.size(); d++){
            Object dogCopy = copyDog.get(d);
            join.add(dogCopy);
        }
        //напишите тут ваш код
        return join;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        ArrayList<Object> copyCat = new ArrayList<>(cats);
        for (int i = 0; i < copyCat.size(); i++){
            Object c = copyCat.get(i);
            pets.remove(c);
        }
        //напишите тут ваш код
    }

    public static void printPets(Set<Object> pets) {
        for (Object o : pets)
            System.out.println(o);
        //напишите тут ваш код
    }
}

/*

    public static class Cat{

    }
    public static class Dog{

    }

    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        Set<Cat> resultCat = new HashSet<Cat>();
        for (int i = 0; i < 4; i++)
            resultCat.add(new Cat());
        //напишите тут ваш код
        return resultCat;
    }

    public static Set<Dog> createDogs() {
        Set<Dog> resultDog = new HashSet<Dog>();
        for (int i = 0; i < 3; i++)
            resultDog.add(new Dog());
        //напишите тут ваш код
        return resultDog;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        Set<Object> join = new HashSet<>();
        join.addAll(cats);
        join.addAll(dogs);
        //напишите тут ваш код
        return join;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        pets.removeAll(cats);
        //напишите тут ваш код
    }

    public static void printPets(Set<Object> pets) {
        for (Object o : pets)
            System.out.println(o);
        System.out.println(pets.size());
        //напишите тут ваш код
    }
}

 */
