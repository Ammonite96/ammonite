package ru.JavaRush.JavaCore.LvL15.lec4;

/**
 * 1. Программа должна выводить следующее:
 * Это double
 * Это Object
 * Это double
 * Это Integer
 * Это double
 * 2. Удали реализации всех лишних методов
 */

public class Overload1 {
    public static void main(String[] args) {
        print(1.0);
        print((Number) 1);
        print(1.0);
        print((Integer) 1);
        print(1.0);
    }

    public static void print(Integer i) {
    System.out.println("Это Integer");
    }

   // public static void print(int i) {
     //   System.out.println("Это Integer");
    //}

    //public static void print(Short i) {
     //   System.out.println("Это Object");
    //}

    public static void print(Object i) {
        System.out.println("Это Object");
    }

    public static void print(double i) {
        System.out.println("Это double");
    }

    //public static void print(Double i) {
   //     System.out.println("Это double");
   // }

  //  public static void print(float i) {
    //    System.out.println("Это Double");
    //}
}
