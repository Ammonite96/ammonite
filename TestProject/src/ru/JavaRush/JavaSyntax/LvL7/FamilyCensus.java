package ru.JavaRush.LvL7;

/**
 * Создай класс Human с полями имя(String), пол(boolean), возраст(int), отец(Human), мать(Human).
 * Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
 *
 * Примечание:
 * Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
 *
 * Пример вывода:
 * Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
 * Имя: Катя, пол: женский, возраст: 55
 * Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
 * ...
 */

public class FamilyCensus {
    public static void main(String[] args) {
        Human grandFather = new Human("Михаил", true, 70);
        Human grandFather1 = new Human("Евгений", true, 71);
        Human grandMother = new Human("Маруся", false, 65);
        Human grandMother1 = new Human("Изольда", false, 68);
        Human father = new Human("Илья", true, 34, grandFather, grandMother);
        Human mother = new Human("Зинаида", false, 30, grandFather1, grandMother1);
        Human child = new Human("Ублюдок1", true, 10, father, mother);
        Human child1 = new Human("Ублюдок2", true, 9, father, mother);
        Human child2 = new Human("Ублюдок3", false, 8, father, mother);

        System.out.println(grandFather + "\n" + grandFather1 + "\n" + grandMother + "\n" + grandMother1 + "\n" +
                father + "\n" + mother + "\n" + child + "\n" + child1 + "\n" + child2);

    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }



            return text;
        }
    }
}
