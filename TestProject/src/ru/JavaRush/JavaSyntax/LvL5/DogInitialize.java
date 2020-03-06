package ru.JavaRush.LvL5;

/**
 * Создать класс Dog (собака) с тремя инициализаторами:
 * - Имя
 * - Имя, рост
 * - Имя, рост, цвет
 */

public class DogInitialize {

    String name; // Имя
    int height; // Рост
    String color; // цвет



    public void initialize(String name){
        this.name = name;
    }

    public void initialize(String name, int height){
        this.name =name;
        this.height = height;
    }

    public void initialize(String name, int height, String color){
        this.name = name;
        this.height = height;
        this.color = color;
    }

    DogInitialize dogInitialize = new DogInitialize();


}
