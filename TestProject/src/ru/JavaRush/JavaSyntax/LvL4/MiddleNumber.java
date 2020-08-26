package ru.JavaRush.JavaSyntax.LvL4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Думаю можно решить через switch case... Ну или ещё как нибудь компактнее...

public class MiddleNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        boolean middleA = a <= b && a >= c || a >= b && b <= c && a <= c;
        boolean middleB = a <= b && b <= c || a >= b && b >= c;
        boolean middleC = (b >= c && c >= a) || (b <= c && c <= a);

        if (b == c && c == a)
            System.out.println(a);
        else if (middleA)
            System.out.println(a);
        else if (middleB)
            System.out.println(b);
        else System.out.println(c);

    }
}
