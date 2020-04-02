package ru.JavaRush.JavaCore.LvL15.lec12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 1. Считать с консоли данные, пока не введено слово "exit".
 * 2. Для каждого значения, кроме "exit", вызвать метод print. Если значение:
 * 2.1. содержит точку '.', то вызвать метод print для Double;
 * 2.2. больше нуля, но меньше 128, то вызвать метод print для short;
 * 2.3. меньше либо равно нулю или больше либо равно 128, то вызвать метод print для Integer;
 * 2.4. иначе, вызвать метод print для String.
 *
 */

public class Solution1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        double d = 0;
        short sh = 0;
        int a = 0;

        while (!(str = reader.readLine()).equals("exit")) {
            try {
                if (str.contains(".")) {
                    d = Double.valueOf(str);
                    print(d);
                } else {
                    try {
                        if (Short.valueOf(str) > 0 && Short.valueOf(str) < 128)
                            print(Short.valueOf(str));
                        else if (Integer.valueOf(str) <= 0 || Integer.valueOf(str) >= 128)
                             print(Integer.valueOf(str));
                    } catch (NumberFormatException nb) {
                            print(Integer.valueOf(str));
                    }
                }
            } catch (Exception ex){
                print(str);
            }
        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}

/*
1.1
100
-1
test
exit
 */