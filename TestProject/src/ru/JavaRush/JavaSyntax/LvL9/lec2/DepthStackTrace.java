package ru.JavaRush.LvL9.lec2;

/**
 * Написать метод, который возвращает результат - глубину его стек-трейса - количество методов в нем (количество элементов в списке).
 * Это же число метод должен выводить на экран.
 */

public class DepthStackTrace {
    public static void main(String[] args) {
        int deep = getStackTraceDepth();

    }

    public static int getStackTraceDepth() {
        //напишите тут ваш код
        int stackTraceElements =Thread.currentThread().getStackTrace().length;
        System.out.println(stackTraceElements);
        return stackTraceElements;
    }
}
