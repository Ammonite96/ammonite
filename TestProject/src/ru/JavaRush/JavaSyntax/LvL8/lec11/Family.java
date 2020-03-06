package ru.JavaRush.LvL8.lec11;

import java.util.ArrayList;

/**
 * 1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
 * 2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
 * 3. Выведи все объекты Human на экран (Подсказка: используй метод toString() класса Human).
 */

public class Family {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human grandPa = new Human("Олег", true, 80);
        Human grandPa1 = new Human("Сергей", true, 79);
        Human grandMa = new Human("Зинаида", false, 75);
        Human grandMa1 = new Human("Ириша", false, 75);
        Human father = new Human("Инакентий", true, 55);
        Human mather = new Human("Драздаперма", false, 52);
        Human child1 = new Human("Инокентий", true, 30);
        Human child2 = new Human("Sara", false, 20);
        Human child3 =new Human("Рот", false, 20);
        grandPa.children.add(father);
        grandMa.children.add(father);
        grandPa1.children.add(mather);
        grandMa1.children.add(mather);
        father.children.add(child1);
        father.children.add(child2);
        father.children.add(child3);
        mather.children.add(child1);
        mather.children.add(child2);
        mather.children.add(child3);

        System.out.println(grandPa + "\n" + grandMa + "\n" + grandPa1 + "\n" + grandMa1 + "\n"+ father + "\n"+ mather+ "\n"+ child1+ "\n"+ child2+ "\n"+ child3);
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        //напишите тут ваш код

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}


/*
father.children.add(new Human("Инокентий", true, 30));
        father.children.add(new Human("Sara", false, 20));
        father.children.add(new Human("Sara1", false, 20));

 */