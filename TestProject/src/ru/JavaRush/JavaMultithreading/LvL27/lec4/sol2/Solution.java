package ru.JavaRush.JavaMultithreading.LvL27.lec4.sol2;

/**
 * В методе secondMethod расставь synchronized блоки так, чтобы при использовании класса Solution нитями образовывался deadlock.
 */

public class Solution {
    private final Object lock = new Object();

    public synchronized void firstMethod() {
        synchronized (lock) {
            doSomething();
        }
    }

    public synchronized void secondMethod() {
        synchronized (lock) {
            synchronized (this) {
                doSomething();
            }
        }
    }

    private void doSomething() {
    }

    public static void main(String[] args) {

    }
}
