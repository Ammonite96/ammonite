package ru.JavaRush.JavaCore.LvL15.lec9;

/**
 * 1. В классе Solution создай класс Cat с публичным полем name типа String.
 * 2. В статическом блоке создай объект типа Cat и присвой его переменной cat(не забудь инициализировать поле name).
 * 3. В классе Cat не создавай конструкторы с параметрами.
 * 4. В статическом блоке выведи имя созданного кота на экран.
 */

public class Static5 {
    public static Cat cat;

    static {
        cat = new Cat();
        cat.name="Sara";
        System.out.println(cat.name);
    }
    public static class Cat{
        public String name;
    }

    public static void main(String[] args) {

    }


}
