package ru.JavaRush.JavaMultithreading.LvL27.lec9.sol2;

public class Person implements Runnable {
    private final Mail mail;

    public Person(Mail mail) {
        this.mail = mail;
    }

    @Override
    public void run() {
        synchronized (mail) {
            try {
                String name = Thread.currentThread().getName();
                Thread.sleep(1000);
                mail.setText("Person [" + name + "] wrote an email 'AAA'");
                mail.notifyAll();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
