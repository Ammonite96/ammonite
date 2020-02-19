package ru.JavaRush.LvL5;

/**
 * 1. Внутри класса Solution создай public static классы Man и Woman.
 * 2. У классов должны быть поля: name (String), age (int), address (String).
 * 3. Создай конструкторы, в которые передаются все возможные параметры.
 * 4. Создай по два объекта каждого класса со всеми данными используя конструктор.
 * 5. Объекты выведи на экран в таком формате: name + " " + age + " " + address
 */

public class Solution {
    public static void main(String[] args) {
        Man man = new Man("Олег", 20, "Москва");
        Man man1 = new Man("Макс", 25, "Вологда");
        Woman woman = new Woman("Зенаида", 20, "Реж");
        Woman woman1 = new Woman("Ольга", 20, "Отреж");
    }

    public static class Man{
        String name;
        int age;
        String address;

        public Man() {

        }

        public Man(String name) {
            this.name = name;
        }

        public Man(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
            System.out.println(name + " " + age + " " + address);
        }
    }

    public static class Woman{
        String name;
        int age;
        String address;

        public Woman() {
        }

        public Woman(String name) {
            this.name = name;
        }

        public Woman(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
            System.out.println(name + " " + age + " " + address);
        }
    }
}
