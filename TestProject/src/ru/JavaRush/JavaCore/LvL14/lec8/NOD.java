package ru.JavaRush.JavaCore.LvL14.lec8;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Наибольший общий делитель (НОД).
 * Ввести с клавиатуры 2 целых положительных числа.
 * Вывести в консоль наибольший общий делитель.
 */

public class NOD {  // Моё решение!
    public static void main(String[] args) throws Exception {
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());

        System.out.println(nod(a, b));
    }

    public static int nod(int a, int b){
        if (b==0)
            return Math.abs(a);
        return nod(b, a % b);
    }
}

/*

Решение для JavaRush

public static void main(String[] args) throws Exception {
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        if (a <= 0 || b <= 0) throw new Exception();
        System.out.println(nod(a, b));
    }

    public static int nod(int a, int b){
        if (b==0)
            return a;
        return nod(b, a % b);
    }

 */
