package ru.JavaRush.JavaCore.LvL13.lec11;

/**
 * Реализовать интерфейс Updatable в классе Screen.
 */

public class ClassInterfaceUpdatable {
    public static void main(String[] args) throws Exception {
    }

    interface Selectable {
        void onSelect();
    }

    interface Updatable extends Selectable {
        void refresh();
    }

    class Screen implements Updatable {

        @Override
        public void onSelect() {

        }

        @Override
        public void refresh() {

        }
    }
}
