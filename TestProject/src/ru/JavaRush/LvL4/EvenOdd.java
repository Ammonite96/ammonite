package TP1JavaRush4lvl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EvenOdd {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите любое число: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int evenodd = Integer.parseInt(reader.readLine());

        if (evenodd == 0)
            System.out.println("ноль");
        else if (evenodd > 0 && (evenodd % 2 == 0))
            System.out.println("положительное четное число");
        else if (evenodd > 0 && !(evenodd % 2 == 0))
            System.out.println("положительное нечетное число");
        else if (evenodd < 0 && (evenodd % 2 == 0))
            System.out.println("отрицательное четное число");
        else if (evenodd < 0 && !(evenodd % 2 == 0))
            System.out.println("отрицательное нечетное число");
    }
}
