package ru.JavaRush.JavaMultithreading.LvL26.lec10.sol2;

import java.util.concurrent.ConcurrentHashMap;

public class Producer implements Runnable {
    private ConcurrentHashMap<String, String> map;

    public Producer(ConcurrentHashMap<String, String> map) {
        this.map = map;
    }

    @Override
    public void run() {
        try {
            int i = 1;
            while (true) {
                map.put(String.valueOf(i++), "Some text for " + (i-1));
                Thread.sleep(500);
            }

        } catch (InterruptedException ie) {
            System.out.println(String.format("[%s] thread was terminated", Thread.currentThread().getName()));
        }
    }
}
