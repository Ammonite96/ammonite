package ru.JavaRush.LvL9.lec6;

/**
 *Перехватить исключение, возникающее при выполнении кода:
 * int a = 42 / 0;
 * Вывести на экран тип перехваченного исключения.
 */

public class ExceptionOfNumber {
    public static void main(String[] args) {
        try {
            int a = 42 / 0;
        } catch (ArithmeticException a) {
            System.out.println("ArithmeticException");
        }
    }
}
