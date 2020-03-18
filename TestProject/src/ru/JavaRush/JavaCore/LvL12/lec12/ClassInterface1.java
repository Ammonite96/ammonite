package ru.JavaRush.JavaCore.LvL12.lec12;

/**
 * Есть интерфейсы CanFly(летать), CanSwim(плавать), CanRun(бегать).
 * Добавь эти интерфейсы классам Duck(утка), Penguin(пингвин), Toad(жаба)
 */

public class ClassInterface1 {
    public static void main(String[] args) {

    }
    public interface CanFly{
        public void fly();
    }

    public interface CanSwim{
        public void swim();
    }

    public interface CanRun{
        public void run();
    }

    public class Duck implements CanFly, CanSwim, CanRun {
        @Override
        public void fly() {

        }

        @Override
        public void swim () {

        }

        @Override
        public void run() {

        }
    }
    public class Penguin implements CanSwim, CanRun {
        @Override
        public void swim() {

        }

        @Override
        public void run() {

        }
    }
    public class Toad implements CanSwim {
        @Override
        public void swim() {

        }
    }
}
