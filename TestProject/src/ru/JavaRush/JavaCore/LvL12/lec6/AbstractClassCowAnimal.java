package ru.JavaRush.JavaCore.LvL12.lec6;

/**
 * Унаследуй класс Cow от Animal.
 * Реализуй все недостающие методы в классе Cow.
 */

public class AbstractClassCowAnimal {
    public static void main(String[] args) {

    }

    public static abstract class Animal {
        public abstract String getName();
    }

    public static class Cow extends Animal {

        @Override
        public String getName() {
            return "Бурёнка";
        }
    }
}
