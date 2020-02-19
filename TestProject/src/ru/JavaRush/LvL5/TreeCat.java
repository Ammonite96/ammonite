package ru.JavaRush.LvL5;
// И вообще должно быть два разных класса

public class TreeCat {
    public static void main(String[] args) {
        Cat cat = new Cat("Вася", 2, 4, 30);
        Cat cat1 = new Cat("Марсик", 10, 5, 10);
        Cat cat2 = new Cat("Оскар", 1, 3, 20);

        System.out.println(cat.age);
        System.out.println(cat1.name);
        System.out.println(cat2.strength);
    }

    public static class Cat {
        /*private*/ String name;
        /*private*/ int age;
        /*private*/ int weight;
        /*private*/ int strength;

        Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}


