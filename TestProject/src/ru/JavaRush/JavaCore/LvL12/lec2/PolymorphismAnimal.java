package ru.JavaRush.JavaCore.LvL12.lec2;

/**
 * Написать метод, который определяет, объект какого класса ему передали, и возвращает результат - одно значение из:
 * "Корова", "Кит", "Собака", "Неизвестное животное".
 */

public class PolymorphismAnimal {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Dog()));
        System.out.println(getObjectType(new Whale()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o) {
        if (o instanceof Cow)
            return "Корова";
        else if (o instanceof Dog)
            return "Собака";
        else if (o instanceof Whale)
            return "Кит";

        return "Неизвестное животное";
    }

    public static class Cow {
    }

    public static class Dog {
    }

    public static class Whale {
    }

    public static class Pig {
    }
}
