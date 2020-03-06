package ru.JavaRush.LvL5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumNumbersConsole {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int sumnum = 0;

        while (true) {
            String s = reader.readLine();
            if (s.equals("сумма")) {
                //System.out.println(s);
                break;
            }
            int num = Integer.parseInt(s);
            sumnum += num;
        }
        System.out.println(sumnum);
    }
}
