package ru.JavaRush.JavaCore.LvL13.lec2;

/**
 * 1. Подумать, что в программе неправильно.
 * 2. Вынести реализацию метода initializeIdAndName в класс User.
 * 3. initializeIdAndName в классе User должен возвращать тип User.
 * 4. Поправить программу, чтобы компилировалась и работала.
 */

public class BagClass {
    public static void main(String[] args) throws Exception {
        System.out.println(Matrix.NEO);
        System.out.println(Matrix.TRINITY);
    }

    static class Matrix {
        public static DBObject NEO = new User().initializeIdAndName(1, "Neo");
        public static DBObject TRINITY = new User().initializeIdAndName(2, "Trinity");
    }

    interface DBObject {
        DBObject initializeIdAndName(long id, String name);
    }

    static class User implements DBObject {
        long id;
        String name;

        @Override
        public String toString() {
            return String.format("The user's name is %s, id = %d", name, id);
        }

        @Override
        public User initializeIdAndName(long id, String name) {
            this.id = id;
            this.name = name;
            return this;
        }
    }
}
