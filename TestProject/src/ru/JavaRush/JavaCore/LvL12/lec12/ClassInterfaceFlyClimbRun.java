package ru.JavaRush.JavaCore.LvL12.lec12;

/**
 * 1. Внутри класса Solution создай интерфейс public interface CanFly(летать) с методом void fly().
 * 2. Внутри класса Solution создай интерфейс public interface CanClimb(лазить по деревьям) с методом void climb().
 * 3. Внутри класса Solution создай интерфейс public interface CanRun(бегать) с методом void run().
 * 4. Подумай логически, какие именно интерфейсы нужно добавить для каждого класса.
 * 5. Добавь интерфейсы классам Cat(кот), Dog(собака), Tiger(тигр), Duck(Утка).
 */

public class ClassInterfaceFlyClimbRun {
    public static void main(String[] args) {

    }
    public interface CanFly{
        public void fly();
    }

    public interface CanClimb{
        public void climb();
    }

    public interface CanRun{
        public void run();
    }

    public static class Cat implements CanRun, CanClimb {

        @Override
        public void climb() {

        }

        @Override
        public void run() {

        }
    }

    public static class Dog implements CanRun {
        @Override
        public void run() {

        }
    }
    public static class Tiger extends Cat {

    }
    public static class Duck implements CanFly, CanRun {
        @Override
        public void fly() {

        }

        @Override
        public void run() {

        }
    }
}
