package ru.JavaRush.LvL5;

/**
 * Разберись, что делает программа.
 * Исправь конструктор с двумя параметрами так, чтобы он вызывал другой конструктор с радиусом 10.
 * Подумай, какой конструктор нужно вызвать.
 * Подсказка:
 * внимательно изучи реализацию конструктора по умолчанию.
 */

public class CircleFromAConstructor {


    public double x;
    public double y;
    public double radius;

    public CircleFromAConstructor(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public CircleFromAConstructor(double x, double y) {
        this(x, y, 10);
    }

    public CircleFromAConstructor() {
        this(5, 5, 1);
    }

    public static void main(String[] args) {

        CircleFromAConstructor circle = new CircleFromAConstructor();
        System.out.println(circle.x + " " + circle.y + " " + circle.radius);

        CircleFromAConstructor anotherCircle = new CircleFromAConstructor(10, 5);
        System.out.println(anotherCircle.x + " " + anotherCircle.y + " " + anotherCircle.radius);
    }
}

