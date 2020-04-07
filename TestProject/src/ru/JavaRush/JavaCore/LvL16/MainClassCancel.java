package ru.JavaRush.JavaCore.LvL16;

public class MainClassCancel implements Runnable {
    private boolean isCancel = false;

    public void cancel() {
        this.isCancel = true;
    }

    public void run() {
        while (!isCancel) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Tik");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MainClassCancel clock = new MainClassCancel();
        Thread clockThread = new Thread(clock);
        clockThread.start();

        Thread.sleep(6000);
        clock.cancel();
    }
}
