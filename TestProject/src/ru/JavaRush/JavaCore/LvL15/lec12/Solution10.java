package ru.JavaRush.JavaCore.LvL15.lec12;

/**
 * Исправь класс Hrivna так, чтоб избежать возникновения ошибки StackOverflowError.
 */

public class Solution10 {
    public static void main(String[] args) {
        System.out.println(new Hrivna().getAmount());
    }

    public static abstract class Money {
        abstract Money getMoney();

        public Object getAmount() {
            return getMoney().getAmount();
        }
    }

    //add your code below - добавь код ниже
    public static class Hrivna extends Money {
        private double amount = 123d;

        public Hrivna getMoney() {
            return this;
        }

        public Object getAmount(){
            return amount;
        }
    }
}
