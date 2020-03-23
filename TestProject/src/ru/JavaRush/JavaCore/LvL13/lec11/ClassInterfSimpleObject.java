package ru.JavaRush.JavaCore.LvL13.lec11;

/**
 * 1. Создай класс StringObject.
 * 2. В классе StringObject реализуй интерфейс SimpleObject с параметром типа String.
 * 3. Программа должна компилироваться.
 */

public class ClassInterfSimpleObject {
    public static void main(String[] args) throws Exception {
        SimpleObject<String> stringObject = new StringObject();
    }

    interface SimpleObject<T> {
        SimpleObject<T> getInstance();
    }

    static class StringObject implements SimpleObject<String>{

        @Override
        public SimpleObject<String> getInstance() {
            return this;
        }
    }
}
