package ru.JavaRush.JavaCore.LvL12.lec12;

/**
 * Добавь такой класс-родитель к классу CTO(технический директор), чтобы класс перестал быть абстрактным.
 * Добавлять/реализовывать методы в классе CTO запрещается.
 */

public class ClassAbstractNoAbstract {
    public static void main(String[] args) {
        CTO cto = new CTO();
        System.out.println(cto);
    }

    public static interface Businessman {
        public void workHard();
    }

    public static class CTO extends Worker implements Businessman {

    }

    public static class Worker {
        public void workHard(){

        }
    }
}
