package ru.JavaRush.JavaCore.LvL13.lec2;

/**
 * Создай класс Screen и реализуй в нем интерфейсы Selectable и Updatable.
 * Не забудь реализовать методы!
 */

public class ScreenClass {
    public static void main(String[] args) throws Exception {
    }

    interface Selectable {
        void onSelect();
    }

    interface Updatable {
        void refresh();
    }

    public class Screen implements Selectable, Updatable{

        @Override
        public void onSelect() {

        }

        @Override
        public void refresh() {

        }
    }
}
