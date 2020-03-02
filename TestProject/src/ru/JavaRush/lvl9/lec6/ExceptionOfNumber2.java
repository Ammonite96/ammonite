package ru.JavaRush.lvl9.lec6;

/**
 * Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
 * int num=Integer.parseInt("XYZ");
 * System.out.println(num);
 */

public class ExceptionOfNumber2 {
    public static void main(String[] args) {

        try {
            int num = Integer.parseInt("XYZ");
            System.out.println(num);
        } catch (NumberFormatException n){
            System.out.println("NumberFormatException");
        }
    }
}
