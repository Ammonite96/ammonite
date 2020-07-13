package ru.JavaRush.JavaMultithreading.LvL22.lec18.SnakeGame;

import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class Room {
    public static Room game;

    private int width;
    private int height;
    private Snake snake;
    private Mouse mouse;

    public Room(int width, int height, Snake snake) {
        this.width = width;
        this.height = height;
        this.snake = snake;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Snake getSnake() {
        return snake;
    }

    public void setSnake(Snake snake) {
        this.snake = snake;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    /**
     * Основной цикл программы.
     * Тут происходят все важные действия
     */
    public void run() {
        //Создаем объект "наблюдатель за клавиатурой" и стартуем его.
        KeyboardObserver keyboardObserver = new KeyboardObserver();
        keyboardObserver.start();

        //пока змея жива
        while (snake.isAlive()) {
            //"наблюдатель" содержит события о нажатии клавиш?
            if (keyboardObserver.hasKeyEvents()) {
                KeyEvent event = keyboardObserver.getEventFromTop();
                //Если равно символу 'q' - выйти из игры.
                if (event.getKeyChar() == 'q') return;

                //Если "стрелка влево" - сдвинуть фигурку влево
                if (event.getKeyCode() == KeyEvent.VK_LEFT)
                    snake.setDirection(SnakeDirection.LEFT);
                    //Если "стрелка вправо" - сдвинуть фигурку вправо
                else if (event.getKeyCode() == KeyEvent.VK_RIGHT)
                    snake.setDirection(SnakeDirection.RIGHT);
                    //Если "стрелка вверх" - сдвинуть фигурку вверх
                else if (event.getKeyCode() == KeyEvent.VK_UP)
                    snake.setDirection(SnakeDirection.UP);
                    //Если "стрелка вниз" - сдвинуть фигурку вниз
                else if (event.getKeyCode() == KeyEvent.VK_DOWN)
                    snake.setDirection(SnakeDirection.DOWN);
            }

            snake.move();   //двигаем змею
            print();        //отображаем текущее состояние игры
            sleep();        //пауза между ходами
        }

        System.out.println("Game Over!");
    }

    public void sleep() {
        try {
            if (snake.getSections().size() < 11) {
                Thread.sleep(500);
            }
            if (snake.getSections().size() > 10 && snake.getSections().size() < 15) {
                Thread.sleep(300);
            }
            if (snake.getSections().size() > 15) {
                Thread.sleep(200);
            }
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }

    public void print() {
        //Создаем массив, куда будем "рисовать" текущее состояние игры
        int[][] matrix = new int[height][width];

        //Рисуем все кусочки змеи
        ArrayList<SnakeSection> sections = new ArrayList<>(snake.getSections());
        for (SnakeSection snakeSection : sections) {
            matrix[snakeSection.getY()][snakeSection.getX()] = 1;
        }

        //Рисуем голову змеи (4 - если змея мертвая)
        matrix[snake.getY()][snake.getX()] = snake.isAlive() ? 2 : 4;

        //Рисуем мышь
        matrix[mouse.getY()][mouse.getX()] = 3;

        //Выводим все это на экран
        String[] symbols = {" . ", " x ", " X ", "^_^", "RIP"};
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                System.out.print(symbols[matrix[y][x]]);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println();
    }

    public void createMouse() {
        int randomX = (int) (Math.random() * width);
        int randomY = (int) (Math.random() * height);
        mouse = new Mouse(randomX, randomY);
    }

    public void eatMouse() {
        createMouse();
    }

    public static void main(String[] args) {
        Snake snake = new Snake(10, 10);
        game = new Room(20, 20, snake);
        snake.setDirection(SnakeDirection.DOWN);
        game.createMouse();
        game.run();
    }
}
