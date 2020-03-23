package ru.JavaRush.JavaCore.LvL13.lec11;

/**
 * Удали все некорректные строки в интерфейсе Button.
 */

public class ClassSolution1 {
    public static void main(String[] args) throws Exception {
        System.out.println(SimpleObject.NAME);
        System.out.println(Button.NAME);
    }

    interface SimpleObject {
        String NAME = "SimpleObject";

        void onPress();
    }

    interface Button extends SimpleObject {

        final String NAME = "Submit";

        String onPress(Object o);



    }
}
