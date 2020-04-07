package ru.JavaRush.JavaCore.LvL16;

public class MainClassInterrupt implements Runnable {
    public void run() {
        Thread current = Thread.currentThread();

        while (!current.isInterrupted()) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Tik");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MainClassInterrupt clock = new MainClassInterrupt();
        Thread clockThread = new Thread(clock);
        clockThread.start();

        Thread.sleep(10000);
        clockThread.interrupt();
    }
}
