package ru.JavaRush.LvL6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Сделать класс ConsoleReader, у которого будут 4 статических метода:
 * String readString() - читает с клавиатуры строку
 * int readInt() - читает с клавиатуры число
 * double readDouble() - читает с клавиатуры дробное число
 * boolean readBoolean() - читает с клавиатуры строку "true" или "false" и возвращает соответствующую логическую переменную true или false
 *
 * Внимание: создавайте переменную для чтения данных с консоли (BufferedReader или Scanner) внутри каждого метода.
 */

public class ConsoleReader {


    public static String readString() throws Exception {
        BufferedReader str = new BufferedReader(new InputStreamReader(System.in));//напишите тут ваш код
        String sr = str.readLine();
        return sr;
    }

    public static int readInt() throws Exception {
       BufferedReader integer = new BufferedReader(new InputStreamReader(System.in));
       int intRead = Integer.parseInt(integer.readLine());
       return intRead;
    }

    public static double readDouble() throws Exception {
        BufferedReader doub = new BufferedReader(new InputStreamReader(System.in));
        double doubleRead = Double.parseDouble(doub.readLine());
        return doubleRead;
    }

    public static boolean readBoolean() throws Exception {
        BufferedReader rb = new BufferedReader(new InputStreamReader(System.in));
        String tf = rb.readLine();
        boolean ft = (tf.equals("true"))? true:false;
        System.out.println(tf);
        return ft;
        // boolean d = Boolean.valueOf(rb.readLine());
        // boolean by = Boolean.parseBoolean(rb.readLine());
    }

    public static void main(String[] args) throws Exception {
        ConsoleReader consoleReader = new ConsoleReader();
        ConsoleReader.readBoolean();
        System.out.println();
    }
}


/*      Scanner integer = new Scanner(System.in);
        int readInt = integer.nextInt();
        return readInt;

 */