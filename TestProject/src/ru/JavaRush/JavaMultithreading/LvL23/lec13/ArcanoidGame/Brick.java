package ru.JavaRush.JavaMultithreading.LvL23.lec13.ArcanoidGame;

public class Brick extends BaseObject {
    public Brick(double x, double y, double radius) {
        super(x, y, radius);
    }

    public Brick(double x, double y) {
        super(x, y, 3);
    }

    //картинка для отрисовки
    private static int[][] matrix = {
            {0, 0, 0, 0, 0},
            {0, 1, 1, 1, 0},
            {0, 1, 1, 1, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
    };

    @Override
    public void draw(Canvas canvas) {
        canvas.drawMatrix(x - radius + 1, y, matrix, 'H');  //  рисуем
    }

    @Override
    public void move() {

    }
}
