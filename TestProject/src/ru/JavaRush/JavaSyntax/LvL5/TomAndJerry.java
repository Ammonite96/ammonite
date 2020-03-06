package ru.JavaRush.LvL5;

/**
 * Создай классы Dog, Cat, Mouse.
 * Добавь по три поля в каждый класс, на твой выбор.
 * Создай объекты для героев мультика Том и Джерри.
 * Так много, как только вспомнишь.
 *
 * Пример:
 * Mouse jerryMouse = new Mouse("Jerry", 12 , 5),
 * где 12 - высота в см,
 * 5 - длина хвоста в см.
 */

public class TomAndJerry {

    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);
        Cat tomCat = new Cat("Tom", 20, 10);
        Dog dog = new Dog("Dog", 30, 15);
        //напишите тут ваш код
    }

    public static class Mouse {
        String name; // имя
        int height; // Рост
        int tail; // Длина хвоста

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    public static class Cat {
        String name; // имя
        int height; // Рост
        int tail; // Длина хвоста

        public Cat(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    public static class Dog{
        String name; // имя
        int height; // Рост
        int tail; // Длина хвоста

        public Dog(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }
    //напишите тут ваш код
}

