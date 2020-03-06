package TP1JavaRush4lvl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RectangleFor {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(reader.readLine());
        int n = Integer.parseInt(reader.readLine());
        int num = 8;


        for (int i = 0; i < m; i++) {
            System.out.print(num);
            for (int j = 1; j < n; j++)
                System.out.print(num);
            System.out.println();

        }
    }
}

