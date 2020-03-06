package ru.JavaRush.LvL10.lec4;

/**
 * Расставьте правильно операторы приведения типа, чтобы получился ответ: c = 256
 * int a = (byte)44;
 * int b = (byte)300;
 * short c = (byte)(b - a);
 */

public class Task5 {
    public static void main(String[] args) {
        int a = (short) 44;
        int b = (short) 300;
        short c = (short) (b - a);
        System.out.println(c);
    }
}
