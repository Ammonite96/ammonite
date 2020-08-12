package ru.JavaRush.JavaMultithreading.LvL25.lec5.sol2;

/**
 * Обработай список нитей в зависимости от состояния:
 * 1. Если нить еще не запущена, то запусти ее.
 * 2. Если нить в ожидании, то прерви ее.
 * 3. Если нить работает, то проверь маркер isInterrupted.
 * 4. Если нить прекратила работу, то выведи в консоль ее приоритет.
 * Используй switch.
 */

public class Solution {
    public static void processThreads(Thread... threads) {
        //implement this method - реализуйте этот метод
        for (Thread thread : threads) {
            switch (thread.getState()) {
                case NEW:
                    thread.start();
                    break;
                case WAITING:
                case BLOCKED:
                case TIMED_WAITING:
                    thread.interrupt();
                    break;
                case RUNNABLE:
                    thread.isInterrupted();
                    break;
                case TERMINATED:
                    System.out.println(thread.getPriority());
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + thread);
            }
        }
    }

    public static void main(String[] args) {
    }
}
