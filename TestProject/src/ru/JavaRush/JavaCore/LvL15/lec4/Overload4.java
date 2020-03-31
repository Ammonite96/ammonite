package ru.JavaRush.JavaCore.LvL15.lec4;

/**
 * 1. Изменить метод printName так, чтобы он выполнялся для man и woman.
 * 2. Реализация метода printName должна быть одна.
 */

public class Overload4 {
    public static void main(String[] args) {
        Man man = new Man();
        Woman woman = new Woman();

        printName(man);
        printName(woman);
    }

    public static void printName(Human human) {

    }

    public static class Human {

    }

    public static class Man extends Human {

    }

    public static class Woman extends Human {

    }
}
