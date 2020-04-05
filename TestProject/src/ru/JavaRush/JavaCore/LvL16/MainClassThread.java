package ru.JavaRush.JavaCore.LvL16;

public class MainClassThread {
    public static void main(String[] args) throws InterruptedException {
        Printer printer = new Printer();
        Thread thread = new Thread(printer);
        thread.start();
        thread.sleep(5000);
        System.out.println("Printer started");
        System.out.println("Main thread finished");
    }
}

class Printer implements Runnable{

    @Override
    public void run() {
        System.out.println("i`m printer");
        System.out.println("Printer thread finished");
    }
}
