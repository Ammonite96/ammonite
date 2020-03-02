package ru.JavaRush.lvl9.lec8;

import java.util.logging.SocketHandler;

/**
 * 1. Есть три исключения последовательно унаследованные от Exception:
 * 2. class Exception1 extends Exception
 * 3. class Exception2 extends Exception1
 * 4. class Exception3 extends Exception2
 * 5. Есть метод, который описан так:
 * public static void method1() throws Exception1, Exception2, Exception3
 * 6. Напиши catch, который перехватит все три Exception1, Exception2 и Exception3
 */

public class InterceptionGroupException {
    public static void main(String[] args) throws Exception {

        try {
            method1();
        } catch (Exception3 e3) {
            System.out.println("Exception1");
        } catch (Exception2 e2) {
            System.out.println("Exception2");
        } catch (Exception1 e){
            System.out.println("Exception1");
        }

    }

    public static void method1() throws Exception1, Exception2, Exception3 {
        int i = (int) (Math.random() * 3);
        if (i == 0) {
            throw new Exception1();
        } else if (i == 1) {
            throw new Exception2();
        } else if (i == 2) {
            throw new Exception3();
        }
    }
}

class Exception1 extends Exception {
}

class Exception2 extends Exception1 {
}

class Exception3 extends Exception2 {
}

