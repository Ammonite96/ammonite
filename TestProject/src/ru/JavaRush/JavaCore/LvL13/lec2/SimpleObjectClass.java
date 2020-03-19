package ru.JavaRush.JavaCore.LvL13.lec2;

/**
 * В классе StringObject реализуй интерфейс SimpleObject с параметром типа String.
 */

public class SimpleObjectClass {
    public static void main(String[] args) throws Exception {
    }

    interface SimpleObject<T> {
        SimpleObject<T> getInstance();
    }

    class StringObject implements SimpleObject <String>{
        @Override
        public SimpleObject <String> getInstance() {
            return null;
        }
    }
}
