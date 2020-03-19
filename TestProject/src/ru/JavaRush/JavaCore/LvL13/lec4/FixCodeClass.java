package ru.JavaRush.JavaCore.LvL13.lec4;

/**
 * Исправить код так, чтобы программа выполнялась и выводила "Я переводчик с английского".
 * Метод main менять нельзя!
 */

public class FixCodeClass {
    public static void main(String[] args) throws Exception {
        Translator translator = new Translator();
        System.out.println(translator.translate());
    }

    public static class Translator {
        public String translate() {
            return "Я переводчик с английского";
        }
    }
}
