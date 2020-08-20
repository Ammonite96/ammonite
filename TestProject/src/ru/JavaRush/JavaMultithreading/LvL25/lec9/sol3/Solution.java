package ru.JavaRush.JavaMultithreading.LvL25.lec9.sol3;

/**
 * В классе Solution реализуй интерфейс UncaughtExceptionHandler, который должен:
 * 1. прервать нить, которая бросила исключение.
 * 2. вывести в консоль стек исключений, начиная с самого вложенного.
 *
 * Пример исключения:
 * new Exception("ABC", new RuntimeException("DEF", new IllegalAccessException("GHI")))
 *
 * Пример вывода:
 * java.lang.IllegalAccessException: GHI
 * java.lang.RuntimeException: DEF
 * java.lang.Exception: ABC
 */

public class Solution implements Thread.UncaughtExceptionHandler {

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        Throwable throwable = e;
        if (throwable != null){
            uncaughtException(t, throwable.getCause());
            t.interrupt();
            System.out.println(throwable);
        }
    }

    public static void main(String[] args) {
        new Solution().uncaughtException(Thread.currentThread(), new Exception("ABC", new RuntimeException("DEF", new IllegalAccessException("GHI"))));
    }
}
