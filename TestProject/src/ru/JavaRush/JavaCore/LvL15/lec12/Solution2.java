package ru.JavaRush.JavaCore.LvL15.lec12;

/**
 * Найти логическую ошибку: утка(Duck) должна корректно реализовывать интерфейс CanMove.
 * Исправьте ошибку.
 * Результат вывода в консоль должен быть:
 * Flying
 * Moving
 */

public class Solution2 {
    public static void main(String[] args) {
        Duck duck = new Duck();
        Util.fly(duck);
        Util.move(duck);
    }

    public static class Duck implements CanFly, CanMove {
        @Override
        public void doAction() {
            System.out.println("Flying");
        }

        @Override
        public void doAnotherAction() {
            System.out.println("Moving");
        }
    }

    public static class Util {
        static void fly(CanFly animal) {
            animal.doAction();
        }

        static void move(CanMove animal) {
            animal.doAnotherAction();
        }
    }

    public static interface CanFly {
        void doAction();
    }

    public static interface CanMove {
        void doAnotherAction();
    }
}
