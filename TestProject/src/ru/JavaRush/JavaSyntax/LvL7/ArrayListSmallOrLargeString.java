package ru.JavaRush.LvL7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * 1. Создай список строк.
 * 2. Добавь в него 10 строчек с клавиатуры.
 * 3. Узнай, какая строка в списке встретится раньше: самая короткая или самая длинная.
 * Если таких строк несколько, то должны быть учтены самые первые из них.
 * 4. Выведи на экран строку из п.3. Должна быть выведена одна строка.
 */

public class ArrayListSmallOrLargeString {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> stringList = new ArrayList<>();
        int count = 0;
        int maxLength = 0;
        int minLength = 0;
        int indexMax = 0;
        int indexMin = 0;
        String stMax = null;
        String stMin = null;
        String st;

        while (true) {
            stringList.add(reader.readLine());
            count++;
            if (count == 10)
                break;
        }

        minLength = stringList.get(0).length();
        for (int i = 0; i < stringList.size(); i++) {
            st = stringList.get(i);
            if (st.length() >= maxLength) {
                maxLength = st.length();
            }
            if (st.length() <= minLength) {
                minLength = st.length();
            }
        }

        for (int j = 0; j < stringList.size(); j++) {
            String str = stringList.get(j);
            if (str.length() == maxLength) {
                indexMax = stringList.indexOf(str);
                stMax = stringList.get(indexMax);
                break;
            }
        }

        for (String s: stringList) {
            if (s.length() == minLength) {
                indexMin = stringList.indexOf(s);
                stMin = stringList.get(indexMin);
                break;
            }
        }

        if (indexMax < indexMin)
            System.out.println(stMax);
        else if (indexMin < indexMax)
            System.out.println(stMin);
    }
}

