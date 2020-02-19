package TP1JavaRush4lvl;

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

        boolean middleA = (a <= b && a >= c && c <= b) || (a >= b && b <= c && a <= c);
        boolean middleB = (a <= b && b <= c && a <= c) || (a >= b && b >= c && c <= a);
        boolean middleC = (a <= b && b >= c && c >= a) || (a >= b && b <= c && c <= a);

        if (a == b && b == c && c == a)
            System.out.println(a);
        else if (middleA)
            System.out.println(a);
        else if (middleB)
            System.out.println(b);
        else if (middleC)
            System.out.println(c);

    }
}
