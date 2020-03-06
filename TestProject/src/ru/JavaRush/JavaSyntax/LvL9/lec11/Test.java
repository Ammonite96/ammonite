package ru.JavaRush.LvL9.lec11;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine();
        String textReplace = text.replaceAll(" ", "");
        char[] chars = textReplace.toCharArray();

        ArrayList<Character> arrayList = new ArrayList<>();
        for (int i = 0; i < chars.length; i++) {
            Character c = chars[i];
            arrayList.add(c);
        }

        for (int i =0 ; i < arrayList.size(); i++){
            char c = arrayList.get(i);
            System.out.println(c);
        }


       // for (int j = 0; j < arrayList.size(); j++){
         //   System.out.println(arrayList.get(j));
        //}

    }
}
