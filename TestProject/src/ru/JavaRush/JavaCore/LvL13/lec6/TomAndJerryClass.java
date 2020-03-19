package ru.JavaRush.JavaCore.LvL13.lec6;

/**
 * 1. Создай классы Dog, Cat и Mouse.
 * 2. Реализуй интерфейсы в добавленных классах, учитывая что:
 * - Кот(Cat) может передвигаться, может кого-то съесть и может быть сам съеден.
 * - Мышь(Mouse) может передвигаться и может быть съедена.
 * - Собака(Dog) может передвигаться и съесть кого-то.
 */

public class TomAndJerryClass {
    public static void main(String[] args) {

    }

    //может двигаться
    public interface Movable {
        void move();
    }

    //может быть съеден
    public interface Edible {
        void beEaten();
    }

    //может кого-нибудь съесть
    public interface Eat {
        void eat();
    }

    class Dog implements Movable, Eat{
        @Override
        public void move() {

        }

        @Override
        public void eat() {

        }
    }
    class Cat implements Movable, Eat, Edible{
        @Override
        public void move() {

        }

        @Override
        public void beEaten() {

        }

        @Override
        public void eat() {

        }
    }
    class Mouse implements Movable, Edible{
        @Override
        public void move() {

        }

        @Override
        public void beEaten() {

        }
    }
}
