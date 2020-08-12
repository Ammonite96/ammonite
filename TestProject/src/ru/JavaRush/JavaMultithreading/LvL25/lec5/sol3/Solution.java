package ru.JavaRush.JavaMultithreading.LvL25.lec5.sol3;

/**
 * 1. Создай private class MyUncaughtExceptionHandler,
 * который на перехват исключения должен подождать половину секунды, а затем вывести на экран secretKey, имя трэда и сообщение возникшего исключения.
 * Используй String.format(...).
 * <p>
 * Пример:
 * super secret key, Thread-0, it's an example
 * <p>
 * 2. Разберись в последовательности выполняемого кода и обеспечь логирование возникновения исключения в п.1.
 * 3. Метод main в тестировании не участвует.
 */

public class Solution {
    public static void main(String[] args) {
        MyThread myThread = new Solution().new MyThread("super secret key");
        myThread.start();
    }

    public class MyThread extends Thread {
        private String secretKey;

        public MyThread(String secretKey) {
            this.secretKey = secretKey;
            setUncaughtExceptionHandler(new MyUncaughtExceptionHandler());
            setDaemon(false);
        }

        @Override
        public void run() {
            throw new NullPointerException("it's an example");
        }

        private class MyUncaughtExceptionHandler implements UncaughtExceptionHandler {

            public MyUncaughtExceptionHandler() {
            }

            @Override
            public void uncaughtException(Thread t, Throwable e) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException interruptedException) {
                    interruptedException.printStackTrace();
                }

                String exception = String.format("%s, %s, %s", secretKey, t.getName(), e.getMessage());
                System.out.println(exception);
            }
        }
    }
}
