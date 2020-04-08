package ru.JavaRush.JavaCore.LvL16.lec10;

/**
 * Создай нить TestThread.
 * В методе main создай экземпляр нити, запусти, а потом прерви ее используя метод interrupt().
 */

public class Interrupt2Class {
    public static void main(String[] args) throws InterruptedException {
        //Add your code here - добавь код тут
        TestThread testThread = new TestThread();
        testThread.start();
        testThread.interrupt();
    }

    //Add your code below - добавь код ниже
    public static class TestThread extends Thread {
        @Override
        public void run() {
        }
    }
}

