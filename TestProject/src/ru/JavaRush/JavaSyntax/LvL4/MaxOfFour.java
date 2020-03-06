package TP1JavaRush4lvl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaxOfFour {
    public static void main(String[] args) throws IOException {
        System.out.println("Ведите 4 числа:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numb = Integer.parseInt(reader.readLine());
        int numb1 = Integer.parseInt(reader.readLine());
        int numb2 = Integer.parseInt(reader.readLine());
        int numb3 = Integer.parseInt(reader.readLine());

        if (numb >= numb1 && numb >= numb2 && numb >= numb3)
            System.out.println(numb);
        else if (numb1 >= numb && numb1 >= numb2 && numb1 >= numb3)
            System.out.println(numb1);
        else if (numb2 >= numb && numb2 >= numb1 && numb2 >= numb3)
            System.out.println(numb2);
        else if (numb3 >= numb && numb3 >= numb1&& numb3 >= numb2)
            System.out.println(numb3);
    }
}