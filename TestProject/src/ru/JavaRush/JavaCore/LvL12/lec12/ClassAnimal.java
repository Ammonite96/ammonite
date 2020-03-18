package ru.JavaRush.JavaCore.LvL12.lec12;

/**
 * Напиши метод, который определяет, какой объект передали в него.
 * Программа должна выводить на экран одну из надписей:
 * "Кот", "Тигр", "Лев", "Бык", "Животное".
 */

public class ClassAnimal {
    public static void main(String[] args) {
        //Cat cat = new Cat();
        //Tiger tiger = new Tiger();
        //Lion lion = new Lion();
        //Bull bull = new Bull();
        //Pig pig = new Pig();
        System.out.println(getObjectType(new Cat()));
    }

    public static String getObjectType (Object o){
        if (o instanceof Cat)
            return "Кот";
        else if (o instanceof Tiger)
            return "Тигр";
        else if (o instanceof Lion)
            return "Лев";
        else if (o instanceof Bull)
            return "Бык";
        else
            return "Животное";
    }

    public static class Cat{}
    public static class Tiger{}
    public static class Lion{}
    public static class Bull{}
    public static class Pig{}
}
