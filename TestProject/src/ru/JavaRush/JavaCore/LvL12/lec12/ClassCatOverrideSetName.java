package ru.JavaRush.JavaCore.LvL12.lec12;

/**
 * Переопредели метод setName в классе Cat так, чтобы программа выдавала на экран надпись
 * "Я - кот"
 */

public class ClassCatOverrideSetName {
    public static void main(String[] args) {
        Pet pet = new Cat();
        pet.setName("Я - пушистик");

        System.out.println(pet.getName());
    }

    public static class Pet {
        protected String name;

        public Pet() {
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    }

    public static class Cat extends Pet {
        //protected String name;

        @Override
        public String getName() {
            return name;
        }

        @Override
        public void setName(String name) {
            this.name = "Я - кот";
        }
    }
}
