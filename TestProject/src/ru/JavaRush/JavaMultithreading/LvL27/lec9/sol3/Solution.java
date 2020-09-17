package ru.JavaRush.JavaMultithreading.LvL27.lec9.sol3;

import java.util.concurrent.CountDownLatch;

/**
 * Дана стандартная реализация методологии wait-notify.
 * Почитай про CountDownLatch и перепиши тело метода someMethod используя поле latch.
 * Весь лишний код удали из класса.
 */

public class Solution {
    private volatile boolean isWaitingForValue = true;

    CountDownLatch latch = new CountDownLatch(1);

    public void someMethod() throws InterruptedException {
        latch.await();
        retrieveValue();
        latch.countDown();
    }

    void retrieveValue() {
        System.out.println("Value retrieved.");
    }

    public static void main(String[] args) {
        try {
            new Solution().someMethod();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
