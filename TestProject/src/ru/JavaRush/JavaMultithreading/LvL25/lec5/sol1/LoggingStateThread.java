package ru.JavaRush.JavaMultithreading.LvL25.lec5.sol1;

public class LoggingStateThread extends Thread {
    private Thread thread;

    public LoggingStateThread(Thread thread) {
        this.thread = thread;

    }

    @Override
    public void run() {
        State currentState = new Thread().getState();
        System.out.println(currentState);
        do {
            if (thread.getState() != currentState) {
                currentState = thread.getState();
                System.out.println(currentState);
            }
        } while (currentState != State.TERMINATED);
        interrupt();
    }
}

