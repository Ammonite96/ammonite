package ru.JavaRush.JavaCore.LvL15.lec12;

/**
 * Разберись, что и в какой последовательности инициализируется. Поставь брейкпойнты и используй дебаггер.
 * Исправить порядок инициализации данных так, чтобы результат был следующим:
 * static void init()
 * Static block
 * public static void main
 * Non-static block
 * static void printAllFields
 * 0
 * null
 * Solution constructor
 * static void printAllFields
 * 6
 * First name
 */

public class Solution6 {
    static {
        init();
    }

    {
        System.out.println("Non-static block");
        printAllFields(this);
    }

    public int i = 6;

    public String name = "First name";

    static {
        System.out.println("Static block");
    }

    public Solution6() {
        System.out.println("Solution constructor");
        printAllFields(this);
    }

    public static void init() {
        System.out.println("static void init()");
    }

    public static void main(String[] args) {
        System.out.println("public static void main");
        Solution6 s = new Solution6();
    }

    public static void printAllFields(Solution6 obj) {
        System.out.println("static void printAllFields");
        System.out.println(obj.i);
        System.out.println(obj.name);
    }
}
