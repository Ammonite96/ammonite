package ru.JavaRush.LvL5;

/**
 * Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (верхняя координата, левая, ширина и высота).
 * Создать для него как можно больше методов initialize(...)
 *
 * Примеры:
 * - заданы 4 параметра: left, top, width, height
 * - ширина/высота не задана (оба равны 0)
 * - высота не задана (равно ширине) создаём квадрат
 * - создаём копию другого прямоугольника (он и передаётся в параметрах)
 */

public class RectangleInitialize {

    int top; //верхняя координата
    int left; //левая координата
    int width; //ширина
    int height; //высота

    public void initialize(int top, int left, int width, int height){
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }

    public void initialize(int top, int left){
        this.top = top;
        this.left = left;
    }

    public void initialize(int top, int left, int width){
        this.top = top;
        this.left = left;
        this.width = width;

    }

    public void initialize(RectangleInitialize rectangleInitialize){

    }
}
