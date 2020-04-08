package ru.JavaRush.JavaCore.LvL16.lec13;

/**
 * Разберись, как работает программа.
 * По образу и подобию CountdownRunnable создай нить CountUpRunnable, которая выводит значения в нормальном порядке - от 1 до number.
 */

public class Thread5MainClass {
    public static int number = 5;

    public static void main(String[] args) {
        new Thread(new CountdownRunnable(), "Уменьшаем").start();
        new Thread(new CountUpRunnable(), "Увеличиваем").start();
    }

    public static class CountUpRunnable implements Runnable {
        //Add your code here - добавь код тут
        private int countIndexUp;

        @Override
        public void run() {
            try {
                while (true){
                    System.out.println(toString());
                    countIndexUp++;
                    Thread.sleep(500);
                    if (countIndexUp == number)
                        return;

                }
            } catch (InterruptedException ie){}
        }
        public String toString() {
            return Thread.currentThread().getName() + ": " + (countIndexUp+1);
        }
    }


    public static class CountdownRunnable implements Runnable {
        private int countIndexDown = Thread5MainClass.number;

        public void run() {
            try {
                while (true) {
                    System.out.println(toString());
                    countIndexDown -= 1;
                    if (countIndexDown == 0) return;
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
            }
        }

        public String toString() {
            return Thread.currentThread().getName() + ": " + countIndexDown;
        }
    }
}
