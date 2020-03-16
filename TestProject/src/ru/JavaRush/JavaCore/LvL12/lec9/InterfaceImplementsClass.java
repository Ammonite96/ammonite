package ru.JavaRush.JavaCore.LvL12.lec9;

/**
 * Есть public интерфейсы CanFly(летать), CanRun(бежать/ездить), CanSwim(плавать).
 * Добавь эти интерфейсы классам Human(человек), Duck(утка), Penguin(пингвин), Airplane(самолет).
 */

public class InterfaceImplementsClass {
    public static void main(String[] args) {

    }

    public interface CanFly {
        public void fly();
    }

    public interface CanRun {
        public void run();
    }

    public interface CanSwim {
        public void swim();
    }


    public class Human implements CanRun, CanSwim {

        @Override
        public void run() {

        }

        @Override
        public void swim() {

        }
    }

    public class Duck implements CanFly, CanRun, CanSwim {

        @Override
        public void fly() {

        }

        @Override
        public void run() {

        }

        @Override
        public void swim() {

        }
    }

    public class Penguin implements CanSwim, CanRun {

        @Override
        public void run() {

        }

        @Override
        public void swim() {

        }
    }

    public class Airplane implements CanFly, CanRun {

        @Override
        public void fly() {

        }

        @Override
        public void run() {

        }
    }
}
