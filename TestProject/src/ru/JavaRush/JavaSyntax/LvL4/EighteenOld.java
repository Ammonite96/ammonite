package TP1JavaRush4lvl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EighteenOld {
    public static void main(String[] args) throws IOException {
        System.out.println("Ведите имя и возраст");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        int age = Integer.parseInt(reader.readLine());

        if (age < 18)
            System.out.println("Подрасти еще");
        else if (age >= 18) {

        }
    }
}