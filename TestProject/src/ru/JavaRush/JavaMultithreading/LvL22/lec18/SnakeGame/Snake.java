package ru.JavaRush.JavaMultithreading.LvL22.lec18.SnakeGame;

import java.util.ArrayList;
import java.util.List;

public class Snake {
    private List<SnakeSection> sections;
    private SnakeDirection direction;
    private boolean isAlive;

    public Snake(int x, int y) {
        SnakeSection snakeSection = new SnakeSection(x, y);
        sections = new ArrayList<>();
        sections.add(snakeSection);
        isAlive = true;
    }

    public void setDirection(SnakeDirection direction) {
        this.direction = direction;
    }

    public List<SnakeSection> getSections() {
        return sections;
    }

    public SnakeDirection getDirection() {
        return direction;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public int getX() {
        int coordX = sections.get(0).getX();
        return coordX;
    }

    public int getY() {
        int coordY = sections.get(0).getY();
        return coordY;
    }

    public void move() {
        if (!isAlive) {
            System.out.println("Game Over!");
            return;
        }

        switch (direction) {
            case UP:
                move(0, -1);
                break;
            case DOWN:
                move(0, 1);
                break;
            case LEFT:
                move(-1, 0);
                break;
            case RIGHT:
                move(1, 0);
        }
    }

    public void move(int dX, int dY) {
        SnakeSection snakeSection = new SnakeSection(sections.get(0).getX()+dX, sections.get(0).getY()+dY);
        checkBorders(snakeSection);
        checkBody(snakeSection);
        if (isAlive) {
            getSections().add(0, snakeSection);
            getSections().remove(sections.size() - 1);
        }

        if (snakeSection.getX() == Room.game.getMouse().getX()
                && snakeSection.getY() == Room.game.getMouse().getY()) {
            Room.game.eatMouse();
            getSections().add(0, snakeSection);
        }
    }

    public void checkBorders(SnakeSection head) {
        if (head.getX() >= Room.game.getHeight())
            isAlive = false;
        if (head.getY() >= Room.game.getWidth())
            isAlive = false;
        if (head.getY() < 0)
            isAlive = false;
        if (head.getX() < 0)
            isAlive = false;
    }

    public void checkBody(SnakeSection head) {
        if (sections.contains(head))
            isAlive = false;
    }
}
