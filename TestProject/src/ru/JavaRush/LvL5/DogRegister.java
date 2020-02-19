package ru.JavaRush.LvL5;

/**
 * Создать класс Dog (собака) с тремя конструкторами:
 * - Имя
 * - Имя, рост
 * - Имя, рост, цвет
 */

public class DogRegister {

    String name;
    int height;
    String color;

    public DogRegister(String name){
        this.name = name;
    }

    public DogRegister(String name, int height){
        this.name = name;
        this.height = height;
    }

    public DogRegister(String name, int height, String color){
        this.name = name;
        this.height = height;
        this.color = color;
    }
}
