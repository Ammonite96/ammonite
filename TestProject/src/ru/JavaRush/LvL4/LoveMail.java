package TP1JavaRush4lvl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LoveMail {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        for (int a = 1; a <=10; a++)
            System.out.println(s+" любит меня.");

    }
}
