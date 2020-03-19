package ru.JavaRush.JavaCore.LvL13.lec2;

/**
 * Исправь 4 ошибки в программе, чтобы она компилировалась.
 */

public class FourException {
    public static void main(String[] args) {

        System.out.println(Dream.HOBBY.toString());
        System.out.println(new Hobby().toString());

    }

    interface Desire {
    }

    interface Dream {
        public Hobby HOBBY = new Hobby();
    }

   public static class Hobby implements Desire, Dream {
        static int INDEX = 1;

        @Override
        public String toString() {
            INDEX++;
            return "" + INDEX;
        }
    }
}
