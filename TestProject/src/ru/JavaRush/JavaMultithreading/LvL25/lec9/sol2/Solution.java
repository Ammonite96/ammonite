package ru.JavaRush.JavaMultithreading.LvL25.lec9.sol2;

import java.util.TimerTask;

/**
 * Создай свой UncaughtExceptionHandler в виде локального класса внутри конструктора.
 * UncaughtExceptionHandler должен маскировать звездочками имя трэда и выводить в консоль описание возникшей ошибки.
 * "Thread-0" должно быть заменено на "********".
 * "Thread-4321" должно быть заменено на "***********".
 */

public class Solution extends TimerTask {
    protected TimerTask original;
    protected final Thread.UncaughtExceptionHandler handler;

    public Solution(TimerTask original) {
        if (original == null) {
            throw new NullPointerException();
        }
        this.original = original;
        this.handler = new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                String exceptionNameStar = t.getName().replaceAll(".", "*");
                String exception = String.format("%s", e.getMessage().replaceAll(t.getName(), exceptionNameStar));
                System.out.println(exception);
            }
        };    //init handler here

    }

    public void run() {
        try {
            original.run();
        } catch (Throwable cause) {
            Thread currentThread = Thread.currentThread();
            handler.uncaughtException(currentThread, new Exception("Blah " + currentThread.getName() + " blah-blah-blah", cause));
        }
    }

    public long scheduledExecutionTime() {
        return original.scheduledExecutionTime();
    }

    public boolean cancel() {
        return original.cancel();
    }

    public static void main(String[] args) {
        Solution solution = new Solution(new TimerTask() {
            @Override
            public void run() {
                throw new ArithmeticException();
            }
        });
        solution.run();
    }
}

// "[A-Za-z\\D\\d]"