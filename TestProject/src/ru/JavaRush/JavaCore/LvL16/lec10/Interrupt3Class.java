package ru.JavaRush.JavaCore.LvL16.lec10;

/**
 * Разберись, как работает программа.
 * Сделай так, чтобы в методе ourInterruptMethod можно было сделать так, чтобы нить TestThread завершилась сама.
 * Нельзя использовать метод interrupt.
 */

public class Interrupt3Class {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new TestThread());
        t.start();
        Thread.sleep(3000);
        ourInterruptMethod();
    }
    private static boolean isClose = true;
    public static void ourInterruptMethod() {
        isClose = false;
    }

    public static class TestThread implements Runnable {
        public void run() {
            while (isClose) {
                try {
                    System.out.println("he-he");
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
            }
        }
    }
}
