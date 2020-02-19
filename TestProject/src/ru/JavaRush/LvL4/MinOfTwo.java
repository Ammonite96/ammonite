package ru.JavaRush.LvL4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MinOfTwo {
    public static void main(String[] args) throws IOException {
        System.out.println("Ведите два числа:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numb = Integer.parseInt(reader.readLine());
        int numb1 = Integer.parseInt(reader.readLine());

        if(numb>numb1)
            System.out.println(numb1);
        else if (numb<=numb1)           //можно было просто решить через <=....
            System.out.println(numb);
        //else if(numb==numb1)
          //  System.out.println(numb);
    }
}