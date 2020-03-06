package ru.JavaRush.LvL5;

/**
 * Изучи класс Circle. Напиши максимальное количество конструкторов с разными аргументами.
 *
 * Подсказка:
 * не забудь про конструктор по умолчанию.
 */

public class CircleConstructor1 {

    public double x;
    public double y;
    public double radius;

    public CircleConstructor1() {
    }

    public CircleConstructor1(double x) {
        this.x = x;
    }

    public CircleConstructor1(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public CircleConstructor1(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public CircleConstructor1(CircleConstructor1 circleConstructor1) {
    }
}
