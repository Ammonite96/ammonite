package ru.JavaRush.JavaCore.LvL12.lec12;

/**
 * Напиши метод, который определяет, какой объект передали в него.
 * Программа должна выводить на экран одну из надписей:
 * "Кот", "Тигр", "Лев", "Бык", "Корова", "Животное".
 * Замечание:
 * постарайся определять тип животного как можно более точно.
 */

public class ClassAnimal1 {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Lion()));
    }

    public static String getObjectType(Object o) {
        if (o instanceof Tiger)
            return "Тигр";
        else if (o instanceof Lion)
            return "Лев";
        else if (o instanceof Cat)
            return "Кот";
        else if (o instanceof Bull)
            return "Бык";
        else if (o instanceof Cow)
            return "Корова";
        else
            return "Животное";
    }

    public static class Animal{}
    public static class Cat extends Animal{}
    public static class Tiger extends Cat{}
    public static class Lion extends Cat{}
    public static class Bull extends Animal{}
    public static class Cow extends Animal{}

}
