package ru.JavaRush.LvL6;

/**
 * В каждом классе Cat и Dog написать метод finalize, который выводит на экран текст о том, что такой-то объект уничтожен.
 */

public class CatAndDogFinalize {
    public static void main(String[] args) throws Throwable {
        Dog dog = new Dog();
        dog.finalize();
        CatAndDogFinalize catAndDogFinalize = new CatAndDogFinalize();
        catAndDogFinalize.finalize();
    }

    protected void finalize() throws Throwable {
        System.out.println("A Cat was destroyed");
    }

}

    class Dog {
        protected void finalize() throws Throwable{
            System.out.println("A Dog was destroyed");
        }

    }

