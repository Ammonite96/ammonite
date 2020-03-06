package TP1JavaRush4lvl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EighteenOld1 {
    public static void main(String[] args) throws IOException {
        System.out.println("Ведите имя и возраст");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        int age = Integer.parseInt(reader.readLine());

        if (age > 20)
            System.out.println("И 18-ти достаточно");

    }
}
//И 18-ти достаточно