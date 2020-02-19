package TP1JavaRush4lvl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThreeNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numb = Integer.parseInt(reader.readLine());
        int numb1 = Integer.parseInt(reader.readLine());
        int numb2 = Integer.parseInt(reader.readLine());

        if (numb != numb1 && numb != numb2 && numb1 == numb2)
            System.out.println("1");
        else if (numb == numb2)
            System.out.println("2");
        else if (numb == numb1)
            System.out.println("3");

    }
}
