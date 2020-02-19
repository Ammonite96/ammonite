package ru.JavaRush.LvL5;

/**
 * Создать класс (Circle) круг, с тремя конструкторами:
 * - centerX, centerY, radius
 * - centerX, centerY, radius, width
 * - centerX, centerY, radius, width, color
 */

public class CircleConstructor {

    int centerX;
    int centerY;
    int radius;
    int width;
    int color;

    public CircleConstructor(int centerX, int centerY, int radius) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }

    public CircleConstructor(int centerX, int centerY, int radius, int width) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
    }

    public CircleConstructor(int centerX, int centerY, int radius, int width, int color) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
        this.color = color;
    }
}
