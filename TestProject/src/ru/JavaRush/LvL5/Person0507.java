package ru.JavaRush.LvL5;

/**
 * Создать class Person. У человека должно быть имя String name, возраст int age.
 * Добавь метод initialize(String name, int age), в котором проинициализируй переменные name и age.
 * В методе main создай объект Person, занеси его ссылку в переменную person.
 * Вызови метод initialize с любыми значениями
 */

public class Person0507 {
    String name;
    int age;

    public void initialize(String name, int age){
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {

        Person0507 person0507 = new Person0507();
        person0507.initialize("Vasia", 25);
    }
}
