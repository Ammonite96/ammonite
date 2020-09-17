package ru.JavaRush.JavaMultithreading.LvL27.lec9.sol2;

public class MailServer implements Runnable {
    private Mail mail;

    public MailServer(Mail mail) {
        this.mail = mail;
    }

    @Override
    public void run() {
        long startTime = System.currentTimeMillis();
        synchronized (mail) {
            try {
                mail.wait();
                String name = Thread.currentThread().getName();
                long endTime = System.currentTimeMillis();
                System.out.format("%s MailServer received: [%s] in %d ms after start", name, mail.getText(), (endTime - startTime));
                mail.notifyAll();
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }
    }
}
