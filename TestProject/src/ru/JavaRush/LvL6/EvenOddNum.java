package ru.JavaRush.LvL6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Ввести с клавиатуры число. Определить, сколько в введенном числе четных цифр, а сколько нечетных.
 * Если число делится без остатка на 2 (т. е. остаток равен нулю), значит оно четное.
 * Увеличиваем на 1 счетчик четных цифр (статическая переменная even).
 * Иначе число нечетное, увеличиваем счетчик нечетных цифр (статическая переменная odd).
 * Вывести на экран сообщение: "Even: а Odd: b", где а - количество четных цифр, b - количество нечетных цифр.
 *
 * Пример для числа 4445:
 * Even: 3 Odd: 1
 */

public class EvenOddNum {
    public static int even;
    public static int odd;


    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(reader.readLine());
        ArrayList<Integer> num = new ArrayList<>();
        while (k > 0) {
            num.add(k % 10);
            k /= 10;
        }
        for (int i = 0; i<num.size(); i++) {
           // System.out.println(num.get(i));
            if (num.get(i) % 2 == 0)
                even++;
            else
                odd++;
        }
        System.out.println("Even: " + even + " " + "Odd: " + odd);
       // System.out.println(even + " " + odd);
        System.out.println(num.toString());
        System.out.println(num.size());
    }
}


