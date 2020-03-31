package ru.JavaRush.JavaCore.LvL15.lec9;

/**
 * 1. Создать 7 public полей класса. Убедитесь, что они инициализируются дефолтными значениями.
 * intVar типа int
 * doubleVar типа double
 * DoubleVar типа Double
 * booleanVar типа boolean
 * ObjectVar типа Object
 * ExceptionVar типа Exception
 * StringVar типа String
 * 2. В методе main вывести их значения в заданном порядке.
 */

public class Static3 {
    public int intVar;
    public double doubleVar;
    public Double DoubleVar;
    public boolean booleanVar;
    public Object ObjectVar;
    public Exception ExceptionVar;
    public String StringVar;

    public static void main(String[] args) {
        Static3 static3 = new Static3();
        System.out.println(static3.intVar + "\n" + static3.doubleVar + "\n" +
                static3.DoubleVar + "\n" + static3.booleanVar + "\n" + static3.ObjectVar + "\n" +
                static3.ExceptionVar + "\n" + static3.StringVar);
    }
}
