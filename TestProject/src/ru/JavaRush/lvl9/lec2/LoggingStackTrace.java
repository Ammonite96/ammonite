package ru.JavaRush.lvl9.lec2;


/**
 * Реализовать метод log.
 * Он должен выводить на экран имя класса и имя метода (в котором вызывается метод log), а также переданное сообщение.
 * Имя класса, имя метода и сообщение разделить двоеточием с пробелом.
 *
 * Пример вывода:
 * com.javarush.task.task09.task0906.Solution: main: In main method
 */

public class LoggingStackTrace {
    public static void main(String[] args) {
        log("In main method");
    }

    public static void log(String s) {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        String nameClass = stackTraceElements[2].getClassName();
        String nameMethod = stackTraceElements[2].getMethodName();
        System.out.println(nameClass + ": " + nameMethod+": " + s);
    }
}
