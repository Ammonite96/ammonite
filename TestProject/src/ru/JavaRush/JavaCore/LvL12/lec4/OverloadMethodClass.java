package ru.JavaRush.JavaCore.LvL12.lec4;

/**
 * Написать два метода: print(int) и print(Integer).
 * Написать такой код в методе main, чтобы вызвались они оба.
 */

public class OverloadMethodClass {
    public static void main(String[] args) {
        print(1);
        print((Integer) 2);
    }

    public static void print(int a){
        System.out.println(a);
    }

    public static void print(Integer i){
        System.out.println(i);
    }
}
