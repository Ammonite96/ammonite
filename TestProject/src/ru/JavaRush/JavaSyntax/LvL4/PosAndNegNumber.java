package TP1JavaRush4lvl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PosAndNegNumber {
    public static void main(String[] args) throws IOException {

        System.out.println("Введите 3 числа: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());
        int num3 = Integer.parseInt(reader.readLine());
        int m = 0;
        int n = 0;

        if (num1 > 0) {
            m++;
        }
        if (num2 > 0) {
            m++;
        }
        if (num3 > 0) {
            m++;
        }
        System.out.println("количество положительных чисел: " + m);

        if (num1 < 0) {
            n++;
        }
        if (num2 < 0) {
            n++;
        }
        if (num3 < 0) {
            n++;
        }
        System.out.println("количество отрицательных чисел: " + n);
    }
}



//"количество отрицательных чисел: "
//"количество положительных чисел: "
//if (all)
//System.out.println("количество отрицательных чисел: 1\n" + "количество положительных чисел: 2");

 /*   boolean allPositive = (num1 > 0 && num2 > 0 && num3 > 0);
    boolean twoPositive = ((num1 > 0 && num2 > 0) || (num1 > 0 && num3 > 0) || (num2 > 0 && num3 > 0));
    boolean allNegative = (num1 < 0 && num2 < 0 && num3 < 0);
    boolean all = (num1 == 0 || num2 == 0 || num3 == 0);
    boolean all = ((num1 == 0 && num2 == 0) || (num1 == 0 && num3 == 0) || (num2 == 0 && num3 == 0));


      boolean allPositive = (num1 > 0 && num2 > 0 && num3 > 0);
        if (allPositive) {
            int z = m + 3;
            System.out.println("количество положительных чисел: " + z);
        }

        boolean twoPositive = ((num1 > 0 && num2 > 0) || (num1 > 0 && num3 > 0) || (num2 > 0 && num3 > 0));
        if (twoPositive) {
            int z = m + 2;
            System.out.println("количество положительных чисел: " + z);
        }

        boolean allNegative = (num1 < 0 && num2 < 0 && num3 < 0);
        if (allNegative) {
            int z = m + 3;
            System.out.println("количество отрицательных чисел: " + z);
        }

        boolean twoNegative = ((num1 < 0 && num2 < 0) || (num1 < 0 && num3 < 0) || (num2 < 0 && num3 < 0));
        if (twoNegative) {
            int z = m + 2;
            System.out.println("количество отрицательных чисел: " + z);
        }*/