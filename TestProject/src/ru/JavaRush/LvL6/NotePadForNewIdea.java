package ru.JavaRush.LvL6;

/**
 * 1. В классе Solution создать public static класс Idea.
 * 2. В классе Idea создать метод public String getDescription(), который будет возвращать любую строку.
 * 3. В классе Solution создай статический метод public void printIdea(Idea idea), который будет выводить на экран описание идеи - это то, что возвращает метод getDescription().
 */

public class NotePadForNewIdea {
    public static void main(String[] args) {
        printIdea(new Idea());
    }

    public static void printIdea(Idea idea){
        idea.getDescription();
        System.out.println(idea.getDescription());
    }

    public static class Idea {

        public String getDescription(){
            String str = "Любая строка";
            return str;
        }
    }
}
