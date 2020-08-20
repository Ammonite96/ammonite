package ru.JavaRush.JavaMultithreading.LvL25.lec9.sol1;

/**
 * Все исключения, которые возникают в процессе работы нити Solution, должны быть обработаны одним из вариантов:
 * 1. Если это Error, то вывести в консоль "Нельзя дальше работать".
 * 2. Если это Exception, то вывести в консоль "Надо обработать".
 * 3. Если это Throwable, то вывести в консоль "Поживем - увидим".
 * Реализуй эту логику.
 */

public class Solution extends Thread {
    public Solution() {
        setUncaughtExceptionHandler(new MyException());
    }

    @Override
    public void run() {
        throw new StackOverflowError();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.start();
    }


    private class MyException implements UncaughtExceptionHandler {
        @Override
        public void uncaughtException(Thread t, Throwable e) {
            checkException(e);
        }

        private void checkException(Throwable e) {
            if (!(e instanceof Error)) {
                if (e instanceof Exception){
                    System.out.println("Надо обработать");
                }else if (e instanceof Throwable){
                    System.out.println("Поживем - увидим");
                }
            } else {
                System.out.println("Нельзя дальше работать");
            }
        }
    }
}
