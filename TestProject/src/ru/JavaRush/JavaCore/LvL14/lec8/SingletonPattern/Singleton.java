package ru.JavaRush.JavaCore.LvL14.lec8.SingletonPattern;

public class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance(){
        if (instance == null)
            instance = new Singleton();
        return instance;
    }
}
