package ru.JavaRush.JavaMultithreading.LvL26.lec10.sol3;

import org.w3c.dom.ls.LSOutput;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Почитать про java.util.concurrent.locks.Lock на http://docs.oracle.com/ (там все есть в джавадоках!)
 * Написать реализацию метода someMethod():
 * 1. попытаться захватить лок
 * 1.1. если лок занят, то вызвать метод actionIfLockIsBusy()
 * 1.2. если лок свободен, то:
 * 1.2.1 вызвать метод actionIfLockIsFree()
 * 1.2.2 отпустить лок при любых условиях, даже если actionIfLockIsFree() будет кидать исключение
 */

public class Solution {
    private Lock lock = new ReentrantLock();

    public void someMethod() {
        // Implement the logic here. Use the lock field
        if (lock.tryLock()) {
            try {
                actionIfLockIsFree();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        } else {
            actionIfLockIsBusy();
        }
    }

    public void actionIfLockIsFree() {
    }

    public void actionIfLockIsBusy() {
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread("Thread1");
        Thread thread2 = new Thread("Thread2");

        try {
            Thread.sleep(300);
            thread1.start();
            thread2.start();
            new Solution().someMethod();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
