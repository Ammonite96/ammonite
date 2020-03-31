package ru.JavaRush.JavaCore.LvL15.lec9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 1. В статическом блоке считайте две переменные с консоли А и В с типом int.
 * 2. Не забыть про IOException, который надо обработать в блоке catch.
 * 3. Закрыть поток ввода методом close().
 */

public class Static2 {
    public static int A;
    public static int B;

    static {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            int num = Integer.parseInt(reader.readLine());
            int num2 = Integer.parseInt(reader.readLine());
            A = num;
            B = num2;
            reader.close();
        }catch (IOException io){
            io.getMessage();
        }
    }

    public static final int MIN = min(A, B);

    public static void main(String[] args) {
        System.out.println(MIN);
    }

    public static int min(int a, int b) {
        return a < b ? a : b;
    }
}
