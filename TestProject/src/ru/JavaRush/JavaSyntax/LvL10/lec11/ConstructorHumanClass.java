package ru.JavaRush.JavaSyntax.LvL10.lec11;

/**
 * Напиши класс Human с 6 полями.
 * Придумай и реализуй 10 различных конструкторов для него.
 * Каждый конструктор должен иметь смысл.
 */

public class ConstructorHumanClass {
    public static void main(String[] args) {

    }

    public static class Human{
        private int age;
        private String name;
        private int weight;
        private String address;
        private boolean sex;
        private int height;

        public Human(String name, String address) {
            this.name = name;
            this.address = address;
        }

        public Human(String name) {
            this.name = name;
        }

        public Human(int age, int height) {
            this.age = age;
            this.height = height;
        }

        public Human(String name, boolean sex) {
            this.name = name;
            this.sex = sex;
        }

        public Human(int weight, boolean sex) {
            this.weight = weight;
            this.sex = sex;
        }

        public Human(boolean sex, int height) {
            this.sex = sex;
            this.height = height;
        }

        public Human(int age, String name, int weight, String address, boolean sex, int height) {
            this.age = age;
            this.name = name;
            this.weight = weight;
            this.address = address;
            this.sex = sex;
            this.height = height;
        }

        public Human(int age, String name, int weight, String address) {
            this.age = age;
            this.name = name;
            this.weight = weight;
            this.address = address;
        }

        public Human(int age, String name, int weight) {
            this.age = age;
            this.name = name;
            this.weight = weight;
        }

        public Human(int age, String name, String address) {
            this.age = age;
            this.name = name;
            this.address = address;
        }
    }

}
