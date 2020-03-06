package TP1JavaRush4lvl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PositiveNumber {
    public static void main(String[] args) throws IOException{
        System.out.println("Введите 3 числа: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());
        int num3 = Integer.parseInt(reader.readLine());

        boolean allPositive =  (num1 >= 1 && num2 >= 1 && num3 >= 1);
        boolean twoPositive = ((num1 >= 1 && num2 >= 1) || (num1 >=1 && num3 >= 1) || (num2 >= 1 && num3 >= 1));
        boolean allNegative = (num1 <= 0 && num2 <= 0 && num3 <= 0);

        if (allPositive)
            System.out.println("3");
        else if (twoPositive)
           System.out.println("2");
        else if(allNegative)
            System.out.println("0");
        else
            System.out.println("1");
    }
}
