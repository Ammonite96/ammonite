package ru.JavaRush.LvL4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumNumber {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;
        for (;true;){
            int num = Integer.parseInt(reader.readLine());
            sum = sum + num;
            if (num == -1)
                break;
        }
       System.out.println(sum);
    }
}



//BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
//        int n = 0, summ = -1;
//
//        while (n != -1) {
//            n = Integer.parseInt(rd.readLine());
//            summ += n;
//        }
//
//        System.out.println(summ);