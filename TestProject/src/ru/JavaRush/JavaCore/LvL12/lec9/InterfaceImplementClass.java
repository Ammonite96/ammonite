package ru.JavaRush.JavaCore.LvL12.lec9;

/**
 * Есть public интерфейсы CanFly(летать), CanMove(передвигаться), CanEat(есть).
 * Добавь эти интерфейсы классам Dog(собака), Car(автомобиль), Duck(утка), Airplane(самолет).
 */

public class InterfaceImplementClass {
    public static void main(String[] args) {

    }

    public interface CanFly {
        public void fly();
    }

    public interface CanMove {
        public void move();
    }

    public interface CanEat {
        public void eat();
    }

    public class Dog implements CanEat, CanMove {
        @Override
        public void eat() {

        }

        @Override
        public void move() {

        }
    }

    public class Duck implements CanEat, CanMove, CanFly {
        @Override
        public void fly() {

        }

        @Override
        public void move() {

        }

        @Override
        public void eat() {

        }
    }

    public class Car implements CanMove {
        @Override
        public void move() {

        }
    }

    public class Airplane implements CanFly, CanMove {
        @Override
        public void fly() {

        }

        @Override
        public void move() {

        }
    }
}
