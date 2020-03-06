package ru.JavaRush.LvL5;

/**
 * Создать класс Friend (друг) с тремя конструкторами:
 * - Имя
 * - Имя, возраст
 * - Имя, возраст, пол
 */

public class Friend0509 {
    String name;
    int age;
    char sex;

    public Friend0509(String name){
        this.name = name;
    }

    public Friend0509(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Friend0509(String name, int age, char sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
}
