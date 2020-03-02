package ru.JavaRush.LvL9.lec2;

/**
 *Написать пять методов, которые вызывают друг друга.
 * Каждый метод должен возвращать имя метода, вызвавшего его, полученное с помощью StackTrace.
 */

public class ReturnMethodNameStackTrace {
    public static void main(String[] args) {
        method1();

    }

    public static String method1() {
        method2();
      //  System.out.println(Thread.currentThread().getStackTrace()[2].getMethodName());
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    public static String method2() {
        method3();
       // System.out.println(Thread.currentThread().getStackTrace()[2].getMethodName());
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    public static String method3() {
        method4();
       // System.out.println(Thread.currentThread().getStackTrace()[2].getMethodName());
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    public static String method4() {
        method5();
      //  System.out.println(Thread.currentThread().getStackTrace()[2].getMethodName());
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    public static String method5() {
        //напишите тут ваш код
        System.out.println(Thread.currentThread().getStackTrace()[6].getMethodName());
        System.out.println(Thread.currentThread().getStackTrace()[5].getMethodName());
        System.out.println(Thread.currentThread().getStackTrace()[4].getMethodName());
        System.out.println(Thread.currentThread().getStackTrace()[3].getMethodName());
        System.out.println(Thread.currentThread().getStackTrace()[2].getMethodName());
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        System.out.println(Thread.currentThread().getStackTrace()[0].getMethodName());
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }
}
