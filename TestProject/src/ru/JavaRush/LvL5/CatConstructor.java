package ru.JavaRush.LvL5;

/**
 * Создать класс Cat (кот) с пятью конструкторами:
 * - Имя,
 * - Имя, вес, возраст
 * - Имя, возраст (вес стандартный)
 * - вес, цвет, (имя, адрес и возраст - неизвестные. Кот - бездомный)
 * - вес, цвет, адрес (чужой домашний кот)
 *
 * Задача конструктора - сделать объект валидным.
 * Например, если вес не известен, то нужно указать какой-нибудь средний вес.
 * Кот не может ничего не весить.
 * То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
 */

public class CatConstructor {

    String name;
    int weight;
    int age;
    String color;
    String address;

    public CatConstructor(String name) {
        this.name = name;
        this.weight = 4;
        this.age = 5;
        this.color = "Blue";
        this.address = null;
    }

    public CatConstructor(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "Black";
        this.address = null;
    }

    public CatConstructor(String name, int age) {
        this.name = name;
        this.weight = 5;
        this.age = age;
        this.color = "Grey";
        this.address = null;
    }

    public CatConstructor(int weight, String color) {
        this.name = null;
        this.weight = weight;
        this.age = 4;
        this.color = color;
        this.address = null;
    }

    public CatConstructor(int weight, String color, String address) {
        this.name = null;
        this.weight = weight;
        this.age = 6;
        this.color = color;
        this.address = address;
    }
}

/*
 public void initialize(String name) {
        this.name = name;
        this.weight = 4;
        this.age = 5;
        this.color = "Blue";
        this.address = null;
    }

    public void initialize(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "Black";
        this.address = null;
    }

    public void initialize(String name, int age) {
        this.name = name;
        this.weight = 5;
        this.age = age;
        this.color = "Grey";
        this.address = null;
    }

    public void initialize(int weight, String color) {
        this.name = null;
        this.weight = weight;
        this.age = 4;
        this.color = color;
        this.address = null;
    }

    public void initialize(int weight, String color, String address) {
        this.name = null;
        this.weight = weight;
        this.age = 6;
        this.color = color;
        this.address = address;
    }
 */