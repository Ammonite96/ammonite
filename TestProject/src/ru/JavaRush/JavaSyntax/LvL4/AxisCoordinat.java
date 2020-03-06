package TP1JavaRush4lvl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AxisCoordinat {
    public static void main(String[] args) throws IOException {
        System.out.println("Ведите координаты");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int coord = Integer.parseInt(reader.readLine());
        int coord1 = Integer.parseInt(reader.readLine());

        if (coord > 0 && coord1 > 0)
            System.out.println("1");
        else if (coord < 0 && coord1 > 0)
            System.out.println("2");
        else if (coord < 0 && coord1 < 0)
            System.out.println("3");
        else if (coord > 0 && coord1 < 0)
            System.out.println("4");

    }
}

//первой четверти a>0 и b>0;
//для второй четверти a<0 и b>0;
//для третьей четверти a<0 и b<0;
//для четвертой четверти a>0 и b<0.