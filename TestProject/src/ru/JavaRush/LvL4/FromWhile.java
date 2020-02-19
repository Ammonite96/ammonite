package TP1JavaRush4lvl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FromWhile {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите хуйню ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int num = Integer.parseInt(reader.readLine());
        int x = 0;

        while (x < num){
            x++;
            System.out.println(s);
        }
    }
}