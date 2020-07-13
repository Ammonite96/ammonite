package ru.JavaRush.JavaMultithreading.LvL22.lec18.SnakeGame;

public class ClassTest {
    public static ClassTest game;

    private int width;
    private int height;
    private Snake snake;
    private Mouse mouse;

    public ClassTest(int width, int height, Snake snake) {
        this.width = width;
        this.height = height;
        this.snake = snake;
    }

    public void print() {
        //Создаем массив, куда будем "рисовать" текущее состояние игры
        //Рисуем все кусочки змеи
        //Рисуем мышь
        //Выводим все это на экран
        int[][] field = new int[width][height];
        for (int i = 0; i < snake.getSections().size(); i++) {
            if (i == 0)
                field[snake.getX()][snake.getY()] = 2;
            else
                field[snake.getSections().get(i).getX()][snake.getSections().get(i).getY()] = 1;
        }

        field[mouse.getX()][mouse.getY()] = 3;

        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                if (field[y][x] == 2)
                    System.out.print("X");
                if (field[y][x] == 1)
                    System.out.print("x");
                if (field[y][x] == 3)
                    System.out.print("^");
                if (field[y][x] == 0)
                    System.out.print("l");
            }
            System.out.println();
        }
    }

    public void createMouse() {
        int randomX = (int) (Math.random() * width);
        int randomY = (int) (Math.random() * height);
        mouse = new Mouse(randomX, randomY);
    }
    public static void main(String[] args) {
        Snake snake = new Snake(10, 10);
        game = new ClassTest(20, 20, snake);
        snake.setDirection(SnakeDirection.DOWN);
        game.createMouse();
        game.print();
        //game.run();
    }
}
