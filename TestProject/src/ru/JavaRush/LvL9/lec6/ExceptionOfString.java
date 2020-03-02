package ru.JavaRush.LvL9.lec6;

/**
 *Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
 * String s = null;
 * String m = s.toLowerCase();
 */

public class ExceptionOfString {
    public static void main(String[] args) {

        try {
            String s = null;
            String m = s.toLowerCase();
        } catch (NullPointerException n){
            System.out.println("NullPointerException");
        }
    }
}
